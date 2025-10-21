package Figuras.espaciais;

import java.util.Scanner;

public class Prisma_triangular {
	Scanner sc = new Scanner(System.in);
	
	private double area__base_prisma_triangular;
	private double altura_prisma_triangular;
	private double volume_prisma_triangular;
	
	public void recebeArea() {
		System.out.println("Digite o valor da area da base do prisma triangular:");
		area__base_prisma_triangular = sc.nextDouble();
	}
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do prisma:");
		altura_prisma_triangular = sc.nextDouble();
	}
	
	public void retornaArea() {
		System.out.println("O lado do Cubo é " +area__base_prisma_triangular);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do prisma é " +altura_prisma_triangular);
	}
	
	public void calcular_area() {
		volume_prisma_triangular = (((area__base_prisma_triangular*area__base_prisma_triangular)*Math.sqrt(3.0))/4)*altura_prisma_triangular;
		System.out.println("O volume do prisma é " +volume_prisma_triangular);
	}
}
