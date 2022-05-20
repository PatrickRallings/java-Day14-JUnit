package Books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book b;
    Book b2;
    @BeforeEach
    void setUp(){
        b = new Book("Dune", 412, 1965);
        b2 = new Book();
    }

    @Test
    @DisplayName("Testing instantiation exists (with params)")
    void checkingExistsB(){
        assertNotNull(b);
    }

    @Test
    @DisplayName("Testing instantiation exists (without params)")
    void checkingExistsB2(){
        assertNotNull(b2);
    }

    @Test
    @DisplayName("Checking accuracy of title (Case: 'Dune')")
    void checkingTitleAccuracy(){
        assertEquals("Dune", b.getTitle());
    }

    @Test
    @DisplayName("Checking accuracy of pagesCount (Case: 412)")
    void checkingPageCountAccuracy(){
        assertEquals(412, b.getPagesCount());
    }

    @Test
    @DisplayName("Checking accuracy of yearPublished (Case: 1965")
    void checkingYearPublishedAccuracy(){
        assertEquals(1965, b.getYearPublished());
    }
}