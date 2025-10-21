package Figuras.espaciais;

import java.util.Scanner;

public class Piramide {
	Scanner sc = new Scanner(System.in);
	
	private double area__base_piramide;
	private double altura_piramide;
	private double volume_piramide;
	
	public void recebeArea() {
		System.out.println("Digite o valor da area da base do piramide:");
		area__base_piramide = sc.nextDouble();
	}
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura da piramide:");
		altura_piramide = sc.nextDouble();
	}
	
	public void retornaAreaBase() {
		System.out.println("A area da base da piramide é " +area__base_piramide);
	}
	
	public void retornaAltura() {
		System.out.println("A altura da piramide é " +altura_piramide);
	}
	
	
	public void calcular_area() {
		volume_piramide = (area__base_piramide*altura_piramide)/3;
		System.out.println("O volume da piramide é " +volume_piramide);
	}
}
