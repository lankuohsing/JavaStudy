package com.example.animal;

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
    public static void main(String[] args) {
	// write your code here
        Mouse mouse1=new Mouse("mouse1",1);
        Penguin penguin1=new Penguin("penguin1",2);
        mouse1.introduction();
        penguin1.introduction();
    }
}
