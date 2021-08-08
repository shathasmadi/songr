import com.example.songr.model.Album;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    @Test public void testOfAlbum(){
     Album test = new Album ("title","artist",7,9,"imageUrl");

       assertEquals("title",test.getTitle());
       assertEquals("imageUrl",test.getImageUrl());
       assertEquals(7,test.getSongCount());

       test.setImageUrl("image");
       assertEquals("image",test.getImageUrl());


    }
}
