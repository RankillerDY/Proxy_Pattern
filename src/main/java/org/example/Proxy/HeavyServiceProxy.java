package org.example.Proxy;

import org.example.HeavyServiceInterface.HeavyServiceInf;
import org.example.Service.HeavyService;

public class HeavyServiceProxy implements HeavyServiceInf {
    private static HeavyService instance;

    private HeavyServiceProxy() {}

    public static HeavyService getInstance() {
        if (instance == null) {
            System.out.println("Heavy Service Proxy Initialize");
            instance = new HeavyService();
        }
        return instance;
    }

    @Override
    public void performOperation() {
        instance.performOperation();
    }
}
