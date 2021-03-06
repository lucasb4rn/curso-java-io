package br.com.lucas.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestandoSerializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String nome = "Lucas Henrique Teixeira Fonseca";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objecto.bin"));
		oos.writeObject(nome);
		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objecto.bin"));
		
		String nome2 = (String) ois.readObject();
		
		System.out.println(nome2);
		
		
	}
	

}
