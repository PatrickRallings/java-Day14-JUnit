package Abbreviations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviationsTest {

    Abbreviations a;
    @BeforeEach
    void setUp(){
        a = new Abbreviations();
    }

    @Test
    @DisplayName("Testing instantiation")
    void checkingInstanceExist(){
        assertNotNull(a);
    }

    @Test
    @DisplayName("Checking that abbreviations hashmap exists")
    void checkingHashMapExist(){
        assertNotNull(a.abbreviationsMap);
    }

    @Test
    @DisplayName("Checking abbreviation key/value pair is successfully added to hashmap (Case: abrev, abbreviation)")
    void checkingKeyValuePairAccuracy(){
        a.addAbbreviation("abrev", "abbreviation");
        assertEquals("abbreviation", a.abbreviationsMap.get("abrev"));
    }

    @Test
    @DisplayName("Checking the method for getting the abbreviation from the hasmap")
    void checkingGetMethod(){
        a.addAbbreviation("abrev", "abbreviation");
        assertEquals("abbreviation", a.findExplanationFor("abrev"));
    }
}