package pe.firstkitchen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Reportes extends JDialog implements ActionListener {

	private final JPanel contentPane = new JPanel();
	private JLabel lblTipoReporte;
	private JComboBox cboVentas;
	private JButton btnCerrar;
	private JTextArea txtS;
	private JScrollPane scp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reportes dialog = new Reportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reportes() {
		setTitle("Generar reportes");
		setBounds(100, 100, 682, 325);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		lblTipoReporte = new JLabel("Tipo de reporte");
		lblTipoReporte.setBounds(10, 21, 90, 14);
		contentPane.add(lblTipoReporte);

		cboVentas = new JComboBox();
		cboVentas.setModel(new DefaultComboBoxModel(
				new String[] { "Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima",
						"Precios en relaci\u00F3n al precio promedio", "Promedios, menores y mayores" }));
		cboVentas.setBounds(108, 21, 362, 22);
		contentPane.add(cboVentas);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(562, 21, 89, 23);
		contentPane.add(btnCerrar);

		scp = new JScrollPane();
		scp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scp.setBounds(10, 61, 641, 210);
		contentPane.add(scp);

		txtS = new JTextArea();
		scp.setViewportView(txtS);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}

}
