package com.miaoshaproject.error;

public enum ErroBusinessError implements CommonError {
    //通用错误类型0001
    PARAMETER_VALIDATION_ERROR(00001, "参数不合法"),
    UNKONWN_ERRO(00002, "未知错误"),
    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(10001, "用户不存在");

    private ErroBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;

    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String erroMsg) {
        this.errMsg = erroMsg;
        return this;
    }
}
