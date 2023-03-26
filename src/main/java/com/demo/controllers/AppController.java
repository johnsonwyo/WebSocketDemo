package com.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.sockets.Socket;

import javax.websocket.EncodeException;
import java.io.IOException;

@Controller
@RequestMapping(value = "/server")
public class AppController {
    @RequestMapping(value = "/send")
    public ResponseEntity<String> testSocket(@RequestParam("message") String message) throws IOException, EncodeException {
        Socket.broadcast(message);
        String successMessage = String.format("Operation completed! " +
                "Message sent to %s listeners", Socket.listeners.size());
        return new ResponseEntity<>(successMessage, HttpStatus.OK);
    }
}
