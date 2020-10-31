/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceQuestions;

import java.util.Scanner;

/**
 *
 * @author KIIT
 */
public class MultiplicationTable {
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i = 1; i<= n; i++)
    {
        for(int j = 1; j <= n; j++)
        {
            
            System.out.print("" + i*j);
        }
        System.out.println();
    }
    
    
}



}
