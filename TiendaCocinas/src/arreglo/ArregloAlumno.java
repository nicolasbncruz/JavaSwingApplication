package arreglo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import clase.Alumno;

public class ArregloAlumno {
	
	ArrayList<Alumno> al = null;

	public ArregloAlumno() {
		al = new ArrayList<Alumno>();
		leerAlumno();
	}
	
	public void agregarAlumno(Alumno a) {
		al.add(a);
	}
	
	public void actualizarAlumno(Alumno a, int i) {		
		al.add(i, a);
	}
	
	public void eliminar(int i) {
		al.remove(i);
	}
	
	public int cantidadAlumno() {
		return al.size();
	}
	
	public Alumno obtenerAlumno(int i) {
		return al.get(i);
	}
	
	public void guardarAlumno() {
		try {
			PrintWriter gu = new PrintWriter(new FileWriter("./data/Alumno.txt"));
			for(int i = 0; i < cantidadAlumno(); i ++) {
				String alumn = obtenerAlumno(i).getCodAlumno()+";"+
							   obtenerAlumno(i).getNombres()+";"+
							   obtenerAlumno(i).getApellidos()+";"+
							   obtenerAlumno(i).getDni()+";"+
							   obtenerAlumno(i).getEdad()+";"+
							   obtenerAlumno(i).getCelular()+";"+
							   obtenerAlumno(i).getEstado();
				gu.println(alumn);
			}
			gu.close();			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se guardo los datos");
		}
	}

	private void leerAlumno() {		
		try {
			BufferedReader leer = new BufferedReader(new FileReader("./data/Alumno.txt"));
			String val;
			Alumno a = null;
			while ((val=leer.readLine())!=null) {
				String datos[]=val.split(";");
				a = new Alumno();
				a.setCodAlumno(Integer.parseInt(datos[0]));
				a.setNombres(datos[1]);
				a.setApellidos(datos[2]);
				a.setDni(datos[3]);
				a.setEdad(Integer.parseInt(datos[4]));
				a.setCelular(Integer.parseInt(datos[5]));
				a.setEstado(Integer.parseInt(datos[6]));
				agregarAlumno(a);
			}
			leer.close();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se encontraron datos");
		}
		
	}
	
	public String nuevoCodigo() {
		String c = "2023";
		if(cantidadAlumno()==0) {
			int cd = 1000 + (cantidadAlumno()+1);
			return c  + cd;
		}else {
			int nv = 1000 + (obtenerAlumno(cantidadAlumno()-1).getCodAlumno())+1;
			return c + nv;
		}
	}

}
