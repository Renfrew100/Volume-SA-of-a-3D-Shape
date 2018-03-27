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
        /*System.out.println("The length entered is " + length + "and the width is " + length);
        main newSquare = new main(length,length);
        System.out.println("The area of the square is:  " + newSquare.area());*/
        
    //User inputs height to be used for a cube
        System.out.println("Enter a height to be used: ");
        double height = input.nextDouble();
        System.out.println("The height entered is " + height);
        Cube newCube = new Cube(length, length, height);
        System.out.println("The volume of the cube is " + newCube.Volume_C());
        System.out.println("The SA of the cube is " + newCube.SA_C());
    
     //An object was created for the rectangular prism  
        RectangularPrism newPrism = new RectangularPrism(length, length, height);
        System.out.println("The volume of the rectangular prism is " + newPrism.Volume_R());
        System.out.println("The SA of the cube is " + newPrism.SA_R());
    }
    
}
