package com.fcm.musicapi.repository;

import com.fcm.musicapi.domain.Music;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MusicRepository extends PagingAndSortingRepository<Music, Long> {

    Iterable<Music> findByArtistName(String artistName);
}
