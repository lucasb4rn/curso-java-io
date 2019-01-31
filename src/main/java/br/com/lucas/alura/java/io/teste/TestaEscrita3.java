package br.com.lucas.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestaEscrita3 {
	
	public static void main(String[] args) throws IOException {
		
		
		
//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter br = new BufferedWriter(osr);
		
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		
		//Ambos comandos abaixo fazem a mesma coisa, porém o printWriter foi lançado depois e com ele outras formas de ler arquivos.
		PrintStream ps = new PrintStream("lorem2.txt"); //versão do java 1.0
		//PrintWriter ps = new PrintWriter("lorem2.txt"); // versao do java 1.1
		
		ps.println("Meu nome é Lucas e estou testando a escrita no arquivo");
		ps.println("Teste para segunda linha");
		ps.close();
		
	}

}
