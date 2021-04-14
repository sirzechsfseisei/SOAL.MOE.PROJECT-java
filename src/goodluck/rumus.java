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
class rumus {
    
    int rollno,g;
    String f;
    
    public rumus(int rollno,String f,int g){
        this.rollno = rollno;
        this.f = f;
        this.g = g;
    }
    
    public String toString(){
        
        return this.rollno+" "+this.f+" "+this.g;
    }
    
    
}
