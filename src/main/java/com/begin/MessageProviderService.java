package com.begin;

import org.springframework.stereotype.Service;

@Service("provider")
public class MessageProviderService implements MessageProvider{

    public String getMessage() {
        return "Hello world!";
    }
}
