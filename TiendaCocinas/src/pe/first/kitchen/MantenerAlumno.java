package pe.first.kitchen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import arreglo.ArregloAlumno;
import clase.Alumno;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;

public class MantenerAlumno extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigoValue;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JTextField txtEdad;
	private JTextField txtCelular;
	DefaultTableModel modelT = new DefaultTableModel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MantenerAlumno dialog = new MantenerAlumno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MantenerAlumno() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				inicio();
				listar();				
			}			
		});
		setBounds(100, 100, 940, 631);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANTENER ALUMNOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(349, 11, 345, 26);
		contentPanel.add(lblNewLabel);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(30, 72, 99, 26);
		contentPanel.add(lblCodigo);
		
		lblCodigoValue = new JLabel("-");
		lblCodigoValue.setBounds(115, 72, 99, 26);
		contentPanel.add(lblCodigoValue);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(30, 109, 99, 26);
		contentPanel.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(115, 109, 136, 26);
		contentPanel.add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(30, 146, 99, 26);
		contentPanel.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(115, 146, 136, 26);
		contentPanel.add(txtApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(302, 72, 78, 26);
		contentPanel.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(381, 72, 136, 26);
		contentPanel.add(txtDni);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(302, 109, 78, 26);
		contentPanel.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(381, 109, 136, 26);
		contentPanel.add(txtEdad);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(302, 146, 78, 26);
		contentPanel.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(381, 146, 136, 26);
		contentPanel.add(txtCelular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevo.setBounds(603, 72, 115, 26);
		contentPanel.add(btnNuevo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnRegistrar_actionPerformed(e);
			}
		});
		btnRegistrar.setBounds(603, 111, 115, 26);
		contentPanel.add(btnRegistrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(603, 148, 115, 26);
		contentPanel.add(btnModificar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnBuscar_actionPerformed(e);
			}
		});
		btnBuscar.setBounds(768, 74, 115, 26);
		contentPanel.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(768, 111, 115, 26);
		contentPanel.add(btnCancelar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(768, 148, 115, 26);
		contentPanel.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 231, 854, 331);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
				
		modelT.addColumn("CODIGO");
		modelT.addColumn("NOMBRES");
		modelT.addColumn("APELLIDOS");
		modelT.addColumn("DNI");
		modelT.addColumn("EDAD");
		modelT.addColumn("CELULAR");
		modelT.addColumn("ESTADO");
		table.setModel(modelT);
		listar();
		scrollPane.setViewportView(table);
		
	}

	ArregloAlumno alum = null; //new ArregloAlumno();
	Alumno a = null;
	
	public void listar() {
		alum = new ArregloAlumno();
		modelT.setRowCount(0);
		for(int i = 0; i < alum.cantidadAlumno(); i++) {
			a = alum.obtenerAlumno(i);
			Object fila[] = {
				alum.nuevoCodigo(),
				a.getNombres(),
				a.getApellidos(),
				a.getDni(),
				a.getEdad(),
				a.getCelular(),
				a.nombreEstado()
			};
			modelT.addRow(fila);
		}
	}
	
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		if(txtEdad.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Ingrese la Edad");
			txtEdad.requestFocus();
			return;
		}
		if(txtCelular.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Ingrese el Nro Celular");
			txtCelular.requestFocus();
			return;
		}
		if(txtDni.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Ingrese el Nro DNI");
			txtDni.requestFocus();
			return;
		}
		if(txtDni.getText().length()!=8) {
			JOptionPane.showMessageDialog(this, "El Dni debe ser de 8 digitos");
			txtDni.requestFocus();
			return;
		}
		for(int i=0; i < txtDni.getText().length(); i++) {
			char c = txtDni.getText().charAt(i);
			if(Character.isLetter(c)) {
				JOptionPane.showMessageDialog(this, "El DNI solo debe contener Digitos");
				txtDni.requestFocus();
				return;
			}
		}
		for(int i=0; i < alum.cantidadAlumno(); i++) {			
			if(txtDni.getText().equals(alum.obtenerAlumno(i).getDni())) {
				JOptionPane.showMessageDialog(this, "El DNI ya existe en el sistema"+ "\n"+ "Ingrese otro DNI");
				txtDni.requestFocus();
				return;
			}
		}
		for(int i=0; i < txtEdad.getText().length(); i++) {
			char c = txtEdad.getText().charAt(i);
			if(Character.isLetter(c)) {
				JOptionPane.showMessageDialog(this, "La Edad solo debe contener Digitos");
				txtEdad.requestFocus();
				return;
			}
		}
		for(int i=0; i < txtCelular.getText().length(); i++) {
			char c = txtCelular.getText().charAt(i);
			if(Character.isLetter(c)) {
				JOptionPane.showMessageDialog(this, "El Celular solo debe contener Digitos");
				txtCelular.requestFocus();
				return;
			}
		}
		
		//alum = new ArregloAlumno();
		int cod=0;
		if(alum.cantidadAlumno()==0) {
			cod = alum.cantidadAlumno()+1;
		}else {
			cod = (alum.obtenerAlumno(alum.cantidadAlumno()-1).getCodAlumno())+1;
		
		}
		String nom = txtNombres.getText();
		String ape = txtApellidos.getText();
		String dni = txtDni.getText();
		int edad = Integer.parseInt(txtEdad.getText());
		int cel = Integer.parseInt(txtCelular.getText());
		int estad = 0;
		a = new Alumno(cod, nom, ape, dni, edad, cel, estad);
		alum.agregarAlumno(a);
		JOptionPane.showMessageDialog(this, "Agregado correctamente");
		alum.guardarAlumno();
		listar();
		
		lblCodigoValue.setText("");
		
		
	}
	
	public void habilitarCampos() {
		txtNombres.requestFocus();
		txtNombres.setEnabled(true);
		txtApellidos.setEnabled(true);
		txtDni.setEnabled(true);
		txtEdad.setEnabled(true);
		txtCelular.setEnabled(true);
		//deshabilitarCampos();
	}
	
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		String cod = JOptionPane.showInputDialog("Ingrese el Codigo de Alumno");
		if(cod!=null) {
			for(int i = 0; i < alum.cantidadAlumno(); i++) {
				if(cod.equals(alum.obtenerAlumno(i).codigoAlumno())) {
					habilitarCampos();
					lblCodigoValue.setForeground(Color.red);
					lblCodigoValue.setText(alum.obtenerAlumno(i).codigoAlumno());
				}
			}
		}
	}
	
	public void inicio() {		
		
	}
	
}
