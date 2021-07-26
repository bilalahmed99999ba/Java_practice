package com.company;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

class Student_Details{
    String name, fname;
    int id, sems;
    float gpa;
    char section;

    Scanner sc = new Scanner(System.in);
    void Display()
    {
        System.out.println(" ");
        System.out.println("-----------Student Details-----------");
        System.out.println("Name: " +name);
        System.out.println("Father Name: " +fname);
        System.out.println("Student ID: " +id);
        System.out.println("Semster Number: " +sems);
        System.out.println("Section: " +section);
        System.out.println("Gpa: " +gpa);
    }

    void setter()
    {
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Father Name: ");
        fname = sc.nextLine();
        System.out.println("Enter Student ID: " );
        id = sc.nextInt();
        System.out.println("Enter Semster Number: " );
        sems = sc.nextInt();
        System.out.println("Enter Section: " );
        section = sc.next().charAt(0);
        System.out.println("Enter Gpa: " );
        gpa = sc.nextFloat();
    }

}

class Marks extends Student_Details{

    float [] course = new float[3];
    float sum=0, perc=0;

void setCourse()
{
    int a =0;
    for (int i =0; i<3; i++)
    {
        a= i+1;
        System.out.print("Enter marks " +a);
        System.out.print(": ");
        course[i] = sc.nextFloat();
        System.out.println("");

    }

}
    void getCourse()
    {
        System.out.println(" ");
        System.out.println("-------------Student Marks-------------");
        int a=0;
        for (int i =0; i<3; i++)
        { a= i+1;
            System.out.print("Course "+a );
            System.out.print(" marks : " +course[i]);
            System.out.println(" ");
        }

    }




    public void Sum_perc()
    {
        for (int i =0; i<3; i++)
        {
         sum += course[i];
        }
        perc = sum/3;
        System.out.println("Total Marks: " +sum);
        System.out.print("Percentage: " +perc);
    }

}



public class student_info {
    public static void main(String[] args) {
        Marks obj = new Marks();

       obj.setter();
       obj.setCourse();

        obj.Display();
        obj.getCourse();
        obj.Sum_perc();

    }
}
