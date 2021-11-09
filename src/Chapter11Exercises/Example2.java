package Chapter11Exercises;

public class Example2 {
    public String findEmail(String firstname, String lastname)throws IllegalArgumentException{
        String email = firstname + lastname + "@gmail.com";
        return email;
    }
}
