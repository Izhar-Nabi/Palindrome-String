package PalindromeString;
import java.util.Scanner;
public class Palindrome {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("\t *********Enter the String for Check The Palindrome or Not*******");
        String data = input.nextLine();
        StringBuilder data2= new StringBuilder(data);
        String empty= "";
        for (int i= data2.length()-1; i>=0; i--) {
            empty =empty+data2.charAt(i);
        }
        System.out.println("reverse String is "+empty);
        if (empty.equalsIgnoreCase(data)){
            System.out.println("Given String is Palindrome ");
        }
        else{
            System.out.println("Given String  isn't palindrome");
        }
    }
}
