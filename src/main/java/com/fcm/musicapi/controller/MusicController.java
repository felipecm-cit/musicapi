package com.fcm.musicapi.controller;

import com.fcm.musicapi.service.interfaces.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<?> listAllMusic(@RequestParam(value = "artist", required = false) String artist) {
        if(artist != null) {
            return new ResponseEntity<>(musicService.getAllByArtist(artist), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(musicService.getAllMusics(), HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> listMusic(@PathVariable Long id) {
        return new ResponseEntity<>(musicService.getMusicById(id), HttpStatus.OK);
    }
}
