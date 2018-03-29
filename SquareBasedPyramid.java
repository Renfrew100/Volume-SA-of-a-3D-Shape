package square;
public class SquareBasedPyramid extends main {
    public double height;
    
    public SquareBasedPyramid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    
    public double Volume_S (){
        return (length1*length1*height)/3;     
    }
    public double SA_S(){
        return Math.pow(length1,2) + 2*length1*(Math.sqrt(Math.pow(length1,2)/4 + Math.pow(height,2)));
    } 
  
    
}
