package Figuras.espaciais;

import java.util.Scanner;

public class Tetraedro {
	Scanner sc = new Scanner(System.in);
	
	private double area_base_tetaedro;
	private double volume_tetaedro;
	
	public void recebeArea() {
		System.out.println("Digite o valor da area da base do tetaedro:");
		area_base_tetaedro = sc.nextDouble();
	}
	
	public void retornaAreaBase() {
		System.out.println("A area da base do teadro é " +area_base_tetaedro);
	}
	
	public void calcular_area() {
		volume_tetaedro = ((area_base_tetaedro*area_base_tetaedro*area_base_tetaedro)*Math.sqrt(2.0))/12;
		System.out.println("O volume do tetaedro é " +volume_tetaedro);
	}
}
