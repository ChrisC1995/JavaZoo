package Zoo;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by christiancampbell on 10/11/16.
 */
public class Animal {


    public static ArrayList <String> list = new ArrayList<>();

    public static Scanner scanner = new Scanner (System.in);

    String species;
    String type;
    String name;
    String temperament;

    public Animal(String n, String ty, String s, String te){
        species = s;
        type = ty;
        name = n;
        temperament = te;
    }

    public static String getName(){
        System.out.println("What is the animal's name?");
        String name1 = scanner.nextLine();
        return name1;
    }

    public static String getType(){
        System.out.println("What is the animal's type?");
        String type1 = scanner.nextLine();
        return type1;
    }
    public static String getSpecies(){
    System.out.println("What is the animal's species?");
    String species1 = scanner.nextLine();
        return species1;
    }
    public static String getTemperament(){
        System.out.println("What is the animal's temperament");
        String temperament1 = scanner.nextLine();
        return temperament1;
    }

    public static void buildAnAnimal(){
        Animal a1 = new Animal (getName(), getType(), getSpecies(), getTemperament());

        list.add(a1.displayInfo());
        System.out.println(a1.displayInfo());
    }


    public String displayInfo(){
        return "Name: " + name + "\n" + "Type: " + type + "\n" + "Species: " + species + "\n" + "Temperament: " + temperament;

    }
    public static void displayArray(){
            System.out.println("Animals in the zoo: " + "\n");
            for(String Items : list){
                System.out.println(Items + "\n");
            }

    }
}
