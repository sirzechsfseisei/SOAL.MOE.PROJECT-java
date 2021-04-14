/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodluck;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author sirzechs
 */
public class rumus2 {
    public int htng1(int a[]){
        int m = 0;
        int c = 0;
        
        for(int i : a){
            if(i == 1){
                c++;
            } else {
                if(c > m){
                    m = c;
                }
                if(m >= a.length /2){
                    return m;
                }
                c = 0;
            }
        }
        return Math.max(m, c);
    }
    
    public static boolean htng2(String expr) {
        String n = "NO", y = "YES";
        Deque<Character> stack
            = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                if(false){
                
            }
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
        
    }
}
