package figuras.planas;

import java.util.Scanner;

public class Quadrado {
	Scanner sc = new Scanner(System.in);
	
	public double lado_quadrado;
	public double area_quadrado;
	
	public void recebeLado() {
		System.out.println("Digite o valor do lado do quadrado:");
		lado_quadrado = sc.nextDouble();
	}
	
	public void retornaLado() {
		System.out.println("O lado do quadrado é " +lado_quadrado);
	}
	
	public void calcular_area() {
		area_quadrado = (lado_quadrado*lado_quadrado);
		System.out.println("A área do quadrado é " +area_quadrado);
	}
}
