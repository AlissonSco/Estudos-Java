package figuras.planas;

import java.util.Scanner;

public class Paralelogramo {
	Scanner sc = new Scanner(System.in);
	
	public double base_paralelogramo;
	public double altura_paralelogramo;
	public double area_paralelogramo;
	
	public void recebeAltura() {
		System.out.println("Digite o valor da altura do paralelogramo:");
		altura_paralelogramo = sc.nextDouble();
	}
	
	public void recebeBase() {
		System.out.println("Digite o valor da base do paralelogramo:");
		base_paralelogramo = sc.nextDouble();
	}
	
	public void retornaAltura() {
		System.out.println("A altura do paralelogramo é " +altura_paralelogramo);
	}
	
	public void retornaBase() {
		System.out.println("A base do paralelogramo é " +base_paralelogramo);
	}
	
	public void calcular_area() {
		area_paralelogramo = (base_paralelogramo*altura_paralelogramo);
		System.out.println("A área do paralelogramo é " +area_paralelogramo);
	}
}
