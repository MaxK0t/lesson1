package by.academy.lesson1;

public class Main {
    static int number = 1;
    static Integer b = number;
    static char point = '.';


    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Sergey");
        person1.setAge(32);
        person1.setHeight(2.03);
        person1.getName();
        person1.getAge();
        person1.getHeight();

        Person person2 = new Person();
        person2.setName("Igor");
        person2.setAge(34);
        person2.getName();
        person2.getAge();
        person2.setHeight(1.89);
        person2.getHeight();

        String couch = "out of ";
        int quantity = b + number + 8;
        System.out.println("Total number of coaches in the application is " + (b + number) + " " + couch + quantity + point);


    }


}
