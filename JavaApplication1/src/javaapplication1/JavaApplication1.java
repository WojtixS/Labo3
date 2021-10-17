/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author w65143
 */
public class JavaApplication1 {
public int suma(int[] liczby){
 return liczby[0]+liczby[1];
}

   public static void main(String[] args) {
   JavaApplication1 zad = new JavaApplication1();
   int[] liczby = {1, 2};
   System.out.println(zad.suma(liczby));
}

    
}

