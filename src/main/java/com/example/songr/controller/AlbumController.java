package com.example.songr.controller;
import com.example.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @GetMapping("/Album")
   public String albums (Model modelOne) {

        Album one = new Album("ya ana ya la","Amr Diab",5,10,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy3wqjzyfgaZFLvrwDY7Px4pgLrcZdcHQ0Ig&usqp=CAU");
        Album two = new Album("3ala bali","shereen abdelwahab",4,20,"https://upload.wikimedia.org/wikipedia/commons/4/49/%D8%B4%D9%8A%D8%B1%D9%8A%D9%86.jpg");
        Album three = new Album("salamat","Nancy",9,80,"https://yt3.ggpht.com/1qwv3D_Q-taogErjMjeicbrKjL7kGJhBXDnsbY7ZMGsaJS88xW2aIqtyqDpUNxZWvYnfdp8R=s900-c-k-c0x00ffffff-no-rj");

        List<Album> albumsTest = new ArrayList<>();

              albumsTest.add(one);
              albumsTest.add(two);
              albumsTest.add(three);

              modelOne.addAttribute("albums",albumsTest);


        return "Album";
    }


}
