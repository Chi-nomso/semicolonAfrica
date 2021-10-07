package Chapter8Exercises;

public class RectangleClass {
    /** >>> Rectangle class with instance variables length and width
     * >>> Generate Test for this class
     * >>> set and get the instance variables
     * >>> verify that the length and width is a float value >0.0 and < 20.0
     * >>> create methods to calculate the perimeter and area.
     * >>>(Perimeter = 2 *(length + width))
     * >>>(Area = length * width)
     * * */

    private double length;
    private double width;


    public void setLength(double length) {
        if(length > 0.0 && length < 20.0){this.length = length;
    }else {
            System.out.println("Kindly provide  a Decimal number");
        }
    }


    public double getLength() {
        return length;
    }

    public void setWidth(double width) {if(width > 0.0 && width < 20.0){
            this.width = width;
        }else {
            System.out.println("Kindly provide  a Decimal number");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getParameter() {
        return 2 *(length + width);
    }


    public double getArea() {
       return(length * width);
    }
}