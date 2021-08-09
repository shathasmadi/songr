package com.example.songr.controller;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
//    @Autowired
//    AlbumRepository albumRepository;
    @GetMapping("/Album")
   public  String albums (Model modelOne) {
//
//        Album one = new Album("ya ana ya la","Amr Diab",5,10,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy3wqjzyfgaZFLvrwDY7Px4pgLrcZdcHQ0Ig&usqp=CAU");
//        Album two = new Album("3ala bali","shereen abdelwahab",4,20,"https://upload.wikimedia.org/wikipedia/commons/4/49/%D8%B4%D9%8A%D8%B1%D9%8A%D9%86.jpg");
//        Album three = new Album("salamat","Nancy",9,80,"https://yt3.ggpht.com/1qwv3D_Q-taogErjMjeicbrKjL7kGJhBXDnsbY7ZMGsaJS88xW2aIqtyqDpUNxZWvYnfdp8R=s900-c-k-c0x00ffffff-no-rj");
//
//        List<Album> albumsTest = new ArrayList<Album>();
//
//              albumsTest.add(one);
//              albumsTest.add(two);
//              albumsTest.add(three);

//              modelOne.addAttribute("albums",albumsTest);

             Album albumOne =new Album("ya ana ya la","Amr Diab",5,9,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy3wqjzyfgaZFLvrwDY7Px4pgLrcZdcHQ0Ig&usqp=CAU");
             Album albumTwo =new Album("3ala bali","shereen abdelwahab",20,49,"https://upload.wikimedia.org/wikipedia/commons/4/49/%D8%B4%D9%8A%D8%B1%D9%8A%D9%86.jpg");
             Album albumThree =new Album("salamat","Nancy",58,69,"https://yt3.ggpht.com/1qwv3D_Q-taogErjMjeicbrKjL7kGJhBXDnsbY7ZMGsaJS88xW2aIqtyqDpUNxZWvYnfdp8R=s900-c-k-c0x00ffffff-no-rj");

        List <Album> albumTest = new ArrayList<>();
            albumTest.add(albumOne);
            albumTest.add(albumTwo);
            albumTest.add(albumThree);
           modelOne.addAttribute("albums",albumTest);

           return "Album";
    }
//
//    @PostMapping("/Album")
//    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageUrl) {
//        Album album = new Album(title, artist, songCount, length, imageUrl);
//        albumRepository.save(album);
//        return new RedirectView("/Album");
//    }

}
