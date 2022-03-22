package cat.uvic.teknos.m06.java2gradle;


public class Square{

    public int side;
    private int area;

    public Square(int side){
        this.side = side;
        this.area = side * side;
    }

    public Square(){

    }

    public int getArea(){
        return this.area;
    }

    public void setSquare(int side){
        this.side = side;
    }

    public void setArea(){
            
    }

}