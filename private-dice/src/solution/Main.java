package solution;

public class Main {
    public static void main(String[]args){
        //tests PairOfDice
        PairOfDice dice = new PairOfDice();
        while(dice.getDiceTally()!=2){
            dice.roll();
        }
        System.out.println("The number of times the dice had to be rolled to get a tally of 2 was " + dice.getRollCounter());
    }
}
