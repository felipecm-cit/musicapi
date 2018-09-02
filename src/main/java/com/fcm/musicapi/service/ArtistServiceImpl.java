package com.fcm.musicapi.service;

import com.fcm.musicapi.domain.Artist;
import com.fcm.musicapi.repository.ArtistRepository;
import com.fcm.musicapi.service.interfaces.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public Iterable<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Iterable<Artist> getArtistByYear(Integer year) {
        return artistRepository.findByYear(year);
    }
}
