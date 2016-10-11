package Zoo;


import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by christiancampbell on 10/11/16.
 */
public class Person {

    public static ArrayList <String> list = new ArrayList<>();

    public static Scanner scanner = new Scanner (System.in);

    public String name;
    public String gender;

    public Person(String n, String g){

        name = n;
        gender = g;
    }

    public static String getName(){
        System.out.println("What is your name?");
        String name1 = scanner.nextLine();
        return name1;
    }

    public static String getGender(){
        System.out.println("What is your gender?");
        String gender1 = scanner.nextLine();
        return gender1;
    }

    public static void buildAPerson(){
        Person p1 = new Person (getName(), getGender());

        list.add(p1.displayInfo());
        System.out.println(p1.displayInfo());


    }
    public String displayInfo(){
        return "Name: " + name + "\n" + "Gender: " + gender;

    }

}
