package com.angcyo.jdbc;

/**
 * Created by angcyo on 16-02-21-021.
 */
public class TestBean {

    /**
     * name_char : 2
     * name_float : 2
     * name_int : 2
     * name_time : -1
     * name_tinyint : 2
     * name_varchar : 2
     * rid : 7
     */

    private String name_char;
    private int name_float;
    private int name_int;
    private long name_time;
    private int name_tinyint;
    private String name_varchar;
    private int rid;

    public void setName_char(String name_char) {
        this.name_char = name_char;
    }

    public void setName_float(int name_float) {
        this.name_float = name_float;
    }

    public void setName_int(int name_int) {
        this.name_int = name_int;
    }

    public void setName_time(long name_time) {
        this.name_time = name_time;
    }

    public void setName_tinyint(int name_tinyint) {
        this.name_tinyint = name_tinyint;
    }

    public void setName_varchar(String name_varchar) {
        this.name_varchar = name_varchar;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName_char() {
        return name_char;
    }

    public int getName_float() {
        return name_float;
    }

    public int getName_int() {
        return name_int;
    }

    public long getName_time() {
        return name_time;
    }

    public int getName_tinyint() {
        return name_tinyint;
    }

    public String getName_varchar() {
        return name_varchar;
    }

    public int getRid() {
        return rid;
    }
}
