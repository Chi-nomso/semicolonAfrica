package Chapter5Exercises;

public class ProductOfOddIntegers {
    public int getProductOfOddNumbers(){
        int product =1;
        for(int i = 1; i <= 15; i+=2){
            product = product * i;
        }
        return product;
    }
}
