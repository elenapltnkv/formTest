
import org.junit.jupiter.api.Test;
import pages.BookRoomPage;

public class BookRoomTest extends BasicInfo {
BookRoomPage roomPage =new BookRoomPage();

    @Test
    public void positiveBookRoom() {
        roomPage.openPage()
                .setName("Ghsggdg")
                .setEmail("fanny@totot.com")
                .setPhone("79999999995")
                .setSubject("Hello!")
                .setDescription("HHsherg hegreyhrg jerghje");
//        room.openPage();
//        room.setValue();
       roomPage.submitInfo();
    }
}
