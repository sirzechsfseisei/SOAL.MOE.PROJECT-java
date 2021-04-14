/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodluck;

import java.util.Comparator;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author sirzechs
 */
public abstract class Sortbyroll implements Comparator<rumus>{
    
    public int compare(rumus a, rumus b)
    {
        return a.rollno - b.rollno;
    }
    
    
}
