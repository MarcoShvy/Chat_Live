package com.example.LiveChat.controller;

import com.example.LiveChat.domain.ChatInput;
import com.example.LiveChat.domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LiveChatController {


    @MessageMapping("/new-message")
    @SendTo("/topics/livechat")
    public ChatOutput newMessage(ChatInput messageIN) {
        return new ChatOutput(HtmlUtils.htmlEscape(messageIN.user() + ": " + messageIN.message()));
    }
}
