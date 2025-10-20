package principal;

import figuras.planas.*;

public class Principal {
	public static void main(String[] args) {
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.recebeAltura();
		triangulo1.recebeBase();
		triangulo1.retornaAltura();
		triangulo1.retornaBase();
		triangulo1.calcular_area();
		
		System.out.println("---");
		
		Trapezio trapezio1 = new Trapezio();
		trapezio1.recebeAltura();
		trapezio1.recebeLadoMaior();
		trapezio1.recebeLadoMenor();
		
		trapezio1.retornaAltura();
		trapezio1.retornaLadoMaior();
		trapezio1.retornaLadoMenor();
		trapezio1.calcular_area();
		
		System.out.println("---");
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.recebeAltura();
		retangulo1.recebeBase();
		retangulo1.retornaAltura();
		retangulo1.calcular_area();
		
		System.out.println("---");
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.recebeLado();
		quadrado1.retornaLado();
		quadrado1.calcular_area();
		
		System.out.println("---");
		
		Paralelogramo paralelogramo1 = new Paralelogramo();
		paralelogramo1.recebeAltura();
		paralelogramo1.recebeBase();
		paralelogramo1.retornaAltura();
		paralelogramo1.calcular_area();
		
		System.out.println("---");
		
		Losangulo losangulo1 = new Losangulo();
		losangulo1.recebeLadoMaior();
		losangulo1.recebeLadoMenor();
		losangulo1.retornaLadoMaior();
		losangulo1.retornaLadoMenor();
		losangulo1.calcular_area();
		
		System.out.println("---");
		
		Circulo circulo1 = new Circulo();
		circulo1.recebeRaio();
		circulo1.retornaRaio();
		circulo1.calcular_area();
		
		
	}
}
