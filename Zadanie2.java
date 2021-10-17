/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

/**
 *
 * @author w65143
 */
public class Zadanie2 {
public int naj(int[] liczby){
 int naj = liczby[0];
 if(liczby[1]>naj){
 naj=liczby[1];
 }
 if(liczby[2]>naj){
 naj=liczby[2];
 }
 return naj;
}


   public static void main(String[] args) {
   Zadanie2 zad = new Zadanie2();
   int[] liczby = new int[] {1,2,3};
   System.out.println(zad.naj(liczby));
   
}

    
}
