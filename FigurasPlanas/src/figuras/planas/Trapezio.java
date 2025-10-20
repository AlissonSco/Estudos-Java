package figuras.planas;

import java.util.Scanner;

public class Trapezio {
	Scanner sc = new Scanner(System.in);
	
	public double lado_maior_trapezio;
	public double lado_menor_trapezio;
	public double altura_trapezio;
	public double area_trapezio;

	public void recebeAltura() {
		System.out.println("Digite o valor da altura do trapezio:");
		altura_trapezio = sc.nextDouble();
	}
	
	public void recebeLadoMenor() {
		System.out.println("Digite o valor do lado menor do trapezio:");
		lado_menor_trapezio = sc.nextDouble();
	}
	
	public void recebeLadoMaior() {
		System.out.println("Digite o valor do lado maior do trapezio:");
		lado_maior_trapezio = sc.nextDouble();
	}
	
	public void retornaLadoMenor() {
		System.out.println("O lado maior do trapezio é " +lado_maior_trapezio);
	}
	
	public void retornaLadoMaior() {
		System.out.println("O lado menor do trapezio é " +lado_menor_trapezio);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do trapezio é " +altura_trapezio);
	}
	
	public void calcular_area() {
		area_trapezio = ((lado_maior_trapezio+lado_menor_trapezio)*altura_trapezio)/2;
		System.out.println("A área do trapezio é: " +area_trapezio);
	}
}
