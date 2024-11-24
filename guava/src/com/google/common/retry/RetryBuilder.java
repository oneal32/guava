package com.google.common.retry;

public class RetryBuilder {

    private Retryer retryer;

    private RetryBuilder(Retryer retryer){
        this.retryer = retryer;
    }
    public static RetryBuilder newBuilder(){
        return new RetryBuilder(new Retryer());
    }

    public RetryBuilder retryIfException(Throwable e){
        return this;
    }

    public RetryBuilder retryIf(RetryCondition condition){
        return this;
    }

    public RetryBuilder strategy(RetryStrategy strategy){
        return this;
    }

    public Retryer build(){
        return this.retryer;
    }

    public static class RetryCondition {

    }

    public static class RetryStrategy {

    }
}
