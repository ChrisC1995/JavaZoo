package Zoo;
import java.util.Scanner;

/**
 * Created by christiancampbell on 10/11/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        while(true){
        System.out.println("**********************" + "\n" + "What would you like to accomplish at our Zoo?" + "\n" + "Press 1 to add people records" + "\n" + "Press 2 to add Animals" + "\n" + "Press 3 to see all records entered" + "\n" + "Press 4 to exit" + "\n" + "**********************");
        int choice = scanner.nextInt();

               switch(choice){
                   case 1:
                       Person.pick();
                       break;
                   case 2:
                       Animal.buildAnAnimal();
                       break;
                   case 3:
                       Person.displayArray();
                       Animal.displayArray();
                       break;

               }

        if( choice == 4){
            break;
        }
        }
    }
}
