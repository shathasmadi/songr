package com.example.songr.controller;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class AlbumController {

      @Autowired
      AlbumRepository albumRepository;

    @GetMapping("/Album")
   public String albums (Model modelOne) {


              modelOne.addAttribute("albums",albumRepository.findAll());


        return "Album";
    }

    @PostMapping("/Album")
       public RedirectView addAlbum(@RequestBody MultiValueMap<String, String> data) {
       Album album = new Album(data.get("title").get(0),data.get("artist").get(0),data.get("songCount").get(0),data.get("length").get(0),data.get("imageUrl").get(0));
       albumRepository.save(album);
       return new RedirectView("/Album");
}

}
