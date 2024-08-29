import java.util.Scanner;

public class Ds5 {

    public static void main(String[] args) {

        int even = 0; 
        
        int odd = 0;

        numberRequest(even, odd);
        
    }

    public static void numberRequest(int even, int odd) {

        Scanner input = new Scanner(System.in);

        boolean go = true;

        while(go) {

            int i = input.nextInt();

            if (i % 2 == 0)
                even += i;

            else
                odd += i;

            System.out.println("Deseja continuar?");

            go = input.nextBoolean(); 

        } 

        input.close();

        System.out.println("Soma impar: " + odd + "\nSoma par: " + even);

        return;

    }
    
}