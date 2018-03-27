package square;
public class RectangularPrism extends main {
    public double height;
    
    public RectangularPrism(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    
    public double Volume_R (){
        return length1*length1*height;     
    }
    public double SA_R(){
        return Math.pow(length1,2)*2 + 4*length1*height;
    } 
   
}
