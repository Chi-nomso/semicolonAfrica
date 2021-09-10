package Chapter6Exercises;

public class TableOfBinaryOctalHexadecimalNumbers {
    public static String getBinaryValue(int number){
        String decimal = Integer.toBinaryString(number);
        return decimal;
    }

    public static String getOctalValue(int number){
        String decimal = Integer.toOctalString(number);
        return decimal;
    }

    public static String getHexadecimalValue(int number){
        String decimal = Integer.toHexString(number);
        return decimal;
    }

    public static void main(String[] args) {
        System.out.printf("%s%25s%25s%25s", "Number","BinaryValue", "OctalValue", "HexadecimalValue");
       for (int i = 0; i <= 256; i++) {
           System.out.printf("%d%25s%25s%25s%n",i,TableOfBinaryOctalHexadecimalNumbers.getBinaryValue(i),TableOfBinaryOctalHexadecimalNumbers.getOctalValue(i),TableOfBinaryOctalHexadecimalNumbers.getHexadecimalValue(i));
//            System.out.println(TableOfBinaryOctalHexadecimalNumbers.getOctalValue(i));
//            System.out.println(TableOfBinaryOctalHexadecimalNumbers.getHexadecimalValue(i));

        }


    }
}
