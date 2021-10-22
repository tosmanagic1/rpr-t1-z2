package ba.unsa.etf.rpr;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {


    private static int sumaCifara(int n) {
        int suma = 0;
        while (n!=0) {
            int cifra = n%10;
            suma = suma + cifra;
            n = n/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Brojevi između 1 i " + n + " koji su djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i%sumaCifara(i) == 0 ) {
                System.out.println(i);
            }
        }
    }

}
