package square;
import java.util.Scanner;
public class Cube extends main {
    public double height;
    
    public Cube(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    
    public double Volume_C (){
        return length1*length1*height;     
    }
    public double SA_C(){
        return Math.pow(length1,2)*6;
    } 
   
}
