package com.example.songr.controller;

import com.example.songr.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository <Song,Integer>{

}
