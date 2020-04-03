package se.lexicon.carl;
import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

/*
    public Rectangle(){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
*/

    public void getArea(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter width:");
        width = input.nextDouble();

        System.out.println("Enter height:");
        height = input.nextDouble();

        System.out.println("The area of the rectangle is " + width*height);

        // Detta borde varit mer OOP, men den här lösningen verkar mer elegant. Och den fungerar.
    }
}
