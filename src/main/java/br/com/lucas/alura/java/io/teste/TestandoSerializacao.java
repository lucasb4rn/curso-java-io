package br.com.lucas.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestandoSerializacao {
	
	public static void main(String[] args) throws IOException {
		
		
		String nome = "Lucas Henrique Teixeira Fonseca";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objecto.bin"));
		
		oos.close();
		
		
	}
	

}
