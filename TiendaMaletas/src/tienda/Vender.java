package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JComboBox cboModelo;
	private JButton btnVender;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnCerrar;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	// Declaración de variables
	// String modelo;
	int cantidad, totalvnet;
	double preciototal, porCuota;
	public static int canven0, canven1, canven2, canven3, canven4;
	public static int canuni0, canuni1, canuni2, canuni3, canuni4;
	public static double imptot0, imptot1, imptot2, imptot3, imptot4;
	public static double descuento0, descuento1, descuento2, descuento3, descuento4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender dialog = new Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender() {
		setBounds(100, 100, 658, 464);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModelo.setBounds(34, 25, 107, 21);
		contentPanel.add(lblModelo);

		cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedCboModelo(e);
			}
		});
		cboModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		cboModelo.setModel(
				new DefaultComboBoxModel(new String[] { "Aviator", "Lucca", "Samsonite", "Century", "Saxoline" }));
		cboModelo.setBounds(170, 21, 198, 29);
		contentPanel.add(cboModelo);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnVender(e);
			}
		});
		btnVender.setBounds(483, 21, 123, 29);
		contentPanel.add(btnVender);

		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecio.setBounds(34, 60, 107, 21);
		contentPanel.add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(170, 61, 198, 21);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCantidad.setBounds(34, 92, 107, 21);
		contentPanel.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(170, 93, 198, 21);
		contentPanel.add(txtCantidad);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCerrar(e);
			}
		});
		btnCerrar.setBounds(483, 61, 123, 29);
		contentPanel.add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 126, 622, 288);
		contentPanel.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

	/*protected void actionPerformedCboModelo(ActionEvent e) {
		int modelo, anchomaleta, altomaleta, fondomaleta;
		double pesomaleta, preciomaleta;
		// Creamos métodos
		modelo = elegirmodelomochila();
		preciomaleta = elegirpreciomaleta(modelo);

		mostrarresultados(preciomaleta);
	}

	int elegirmodelomochila() {
		return cboModelo.getSelectedIndex();
	}

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

	void mostrarresultados(double preciomaleta) {
		txtPrecio.setText(String.valueOf(preciomaleta));
	}*/

	protected void actionPerformedBtnVender(ActionEvent e) {
		// Tienda llamarDatos = new Tienda();
		String modelo, obsequio;
		int tipo, cantidad;
		double precio, impcompra, porcentaje, imptpagar, descuento;
		tipo = determinarTipo();
		modelo = nombreModelo(tipo);
		cantidad = cantidad();
		impcompra = importeCompra(tipo, cantidad);
		porcentaje = porcentaje(cantidad);
		descuento = importeDescuento(impcompra, porcentaje);
		imptpagar = importePagar(tipo, impcompra, descuento);
		obsequio = dameObsequio(cantidad);
		precio = precioParlante(tipo);
		agregarAcumulador(tipo, cantidad, impcompra, descuento, imptpagar);
		avisoVentas();
		mostrarResultados(modelo, precio, cantidad, impcompra, descuento, imptpagar, obsequio);
	}

	// Ingresar datos
	int determinarTipo() {
		return cboModelo.getSelectedIndex();
	}

	int cantidad() {
		return cantidad = Integer.parseInt(txtCantidad.getText());
	}

	String nombreModelo(int tip) {
		switch (tip) {
		case 0:
			return Tienda.modelo0;
		case 1:
			return Tienda.modelo1;
		case 2:
			return Tienda.modelo2;
		case 3:
			return Tienda.modelo3;
		default:
			return Tienda.modelo4;
		}
	}

	double importeCompra(int tip, int cant) {
		switch (tip) {
		case 0:
			return Tienda.precio0 * cant;
		case 1:
			return Tienda.precio1 * cant;
		case 2:
			return Tienda.precio2 * cant;
		case 3:
			return Tienda.precio3 * cant;
		default:
			return Tienda.precio4 * cant;
		}
	}

	double porcentaje(int cant) {
		if (cant >= 1 && cant <= 5) {
			return Tienda.porcentaje1;
		} else if (cant >= 6 && cant <= 10) {
			return Tienda.porcentaje2;
		} else if (cant >= 11 && cant <= 15) {
			return Tienda.porcentaje3;
		} else {
			return Tienda.porcentaje4;
		}
	}

	double importeDescuento(double impcom, double desct) {
		return (impcom * desct) / 100;
	}

	double importePagar(int tip, double impcom, double desct) {
		switch (tip) {
		case 0:
			return impcom - desct;
		case 1:
			return impcom - desct;
		case 2:
			return impcom - desct;
		case 3:
			return impcom - desct;
		default:
			return impcom - desct;
		}
	}

	String dameObsequio(int cant) {
		if (cant == 1) {
			return Tienda.obsequio1;
		} else if (cant > 2 && cant < 5) {
			return Tienda.obsequio2;
		} else {
			return Tienda.obsequio3;
		}
	}

	void agregarAcumulador(int tip, int cant, double imptcomp, double desc, double imppag) {
		switch (tip) {
		case 0:
			canven0++;
			canuni0 += cant;
			imptot0 += imppag;
			descuento0 += desc;
			break;
		case 1:
			canven1++;
			canuni1 += cant;
			imptot1 += imppag;
			descuento1 += desc;
			break;
		case 2:
			canven2++;
			canuni2 += cant;
			imptot2 += imppag;
			descuento2 += desc;
			break;
		case 3:
			canven3++;
			canuni3 += cant;
			imptot3 += imppag;
			descuento3 += desc;
			break;
		default:
			canven4++;
			canuni4 += cant;
			imptot4 += imppag;
			descuento4 += desc;
			break;
		}
	}

	void avisoVentas() {
		totalvnet = canven0 + canven1 + canven2 + canven3 + canven4;
		if (totalvnet % 5 == 0) {
			preciototal = imptot0 + imptot1 + imptot2 + imptot3 + imptot4;
			porCuota = (preciototal / Tienda.cuotaDiaria) * 100;
			JOptionPane.showMessageDialog(null,
					"Venta N°: " + totalvnet + "\n" + "Importe total general acumulado: S/. " + preciototal + "\n"
							+ "Porcentaje de la cuota diaria: " + porCuota + "%");
		}
	}

	void mostrarResultados(String model, double prec, int cant, double imptcomp, double desc, double imppag,
			String obse) {
		textArea.setText("");
		textArea.append("");
		textArea.append(" " + "Modelo : " + model + "\n");
		textArea.append(" " + "Precio : S/. " + prec + "\n");
		textArea.append(" " + "Cantidad : " + cant + "\n");
		textArea.append(" " + "Importe Compra : S/. " + imptcomp + "\n");
		textArea.append(" " + "Importe descuento : S/. " + desc + "\n");
		textArea.append(" " + "Importe pagar: S/. " + imppag + "\n");
		textArea.append(" " + "Obsequio: " + obse);
	}

	void imprimir(String cad) {
		textArea.append(cad + "\n");
	}

	protected void actionPerformedCboModelo(ActionEvent arg0) {
		// Variables locales
		int posicion;
		double precio;
		posicion = getPosicion();
		precio = precioParlante(posicion);
		imprimir(precio);
	}

	int getPosicion() {
		return cboModelo.getSelectedIndex();
	}

	double precioParlante(int posi) {
		switch (posi) {
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

	void imprimir(double precio) {
		txtPrecio.setText(precio + "\n");
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
