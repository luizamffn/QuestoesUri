package questoesUri;

import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
        int num = sc.nextInt();
        int horas = sc.nextInt();
		float valor = sc.nextInt();
        
        float salario = horas * valor;
     
        System.out.println("NUMBER = "+num);
		System.out.println("SALARY = U$ "+salario);

	}

}
