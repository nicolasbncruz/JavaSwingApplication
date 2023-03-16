package pe.cibertec.karen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ItemEvent;

public class FrmModificarCocina extends JFrame {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JComboBox cboModelo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblAncho;
	private JTextField txtAncho;
	private JLabel lblAlto;
	private JTextField txtAlto;
	private JLabel lblFondo;
	private JTextField txtFondo;
	private JLabel lblQuemadores;
	private JTextField txtQuemadores;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmModificarCocina frame = new FrmModificarCocina();
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmModificarCocina() {
		setTitle("Consultar cocina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 91, 14);
		contentPane.add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				itemStateChangedCboModelo(e);
			}
		});
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(124, 7, 194, 22);
		contentPane.add(cboModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 52, 91, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(124, 49, 194, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(10, 83, 91, 14);
		contentPane.add(lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(124, 80, 194, 20);
		contentPane.add(txtAncho);
		
		lblAlto = new JLabel("Alto");
		lblAlto.setBounds(10, 114, 91, 14);
		contentPane.add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(124, 111, 194, 20);
		contentPane.add(txtAlto);
		
		lblFondo = new JLabel("Fondo");
		lblFondo.setBounds(10, 142, 91, 14);
		contentPane.add(lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(124, 139, 194, 20);
		contentPane.add(txtFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 170, 91, 14);
		contentPane.add(lblQuemadores);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(124, 167, 194, 20);
		contentPane.add(txtQuemadores);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setBounds(469, 7, 115, 23);
		contentPane.add(btnNewButton);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnGrabar(e);
			}
		});
		btnGrabar.setBounds(469, 48, 115, 23);
		contentPane.add(btnGrabar);
		
		inicializarCocina(cboModelo.getSelectedItem().toString());
	}
	
	List<Cocina> lista = new ArrayList<Cocina>();
	
	public void inicializarCocina(String modelo) {
		lista = DataCocina.listaCocinas();
		Cocina cocina = lista.get(0);		
		implementaCocina(cocina);
	}
	
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		this.dispose();
	}
	
	
	private JButton btnGrabar;
	
	protected void itemStateChangedCboModelo(ItemEvent e) {				
		lista = DataCocina.listaCocinas();
		
		for(Cocina cocina: lista) {
			if(cocina.getModelo().equals(e.getItem())) {				
				implementaCocina(cocina);
			}
		}		
	}
	
	private void implementaCocina(Cocina cocina) {
		txtPrecio.setText(String.valueOf(cocina.getPrecio()));
		txtAncho.setText(String.valueOf(cocina.getAncho()));
		txtAlto.setText(String.valueOf(cocina.getAlto()));
		txtFondo.setText(String.valueOf(cocina.getFondo()));
		txtQuemadores.setText(String.valueOf(cocina.getQuemadores()));
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		String modeloCocina;
		double precio;
		double ancho;
		double alto;
		double fondo;
		int quemadores;
		
		modeloCocina = cboModelo.getSelectedItem().toString();
		precio = Double.parseDouble(txtPrecio.getText());
		ancho = Double.parseDouble(txtAncho.getText());
		alto = Double.parseDouble(txtAlto.getText());
		fondo = Double.parseDouble(txtFondo.getText());
		quemadores = Integer.parseInt(txtQuemadores.getText());
		
		Cocina cocinaActualizada = new Cocina(modeloCocina, precio, ancho, alto, fondo, quemadores);
		
		lista = DataCocina.listaCocinas();
		for(Cocina cocina: lista) {
			if(modeloCocina.equals(cocina.getModelo())) {
				
				DataCocina.actualizaCocina(cocinaActualizada);
			}
		}
		this.dispose();
	}
}
