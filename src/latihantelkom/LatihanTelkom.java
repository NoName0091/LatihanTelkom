/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantelkom;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanTelkom {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int angka1;
		int angka2;
		int max;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Masukan Angka-1 = ");
		angka1 = input.nextInt();
		System.out.println("Masukan Angka-2 = ");
		angka2 = input.nextInt();
		
		if(angka1>angka2){
			max = angka1;
		}
		else {
			max = angka2;
		}
		System.out.println("Angka Terbesar Adalah = "+max);
  }
}
