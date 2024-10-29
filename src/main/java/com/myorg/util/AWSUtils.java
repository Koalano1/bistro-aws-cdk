package com.myorg.util;

import software.amazon.awscdk.Environment;

public class AWSUtils {
    public static Environment makeEnv(String account, String region) {
        return Environment.builder()
                .account(account)
                .region(region)
                .build();
    }
}
