import java.util.*;

public class Main{
    public static void main(String[] args){
	int ran=0,hcount=0, tcount=0;
    String name;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Who are you?");
    name = sc.nextLine();
    System.out.println("Hello, " + name + "!");

    System.out.println("Tossing a coin...");
    for(int i=1; i<=3 ; i++){
        ran = random.nextInt(100);
        if(ran%2 == 0){
            System.out.println("Round" + i + ": Heads");
            hcount++;
        } 
        else {
            System.out.println("Round" + i + ": Tails");
            tcount++;
        }
    }

    System.out.println("Heads: " +hcount+ ", Tails: " +tcount);
    if(hcount > tcount) System.out.println(name + " won!");
    else System.out.println(name + " lost!");
    }
    

}
