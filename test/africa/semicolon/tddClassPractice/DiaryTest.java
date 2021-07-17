package africa.semicolon.tddClassPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    public void diaryCanBeCreated(){
        /* Below, we're creating a diary constructor with an argument of type
        string ---> "love stories"
         */
        Diary diary = new Diary("Love Stories");
        assertNotNull(diary);
        assertEquals("Love Stories",diary.getTitle());
    }

    @Test
    public void dairyCanAddEntry(){
        /* Here we are testing that the diary should have an entry
            we first create an object of type entry and the add the entry
            to the diary, by using the method --> "diary.addEntry(entry)" with argument (entry)
            which is the entry object that was created.
            we are using an array list(in the dairy class) because the entries in the diary can be more than
            1page.
         */

        Diary diary = new Diary("Nomso Dairy");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of Ordinary Cake...");

        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());

        diary.addEntry(entry);
        assertEquals(2, diary.getNumberOfEntries());

    }

    @Test
    public void dairyCanAddEntriesAsString(){
        Diary diary = new Diary("Blessing's Dairy");
        diary.addEntry("Heart don tear finish", "it was a teary day");
        assertEquals(1,diary.getNumberOfEntries());
        diary.addEntry("he came begging","check next");
        assertEquals(2,diary.getNumberOfEntries());
    }

    @Test
    public void entriesCanBeSearchedByTitle(){
        Diary diary = new Diary("Blessing's Dairy");
        Entry entry = new Entry();
        entry.setTitle("Heart don tear finish");
        entry.setBody("it was a teary day");
        diary.addEntry(entry);
        diary.addEntry("he came begging","check next");

        Entry foundEntry = diary.findEntryByTitle("Heart don tear finish");
        assertEquals(foundEntry, entry);
    }

    @Test
    public void diaryCanDeleteByTitle(){
        Diary diary = new Diary("Blessing's Dairy");
        Entry entry = new Entry();
        entry.setTitle("Heart don tear finish");
        entry.setBody("it was a teary day");
        diary.addEntry(entry);
        diary.addEntry("he came begging","check next");
        assertEquals(2, diary.getNumberOfEntries());

        diary.deleteEntryByTitle("he came begging");
        assertEquals(1,diary.getNumberOfEntries());
    }
}
