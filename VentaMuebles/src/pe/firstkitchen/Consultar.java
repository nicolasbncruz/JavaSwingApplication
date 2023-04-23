package pe.firstkitchen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Consultar extends JDialog implements ActionListener, ItemListener{

	private final JPanel contentPane = new JPanel();
	
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
	private JButton btnCerrar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consultar dialog = new Consultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consultar() {
		setTitle("Consultar cocina");
		setBounds(100, 100, 492, 292);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblModelo.setBounds(28, 30, 86, 14);
		contentPane.add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.addItemListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(141, 26, 153, 23);
		contentPane.add(cboModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecio.setBounds(28, 67, 86, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(141, 64, 153, 22);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAncho.setBounds(28, 102, 102, 14);
		contentPane.add(lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(141, 97, 153, 22);
		contentPane.add(txtAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAlto.setBounds(28, 134, 86, 17);
		contentPane.add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtAlto.setEditable(false);
		txtAlto.setColumns(10);
		txtAlto.setBounds(141, 130, 153, 22);
		contentPane.add(txtAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFondo.setBounds(28, 168, 86, 14);
		contentPane.add(lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtFondo.setEditable(false);
		txtFondo.setColumns(10);
		txtFondo.setBounds(141, 163, 153, 22);
		contentPane.add(txtFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblQuemadores.setBounds(28, 201, 86, 14);
		contentPane.add(lblQuemadores);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtQuemadores.setEditable(false);
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(141, 196, 153, 22);
		contentPane.add(txtQuemadores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(354, 26, 102, 23);
		contentPane.add(btnCerrar);
		
		//implementacion seteo inicial		
		seteatPrimeraCocina();	
	}
	
	private void seteatPrimeraCocina() {
		lista = CocinaDatos.listaCocinas();
		Cocina cocinaMabe = lista.get(0);
		
		txtPrecio.setText(String.valueOf(cocinaMabe.getPrecio()));
		txtQuemadores.setText(String.valueOf(cocinaMabe.getQuemadores()));
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboModelo) {
			itemStateChangedCboModelo(e);
		}
	}
	
	List<Cocina> lista = new ArrayList<>();
	
	protected void itemStateChangedCboModelo(ItemEvent e) {
		lista = CocinaDatos.listaCocinas();
				
		//for(TipoDato objeto : lista<TipoDato>)
		for(Cocina kitchen : lista) {
			
			if(kitchen.getModelo() == e.getItem()) {
				
				txtPrecio.setText( String.valueOf(kitchen.getPrecio()) );
				//TODO: kcruz
				txtQuemadores.setText(  String.valueOf(kitchen.getQuemadores()) );
			}
		
		}
		
	}

}
