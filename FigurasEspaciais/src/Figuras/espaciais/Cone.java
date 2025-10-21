package Figuras.espaciais;

import java.util.Scanner;

public class Cone {
	Scanner sc = new Scanner(System.in);
	
	private double pi_cone_aproximado = 3.14;
	private double raio_cone;
	private double altura_cone;
	private double volume_cone;
	
	public void recebeRaio() {
		System.out.println("Digite o valor do raio do cone:");
		raio_cone = sc.nextDouble();
	}
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do cone:");
		altura_cone = sc.nextDouble();
	}
	
	public void retornaRaio() {
		System.out.println("O raio do cone é " +raio_cone);
	}

	public void retornaAltura() {
		System.out.println("A altura do cone esfera é " +altura_cone);
	}

	
	public void calcular_area() {
		volume_cone = (pi_cone_aproximado*(raio_cone*raio_cone)*altura_cone)/3;
		System.out.println("O volume do cone é " +volume_cone);
	}
}
