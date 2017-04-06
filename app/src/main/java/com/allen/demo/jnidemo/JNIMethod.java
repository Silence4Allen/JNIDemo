package com.allen.demo.jnidemo;

/**
 * Created by Allen on 2017/4/6.
 */

public class JNIMethod {
    static {
        System.loadLibrary("JNITest");
    }

    public static native String sayHello();
}
