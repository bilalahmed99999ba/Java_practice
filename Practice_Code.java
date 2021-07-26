package com.company;
import java.util.Scanner;

abstract class Shape{
    abstract void Draw();
    abstract void Colour();
}

class Child_Shape extends Shape{
    void Draw()
    {
        System.out.println("Drawing....");
    }

    void Colour()
    {
        System.out.println("colouring...");
    }


}
public class Practice_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Child_Shape obj = new Child_Shape();

        System.out.println(" 1 ---- colouring  \n 2 ---- drawing");
        System.out.println("Choose a operation:  ");
        int input = sc.nextInt();
        switch(input){
            case 1:
                obj.Colour();
                break;
            case 2:
                obj.Draw();
                break;

        }
    }
}