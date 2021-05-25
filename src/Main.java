
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String[] pesanan = {"1. Coffe Latte", "2. Arabica coffe", "3. Robusta Coffe", "4. Luwak Coffe", "5. Teh Tarik"};   
       System.out.println("Menu Pesanan");
       for(int i=0; i < 5; i++){
            System.out.println(pesanan[i]);
       }
       Scanner userInput = new Scanner(System.in);
        System.out.println("===================="); 
       System.out.println("masukkan pilihan menu");
        int pilihanUser = userInput.nextInt();
        int index = pilihanUser - 1;
        System.out.println("Anda memesan " + pesanan[index]);
        
    }
}
