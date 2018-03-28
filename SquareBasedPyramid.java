package square;
public class Square_Based_Pyramid extends main {
    public double height;
    
    public Square_Based_Pyramid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    
    public double Volume_P (){
        return (length1*length1*height)/3;     
    }
    public double SA_P(){
        return Math.pow(length1,2) + 2*length1*(Math.sqrt(Math.pow(length1,2)/4 + Math.pow(height,2)));
    } 
  
    
}
