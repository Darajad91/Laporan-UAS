/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uas;

import javax.swing.JOptionPane;

/**
 *
 * @author sabda
 */
public class switch_case {
    
   public static void main(String args[]) {
        int a = 100;
        int b = 25;
        int hasil = 0;
        System.out.println("Menu Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String input = JOptionPane.showInputDialog("Masukkan Pilihan andah: ");
        int pilihan = Integer.parseInt(input);
        
        switch (pilihan)
        {
            case 1: 
                hasil = a + b;
                System.out.println("Penjumlahan "+a+"dan"+b+" adalah "+hasil);
                
                break;
            case 2: 
                hasil = a - b;
                System.out.println("Pengurangan "+a+" dan "+b+" adalah "+hasil);
                
                break;
            default:
                System.out.println("Pilihan anda salah");
        }
    }
    
    
}
