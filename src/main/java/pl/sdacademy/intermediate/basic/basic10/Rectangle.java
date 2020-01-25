package pl.sdacademy.intermediate.basic.basic10;

public class Rectangle {


    int width;
    int heigh;

    public Rectangle(int width, int heigh) {

        if (width <= 0 || heigh <= 0){
            throw new IllegalArgumentException("width and height must be >=0");

        }
        this.width = width;
        this.heigh = heigh;
    }
    int calculateArea(){
        return width * heigh;
    }
    int calculatePerimeter(){
        return 2 * width + 2 * heigh;
    }
    int getWidth(){
        return width;
    }
}
