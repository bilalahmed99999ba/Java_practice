package com.company;

abstract class Imp{
    abstract void meth0();
}
interface Interface1{
    void meth1();
    void meth2();
}

interface Interface2 extends Interface1{
    void meth3();
    void meth4();
}

class Class extends Imp implements Interface1 , Interface2{
    @Override
    void meth0()
    {
        System.out.println("Method 0");
    }

    @Override
    public void meth1() {
        System.out.println("Method 1");
    }
    @Override
    public void meth2() {
        System.out.println("Method 2");
    }
    @Override
    public void meth3() {
        System.out.println("Method 3");
    }
    @Override
    public void meth4() {
        System.out.println("Method 4");
    }

}
public class cwh_interface_inheritance {
    public static void main(String[] args) {
        Class c = new Class();
        c.meth0();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}
