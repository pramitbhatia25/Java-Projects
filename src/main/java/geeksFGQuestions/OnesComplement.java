/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksFGQuestions;

/**
 *
 * @author KIIT
 */
public class OnesComplement {
    public static void main(String[] Args){
       int N = 3;
       String S = "0011010";
       String y = "";
       for(int i = 0; i<N + 4; i++)
       {
           
       if(S.charAt(i) == '0')
       {
           y += '1';
       }
       else if(S.charAt(i) == '1')
       {
           y += '0';
       }
           
       }
       System.out.println("" + y);
    }
}
