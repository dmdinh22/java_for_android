/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        //while example
        int sequenceWhile = 9;

        // as long as the int is less than ten
        while(sequenceWhile < 10){
            System.out.println("while: " + sequenceWhile);
            sequenceWhile++;
        }
        //do-while example
        int sequenceDoWhile = 10;
        // run it once
        do{
            System.out.println("do-while: " + sequenceDoWhile);
            sequenceDoWhile++;
            // keep runing as long as int is less than ten
        } while(sequenceDoWhile < 10);
    }
}
