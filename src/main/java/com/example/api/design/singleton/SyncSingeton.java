package com.example.api.design.singleton;

public class SyncSingeton {

    public static SyncSingeton instance;

    private SyncSingeton(){

    }

    public static synchronized SyncSingeton getInstance(){
        if(instance==null){
            instance = new SyncSingeton();
        }
        return instance;
    }
}
