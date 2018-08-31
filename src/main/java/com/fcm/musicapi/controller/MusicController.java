package com.fcm.musicapi.controller;

import com.fcm.musicapi.service.interfaces.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<?> listAllMusics() {
        return new ResponseEntity<>(musicService.getAllMusics(), HttpStatus.OK);
    }
}
