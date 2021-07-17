package africa.semicolon.tddClassPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    /* Wants to create an E-Diary that has Entry class
     */
    @Test
    public void entryCanBeCreated(){
        Entry entry = new Entry();
        assertNotNull(entry);
    }

    @Test
    public void entryHasDateAfterCreation(){
        Entry entry = new Entry();
        System.out.println(entry.getDateTime());
        assertNotNull(entry.getDateTime());
    }

    @Test
    public void entryHasATitle(){
        Entry entry = new Entry();
        entry.setTitle("My Break up Experience");
        assertEquals("My Break up Experience", entry.getTitle());
    }

    @Test
    public void entryHasABody(){
        Entry entry = new Entry();
        String entryBody= """
                I used to love him but he started misbehaving. He said he wanted some time apart
                i should find my way.
                """;
        entry.setBody(entryBody);
        assertEquals(entryBody,entry.getentryBody());
    }
}
