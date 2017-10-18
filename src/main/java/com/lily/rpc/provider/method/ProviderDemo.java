package com.lily.rpc.provider.method;

/**
 * Created by Lily on 2017/10/18.
 */
public class ProviderDemo implements ProviderDemoImpl {
    public String printMsg(String msg) {
        System.out.println("----" + msg + "----");
        return "hello " + msg;
    }
}
