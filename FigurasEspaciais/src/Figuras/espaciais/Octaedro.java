package Figuras.espaciais;

import java.util.Scanner;

public class Octaedro {
	Scanner sc = new Scanner(System.in);
	
	private double area_base_Octaedro;
	private double volume_dodecaedro;
	
	public void recebeAreaBase() {
		System.out.println("Digite o valor da area da base do octaedro:");
		area_base_Octaedro = sc.nextDouble();
	}
	
	public void retornaAreaBase() {
		System.out.println("A area da base do octaedro é " +area_base_Octaedro);
	}
	
	public void calcular_area() {
		volume_dodecaedro = (area_base_Octaedro*area_base_Octaedro*area_base_Octaedro)*((Math.sqrt(2.0))/3);
		System.out.println("O volume do octaedro é " +volume_dodecaedro);
	}
}
