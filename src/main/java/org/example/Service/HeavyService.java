package org.example.Service;

import org.example.HeavyServiceInterface.HeavyServiceInf;

public class HeavyService implements HeavyServiceInf {
    @Override
    public void performOperation() {
        System.out.println("Heavy Service perform operation");
    }
}
