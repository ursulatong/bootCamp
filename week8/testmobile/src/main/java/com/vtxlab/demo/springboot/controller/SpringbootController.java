package com.vtxlab.demo.springboot.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SpringbootController {
  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "AC51b3788dc95dd2635edf8e6f49961474";
  public static final String AUTH_TOKEN = "[6dd079ce43be7c7e0e4b30b66037f036]";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(
        new com.twilio.type.PhoneNumber("whatsapp:+85295072237"),
        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
        "Goog Job, Man!")
        .create();

    System.out.println(message.getSid());
  }
}
