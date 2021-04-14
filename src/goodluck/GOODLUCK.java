/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodluck;
import com.sun.xml.internal.ws.util.StreamUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.*;
import java.util.Collections;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;
/**
 *
 * @author sirzechs
 */
public class GOODLUCK {

    private static Scanner scan;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rumus2 r = new rumus2();

        int x[] = {1,1,0,1,1,1};
        int z[] = {1,0,0,1,0,1,1};
        
        System.out.println(r.htng1(x));
        System.out.println(r.htng1(z)+"\n");
        
        String s[] = {"h","e","l","l","o"};
        //Arrays.sort(s);
        int i;
        List<String> list = Arrays.asList("h","e","l","l","o");
        list.stream().collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator()
      .forEachRemaining(System.out::println);
        List<String> how = Arrays.asList("h","e","l","l","o");
        List<String> sortedList = how.stream().sorted(Collections.reverseOrder())
        .collect(Collectors.toList());
        //how.stream().sorted().forEach(System.out::println);
        System.out.println("\n"+sortedList+"\n");
        String q = "{ [ ( ) ] }";
        String w = " { [ ( ] ) }";
        String e = "{ ( ( [ ] ) [ ] ) [ ] }";
        
        if (r.htng2(q)==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
        if (r.htng2(w)==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
        if (r.htng2(e)==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
    
}
