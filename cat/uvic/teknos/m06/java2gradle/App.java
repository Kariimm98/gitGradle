package cat.uvic.teknos.m06.java2gradle;


//import cat.uvic.teknos.m06.java2gradle.Square;
import org.apache.commons.lang3.math.*;

public class App {
    
    public static int sumarArea(int side){
        return side * side;
        
    }
    public static void main(String[] args){
        
  //      var square  = new Square();
   //     var squareArea = square.getArea();

        var numberUtil = new NumberUtils();
        var integers = new int [] { 23, 56, 78, 189, 1};
        
        System.out.println("min: "+ numberUtil.min(integers) + "max: " + numberUtil.max(integers));
        //System.out.println("area del quadrado es: " + squareArea);
    }


}
