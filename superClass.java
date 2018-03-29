package square;
import java.util.Scanner;

public class main {
    
    public double length1;
    public double width1;
    
    public main (double length1, double width1){
       this.length1 = length1;
       this.width1 = width1;
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
    
    while(true) { 
        
        //User inputs length to be used for all classes
        System.out.println("");
        System.out.print("Enter a length to be used: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        /*System.out.println("The length entered is " + length + "and the width is " + length);
        main newSquare = new main(length,length);
        System.out.println("The area of the square is:  " + newSquare.area());*/
        
        //User inputs height to be used for all classes 
        System.out.print("Enter a height to be used: ");
        double height = input.nextDouble();
        System.out.println("");
        
        //An object was created for the cube 
        Cube newCube = new Cube(length, length, height);
        System.out.println("The Volume of the Cube is " + newCube.Volume_C());
        System.out.println("The Surface Area of the Cube is " + newCube.SA_C());
        System.out.println("");
    
        //An object was created for the rectangular prism  
        RectangularPrism newPrism = new RectangularPrism(length, length, height);
        System.out.println("The Volume of the Rectangular Prism is " + newPrism.Volume_R());
        System.out.println("The Surface Area of the Rectangular Prism is " + newPrism.SA_R());
        System.out.println("");
        
        //An object was created for the square based pyramid
        SquareBasedPyramid newPyramid = new SquareBasedPyramid(length,length,height);
        System.out.println("The Volume of the Square-Based Pyramid is " + newPyramid.Volume_S());
        System.out.println("The Surface Area of the Square-Based Pyramid is " + newPyramid.SA_S());
        
    }
    }
    
}
