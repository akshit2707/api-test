package com.example.api.design.singleton;

import com.fasterxml.jackson.databind.ser.Serializers;

public class BaseSingeton {
    public static BaseSingeton instance = new BaseSingeton();

    private BaseSingeton () {

    }

    public static BaseSingeton getInstance () {
        return instance;
    }
}
