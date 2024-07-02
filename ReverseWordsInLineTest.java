import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInLineTest {

    @Test
    public void ReverseWordsInLineTest() {

        assertEquals("My Name is Shyam!", ReverseWordsInLine.reverse("yM emaN si mayhS!"));

        assertEquals("oLLeH", ReverseWordsInLine.reverse("HeLLo"));

        assertEquals("Hitesh.", ReverseWordsInLine.reverse("hsetiH."));

        assertEquals("olleH!", ReverseWordsInLine.reverse("Hello!"));

        assertEquals("Nikhil?", ReverseWordsInLine.reverse("?lihkiN"));
    }

}
