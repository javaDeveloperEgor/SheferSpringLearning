package com.begin.chapter4.FactoryBean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestFactory {

    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}
