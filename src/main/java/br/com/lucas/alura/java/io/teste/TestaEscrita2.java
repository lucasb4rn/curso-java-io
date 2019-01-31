package br.com.lucas.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaEscrita2 {
	
	public static void main(String[] args) throws IOException {
		
		
		
//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter br = new BufferedWriter(osr);
		
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("Meu nome é Lucas e estou testando a escrita no arquivo");
		bw.newLine();
		bw.write("Teste para segunda linha");
		bw.close();
		
		
		
		
		
	}

}
