package com.example.demo;

public class MsgUtil {


    public static void sendMsg(String message) {
        SpringUtils.getBean(WebSocketServer.class).sendAllMessage(message);
    }
}
