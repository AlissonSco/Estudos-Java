package Principal;

import Figuras.espaciais.*;

public class Principal {
	public static void main(String[] args) {
		
		Cubo cubo1 = new Cubo();
		cubo1.recebeLado();
		cubo1.retornaLado();
		cubo1.calcular_area();
		
		System.out.println("---");
		
		Cone cone1 = new Cone();
		cone1.recebeAltura();
		cone1.recebeRaio();
		cone1.retornaAltura();
		cone1.recebeRaio();
		cone1.calcular_area();
		
		System.out.println("---");
		
		Cilindro cilindro1 = new Cilindro();
		cilindro1.recebeAltura();
		cilindro1.recebeRaio();
		cilindro1.retornaAltura();
		cilindro1.retornaRaio();
		cilindro1.calcular_area();
		
		System.out.println("---");
		
		Esfera esfera1 = new Esfera();
		esfera1.recebeRaio();
		esfera1.retornaRaio();
		esfera1.calcular_area();
		
		System.out.println("---");
		
		Dodecaedro dodecaedro1 = new Dodecaedro();
		dodecaedro1.recebeAreaBase();
		dodecaedro1.retornaAreaBase();
		dodecaedro1.calcular_area();
		
		System.out.println("---");
		
		Icosaedro icosaedro1 = new Icosaedro();
		icosaedro1.recebeAreaBase();
		icosaedro1.retornaAreaBase();
		icosaedro1.calcular_area();
		
		System.out.println("---");
		
		Octaedro octaedro1 = new Octaedro();
		octaedro1.recebeAreaBase();
		octaedro1.retornaAreaBase();
		octaedro1.calcular_area();
		
		System.out.println("---");
		
		Paralelepipedo paralelepipedo1 = new Paralelepipedo();
		paralelepipedo1.recebeAltura();
		paralelepipedo1.recebeComprimento();
		paralelepipedo1.recebeLargura();
		paralelepipedo1.retornaAltura();
		paralelepipedo1.retornaComprimento();
		paralelepipedo1.retornaLargura();
		paralelepipedo1.calcular_area();
		
		System.out.println("---");
		
		Piramide piramide1 = new Piramide();
		piramide1.recebeAltura();
		piramide1.recebeArea();
		piramide1.retornaAltura();
		piramide1.retornaAreaBase();
		piramide1.calcular_area();
		
		System.out.println("---");
		
		Prisma_triangular prisma1 = new Prisma_triangular();
		prisma1.recebeAltura();
		prisma1.recebeArea();
		prisma1.retornaAltura();
		prisma1.retornaArea();
		prisma1.calcular_area();
		
		System.out.println("---");
		
		Tetraedro tetraedro1 = new Tetraedro();
		tetraedro1.recebeArea();
		tetraedro1.retornaAreaBase();
		tetraedro1.calcular_area();
		
	}
}