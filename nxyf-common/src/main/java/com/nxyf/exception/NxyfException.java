package com.nxyf.exception;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 10:33
 */
public class NxyfException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public NxyfException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public NxyfException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public NxyfException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public NxyfException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
