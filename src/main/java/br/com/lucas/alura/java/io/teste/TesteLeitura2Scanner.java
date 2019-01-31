package br.com.lucas.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2Scanner {
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNext()){
		String linha = scanner.nextLine();
		System.out.println(linha);
			
		}
		
		scanner.close();
	}
	

}