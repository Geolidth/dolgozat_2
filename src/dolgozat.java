//Csajbók-Reményi László SZOFT I/2/E 2023.05.23. Dolgozat_2

import java.util.Scanner;

public class dolgozat {

    public static void main(String[] args) throws Exception {
        System.out.println("\nCsajbók-Reményi László SZOFT I/2/E 2023.05.23. Dolgozat_2\n");
        double a = 0;
        double b = 0;
        double c = 0;
        double V = 0;
        System.out.println("\\-->  Feladat 0358  <--\\");
        System.out.println("\\-->  A feladat egy Paralelepipedon térfogatát számolja ki a megadott képlettel  <--\\");
        System.out.println("\\-->  https://szit.hu/doku.php?id=oktatas:programozas:feladatok:altalanos#feladat_0358  <--\\\n");
        a = getSides("'a'");
        b = getSides("'b'");
        c = getSides("'c'");
        V = clacParalelepipedon(a, b, c);
        System.out.println("A Paralelepipedon térfogata: " + V);
    }

    static public double getSides(String text) {
        String strNumber ;
        do{Scanner scan = new Scanner(System.in);
        System.out.print("Kérem "+ text + " oldalt: ");
        strNumber= scan.nextLine();
        }while(!checkInput(strNumber, text));
        double number= Double.parseDouble(strNumber);
        return number;
    }

    public static boolean checkInput(String input, String text){
        boolean inputCehck= true;
        if(input.matches("[0-9.]+") && !input.matches("[0.]+")){
            System.out.println(text + " oldal helyes értékű!");
        }
        else{
            System.out.println(text + " oldal nem helyes értékű!");
            inputCehck=false;
        }
        return inputCehck;
    }


    static public double clacParalelepipedon(double a, double b, double c) {
        double number=-1.0;
        if(a!=0 && b!=0 && c!=0){
           number = a*b*c; 
        }
        return number;
    }
}
