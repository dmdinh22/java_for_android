/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        //String weather = "rainy";
        String weather = "sunny";
        //String weather = "windy";
        //String weather = "snowy";
        if(weather == "rainy"){
            System.out.println("Don't forget to bring your umbrella.");
        }else if(weather == "sunny"){
            System.out.println("Don't forget your sunglasses.");
        }else if(weather == "windy"){
            System.out.println("Don't forget to bring your coat.");
        }else{
            System.out.println("Enjoy the snow!");
        }
    }
}
