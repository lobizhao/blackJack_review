import java.util.ArrayList;

public class Deck {

    public Card[] position = new Card[20];
    public void put(int num, Card card){
        position[num-1] = card;
    }

    public void printPos(){

        for(int i = 0; i<5; i++){
            System.out.printf("%-5s",position[i] != null? position[i].name:i+1);
        }

        System.out.print("     ");
        for(int i = 16; i<18; i++){
            System.out.printf("%-5s",position[i] != null? position[i].name:i+1);
        }
        System.out.println();


        for(int i = 5; i<10; i++){
            System.out.printf("%-5s",position[i] != null? position[i].name:i+1);
        }

        System.out.print("     ");
        for(int i = 18; i<20; i++){
            System.out.printf("%-5s",position[i] != null? position[i].name:i+1);
        }
        System.out.println();

        System.out.print("     ");
        for(int i = 10; i<13; i++){
            System.out.printf("%-5s",position[i] != null? position[i].name:i+1);
        }
        System.out.println();

        System.out.print("     ");
        for(int i = 13; i<16;i++ ){
            System.out.printf("%-5s",position[i] != null? position[i].name:i+1);
        }
        System.out.println();
    }

}
