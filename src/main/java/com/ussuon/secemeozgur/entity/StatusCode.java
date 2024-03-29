package com.ussuon.secemeozgur.entity;

/**
 * @Title: 状态码实体类
 * @author: 陈宏松
 * @create: 2018-12-18 14:37
 * @version: 1.0.0
 **/
public class StatusCode {

    public static final int OK = 20000;//成功
    public static final int ERROR = 20001;//失败
    public static final int LOGINERROR = 20002;//用户名密码错误
    public static final int ACCESSERROR = 20003;//权限不足
    public static final int REMOTEERROR = 20004;//远程调用失败
    public static final int REPERROR = 20005;//重复操作

}
