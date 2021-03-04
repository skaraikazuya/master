package com.mockserver.demo.entity;

public class Mock {

    private int id;
    private String method;
    private String path;
    private String param;
    private int type;//0-固定返回，1-随机返回，2-传入返回

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mock{" +
                "id=" + id +
                ", method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", param='" + param + '\'' +
                ", type=" + type +
                '}';
    }
}
