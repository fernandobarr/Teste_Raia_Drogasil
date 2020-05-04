package br.com.drogasil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

	public static void start()
	{
		@SuppressWarnings("resource")
		Scanner lerSalario = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				
				System.out.println("Digite o salario: \n");				
				Double sal = new Double(lerSalario.nextDouble());					
				System.out.println("Digite o percentual de reajuste \n");				
				Double perc = new Double(lerSalario.nextDouble());	
				Double total = sal + (sal * perc);
				
				if(Math.floor((total % 2)) == 0 )
				{
					total = total + 1;
					System.out.println("\n Par R$" + total.toString());
				}
				else
				{					
					System.out.println("\n Impar R$" + total.toString());
				}
				
			}catch (InputMismatchException ime)
			{
				System.err.println("\nErro ao digitar o salario.\n");
				continua = false;
			}
			
		}while(continua);				
	}
	
	public static void main(String[] args) {
		start();
	}
}
