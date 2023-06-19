package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x ,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p *  (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p *  (p - y.a) * (p - y.b) * (p - y.c));
		
		
		
		
		sc.close();

	}

}
