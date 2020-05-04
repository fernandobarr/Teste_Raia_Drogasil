package br.com.drogasil;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {

	public static void start()
	{
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(5);
		lista.add(8);
		lista.add(9);
		
		for (int i = 0; i < lista.size(); i++)
		{
			System.out.println("Array na posição [" + i + "] = " + lista.get(i));
		}		 
	}
	
	public static void main(String[] args) {
		start();
	}

}
