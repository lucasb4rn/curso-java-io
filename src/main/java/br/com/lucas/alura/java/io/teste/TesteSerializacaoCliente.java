package br.com.lucas.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setProfissao("Dev");
		cliente.setCpf("32156465");
		
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("objecto.bin")); oos.writeObject(cliente); oos.close();
		 */
		
		
		
		  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objecto.bin")); 
		  
		  Cliente cliente1 = (Cliente) ois.readObject();
		  
		  System.out.println(cliente1.getNome());
		  System.out.println(cliente1.getCpf());
		 
		
		
	}
	

}
