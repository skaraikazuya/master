package com.mockserver.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("mock实体")
public class Mock {

    @ApiModelProperty("id")
    private int id;

    @ApiModelProperty("方法名")
    private String method;

    @ApiModelProperty("路径")
    private String path;

    @ApiModelProperty("参数")
    private String param;

    @ApiModelProperty("返回值类型")
    private int type;//0-固定返回，1-随机返回，2-传入返回

    @ApiModelProperty("传入返回值")
    private String responseVal;

    public String getResponseVal() {
        return responseVal;
    }

    public void setResponseVal(String responseVal) {
        this.responseVal = responseVal;
    }

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
