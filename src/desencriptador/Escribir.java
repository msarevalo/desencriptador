package desencriptador;

import java.io.*;
import java.util.ArrayList;

public class Escribir
{
    public void escribe(ArrayList<Integer> a)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\Manuel\\Desktop\\UEB\\universidad\\desencriptador\\\\primos.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < a.size(); i++)
                pw.print(a.get(i) + ",");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
