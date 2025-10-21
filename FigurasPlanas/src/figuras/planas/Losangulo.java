package figuras.planas;

import java.util.Scanner;

public class Losangulo {
	Scanner sc = new Scanner(System.in);
	
	private double lado_maior;
	private double lado_menor;
	private double area_losangulo;
	
	public void recebeLadoMenor() {
		System.out.println("Digite o valor do lado menor do losangulo:");
		lado_menor = sc.nextDouble();
	}
	
	public void recebeLadoMaior() {
		System.out.println("Digite o valor do lado maior do losangulo:");
		lado_maior = sc.nextDouble();
	}
	
	public void retornaLadoMenor() {
		System.out.println("O lado maior do losangulo é " +lado_maior);
	}
	
	public void retornaLadoMaior() {
		System.out.println("O lado menor do losangulo é " +lado_menor);
	}
	
	public void calcular_area() {
		area_losangulo = (lado_menor*lado_maior)/2;
		System.out.println("A área do losangulo de lado maior " +lado_maior+ " e lado menor " +lado_menor+ " é " +area_losangulo);
	}
}

