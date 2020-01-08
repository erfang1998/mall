package com.macro.mall.tiny.commom.api;

/**
 * 调用返回对象
 * Create by zy on 2020/1/2
 **/
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    //为什么是protected不是public
    protected CommonResult(){}

    protected CommonResult(long code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param data 获得的数据
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCESS.getCode(),
                ResultCode.SUCESS.getMessage(),data);
    }

    /**
     * 成功返回结果
     * @param data 获得的数据
     * @param <T>
     * @param message 提示信息
     * @return
     */
    public static <T> CommonResult<T> success(T data, String message){
        return new CommonResult<T>(ResultCode.SUCESS.getCode(), message,data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<T>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * 失败返回信息
     * @param message 提示信息
     * @return
     */
    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<T>(ResultCode.FAILED.getCode(),message,null);
    }

    /**
     * 失败返回结果
     * @return
     */
    public static <T> CommonResult<T> failed(){
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数检验失败返回结果
     * @return
     */
    public static <T> CommonResult<T> validateFailed(){
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     * @return
     */
    public static <T> CommonResult<T> validateFailed(String message){
        return new CommonResult<>(ResultCode.VALIDATE_FAILED.getCode(), message,null);
    }

    /**
     * 未授权返回结果
     * @return
     */
    public static <T> CommonResult<T> forbidden(T data){
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(),
                ResultCode.FORBIDDEN.getMessage(),data);
    }

    /**
     * 未登录返回结果
     * @return
     */
    public static <T> CommonResult<T> unauthorized(T data){
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(),
                ResultCode.UNAUTHORIZED.getMessage(),data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
