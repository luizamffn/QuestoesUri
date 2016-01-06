package questoesUri;

import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        float CONSUMO = X/Y;
     
        System.out.println(CONSUMO + " km/l");
		//System.out.format("%.3f km/l", CONSUMO);
     

	}

}
