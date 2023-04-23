package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class GenerarReportes extends JDialog implements ActionListener {
	private JLabel lblTipoDeReporte;
	private JComboBox comboBox;
	private JButton btnCerrar;
	private JTextArea textArea;
	private JScrollPane scpScroll;

	private final JPanel contentPanel = new JPanel();

	double descuent0, descuent1, descuent2, descuent3, descuent4;
	double preprom, datoprom;
	String modelo0, modelo1, modelo2, modelo3, modelo4;
	int cant0, cant1, cant2, cant3, cant4;
	int cantuni0, cantuni1, cantuni2, cantuni3, cantuni4;
	double impto0, impto1, impto2, impto3, impto4;
	int cantOp0, cantOp1, cantOp2, cantOp3, cantOp4;
	String prom0, prom1, prom2, prom3, prom4;
	String mensOp0, mensOp1, mensOp2, mensOp3, mensOp4;
	double prom, suma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReportes dialog = new GenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 756, 488);
		getContentPane().setLayout(null);
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeReporte.setBounds(23, 25, 115, 16);
		getContentPane().add(lblTipoDeReporte);
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Ventas por modelo ", "Ventas en relacion a las ventas \u00F3ptima",
						"Precio en relaci\u00F3n al precio promedio", "General " }));
		comboBox.setBounds(150, 22, 408, 25);
		getContentPane().add(comboBox);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(588, 25, 115, 22);
		getContentPane().add(btnCerrar);
		scpScroll = new JScrollPane();
		scpScroll.setBounds(21, 75, 700, 350);
		getContentPane().add(scpScroll);
		textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		textArea.setBounds(23, 76, 700, 350);
		// getContentPane().add(textArea);
		scpScroll.setViewportView(textArea);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == comboBox) {
			actionPerformedComboBox(arg0);
		}
	}

	protected void actionPerformedComboBox(ActionEvent arg0) {
		Vender ventas = new Vender();
		int tipo, ventacant;
		String modelo;
		tipo = tipoReporte();
		mostrarModelo();
		cantidadVentas();
		cantidadUnidades();
		importeTotal();
		CantidadOptima();
		sinVentas();
		precioPromedio();
		prePromedio();
		mensjOp();
		mostrarResultado(tipo);
	}

	int tipoReporte() {
		return comboBox.getSelectedIndex();
	}

	void mostrarModelo() {
		modelo0 = Tienda.modelo0;
		modelo1 = Tienda.modelo1;
		modelo2 = Tienda.modelo2;
		modelo3 = Tienda.modelo3;
		modelo4 = Tienda.modelo4;
	}

	void cantidadVentas() {
		cant0 = Vender.canven0;
		cant1 = Vender.canven1;
		cant2 = Vender.canven2;
		cant3 = Vender.canven3;
		cant4 = Vender.canven4;
	}

	void cantidadUnidades() {
		cantuni0 = Vender.canuni0;
		cantuni1 = Vender.canuni1;
		cantuni2 = Vender.canuni2;
		cantuni3 = Vender.canuni3;
		cantuni4 = Vender.canuni4;
	}

	void importeTotal() {
		impto0 = Vender.imptot0;
		impto1 = Vender.imptot1;
		impto2 = Vender.imptot2;
		impto3 = Vender.imptot3;
		impto4 = Vender.imptot4;
	}

	void descuentoTotal() {
		descuent0 = Vender.descuento0;
		descuent1 = Vender.descuento1;
		descuent2 = Vender.descuento2;
		descuent3 = Vender.descuento3;
		descuent4 = Vender.descuento4;
	}

	void CantidadOptima() {
		cantOp0 = cantuni0 - Tienda.cantidadOptima;
		cantOp1 = cantuni1 - Tienda.cantidadOptima;
		cantOp2 = cantuni2 - Tienda.cantidadOptima;
		cantOp3 = cantuni3 - Tienda.cantidadOptima;
		cantOp4 = cantuni4 - Tienda.cantidadOptima;
	}

	int modelosVendidos = 0;

	void sinVentas() {
		if (Vender.canven0 > 0) {
			modelosVendidos++;
		}
		if (Vender.canven1 > 0) {
			modelosVendidos++;
		}
		if (Vender.canven2 > 0) {
			modelosVendidos++;
		}
		if (Vender.canven3 > 0) {
			modelosVendidos++;
		}
		if (Vender.canven4 > 0) {
			modelosVendidos++;
		}
	}

	void mensjOp() {
		if (cantOp0 > Tienda.cantidadOptima) {
			mensOp0 = "más que la cantidad óptima";
		} else {
			mensOp0 = "menos que la cantidad óptima";
		}
		if (cantOp1 > Tienda.cantidadOptima) {
			mensOp1 = "más que la cantidad óptima";
		} else {
			mensOp1 = "menos que la cantidad óptima";
		}
		if (cantOp2 > Tienda.cantidadOptima) {
			mensOp2 = "más que la cantidad óptima";
		} else {
			mensOp2 = "menos que la cantidad óptima";
		}
		if (cantOp3 > Tienda.cantidadOptima) {
			mensOp3 = "más que la cantidad óptima";
		} else {
			mensOp3 = "menos que la cantidad óptima";
		}
		if (cantOp4 > Tienda.cantidadOptima) {
			mensOp4 = "más que la cantidad óptima";
		} else {
			mensOp4 = "menos que la cantidad óptima";
		}
	}

	double precioPromedio() {
		return preprom = (Tienda.precio0 + Tienda.precio1 + Tienda.precio2 + Tienda.precio3 + Tienda.precio4) / 5;
	}

	void prePromedio() {
		if (preprom > Tienda.precio0) {
			prom0 = "Menor al promedio";
		} else {
			prom0 = "Mayor al promedio";
			// prom++;
		}
		if (preprom > Tienda.precio1) {
			prom1 = "Menor al promedio";
		} else {
			prom1 = "Mayor al promedio";
		}
		if (preprom > Tienda.precio2) {
			prom2 = "Menor al promedio";
		} else {
			prom2 = "Mayor al promedio";
		}
		if (preprom > Tienda.precio3) {
			prom3 = "Menor al promedio";
		} else {
			prom3 = "Mayor al promedio";
		}
		if (preprom > Tienda.precio4) {
			prom4 = "Menor al promedio";
		} else {
			prom4 = "Mayor al promedio";
		}
	}

	void mostrarResultado(int tip) {
		switch (tip) {
		case 0:
			textArea.setText(""+"\n");
			textArea.append("VENTAS POR MODELO"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo0+"\n");
			textArea.append(" " + "Cantidad de ventas : " + cant0+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni0+"\n");
			textArea.append(" " + "Importe total vendido : S/. " + impto0+"\n");
			textArea.append(" " + "Total descuento : S/. " + descuent0+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo1+"\n");
			textArea.append(" " + "Cantidad de ventas : " + cant1+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni1+"\n");
			textArea.append(" " + "Importe total vendido : S/. " + impto1+"\n");
			textArea.append(" " + "Total descuento : S/. " + descuent1+"\n");
			textArea.append(" " + ""+"\n");
			textArea.append(" " + "Modelo : " + modelo2+"\n");
			textArea.append(" " + "Cantidad de ventas : " + cant2+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni2+"\n");
			textArea.append(" " + "Importe total vendido : S/. " + impto2+"\n");
			textArea.append(" " + "Total descuento : S/. " + descuent2+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo3+"\n");
			textArea.append(" " + "Cantidad de ventas : " + cant3+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni3+"\n");
			textArea.append(" " + "Importe total vendido : S/. " + impto3+"\n");
			textArea.append(" " + "Total descuento : S/. " + descuent3+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo4+"\n");
			textArea.append(" " + "Cantidad de ventas : " + cant4+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni4+"\n");
			textArea.append(" " + "Importe total vendido : S/. " + impto4+"\n");
			textArea.append(" " + "Total descuento : S/. " + descuent4+"\n");
			return;
		case 1:
			textArea.setText(""+"\n");
			textArea.append(" " + "VENTAS EN RELACIÓN A LA VENTA ÓPTIMA"+"\n");
			textArea.append(" " + "Modelo : " + modelo0+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni0 + "(" + cantOp0 + " " + mensOp0 + " )"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "VENTAS EN RELACIÓN A LA VENTA ÓPTIMA"+"\n");
			textArea.append(" " + "Modelo : " + modelo1+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni1 + "(" + cantOp1 + " " + mensOp1 + " )"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "VENTAS EN RELACIÓN A LA VENTA ÓPTIMA"+"\n");
			textArea.append(" " + "Modelo : " + modelo2+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni2 + "(" + cantOp2 + " " + mensOp2 + " )"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "VENTAS EN RELACIÓN A LA VENTA ÓPTIMA"+"\n");
			textArea.append(" " + "Modelo : " + modelo3+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni3 + "(" + cantOp3 + " " + mensOp3 + " )"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "VENTAS EN RELACIÓN A LA VENTA ÓPTIMA"+"\n");
			textArea.append(" " + "Modelo : " + modelo4+"\n");
			textArea.append(" " + "Cantidad de unidades vendidas : " + cantuni4 + "(" + cantOp4 + " " + mensOp4 + " )"+"\n");
			return;
		case 2:
			textArea.setText(""+"\n");
			textArea.append(" " + "PRECIOS EN LA RELACION AL PRECIO PROMEDIO"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo0+"\n");
			textArea.append(" " + "Precio : " + Tienda.precio0 + "( " + prom0 + ")"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo1+"\n");
			textArea.append(" " + "Precio : " + Tienda.precio1 + "(" + prom1 + ")"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo2+"\n");
			textArea.append(" " + "Precio : " + Tienda.precio2 + "(" + prom2 + ")"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo3+"\n");
			textArea.append(" " + "Precio : " + Tienda.precio3 + "(" + prom3 + ")"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Modelo : " + modelo4+"\n");
			textArea.append(" " + "Precio : " + Tienda.precio4 + "(" + prom4 + ")"+"\n");
			return;
		case 3:
			textArea.setText(""+"\n");
			textArea.append(" " + "GENERAL"+"\n");
			textArea.append(""+"\n");
			textArea.append(" " + "Precio promedio :.............S/. " + preprom+"\n");
			textArea.append(" " + "Precio menor : ...............S/. " + Tienda.precio3+"\n");
			textArea.append(" " + "Precio mayor : ...............S/. " + Tienda.precio1+"\n");
			textArea.append(" " + "Cantidad de precios mayores al precio promedio.....: " + 2+"\n");
			textArea.append(" " + "Cantidad de modelos sin ventas: ........" + (5 - modelosVendidos)+"\n");
		}
	}

	void imprimir(String cad) {
		textArea.append(cad + "\n"+"\n");
	}

	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}

}
