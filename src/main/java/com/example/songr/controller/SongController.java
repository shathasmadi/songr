package com.example.songr.controller;

import com.example.songr.model.Album;
import com.example.songr.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.Entity;
import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;


    @GetMapping("/Album/{id}")
    public String songs(@PathVariable("id") int id, Model modelOne) {

        modelOne.addAttribute("album",albumRepository.findById(id).get());

        return "Song";
    }

    @GetMapping("/Song")
    public String songs( Model modelOne) {

        modelOne.addAttribute("songs",songRepository.findAll());

        return "allSong";
    }


    @PostMapping("/newsong/{id}")
    public RedirectView newSong (@RequestBody MultiValueMap<String, String> data,@PathVariable("id") int id) {
        Song song= new Song(data.get("title").get(0), data.get("length").get(0), data.get("trackNumber").get(0));
        song.setAlbum(albumRepository.findById(id).get());
        songRepository.save(song);
        return new RedirectView ("/Album/{id}");
    }


}
