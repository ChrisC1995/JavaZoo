package Zoo;
import java.util.Scanner;

/**
 * Created by christiancampbell on 10/11/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("What would you like to accomplish at our Zoo?" + "\n" + "Press 1 to add visitors records" + "\n" + "Press 2 to add Animals" + "\n" + "Press 3 for help" + "\n" + "Press 4 to exit");
        int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    Person.buildAPerson();
                    break;
            }

    }
}
