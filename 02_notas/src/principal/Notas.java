package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		int [] notas =new int[5];
		generarNotas(notas);
		System.out.println("Aprobados: "+aprobados(notas));
		System.out.println("Media: "+media(notas));
		ordenarNotas(notas);
		listarNotas(notas);
	}
	private static void generarNotas(int[] notas) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		while(total<notas.length) {
			System.out.println("Introduce nota: ");
			int nota=sc.nextInt();
			if(nota>=0&&nota<=10) {
				notas[total]=nota;
				total++;
			}
		}
	}
	private static int aprobados(int [] notas) {
		int aprobados=0;
		for(int nota:notas) {
			if(nota>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	private static int media(int [] notas) {
		int media=0;
		for(int nota:notas) {
			media+=nota;
		}
		return media/notas.length;
	}
	private static void ordenarNotas(int [] notas) {
		int aux;
		for(int i=0;i<notas.length;i++) {
			for(int k=i+1;k<notas.length;k++) {
				if(notas[k]<notas[i]) {
					aux=notas[i];
					notas[i]=notas[k];
					notas[k]=aux;
				}
			}
			
		}
	}
	private static void listarNotas(int [] notas) {
		for(int nota:notas) {
			System.out.println(nota);			
		}
	}
	

}
