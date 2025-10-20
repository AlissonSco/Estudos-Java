package figuras.planas;

import java.util.Scanner;

public class Triangulo {
	Scanner sc = new Scanner(System.in);
	
	public double base_triangulo;
	public double altura_triangulo;
	public double area_triangulo;
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do triângulo:");
		altura_triangulo = sc.nextDouble();
	}
	
	public void recebeBase() {
		System.out.println("Digite o valor da base do triângulo:");
		base_triangulo = sc.nextDouble();
	}
	
	public void retornaAltura() {
		System.out.println("A altura do triângulo é " +altura_triangulo);
	}
	
	public void retornaBase() {
		System.out.println("A base do triângulo é " +base_triangulo);
	}
	
	
	public void calcular_area() {
		area_triangulo = (base_triangulo*altura_triangulo)/2;
		System.out.println("A área do triangulo: " +area_triangulo);
	}

}
