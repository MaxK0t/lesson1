package by.academy.lesson1;

public class Person {
    private String name;
    private byte b;
    private Byte b1;
    private short s;
    private Short s1;
    private int age;
    private Integer i = 134;
    private double height;
    private Long l1;

    private boolean bl;
    private Boolean bl1;
    private char metre = 'm';
    private Character ch = ';';
    private char point = '.';

    public void getName() {
        System.out.println("The coach's name is " + name + ch);
    }

    public void setName(String n) {
        name = n;
    }

    public void getAge() {
        System.out.println("His age is " + age + ch);
    }

    public void setAge(int b) {
        age = b;
    }

    public void getHeight() {
        System.out.println("He has a height of " + height + metre + point);
    }

    public void setHeight(double l) {
        height = l;
    }


}

