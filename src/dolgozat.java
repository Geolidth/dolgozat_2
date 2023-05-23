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
        a = getSides("Kérem az 'a' oldalt: ");
        b = getSides("Kérem a 'b' oldalt: ");
        c = getSides("Kérem a 'c' oldalt: ");
        V = clacParalelepipedon(a, b, c);
        System.out.println("A Paralelepipedon térfogata: " + V);
    }

    static public double getSides(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String strNumber = scan.nextLine();
        checkInput(strNumber, text);
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


    static public double clacParalelepipedon(Double a, Double b, Double c) {
        Double number = a * b * c;
        return number;
    }
}
