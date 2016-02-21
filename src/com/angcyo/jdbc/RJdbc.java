package com.angcyo.jdbc;

import com.alibaba.fastjson.JSON;
import com.angcyo.utils.TextUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by angcyo on 16-02-19-019.
 */
public class RJdbc {

    public static final String MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";//数据库驱动程序
    public static final String MYSQL_JDBC_URL = "jdbc:mysql://%s/%s";//数据库连接地址
    private Connection mConnection;
    private Statement mStatement;
    private PreparedStatement mPreparedStatement;
    private ResultSet mResultSet;

    private RJdbc() {

    }

    public static RJdbc init(String host, String dbName, String userName, String userPw) throws SQLException, ClassNotFoundException {
        RJdbc rJdbc = new RJdbc();
        rJdbc.createConnect(host, dbName, userName, userPw);
        return rJdbc;
    }


    private RJdbc createConnect(String host, String dbName, String userName, String userPw) throws ClassNotFoundException, SQLException {
        if (mConnection == null) {
            Class.forName(MYSQL_JDBC_DRIVER);
            mConnection = DriverManager.getConnection(String.format(MYSQL_JDBC_URL, host, dbName), userName, userPw);
        }
        return this;
    }


    /**
     * 关闭数据库连接, 释放资源
     *
     * @author Created by angcyo on 2016-02-19 22:59:35
     */
    public RJdbc close() {
        closeResult(mResultSet);

        if (mPreparedStatement != null) {
            try {
                mPreparedStatement.close();
                mPreparedStatement = null;
            } catch (SQLException e) {
            }
        }

        if (mStatement != null) {
            try {
                mStatement.close();
                mStatement = null;
            } catch (SQLException e) {
            }
        }


        if (mConnection != null) {
            try {
                mConnection.close();
                mConnection = null;
            } catch (SQLException e) {
            }
        }

        return this;
    }

