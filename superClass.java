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
    
    /*public double area(){
        return length1*width1;
    }*/
    
    public static void main(String[] args) {
       
        int playAgain = 1;        
        while(playAgain == 1) {
            int shape = 0;
            while(shape != 4) { 

                System.out.println("Do you want to play or quit? (1 or 2)");
                Scanner input = new Scanner(System.in);
                playAgain = input.nextInt();
                
                if (playAgain == 1) {
                    //User inputs length to be used for all classes
                    System.out.println("");
                    System.out.print("Enter a length to be used: ");
                    double length = input.nextDouble();

                    //User inputs height to be used for all classes 
                    System.out.print("Enter a height to be used: ");
                    double height = input.nextDouble();
                    System.out.println("");
                    
                    System.out.println("Enter 1 for volume and SA of cube, 2 for volume and SA fo rectangular prism, "
                            + "3 for volume and SA for square-based pyramid and 4 to quit");
                    shape=input.nextInt();

                    if (shape == 1) {
                        //An object was created for the cube 
                        Cube newCube = new Cube(length, length, height);
                        System.out.println("The Volume of the Cube is " + newCube.Volume_C());
                        System.out.println("The Surface Area of the Cube is " + newCube.SA_C());
                        System.out.println("");
                    }

                    else if (shape == 2) {
                        //An object was created for the rectangular prism  
                        RectangularPrism newPrism = new RectangularPrism(length, length, height);
                        System.out.println("The Volume of the Rectangular Prism is " + newPrism.Volume_R());
                        System.out.println("The Surface Area of the Rectangular Prism is " + newPrism.SA_R());
                        System.out.println("");
                    }

                    else if (shape == 3){
                        //An object was created for the square based pyramid
                        SquareBasedPyramid newPyramid = new SquareBasedPyramid(length,length,height);
                        System.out.println("The Volume of the Square-Based Pyramid is " + newPyramid.Volume_T());
                        System.out.println("The Surface Area of the Square-Based Pyramid is " + newPyramid.SA_T());
                    }

                    else {
                        System.out.println("Thanks for using our application!");
                        break;
                    }
                }
                
                else {
                    playAgain = 2;
                    break;
                }
                
                
            }
    
        }
    }
    
}
