package pe.firstkitchen;

import java.util.ArrayList;
import java.util.List;

public class CocinaDatos {
	
	public static List<Cocina> listaCocinas(){
		
		Cocina cocina0 = new Cocina("Mabe EMP6120PG0", 949.0, 60.0, 91.0, 58.6, 4);
		Cocina cocina1 = new Cocina("Indurama Parma", 1089.0, 80.0, 94.0, 67.5, 6);
		Cocina cocina2 = new Cocina("Sole COSOL027", 850.0, 60.0, 90.0, 50.0, 4);
		Cocina cocina3 = new Cocina("Coldex CX602", 629.0, 61.6, 95.0, 51.5, 5);
		Cocina cocina4 = new Cocina("Reco Dakota", 849.0, 75.4, 94.5, 66.0, 5);
		
		List<Cocina> lista = new ArrayList<>();
		
		lista.add(cocina0);
		lista.add(cocina1);
		lista.add(cocina2);
		lista.add(cocina3);
		lista.add(cocina4);
		
       return lista;
	}

	
  

}
