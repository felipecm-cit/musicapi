package com.fcm.musicapi.controller;

import com.fcm.musicapi.domain.Artist;
import com.fcm.musicapi.repository.ArtistRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<?> listAllArtists() {
        return new ResponseEntity<>(this.artistRepository.findAll(), HttpStatus.OK);
    }

}
