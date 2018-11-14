/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pif18b;

import java.util.Scanner;

/**
 *
 * @author LAB-1-GSG
 */
public class CLAT11 {
public static void main (String[] args)
{
//buat variabel
    int batas,x,total,harga;
    //buat variabel untuk input
    Scanner in = new Scanner(System.in);
    try
    {
        //input
        System.out.print("Isi Harga Dasar : ");
        harga = in.nextInt();
        System.out.print("Isi Jumlah Item : ");
        batas = in.nextInt();
        //buat format header/judul
        System.out.println("-----------------------");
        System.out.println("JUMLAH\t\tTOTAL");
        System.out.println("=====>=====>=====>=====");
        //Isi Nilai awal "total" dan "X"
        total = 1;
        x = 1;
        //proses dengan "while"
        while(x<=batas)
    {
        total = harga * x;
        System.out.println(x+")\t\t"+total);
         System.out.println("<><><><><><><><><><>");
        //step
        x++;
        
    }  
    }
    //catch(Exception yf) yang asli pake ini bukan finally
    finally
    {
         System.out.println("\t\tATTENTION !!!");
         System.out.println("\t\tNot Copyright This Code!!!");
         System.out.println("\t\tDON'T TRY THIS AT HOME!!!");
    }
    
    
    
}
    
}
