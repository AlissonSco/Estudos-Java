package Figuras.espaciais;

import java.util.Scanner;

public class Dodecaedro {
	Scanner sc = new Scanner(System.in);
	
	private double area_base_dodecaedro;
	private double volume_dodecaedro;
	
	public void recebeAreaBase() {
		System.out.println("Digite o valor da area da base do dodecaedro:");
		area_base_dodecaedro = sc.nextDouble();
	}
	
	public void retornaAreaBase() {
		System.out.println("A area da base do dodecaedro é " +area_base_dodecaedro);
	}
	
	public void calcular_area() {
		volume_dodecaedro = (area_base_dodecaedro*area_base_dodecaedro*area_base_dodecaedro)*((15+7*(Math.sqrt(5.0)))/4);
		System.out.println("O volume do dodecaedro é " +volume_dodecaedro);
	}
}
