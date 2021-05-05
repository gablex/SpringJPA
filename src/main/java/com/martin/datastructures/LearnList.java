/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.datastructures;

import java.awt.List;

/**
 *
 * @author admin
 */
public class LearnList extends List {
    public LearnList(){
        for(int i=0; i<10; i++){
        super.add("Test",i);
        }
        System.out.println(super.getItemCount());
    }
    public static void main(String[] args) {
       new LearnList();
    }
}
