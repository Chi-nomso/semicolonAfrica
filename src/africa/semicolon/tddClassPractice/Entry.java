package africa.semicolon.tddClassPractice;

import java.time.LocalDateTime;
import java.time.Month;

public class Entry {
    private LocalDateTime dateTime;
    private String title;
    private String body;


    public Entry(){
        dateTime = LocalDateTime.now();
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setTitle(String entryTitle) {
        title = entryTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String entryBody) {
        body = entryBody;
    }

    public String getentryBody() {
        return body;
    }
}
