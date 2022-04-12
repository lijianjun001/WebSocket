package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/message")
public class MsgController {

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendMsg(String msg) {
        MsgUtil.sendMsg(msg);
        return "success";
    }
}
