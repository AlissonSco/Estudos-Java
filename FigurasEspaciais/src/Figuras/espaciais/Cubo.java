package Figuras.espaciais;

import java.util.Scanner;

public class Cubo {
	Scanner sc = new Scanner(System.in);
	
	private double lado_cubo;
	private double volume_cubo;
	
	public void recebeLado() {
		System.out.println("Digite o valor do lado do Cubo:");
		lado_cubo = sc.nextDouble();
	}
	
	public void retornaLado() {
		System.out.println("O lado do Cubo é " +lado_cubo);
	}
	
	public void calcular_area() {
		volume_cubo = lado_cubo*lado_cubo*lado_cubo;
		System.out.println("O volume do cubo é " +volume_cubo);
	}
}
