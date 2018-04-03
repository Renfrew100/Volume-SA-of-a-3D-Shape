package square;
import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    
    public double length1;
    public double width1;
    
    public main (double length, double width){
       this.length1 = length;
       this.width1 = width;
    }
    
    public double square_Length (){
        return length1;
    }
    
    public double square_Width (){
        return width1;
    }
  
    public static void main(String[] args) {
        
        double length = 0;
        double height = 0;
        int playAgain = 1;        
        while(playAgain == 1) {
            int shape = 0;
            while(shape != 4) { 
                
                System.out.println("");
                System.out.print("Do you want to play or quit? (1 or 2, respectively): ");
                Scanner input = new Scanner(System.in);
                playAgain = input.nextInt();
                
                if (playAgain == 1) {
                   
                   //Validity of the input of a length
                    do {
                        System.out.print("Enter a length to be used: ");
                        try {
                            length = input.nextDouble();
                
                            if (length < 0) {
                                System.out.println("Please enter a positive value for the length!");
                                System.out.println("");
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Please enter an integer!");
                            input.next(); //Discard the input of a string
                            System.out.println("");
                        } 
                    } while(length < 0);
                    
                    //Validity of the input of a height
                    do {
                        System.out.print("Enter a height to be used: ");
                        try {
                            height = input.nextDouble();
                
                            if (height < 0) {
                                System.out.println("Please enter a positive value for the height!");
                                System.out.println("");
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Please enter an integer!");
                            input.next(); //Discard the input of a string
                            System.out.println("");
                        } 
                    } while(height < 0);
                    
                    System.out.println("");
                    System.out.print("Enter 1 for Volume and SA of Cube, 2 for Volume and SA for Rectangular Prism, "
                            + "3 for Volume and SA for Square-Based Pyramid and 4 to Quit: ");
                    shape=input.nextInt();

                    switch (shape) {
                        case 1:
                            //An object was created for the cube
                            Cube newCube = new Cube(length, length, height);
                            System.out.println("The Volume of the Cube is " + newCube.Volume_C());
                            System.out.println("The Surface Area of the Cube is " + newCube.SA_C());
                            System.out.println("");
                            break;
                        case 2:
                            //An object was created for the rectangular prism
                            RectangularPrism newPrism = new RectangularPrism(length, length, height);
                            System.out.println("The Volume of the Rectangular Prism is " + newPrism.Volume_R());
                            System.out.println("The Surface Area of the Rectangular Prism is " + newPrism.SA_R());
                            System.out.println("");
                            break;
                        case 3:
                            //An object was created for the square based pyramid
                            SquareBasedPyramid newPyramid = new SquareBasedPyramid(length,length,height);
                            System.out.println("The Volume of the Square-Based Pyramid is " + newPyramid.Volume_S());
                            System.out.println("The Surface Area of the Square-Based Pyramid is " + newPyramid.SA_S());
                            System.out.println("");
                            break;
                        default:
                            break;
                    }

                }             
                else {
                    playAgain = 2;
                    System.out.println("Thanks for using our application!");
                    break; 
                }         
            }
        }
    } 
}
