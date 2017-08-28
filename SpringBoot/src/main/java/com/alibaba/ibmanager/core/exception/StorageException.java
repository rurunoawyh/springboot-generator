/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.ibmanager.core.exception;

/**
 * 文件存储异常包装类
 * 
 * @author changqian 2017年5月24日 下午3:37:57
 */
public class StorageException extends RuntimeException {

    private static final long serialVersionUID = -4802953595973575358L;

    private String            errorCode;

    private String            errorMsg;

    public StorageException(String errorCode, String errorMsg){
        super();
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public StorageException(String errorCode, String errorMsg, Throwable cause){
        super(cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        return "oss服务异常：{errorCode:" + errorCode + ", errorMsg:" + errorMsg + "}";
    }

}
