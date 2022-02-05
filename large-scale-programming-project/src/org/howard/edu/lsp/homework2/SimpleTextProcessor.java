package org.howard.edu.lsp.homework2;

import java.util.Scanner;

public class SimpleTextProcessor {

	public static void main(String[] args) {
	
		System.out.println("String? ");
		Scanner objc = new Scanner(System.in); 
		String data = objc.nextLine();
		while (data != "") {
			String[] data1 = data.split("\\s+");
			System.out.println("Token(s): ");
			Integer sum_a = new Integer("0"); 
			Integer product = new Integer("1"); 
			for(int i = 0; i <data1.length; i++) {
				System.out.println(data1[i]);
				String s = data1[i]; 
				int a = Integer.parseInt(s); 
				sum_a= sum_a + a;
			    product = product * a;	
		}
			System.out.println("Sum:" +sum_a);
			System.out.println("Product:" +product);
			System.out.println(" ");
			System.out.println("String? ");
			Scanner obj = new Scanner(System.in); 
			String data2 = obj.nextLine();
			if (data2 == "") {
			System.out.println("Goodbye"); 
			break;} }
			
	}
}
