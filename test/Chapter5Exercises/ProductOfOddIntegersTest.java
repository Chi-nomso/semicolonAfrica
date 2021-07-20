package Chapter5Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfOddIntegersTest {
    @Test
public void ProductOfOddNumbersFromOneToFifteen(){
        ProductOfOddIntegers product = new ProductOfOddIntegers();
        assertEquals(2027025, product.getProductOfOddNumbers());
    }


}