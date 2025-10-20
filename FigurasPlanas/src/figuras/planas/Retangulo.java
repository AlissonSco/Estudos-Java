package figuras.planas;

import java.util.Scanner;

public class Retangulo {
	Scanner sc = new Scanner(System.in);
	
	public double base_retangulo;
	public double altura_retangulo;
	public double area_retangulo;
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do retangulo:");
		altura_retangulo = sc.nextDouble();
	}
	
	public void recebeBase() {
		System.out.println("Digite o valor da base do retangulo:");
		base_retangulo = sc.nextDouble();
	}
	
	public void retornaAltura() {
		System.out.println("A altura do retangulo é " +altura_retangulo);
	}
	
	public void retornaBase() {
		System.out.println("A base do retangulo é " +base_retangulo);
	}
	
	public void calcular_area() {
		area_retangulo = (base_retangulo*altura_retangulo);
		
		System.out.println("A área do retangulo é " +area_retangulo);
	}
}
