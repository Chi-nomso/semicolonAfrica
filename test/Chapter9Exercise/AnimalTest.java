package Chapter9Exercise;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
     public void testThatPenguinCanFly(){
        Penguine penguine = new Penguine();
        penguine.fly();
    }


}
