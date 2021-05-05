/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.datastructures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class FirstHashMap {
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    static File file;
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap=new HashMap<>();
        Scanner reader=new Scanner(System.in);
        Integer valueEntered;
        Integer counter=0;
        
        System.out.println("Enter number of values to add for the Hashmap\n");
        valueEntered=reader.nextInt();
        for(counter=0; counter<valueEntered; counter++){
            hashmap.put(counter, "Value"+counter);
           
        }
         try {
                File.createTempFile("learncoding", ".txt");
            } catch (IOException ex) {
                Logger.getLogger(FirstHashMap.class.getName()).log(Level.SEVERE, null, ex);
            }
      if(!hashmap.isEmpty()){
            System.out.println("| Index\t| Value");
          for(counter=0; counter<hashmap.size(); counter++){
                      
                        System.out.println("| "+(counter+1)+" \t|"+hashmap.get(counter)+" |");
          }
          
      }
      
    }
}
