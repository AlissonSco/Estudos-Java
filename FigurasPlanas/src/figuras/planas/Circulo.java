package figuras.planas;

import java.util.Scanner;

public class Circulo {
	Scanner sc = new Scanner(System.in);
	
	public double raio_circulo;
	public double area_circulo;
	
	public void recebeRaio() {
		System.out.println("Digite o valor do raio do circulo:");
		raio_circulo = sc.nextDouble();
	}
	
	public void retornaRaio() {
		System.out.println("O raio do circulo é " +raio_circulo);
	}
	
	public void calcular_area() {
		area_circulo = (3.14*raio_circulo);
		System.out.println("A área do circulo  é : " +area_circulo);
	}
}
