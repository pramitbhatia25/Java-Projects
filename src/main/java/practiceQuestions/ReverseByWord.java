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
public class ReverseByWord {
    public static void main(String[] Args){
        
        System.out.println("Enter String To Reverse: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int cha = 0;
        for(int i = a.length() - 1; i >= 0; i--)
        {
            if(a.charAt(i) == ' '){cha++;}
        }
        int lindex = 0;
        String[] b = a.split(" ");
        for(int i = cha; i >= 0; i--)
        {
            System.out.print(b[i] + " ");
            
        }
        
        
        
        
        System.out.println(b + "     " + cha);
        
    }
}
