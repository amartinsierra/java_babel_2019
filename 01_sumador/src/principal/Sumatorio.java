package principal;

public class Sumatorio {

	public static void main(String[] args) {
		int a=50;
		int b=16;
		int menor=buscarMenor(a,b);
		int mayor=buscarMayor(a,b);
		System.out.println("Suma de pares "+sumaPares(menor, mayor));
	}
	
	private static int buscarMenor(int x, int y) {
		return x>y?y:x;
	}
	private static int buscarMayor(int x, int y) {
		return x>y?x:y;
	}
	private static int sumaPares(int menor, int mayor) {
		int suma=0;
		for(int i=menor;i<=mayor;i++) {
			if(i%2==0) {
				suma+=i;
			}
		}
		return suma;
	}
}
