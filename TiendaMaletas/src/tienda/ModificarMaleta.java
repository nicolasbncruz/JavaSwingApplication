package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class ModificarMaleta extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPeso;
	private JTextField txtFondo;
	private JTextField txtAlto;
	private JTextField txtAncho;
	private JTextField txtPrecio;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblPeso;
	private JButton btnCerrar;
	private JButton btnGrabar;
	@SuppressWarnings("rawtypes")
	private JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarMaleta dialog = new ModificarMaleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ModificarMaleta() {
		setTitle("Modificar Maleta");
		// Agregando icono
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setBounds(100, 100, 481, 256);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(25, 29, 60, 14);
			contentPanel.add(lblModelo);
		}
		{
			lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(25, 56, 77, 14);
			contentPanel.add(lblPrecio);
		}
		{
			lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(25, 83, 77, 14);
			contentPanel.add(lblAncho);
		}
		{
			lblAlto = new JLabel("Alto (cm)");
			lblAlto.setBounds(25, 110, 77, 14);
			contentPanel.add(lblAlto);
		}
		{
			lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setBounds(24, 137, 78, 14);
			contentPanel.add(lblFondo);
		}
		{
			lblPeso = new JLabel("Peso (kg)");
			lblPeso.setBounds(25, 164, 77, 14);
			contentPanel.add(lblPeso);
		}
		{
			txtPeso = new JTextField();
			txtPeso.setColumns(10);
			txtPeso.setBounds(129, 161, 153, 20);
			contentPanel.add(txtPeso);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setColumns(10);
			txtFondo.setBounds(129, 134, 153, 20);
			contentPanel.add(txtFondo);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setColumns(10);
			txtAlto.setBounds(129, 107, 153, 20);
			contentPanel.add(txtAlto);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setColumns(10);
			txtAncho.setBounds(129, 80, 153, 20);
			contentPanel.add(txtAncho);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(129, 53, 153, 20);
			contentPanel.add(txtPrecio);
		}
		{
			cboModelo = new JComboBox();
			cboModelo.addActionListener(this);
			cboModelo.setModel(
					new DefaultComboBoxModel(new String[] { "Aviator", "Lucca", "Samsonite", "Century", "Saxoline" }));
			cboModelo.setBounds(129, 26, 153, 20);
			contentPanel.add(cboModelo);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(293, 53, 140, 23);
			contentPanel.add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(this);
			btnGrabar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnGrabar.setBounds(293, 25, 140, 23);
			contentPanel.add(btnGrabar);
		}
		// PARA QUE CUANDO SE HABRA EL GUI, APAREZCAN LOS DATOS COMPLETOS
		cboModelo.setToolTipText(Tienda.modelo0);
		txtPrecio.setText("" + Tienda.precio0);
		txtAncho.setText("" + Tienda.ancho0);
		txtAlto.setText("" + Tienda.alto0);
		txtFondo.setText("" + Tienda.fondo0);
		txtPeso.setText("" + Tienda.peso0);
	}

	// DEPENDIENDO DE DONDE SE HAGA CLICK:--------------------
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
	}

	// BOTON CERRAR -------------------------------------------
	public void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	// BOTON SELECCIONAR MODELO -------------------------------
	public void actionPerformedCboModelo(ActionEvent e) {
		// DECLARAMOS NUESTRAS VARIABLES
		int modelo, anchomaleta, altomaleta, fondomaleta;
		double pesomaleta, preciomaleta;
		// INVOCAMOS LOS MÉTODOS
		modelo = elegirmodelomochila();
		preciomaleta = elegirpreciomaleta(modelo);
		anchomaleta = elegiranchomaleta(modelo);
		altomaleta = elegiraltomaleta(modelo);
		fondomaleta = elegirfondomaleta(modelo);
		pesomaleta = elegirpesomaleta(modelo);
		mostrarresultados(preciomaleta, anchomaleta, altomaleta, fondomaleta, pesomaleta);
	}

	// CONFIGURAMOS INDEX
	int elegirmodelomochila() {
		return cboModelo.getSelectedIndex();
	}

	// BUSCAR PRECIO DE ACUERDO A SELEECIÓN
	double elegirpreciomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.precio0;
		case 1:
			return Tienda.precio1;
		case 2:
			return Tienda.precio2;
		case 3:
			return Tienda.precio3;
		default:
			return Tienda.precio4;
		}
	}

	// BUSCAR ANCHO DE ACUERDO A SELEECIÓN
	int elegiranchomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.ancho0;
		case 1:
			return Tienda.ancho1;
		case 2:
			return Tienda.ancho2;
		case 3:
			return Tienda.ancho3;
		default:
			return Tienda.ancho4;
		}
	}

	// BUSCAR ALTO DE ACUERDO A SELEECIÓN
	int elegiraltomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.alto0;
		case 1:
			return Tienda.alto1;
		case 2:
			return Tienda.alto2;
		case 3:
			return Tienda.alto3;
		default:
			return Tienda.alto4;
		}
	}

	// BUSCAR FONDO DE ACUERDO A SELEECIÓN
	int elegirfondomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.fondo0;
		case 1:
			return Tienda.fondo1;
		case 2:
			return Tienda.fondo2;
		case 3:
			return Tienda.fondo3;
		default:
			return Tienda.fondo4;
		}

	}

	// BUSCAR PESO DE ACUERDO A SELEECIÓN
	double elegirpesomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.peso0;
		case 1:
			return Tienda.peso1;
		case 2:
			return Tienda.peso2;
		case 3:
			return Tienda.peso3;
		default:
			return Tienda.peso4;
		}
	}

	// IMPRIMIMOS EL RESULTADO
	void mostrarresultados(double preciomaleta, int anchomaleta, int altomaleta, int fondomaleta, double pesomaleta) {
		txtPrecio.setText(preciomaleta + "");
		txtAncho.setText(anchomaleta + "");
		txtAlto.setText(altomaleta + "");
		txtFondo.setText(fondomaleta + "");
		txtPeso.setText(pesomaleta + "");
	}

	// BOTON GRABAR ------------------------------------------
	public void actionPerformedBtnGrabar(ActionEvent e) {
		Tienda tienda = new Tienda();
		String nombremochila;
		nombremochila = cboModelo.getSelectedItem().toString();
		if (nombremochila.equals("Aviator")) {
			Tienda.precio0 = Double.parseDouble(txtPrecio.getText());
			Tienda.ancho0 = Integer.parseInt(txtAncho.getText());
			Tienda.alto0 = Integer.parseInt(txtAlto.getText());
			Tienda.fondo0 = Integer.parseInt(txtFondo.getText());
			Tienda.peso0 = Double.parseDouble(txtPeso.getText());
			txtPrecio.setText(String.valueOf(Tienda.precio0));
			txtAncho.setText(String.valueOf(Tienda.ancho0));
			txtAlto.setText(String.valueOf(Tienda.alto0));
			txtFondo.setText(String.valueOf(Tienda.fondo0));
			txtPeso.setText(String.valueOf(Tienda.peso0));
		}
		if (nombremochila.equals("Lucca")) {
			Tienda.precio1 = Double.parseDouble(txtPrecio.getText());
			Tienda.ancho1 = Integer.parseInt(txtAncho.getText());
			Tienda.alto1 = Integer.parseInt(txtAlto.getText());
			Tienda.fondo1 = Integer.parseInt(txtFondo.getText());
			Tienda.peso1 = Double.parseDouble(txtPeso.getText());
			txtPrecio.setText(String.valueOf(Tienda.precio1));
			txtAncho.setText(String.valueOf(Tienda.ancho1));
			txtAlto.setText(String.valueOf(Tienda.alto1));
			txtFondo.setText(String.valueOf(Tienda.fondo1));
			txtPeso.setText(String.valueOf(Tienda.peso1));
		}
		if (nombremochila.equals("Samsonite")) {
			Tienda.precio2 = Double.parseDouble(txtPrecio.getText());
			Tienda.ancho2 = Integer.parseInt(txtAncho.getText());
			Tienda.alto2 = Integer.parseInt(txtAlto.getText());
			Tienda.fondo2 = Integer.parseInt(txtFondo.getText());
			Tienda.peso2 = Double.parseDouble(txtPeso.getText());
			txtPrecio.setText(String.valueOf(Tienda.precio2));
			txtAncho.setText(String.valueOf(Tienda.ancho2));
			txtAlto.setText(String.valueOf(Tienda.alto2));
			txtFondo.setText(String.valueOf(Tienda.fondo2));
			txtPeso.setText(String.valueOf(Tienda.peso2));
		}
		if (nombremochila.equals("Century")) {
			Tienda.precio3 = Double.parseDouble(txtPrecio.getText());
			Tienda.ancho3 = Integer.parseInt(txtAncho.getText());
			Tienda.alto3 = Integer.parseInt(txtAlto.getText());
			Tienda.fondo3 = Integer.parseInt(txtFondo.getText());
			Tienda.peso3 = Double.parseDouble(txtPeso.getText());
			txtPrecio.setText(String.valueOf(Tienda.precio3));
			txtAncho.setText(String.valueOf(Tienda.ancho3));
			txtAlto.setText(String.valueOf(Tienda.alto3));
			txtFondo.setText(String.valueOf(Tienda.fondo3));
			txtPeso.setText(String.valueOf(Tienda.peso3));
		}
		if (nombremochila.equals("Saxoline")) {
			Tienda.precio4 = Double.parseDouble(txtPrecio.getText());
			Tienda.ancho4 = Integer.parseInt(txtAncho.getText());
			Tienda.alto4 = Integer.parseInt(txtAlto.getText());
			Tienda.fondo4 = Integer.parseInt(txtFondo.getText());
			Tienda.peso4 = Double.parseDouble(txtPeso.getText());
			txtPrecio.setText(String.valueOf(Tienda.precio4));
			txtAncho.setText(String.valueOf(Tienda.ancho4));
			txtAlto.setText(String.valueOf(Tienda.alto4));
			txtFondo.setText(String.valueOf(Tienda.fondo4));
			txtPeso.setText(String.valueOf(Tienda.peso4));
		}
	}

}
