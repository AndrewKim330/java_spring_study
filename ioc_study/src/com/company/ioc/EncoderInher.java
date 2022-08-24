package com.company.ioc;

import java.util.Base64;

public class EncoderInher implements IEncoder{
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
