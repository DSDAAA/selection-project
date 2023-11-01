package com.dsdaaa.service;

public interface SmsService {
    void sendSms(String phone, String validateCode);

    void sendValidateCode(String phone);
}
