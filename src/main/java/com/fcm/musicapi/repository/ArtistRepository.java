package com.fcm.musicapi.repository;

import com.fcm.musicapi.domain.Artist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Long> {

    Iterable<Artist> findByYear(Integer year);

}
