/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceQuestions;
import java.util.*;
/**
 *
 * @author KIIT
 */
public class DayFromDate {
public static void main(String[] Args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No of Month: ");
    int month  = sc.nextInt();
    System.out.println("Enter No of Day: ");
    int dayofmonth  = sc.nextInt();
    System.out.println("Enter No of Year: ");
    int year  = sc.nextInt();
    
    int m = year%100;
    
    int k =0;
    switch(month)
    {
        case 1: k =1;break;
        case 2: k = 4;break;
        case 3: k = 4;break;
        case 4: k = 0;break;
        case 5: k = 2;break;
        case 6: k = 5;break;
        case 7: k = 0;break;
        case 8: k = 3;break;
        case 9: k = 6;break;
        case 10:k = 1;break;
        case 11:k = 4;break;
        case 12:k = 6;       
     }

    int n = m/4 + dayofmonth + k;
 //   System.out.println(n + " = " + m + " + " + dayofmonth + " + " + k);
    if(year%4 == 0 && (month == 1 | month == 2))
    {
        n = n-1;
    }
   
    int centurycode = 0;
    
    int j = year/100;
    
    switch(j)
    {
        case 17: centurycode = 4;break;
        case 18: centurycode = 2;break;
        case 19: centurycode = 0;break;
        case 20: centurycode = 6;break;
        case 21: centurycode = 4;break;
        case 22: centurycode = 2;break;
        case 23: centurycode = 0;break;
        case 24: centurycode = 6;break;
        case 25: centurycode = 4;break;
        case 26: centurycode = 2;break;
        case 27: centurycode = 0;break;
        case 28: centurycode = 6;
    
    
    
    }
    n = n+centurycode + m;
    int ans = n%7;
    System.out.print(ans);
}




    
}
