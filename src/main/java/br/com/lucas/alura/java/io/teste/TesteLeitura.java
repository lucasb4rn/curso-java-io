package br.com.lucas.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public TesteLeitura() {
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt"), "UTF-8"));
		
		
		/*
		 * FileInputStream fis = new FileInputStream("lorem.txt"); InputStreamReader isr
		 * = new InputStreamReader(fis); BufferedReader br = new BufferedReader(isr);
		 */
		 
		
		
		
		/*
		 * InputStream fis = new FileInputStream("lorem.txt"); //forma generica abstrata
		 * Reader isr = new InputStreamReader(fis); //forma generica classe abstrata
		 * BufferedReader br = new BufferedReader(isr);
		 */

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}

}
