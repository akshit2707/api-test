package com.example.api.design;

import com.example.api.design.singleton.BaseSingeton;
import com.example.api.design.singleton.LazySingleton;
import com.example.api.design.singleton.SyncNonBlockingSingleton;
import com.example.api.design.singleton.SyncSingeton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Singleton {

    public static void main(String[] args){
       BaseSingeton s1 = BaseSingeton.getInstance();
       BaseSingeton s2  = BaseSingeton.getInstance();
        log.info(s1.toString());
        log.info(s2.toString());

        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        log.info(l1.toString());
        log.info(l2.toString());

        SyncSingeton syncSingeton = SyncSingeton.getInstance();
        SyncSingeton syncSingleton1 = SyncSingeton.getInstance();
        log.info(syncSingleton1.toString());
        log.info(syncSingeton.toString());
        SyncNonBlockingSingleton sn1 = SyncNonBlockingSingleton.getInstance();
        SyncNonBlockingSingleton sn2 = SyncNonBlockingSingleton.getInstance();
        log.info(sn1.toString());
        log.info(sn2.toString());

    }
}
