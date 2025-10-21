package Figuras.espaciais;

import java.util.Scanner;

public class Cilindro {
	Scanner sc = new Scanner(System.in);
	
	private double pi_cilindro_aproximado = 3.14;
	private double raio_cilindro;
	private double altura_cilindro;
	private double volume_cilindro;
	
	public void recebeRaio() {
		System.out.println("Digite o valor do raio do cilindro:");
		raio_cilindro = sc.nextDouble();
	}
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do cilindro:");
		altura_cilindro = sc.nextDouble();
	}
	
	public void retornaRaio() {
		System.out.println("O raio do cilindro é " +raio_cilindro);
	}
	
	public void retornaAltura() {
		System.out.println("A altura da piramide é " +altura_cilindro);
	}
	
	
	public void calcular_area() {
		volume_cilindro = pi_cilindro_aproximado*(raio_cilindro*raio_cilindro)*altura_cilindro;
		System.out.println("O volume da piramide é " +volume_cilindro);
	}
}
