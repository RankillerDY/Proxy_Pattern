package org.example;

import org.example.Proxy.HeavyServiceProxy;

public class Client {
    public static void main(String[] args) {
        //First try
        HeavyServiceProxy.getInstance().performOperation();
        System.out.println("----------------------------");
        //Second try
        HeavyServiceProxy.getInstance().performOperation();
    }
}