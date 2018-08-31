package com.fcm.musicapi.service;

import com.fcm.musicapi.domain.Music;
import com.fcm.musicapi.repository.MusicRepository;
import com.fcm.musicapi.service.interfaces.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicRepository musicRepository;


    @Override
    public Iterable<Music> getAllMusics() {
        return musicRepository.findAll();
    }

    @Override
    public Music getMusicById(Long id) {
        return musicRepository.findById(id).get();
    }

    @Override
    public Iterable<Music> getAllByArtist(String artistName) {
        return musicRepository.findByArtistName(artistName);
    }
}
