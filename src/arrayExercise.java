import java.util.ArrayList;
import java.util.Scanner;

public class arrayExercise {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true){
            displayMenu();
            int choice = input.nextInt();
            if(choice ==1){
                System.out.println("input add value");
                //integers.add(input.nextInt()); that also work
                int value = input.nextInt();
                integers.add(value);
            }else if(choice == 2){
                //remove
                System.out.println("which element you want remove?");
                int discard = input.nextInt();
                //check whether the list contains element
                if(integers.contains(discard)){
                    //integers.remove(discard); //this is used to removeindex
                    //but what is that?
                    //ok,fine. it must be keep constance with the arraylist type
                    integers.remove(Integer.valueOf(discard));
                    System.out.printf("removed %d\n",discard);
                }else {
                    System.out.println("No element contains");
                }

            }else if(choice == 3){
                //print
                System.out.println("your list : "+ integers);
            }else if(choice == 4){
                System.out.println("Bey");
                break;
            }
        }

    }

    public static void displayMenu(){
        System.out.println();

        System.out.println("1. Add element");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Your Choice: ");
    }
}
