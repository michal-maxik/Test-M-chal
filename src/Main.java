//2.Zadaní D

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//1

int[] pole = {3,4,5,6,7,8,9};
System.out.println("Hodnoty v poli.");


     for (int i = 0; i <pole.length; i++){
         System.out.println(pole[i] + "");
     }
System.out.println();

        System.out.println("Hodnoty v poli naopak");
        for (int i = pole.length -1; i >=0; i--){
            System.out.println(pole[i] + "");
        }


//2.
        System.out.println("Napiš mi velikost pole o čísle N");
        int velikost = sc.nextInt();
        int[] mince = new int[velikost];
        System.out.println("Zadejte " +velikost + " hodnot.");
       for (int i = 0;i< velikost; i++){
           mince[i]= sc.nextInt();
       }
       int soucet = 0;
       for (int i =0;i<mince.length; i++){
           soucet += mince[i];

       }
       int max = mince[0];
       for (int i =0;i<mince.length;i++){
           if (max<mince[i]){
               max = mince[i];
           }
       }

System.out.println(soucet);
       System.out.println(max);





//3.
 Ucitel ucitel = new Ucitel();

        System.out.println("Hodnocení od 1<->10 pro Pepu,Jana,Brunclíka,Jitku");
        int body = sc.nextInt();
        int[] hodnoceni = new int [body];
        for (int i = 0;i< velikost; i++){
            hodnoceni[i]= sc.nextInt();
        }



    }
}