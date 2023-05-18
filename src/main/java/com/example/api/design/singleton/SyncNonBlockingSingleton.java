package com.example.api.design.singleton;

public class SyncNonBlockingSingleton {
    public static SyncNonBlockingSingleton instance;

    private SyncNonBlockingSingleton () {

    }

    public static SyncNonBlockingSingleton getInstance () {
        if (instance == null) {
            synchronized (SyncNonBlockingSingleton.class) {
                if (instance == null) {
                    instance = new SyncNonBlockingSingleton();
                }
            }
        }
        return instance;
    }
}
