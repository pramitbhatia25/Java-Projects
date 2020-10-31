/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptExamples;

import java.util.Scanner;

/**
 *
 * @author KIIT
 */
public class Fibonacci {
    
    
    public static void main(String[] Args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] f = new int[n+4];
        int n1 = 0; int n2 = 1;
        f[0] = n1;f[1] = n2;
        for(int i = 0; i < n+2; i++)
        {
            int s = n2;
            n2 = n1+n2;
            n1 = s;
            f[i+2] = n2;
        }
        boolean fs = false;
        for(int i = 0; i <n+5; i++)
        {
           System.out.println(i + "   " + f[i] + "   "+ n);
            if(f[i] == n){fs = true;break;}
        }
        System.out.println("" + fs);
    }
    
}
