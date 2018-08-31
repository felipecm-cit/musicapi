package com.fcm.musicapi.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {

    @Id
    private Long id;

    private String name;

    private Integer year;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "artist")
    private Set<Music> musics = new HashSet<>();

    public Set<Music> getMusics() {
        return musics;
    }

    public void setMusics(Set<Music> musics) {
        this.musics = musics;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
