package Figuras.espaciais;

import java.util.Scanner;

public class Paralelepipedo {
	Scanner sc = new Scanner(System.in);
	
	private double largura_paralelepipedo;
	private double comprimento_paralelepipedo;
	private double altura_paralelepipedo;
	private double volume_paralelepipedo;
	
	public void recebeLargura() {
		System.out.println("Digite o valor da largura do paralelepipedo:");
		largura_paralelepipedo = sc.nextDouble();
	}
	
	public void recebeComprimento() {
		System.out.println("Digite o valor do comprimento do paralelepipedo:");
		comprimento_paralelepipedo = sc.nextDouble();
	}
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do paralelepipedo:");
		altura_paralelepipedo = sc.nextDouble();
	}
	
	public void retornaLargura() {
		System.out.println("A largura do paralelepipedo é " +largura_paralelepipedo);
	}
	
	public void retornaComprimento() {
		System.out.println("O comprimento do paralelepipedo é " +comprimento_paralelepipedo);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do paralelepipedo é " +altura_paralelepipedo);
	}
	
	public void calcular_area() {
		volume_paralelepipedo = largura_paralelepipedo*comprimento_paralelepipedo*altura_paralelepipedo;
		System.out.println("O volume do paralelepipedo é " +volume_paralelepipedo);
	}
}
