package Figuras.espaciais;

import java.util.Scanner;

public class Icosaedro {
	Scanner sc = new Scanner(System.in);
	
	private double area_base_Icosaedro;
	private double volume_icosaedro;
	
	public void recebeAreaBase() {
		System.out.println("Digite o valor da area da base do icosaedro:");
		area_base_Icosaedro = sc.nextDouble();
	}
	
	public void retornaAreaBase() {
		System.out.println("A area da base do icosaedro é " +area_base_Icosaedro);
	}
	
	public void calcular_area() {
		volume_icosaedro = (area_base_Icosaedro*area_base_Icosaedro*area_base_Icosaedro)*((5+3*(Math.sqrt(5.0)))/12);
		System.out.println("O volume do icosaedro é " +volume_icosaedro);
	}
}
