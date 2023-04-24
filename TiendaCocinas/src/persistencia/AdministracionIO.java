package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdministracionIO {
	
	public static void main(String[] args) {
		cargarNombre();
	}
	
	public static void cargarNombre() {
		File archivo = new File("./data/nombres.txt");
		try {
			FileWriter fr = new FileWriter(archivo, true);
			fr.write("Nicolas Cruz");
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
