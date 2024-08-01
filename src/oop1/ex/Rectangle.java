package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    boolean isSquare(){
        return  width == height;
    }
    // 여기서는 매개변수를 굳이 쓰지 않아도 된다.
}
