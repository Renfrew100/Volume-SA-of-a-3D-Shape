package square;
import java.util.Scanner;

public class main {
    
    public double length1;
    public double width1;
    
    public main (double length, double width){
        length1 = length;
        width1 = width;
    }
    
    public double square_Length (){
        return length1;
    }
    
    public double square_Width (){
        return width1;
    }
    
    public double area(){
        return length1*width1;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a length to be used: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("The length entered is " + length + "and the width is " + length);
        main newSquare = new main(length, length);
        System.out.println("The area of the square is:  " + newSquare.area());
    
    }
    
}
