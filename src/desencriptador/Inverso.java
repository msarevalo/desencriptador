package desencriptador;

import java.util.ArrayList;

public class Inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> primos = new ArrayList<Integer>();
		int base =  614656;
		//int base =  26;
		for(int i=1;i<=base;i++) {
			if ((i%1000)==0) {
				System.out.println(i);
			}
			for(int j=1; j<=base;j++) {
				int primo = (i*j)%base;
				if(primo==1) {
					//System.out.println(i + " " + j + " Son primos relativos");
					primos.add(i);
				}
			}
		}
		
		/*for(int i=0; i<primos.size(); i++) {
			System.out.println(primos.get(i));
		}*/
		Escribir escribe = new Escribir();
		escribe.escribe(primos);
		
	}

}
