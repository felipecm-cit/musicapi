package com.fcm.musicapi.service.interfaces;

import com.fcm.musicapi.domain.Artist;

public interface ArtistService {

    Iterable<Artist> getAllArtists();

    Iterable<Artist> getArtistByYear(Integer year);

}
