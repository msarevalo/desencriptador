package desencriptador;

import java.io.IOException;
import java.util.ArrayList;

public class desencripta {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Primos pri = new Primos();
		int base =  614656;
		int acumulado = 0;
		int valor = 0;
		String encriptado = "";
		ArrayList<Character> abc = new ArrayList<>();
		
		abc.add('a'); abc.add('b');
		abc.add('c'); abc.add('d');
		abc.add('e'); abc.add('f');
		abc.add('g'); abc.add('h');
		abc.add('i'); abc.add('j');
		abc.add('k'); abc.add('l');
		abc.add('m'); abc.add('n');
		abc.add('ñ'); abc.add('o');
		abc.add('p'); abc.add('q');
		abc.add('r'); abc.add('s');
		abc.add('t'); abc.add('u');
		abc.add('v'); abc.add('w');
		abc.add('x'); abc.add('y');
		abc.add('z'); abc.add('_');
		
		String primeraLinea = "kzzw";
		primeraLinea = primeraLinea.replace(" ", "_");
		System.out.println(primeraLinea);
		for (int i=0; i<primeraLinea.length(); i=i+4) {
			String palabra = "";
			palabra = palabra + primeraLinea.charAt(i);
			palabra = palabra + primeraLinea.charAt(i+1);
			palabra = palabra + primeraLinea.charAt(i+2);
			palabra = palabra + primeraLinea.charAt(i+3);
			
			System.out.println(palabra);
			
			acumulado = 0;
			
			for (int j=0; j<palabra.length(); j++) {
				//System.out.println(cadena.charAt(i));
				if (j==0) {
					valor = (int) (abc.indexOf(palabra.charAt(j)) * Math.pow(28,3));
				}
				if (j==1) {
					valor = (int) (abc.indexOf(palabra.charAt(j)) * Math.pow(28,2));
				}
				if (j==2) {
					valor = (int) (abc.indexOf(palabra.charAt(j)) * Math.pow(28,1));
				}
				if (j==3) {
					valor = (int) (abc.indexOf(palabra.charAt(j)) * Math.pow(28,0));
				}
				acumulado = acumulado + valor;
			}
			
			System.out.println(acumulado);
			
			double e = 0;
			//System.out.println(a + " " + b);
			e = (acumulado - 601367);
			e = e * 376919;
			e = e % 614656;
			//e =  242248;
			System.out.println(e);
			int letra1 = (int)(e / Math.pow(28, 3));
			if (letra1<0)
				letra1 = letra1 * -1;
			int letra2 = (int)((e % Math.pow(28, 3)) / Math.pow(28, 2));
			if (letra2<0)
				letra2 = letra2 * -1;
			int letra3 = (int)(((e % Math.pow(28, 3)) % Math.pow(28, 2)) / Math.pow(28, 1));
			if (letra3<0)
				letra3 = letra3 * -1;
			int letra4 = (int)(e % 28);
			if (letra4<0)
				letra4 = letra4 * -1;
			//System.out.println(letra4);
			//System.out.println(abc.get(letra1) + "" + abc.get(letra2) + "" + abc.get(letra3) + "" + abc.get(letra4));
			
			encriptado = encriptado + abc.get(letra1) + "" + abc.get(letra2) + "" + abc.get(letra3) + "" + abc.get(letra4);
			
		}
		System.out.println(encriptado);
		/*for(int i=pri.primo().length-1; i>=0; i--) {
			for(int j=base;j>=base/2;j++) {
				
			}
			
			System.out.println(pri.primo()[i]);
		}*/
		
		//System.out.println(Integer.parseInt(pri.primo()[300])*2);
	}

}
