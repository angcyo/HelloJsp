package com.angcyo.jdbc;

import com.angcyo.utils.TextUtils;

import java.io.PrintStream;
import java.sql.SQLException;

/**
 * Created by angcyo on 16-02-19-019.
 */
public class Demo {
    public static PrintStream R = System.out;

    public static void main(String... args) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            DriverManager.getConnection("jdbc:mysql://%s/%s");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                R.print("");
            }
        });
        connect();

//        try {
//            Properties properties = new Properties();
//            InputStream inputStream = Demo.class.getClassLoader().getResourceAsStream("jdbcconfig.properties");
//            InputStream inputStream2 = Demo.class.getClassLoader().getResourceAsStream("test.java1");
//            properties.load(inputStream2);
//            String name = properties.getProperty("name");
//            String pass = properties.getProperty("pass");
//            properties.setProperty("na", "adf");
//            String na = properties.getProperty("na");
//            String na2 = properties.getProperty("na");
//            int nam = 120;
//            func(Integer.valueOf(nam));
//            func(nam);
//            func(new TestBean());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static <T> void func(T objects) {
        Class<?> aClass = objects.getClass();
        String typeName = aClass.getTypeName();
        String simpleName = aClass.getSimpleName();
        String canonicalName = aClass.getCanonicalName();
        String name = aClass.getName();
        String simpleName2 = aClass.getSimpleName();

        if (Integer.class.getName().equalsIgnoreCase(name)) {
            R.println("");
        } else {
            R.println("");
        }

    }

    public static void connect() {
        try {
//            createConnect("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo");
//            createConnect("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo");
//            createConnect("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo");
//            createConnect("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo");
//            execute("SELECT * FROM name_table_test1");
//            RJdbc.init("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo")
//                    .query("SELECT * FROM name_table_test1", new OnResult() {
//                        @Override
//                        public void onResult(int rows, ResultSet resultSet) {
//                            if (resultSet != null) {
//                                try {
//                                    while (resultSet.next()) {
//                                        ResultSetMetaData metaData = resultSet.getMetaData();
//                                        //循环获取字段的名称
//                                        for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                                            String catalogName = metaData.getCatalogName(i);
//                                            String columnClassName = metaData.getColumnClassName(i);
//                                            String columnLabel = metaData.getColumnLabel(i);
//                                            String columnName = metaData.getColumnName(i);
//                                            int columnType = metaData.getColumnType(i);
//                                            String columnTypeName = metaData.getColumnTypeName(i);
//                                            String schemaName = metaData.getSchemaName(i);
//                                            String tableName = metaData.getTableName(i);
//
//                                        }
//                                    }
//                                } catch (SQLException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                        }
//                    }).close();

            RJdbc.init("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo")
                    .query("SELECT * FROM name_table_test1", new RJdbc.JsonStringResult() {
                                @Override
                                public void onJsonStringResult(String jsonString) {
                                    if (!TextUtils.isEmpty(jsonString)) {
                                        R.println(jsonString);
                                    }
                                }
                            }
                    ).close();

//            RJdbc.init("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo")
//                    .query("SELECT * FROM name_table_test1", new RJdbc.JsonObjectResult<TestBean>() {
//
//                                @Override
//                                public void onJsonObjectResult(ArrayList<TestBean> lists) {
//
//                                }
//                            }
//                    ).close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