    private static void closeResult(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
            }
        }
    }

    /**
     * 执行sql语句, 回调返回受影响的行数
     *
     * @param sql      the sql
     * @param listener the listener
     * @return the r jdbc
     * @throws SQLException the sql exception
     * @author Created by angcyo on 2016-02-21 00:33:19
     */
    public RJdbc update(String sql, OnResult listener) throws SQLException {
        if (TextUtils.isEmpty(sql)) {
            if (listener != null) {
                listener.onResult(-1, null);
            }
            return this;
        }
        beforeExecute();
        int update = mStatement.executeUpdate(sql);
        if (listener != null) {
            listener.onResult(update, null);
        }
        return this;
    }

    private void beforeExecute() throws SQLException {
        verifyConnect();
        if (mStatement == null || mStatement.isClosed()) {
            mStatement = mConnection.createStatement();
        }
//        if (mPreparedStatement == null || mPreparedStatement.isClosed()) {
//            mPreparedStatement = mConnection.prepareStatement();
//        }
    }

    /**
     * 用于查询数据库, 回调返回
     *
     * @param sql      the sql
     * @param listener the listener
     * @return the r jdbc
     * @throws SQLException the sql exception
     * @author Created by angcyo on 2016-02-21 00:39:43
     */
    public RJdbc query(String sql, OnResult listener) throws SQLException {
        if (TextUtils.isEmpty(sql)) {
            return this;
        }
        beforeExecute();
        ResultSet resultSet = mStatement.executeQuery(sql);
        if (listener != null) {
            listener.onResult(0, resultSet);
        }
        closeResult(resultSet);
        return this;
    }

    /**
     * 执行失败, 回调返回 -1, 成功回调返回1
     *
     * @param sql      the sql
     * @param listener the listener
     * @return the r jdbc
     * @throws SQLException the sql exception
     * @author Created by angcyo on 2016-02-21 00:52:17
     */
    public RJdbc execute(String sql, OnResult listener) throws SQLException {
        if (TextUtils.isEmpty(sql)) {
            if (listener != null) {
                listener.onResult(-1, null);
            }
            return this;
        }
        beforeExecute();
        boolean execute = mStatement.execute(sql);
        if (listener != null) {
            if (execute) {
                listener.onResult(1, null);
            } else {
                listener.onResult(-1, null);
            }
        }
        return this;
    }

    public RJdbc prepareQuery(String sql, OnResult listener, OnPrepareSet onPrepareSet) throws SQLException {
        if (TextUtils.isEmpty(sql)) {
            return this;
        }
        beforeExecute();
        mPreparedStatement = mConnection.prepareStatement(sql);
        if (onPrepareSet != null) {
            onPrepareSet.onPrepareSet(mPreparedStatement);
            ResultSet resultSet = mPreparedStatement.executeQuery();
            if (listener != null) {
                listener.onResult(0, resultSet);
            }
            closeResult(resultSet);
        }
        return this;
    }


    /**
     * 开始一个事务处理,自动回滚
     *
     * @param sqlList  需要执行的sql语句列表
     * @param listener 结果的回到
     * @author Created by angcyo on 2016-02-21 13:53:03
     */
    public void beginTransaction(List<String> sqlList, OnTransactionResult listener) {
        boolean success = false;
        if (sqlList == null || sqlList.size() == 0) {
            success = true;
        } else {
            try {
                verifyConnect();
                mConnection.setAutoCommit(false);
                for (String sql : sqlList) {
                    update(sql, null);
                }
                mConnection.commit();
                success = true;
            } catch (SQLException e) {
                try {
                    mConnection.rollback();
                } catch (SQLException e1) {
                }
                success = false;
            } finally {
                close();
            }
        }
        if (listener != null) {
            listener.onTransactionResult(success);
        }
    }

    /**
     * 验证连接是否有效, 无效抛出异常, 中断程序.
     *
     * @author Created by angcyo on 2016-02-21 00:28:12
     */
    public void verifyConnect() {
        if (mConnection == null) {
            throw new IllegalStateException("You need to call init() first.");
        }
        try {
            if (mConnection.isClosed()) {
                throw new IllegalStateException("Connect is closed, please call init() first.");
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }


    /*返回的数据回调*/
    public interface OnResult {
        void onResult(int rows, ResultSet resultSet);
    }

    /*封装成String的数据回调*/
    public static abstract class JsonStringResult implements OnResult {

        @Override
        public void onResult(int rows, ResultSet resultSet) {
            StringBuilder stringBuilder = new StringBuilder();
            if (resultSet != null) {
                try {
                    stringBuilder.append("[");
                    boolean isNextBegin = true;
                    while (resultSet.next()) {
                        if (!isNextBegin) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append("{");
                        isNextBegin = false;
                        try {
                            ResultSetMetaData metaData = resultSet.getMetaData();
                            //循环获取字段的名称, 和 对应的值
                            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                                //String catalogName = metaData.getCatalogName(i);
                                //String columnClassName = metaData.getColumnClassName(i);
                                //String columnLabel = metaData.getColumnLabel(i);
                                //String columnName = metaData.getColumnName(i);
                                //int columnType = metaData.getColumnType(i);
                                //String columnTypeName = metaData.getColumnTypeName(i);
                                //String schemaName = metaData.getSchemaName(i);
                                //String tableName = metaData.getTableName(i);

                                if (i > 1) {
                                    stringBuilder.append(",");
                                }

                                //拼接字段名称
                                stringBuilder.append("\"");
                                stringBuilder.append(metaData.getColumnName(i));
                                stringBuilder.append("\"");
                                //分隔符
                                stringBuilder.append(":");
                                //字段值,根据字段类型,返回不同格式的值
                                switch (metaData.getColumnType(i)) {
                                    case Types.BOOLEAN:
                                        stringBuilder.append(resultSet.getBoolean(i));
                                        break;
                                    case Types.INTEGER:
                                    case Types.TINYINT:
                                    case Types.BIT:
                                    case Types.REAL:
                                        stringBuilder.append(resultSet.getLong(i));
                                        break;
                                    case Types.TIMESTAMP:
                                        Timestamp timestamp = resultSet.getTimestamp(i);
                                        if (timestamp == null) {
                                            stringBuilder.append(-1);
                                        } else {
                                            stringBuilder.append(timestamp.getTime());
                                        }
                                        break;
                                    case Types.FLOAT:
                                        stringBuilder.append(resultSet.getFloat(i));
                                        break;
                                    case Types.DOUBLE:
                                        stringBuilder.append(resultSet.getDouble(i));
                                        break;
                                    default:
                                        stringBuilder.append("\"");
                                        stringBuilder.append(resultSet.getString(i));
                                        stringBuilder.append("\"");
                                        break;
                                }

                            }
                        } catch (SQLException e) {
                        }
                        stringBuilder.append("}");
                    }
                    stringBuilder.append("]");
                } catch (SQLException e) {
                }
            }
            onJsonStringResult(stringBuilder.toString());
        }

        public abstract void onJsonStringResult(String jsonString);
    }

    public static abstract class JsonObjectResult<T> extends JsonStringResult {

        public Class getGenericTypeClass() {
            Type type = ((ParameterizedType) JsonObjectResult.this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            return (Class) type;
        }

        @Override
        public void onJsonStringResult(String jsonString) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                if (!jsonString.startsWith("[")) {
                    stringBuilder.append("[");
                    stringBuilder.append(jsonString);
                    stringBuilder.append("]");
                } else {
                    stringBuilder.append(jsonString);
                }

                ArrayList<T> parseArray2 = (ArrayList<T>) JSON.parseArray(stringBuilder.toString(), getGenericTypeClass());
                onJsonObjectResult(parseArray2);
            } catch (Exception e) {
                onJsonObjectResult(null);
            }
        }

        public abstract void onJsonObjectResult(ArrayList<T> lists);
    }

    /*数据参数占位设置回调*/
    public interface OnPrepareSet {
        void onPrepareSet(PreparedStatement preparedStatement);
    }

    /*sql事务执行结果回调*/
    public interface OnTransactionResult {
        void onTransactionResult(boolean isSuccess);
    }

}
