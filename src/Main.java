
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// array pesanan       
       String[] pesanan = {"1. Coffe Latte", "2. Arabica coffe", "3. Robusta Coffe", "4. Luwak Coffe", "5. Teh Tarik"};   
       System.out.println("Menu Pesanan");
// looping menu       
       for(int j=0; j < 5; j++){
            System.out.println(pesanan[j]);
       }
// Scan pesanan       
       Scanner userInput = new Scanner(System.in);
       System.out.println("===================="); 
       System.out.println("masukkan pilihan menu");
        int pilihanUser = userInput.nextInt();
        int index = pilihanUser - 1;
        System.out.println("Anda memesan " + pesanan[index]);
        
    }
}
