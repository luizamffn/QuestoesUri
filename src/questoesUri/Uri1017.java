package questoesUri;

import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
        int horas = sc.nextInt();
        int velocidade = sc.nextInt();
        
        Double litros = (horas * velocidade)/12.0;
     
        //System.out.println(litros);
		System.out.format("%.3f ", litros);

	}

}
