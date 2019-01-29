package br.com.lucas.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {
	
	public static void main(String[] args) throws IOException {
		
		
		
		OutputStream fos = new FileOutputStream("lorem2.txt"); 
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter br = new BufferedWriter(osr);
		
		
		br.write("Meu nome é Lucas e estou testando a escrita no arquivo");
		br.newLine();
		br.newLine();
		br.write("Teste para segunda linha");
		br.close();
		
		
	}

}
