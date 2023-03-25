/*NIM :13020210088
  Nama:Riany Rezeqy Utamie
  Hari/Tanggal : Jumat, 10 Maret 2023
  Waktu pengerjaan :16.00
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import javax.swing.*;
import java.io.*;

public class BacaKar {
      public static void main(String[] args) throws IOException {

        char cc;
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
      
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");


        cc =dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");

        bil =Integer.parseInt(datAIn.readLine());

        System.out.print (cc +"\n" +bil+"\n");
	/* Tambatkan progran membaca / Input data monggunakan Class Scanner, Class Console dan Class JOptionPane */

	// program membaca/Input data menggunakan Class Scanner
	System.out.println("Penggunaan Class Scanner :");
	System.out.println("Masukan Nilai : " );
	Scanner masukan = new Scanner(System.in);
	int a = masukan.nextInt();
	System.out.println("Nilai yang dimasukkan " +a);

	
	//Program menginput data dengan Class console
	System.out.println("\nBerikut adalah penggunakan Class Console");
	System.out.println("Masukkan nilai : ");
	Console input = System.console(); 
	String b= input.readLine(); 
	System.out.println("Nilai yang dimasukkan adalah "+b);
	
	
	//program membaca/input data menggunakan Class JOptinPane
	JOptionPane.showMessageDialog(null, "Hello, \nBerikut adalah penggunaan Class JOptionPane"); 
	String akar = JOptionPane.showInputDialog("Masukkan karakter: "); 
	System.out.println("\nBerikut adalah penggunaan Class JOptionPane \nkarakter yang baru saja dimasukkan "+akar);
	

        System.out.print ("bye \n");

	

    }
}

