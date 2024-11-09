package com.google.common.retry;

public class RetryBuilder {

    public RetryBuilder retryIfException(Throwable e){
        return this;
    }

    public RetryBuilder retryIf(RetryCondition condition);


    public static class RetryCondition {

    }
}
