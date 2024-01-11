import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackSolitaire {

    public static void play(){
        ArrayList<Card> randomCard = Card.cards();
        Deck deck = new Deck();
        int userNum =0;

        int loop =0;
        while (loop <20){
            String currentCard = randomCard.get(loop).name;
            System.out.printf("Current card is: %s\n", currentCard);

            deck.printPos();
            userNum = inPutNum();
            deck.put(userNum, randomCard.get(loop));

            loop++;
        }
        deck.printPos();
        deck.put(userNum, randomCard.get(loop));

        int score = sum(randomCard);
        System.out.printf("Game over! your fianl score is %d\n",score);

    }


    //new mark, to check whether the input number is already in the list
    private static ArrayList<Integer> mark = new ArrayList<>();
    public static int inPutNum(){
        int userInput = 0;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Choose a position(1-20)");
            int userIn = input.nextInt();

            if(userIn < 1 || userIn > 20){
                System.out.println("Invalid input, please choose a position(1-20) again");
                continue;
            }
            if(mark.contains(userIn)){
                System.out.println("This number has already been entered. Please enter a unique number.");
                continue;
            }else {
                mark.add(userIn);
                userInput = userIn;
                break;
            }
        }
        return userInput;

    }



    public static int sum( ArrayList<Card> card ){

        int[][] calculate = new int[][] {
                {0,1,2,3,4},
                {5,6,7,8,9},
                {10,11,12 },
                {13,14,15},
                {0,5},
                {1,6,10,13},
                {3,8,12,15},
                {4,9}
        };


        int socre =0;

        for(int i =0; i< calculate.length; i++){
            int finalSum = 0;
            boolean hasA = false;
            for(int j =0; j<calculate[i].length; j++){
                Card finalCard = card.get(calculate[i][j]);
                finalSum += finalCard.value;
                hasA |= finalCard.name.startsWith("A");
            }

            if(finalSum <= 11 && hasA){
                finalSum += 10;
            }

            if(finalSum == 21){
                if(calculate[i].length == 2){
                    socre += 10;
                }else {
                    socre += 7;
                }
            }else if(finalSum == 20){
                socre += 5;
            }else if(finalSum == 19){
                socre += 4;
            }else if(finalSum == 18){
                socre += 3;
            }else if(finalSum == 17){
                socre += 2;
            }else if(finalSum <= 16){
                socre += 1;
            }else if(finalSum >21){
                socre +=0;
            }

        }

        return socre;
    }




}