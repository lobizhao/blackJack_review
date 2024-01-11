import java.util.ArrayList;
import java.util.Collections;

public class Card {
    public int value;
    public String name;

    //for now the Card is a type, just like Integer or String and something else
    public Card(int num, String suit){

        if(num ==1 ){
            name = "A" + suit;
        }else if(num == 11){
            name = "J" + suit;
            value = 10;
        }else if(num == 12){
            name = "Q" +suit;
            value = 10;
        }else if(num == 13){
            name = "K"+suit;
            value = 10;
        }else {
            name = Integer.toString(num) + suit;
        }
        value = num;

    }
    @Override
    public String toString(){
        return name;
    }

    public static ArrayList<Card> cards(){
        ArrayList<Card> cards = new ArrayList<>();
        for(int i =1; i<13; i++){
            cards.add(new Card(i, "H"));    //add hearts
            cards.add(new Card(i, "D"));    //add diamonds
            cards.add(new Card(i, "C"));    //add culbs
            cards.add(new Card(i, "S"));    //add Spades
        }

        Collections.shuffle(cards);
        return cards;
    }

}
