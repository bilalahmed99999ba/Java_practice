package com.company;


class Addition{
    int sum=0;
    void add(int x){
        sum+=x;
        System.out.println("Total: " +sum);
    }
    void add(int x, int y){
        sum= x+y;
        System.out.println("Total: " +sum);
    }
    void add(int x , int y , int z){
        sum = x+y+z;
        System.out.println("Total: " +sum);
    }



}
public class cwh_add_NUmbers_from_user {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(2);
        obj.add(2,3);
        obj.add(2,3, 4);
    }
}
