package pVocals;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class VocalsTest {

    @Test
    public void testEsVocal_LowercaseVowel() {
        Vocals vocals = new Vocals();
        assertTrue(vocals.esVocal("a"));
    }

    @Test
    public void testEsVocal_UppercaseVowel() {
        Vocals vocals = new Vocals();
        assertTrue(vocals.esVocal("E"));
    }

    @Test
    public void testEsVocal_Consonant() {
        Vocals vocals = new Vocals();
        assertFalse(vocals.esVocal("z"));
    }

    @Test
    public void testEsVocal_EmptyString() {
        Vocals vocals = new Vocals();
        assertFalse(vocals.esVocal(""));
    }

    @Test
    public void testEsVocal_MultipleCharacters() {
        Vocals vocals = new Vocals();
        assertFalse(vocals.esVocal("abc"));
    }

    @Test
    public void testEsVocal_NullInput() {
        Vocals vocals = new Vocals();
        assertFalse(vocals.esVocal(null));
    }
}