package DesafioSigno;

import java.util.Scanner;

public class Signos {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia do seu nascimento com dois dígitos ");
		int diaDigitado = scan.nextInt();
		System.out.println("Digite o mes do seu nascimento com dois dígitos");
		int mesDigitado = scan.nextInt();

		int resultadoDia = diaDigitado;
		int resultadoMes = mesDigitado;

		switch (resultadoMes) {
		case 01:
			if (resultadoDia <= 20) {
				System.out.println("Capricornio");
			} else {
				System.out.println("Aquario");
			}
			break;

		case 02:
			if (resultadoDia <= 19) {
				System.out.println("Aquario");

			} else {
				System.out.println("Peixes");
			}
			break;

		case 03:
			if (resultadoDia <= 20) {
				System.out.println("Peixes");
			} else {
				System.out.println("Aries");
			}
			break;

		case 04:
			if (resultadoDia <= 20) {
				System.out.println("Aries");
			} else {
				System.out.println("Touro");
			}
			break;

		case 05:
			if (resultadoDia <= 21) {
				System.out.println("Touro");
			} else {
				System.out.println("Gemeos");
			}
				break;
			
		case 06:
			if (resultadoDia <= 21) {
				System.out.println(" Gemeos");
			} else {
				System.out.println("Cancer");
			}
			break;

		case 07:
			if (resultadoDia <= 21) {
				System.out.println("Cancer");
			} else {
				System.out.println("Leão");
			}
			break;

		case 8:
			if (resultadoDia <= 22) {
				System.out.println("Leão");
			} else {
				System.out.println("Virgem");
			}
			break;

		case 9:
			if (resultadoDia <= 23) {
				System.out.println("Virgem");
			} else {
				System.out.println("Libra");
			}
			break;

		case 10:
			if (resultadoDia <= 22) {
				System.out.println("Libra");
			} else {
				System.out.println("Escorpião");
			}
			break;

		case 11:
			if (resultadoDia <= 21) {
				System.out.println("Escorpião");
			} else {
				System.out.println("Sagitario");
			}
			break;

		case 12:
			if (resultadoDia <= 21) {
				System.out.println("Sagitario");
			}else {
				System.out.println("Capricornio");
			}
				break;

			}
		}

	}

