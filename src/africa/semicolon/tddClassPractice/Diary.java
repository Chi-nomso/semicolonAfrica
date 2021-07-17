package africa.semicolon.tddClassPractice;

import java.util.ArrayList;

public class Diary {
    private  final String title;
    //private String diaryEntry;
    private ArrayList<Entry> entries;



    public Diary(String diaryTitle) {
        title = diaryTitle;
        entries = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void addEntry(String entryTitle, String entryBody) {
        Entry entry = new Entry();
        entry.setBody(entryBody);
        entry.setTitle(entryTitle);
        addEntry(entry);
    }

    public Entry findEntryByTitle(String title) {
        for(int i = 0; i< entries.size(); i++){
            if(entries.get(i).getTitle().equals(title)){
                return  entries.get(i);
            }
        }
        return  null;

        //enhance for loop below


//        for(Entry entry:entries){
//            if(entry.getTitle().equals(title)){
//                return entry;
//            }
//        }
//        return null;
    }

    public void deleteEntryByTitle(String title) {
        Entry foundEntry = findEntryByTitle(title);
        entries.remove(foundEntry);
    }

    public ArrayList<Entry> getAllEntries() {
        return entries;
    }
}
