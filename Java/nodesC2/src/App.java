package gdg;
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
       //the older version no challenge
       /*Scanner input = new Scanner(System.in);  
       System.out.print("what is your name? ");
       String name=input.nextLine();
       System.out.println("Hello, "+name+", nice to meet you!");*/
       
       
       //challenge1 print name without variables + differnet greeting
       Scanner input= new Scanner(System.in);
       Random random= new Random();
       
       //part 2 of callenge by crete array of greeting and chose one randomly by random libray
       String[] welcs={"Hello ","Greetings ", "Welcome ", "Welcome back "};
       System.out.print("what is your name? ");
       int gre=random.nextInt(4);
       
       //part 1 by input.next takes inputs directly no varaibles
       System.out.println(welcs[gre]+ input.next()); 
    }
}
