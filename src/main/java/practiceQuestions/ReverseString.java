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
public class ReverseString {
    public static void main(String[] Args){
        
        System.out.println("Enter String To Reverse: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        for(int i = a.length() - 1; i >= 0; i--)
        {
            b += a.charAt(i);
        }
        System.out.print(b);
        
    }
}
