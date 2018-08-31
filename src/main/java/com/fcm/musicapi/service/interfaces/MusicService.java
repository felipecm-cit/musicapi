package com.fcm.musicapi.service.interfaces;

import com.fcm.musicapi.domain.Music;

public interface MusicService {

    Iterable<Music> getAllMusics();

    Iterable<Music> getAllByArtist(String artistName);

    Music getMusicById(Long id);

}
