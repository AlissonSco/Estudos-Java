package Figuras.espaciais;

import java.util.Scanner;

public class Esfera {
	Scanner sc = new Scanner(System.in);
	
	private double pi_esfera_aproximado = 3.14;
	private double raio_esfera;
	private double volume_esfera;
	
	public void recebeRaio() {
		System.out.println("Digite o valor do raio da esfera:");
		raio_esfera = sc.nextDouble();
	}
	
	public void retornaRaio() {
		System.out.println("O raio da esfera é " +raio_esfera);
	}

	
	public void calcular_area() {
		volume_esfera = (pi_esfera_aproximado*(raio_esfera*raio_esfera*raio_esfera))*(3/4);
		System.out.println("O volume da esfera é " +volume_esfera);
	}
}
