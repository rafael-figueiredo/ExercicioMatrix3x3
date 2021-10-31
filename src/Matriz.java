import java.util.Scanner;
public class Matriz {
	public int x1, x2, x3, y1, y2, y3, z1, z2, z3, d;
	Scanner sc = new Scanner(System.in);
	public void calcular() {
		System.out.println("Informe o primeiro valor da coluna X: ");
		x1 = sc.nextInt();
		System.out.println("Informe o segundo valor da coluna X: ");
		x2 = sc.nextInt();
		System.out.println("Informe o terceiro valor da coluna X: ");
		x3 = sc.nextInt();
		System.out.println("Informe o primeiro valor da coluna Y: ");
		y1 = sc.nextInt();
		System.out.println("Informe o segundo valor da coluna Y: ");
		y2 = sc.nextInt();
		System.out.println("Informe o terceiro valor da coluna Y: ");
		y3 = sc.nextInt();
		System.out.println("Informe o primeiro valor da coluna Z: ");
		z1 = sc.nextInt();
		System.out.println("Informe o segundo valor da coluna Z: ");
		z2 = sc.nextInt();
		System.out.println("Informe o terceiro valor da coluna Z: ");
		z3 = sc.nextInt();
		d = ((x1*y2*z3) + (y1*z2*x3) + (z1*x2*y3)) - ((y1*x2*z3) + (x1*z2*y3) + (z1*y2*x3));
		System.out.println("O determinante da matrix 3x3 é " + d);
	}
}
