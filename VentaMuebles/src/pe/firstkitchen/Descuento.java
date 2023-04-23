package pe.firstkitchen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Descuento extends JDialog implements ActionListener {

	private final JPanel contentPane = new JPanel();
	private JLabel lbl1a5Unidades;
	private JTextField txt1a5Unidades;
	private JLabel lblPorcentaje1;
	private JLabel lbl6a10Unidades;
	private JTextField txt6a10Unidades;
	private JLabel lblPorcentaje1_1;
	private JLabel lbl11a15Unidades;
	private JTextField txt11a15Unidades;
	private JLabel lblPorcentaje1_2;
	private JLabel lblMasDe15;
	private JTextField txtMasDe15;
	private JLabel lblPorcentaje1_3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Descuento dialog = new Descuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Descuento() {
		setTitle("Configurar descuentos");
		setBounds(100, 100, 523, 181);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		lbl1a5Unidades = new JLabel("1 a 5 unidades");
		lbl1a5Unidades.setBounds(10, 24, 106, 14);
		contentPane.add(lbl1a5Unidades);

		txt1a5Unidades = new JTextField();
		txt1a5Unidades.setBounds(154, 21, 121, 20);
		contentPane.add(txt1a5Unidades);
		txt1a5Unidades.setColumns(10);

		lblPorcentaje1 = new JLabel("%");
		lblPorcentaje1.setBounds(285, 24, 46, 14);
		contentPane.add(lblPorcentaje1);

		lbl6a10Unidades = new JLabel("6 a 10 unidades");
		lbl6a10Unidades.setBounds(10, 52, 106, 14);
		contentPane.add(lbl6a10Unidades);

		txt6a10Unidades = new JTextField();
		txt6a10Unidades.setColumns(10);
		txt6a10Unidades.setBounds(154, 49, 121, 20);
		contentPane.add(txt6a10Unidades);

		lblPorcentaje1_1 = new JLabel("%");
		lblPorcentaje1_1.setBounds(285, 52, 46, 14);
		contentPane.add(lblPorcentaje1_1);

		lbl11a15Unidades = new JLabel("11 a 15 unidades");
		lbl11a15Unidades.setBounds(10, 80, 106, 14);
		contentPane.add(lbl11a15Unidades);

		txt11a15Unidades = new JTextField();
		txt11a15Unidades.setColumns(10);
		txt11a15Unidades.setBounds(154, 77, 121, 20);
		contentPane.add(txt11a15Unidades);

		lblPorcentaje1_2 = new JLabel("%");
		lblPorcentaje1_2.setBounds(285, 80, 46, 14);
		contentPane.add(lblPorcentaje1_2);

		lblMasDe15 = new JLabel("M\u00E1s de 15 unidades");
		lblMasDe15.setBounds(10, 108, 134, 14);
		contentPane.add(lblMasDe15);

		txtMasDe15 = new JTextField();
		txtMasDe15.setColumns(10);
		txtMasDe15.setBounds(154, 105, 121, 20);
		contentPane.add(txtMasDe15);

		lblPorcentaje1_3 = new JLabel("%");
		lblPorcentaje1_3.setBounds(285, 108, 46, 14);
		contentPane.add(lblPorcentaje1_3);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(402, 20, 89, 23);
		contentPane.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(402, 48, 89, 23);
		contentPane.add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.dispose();
	}

}
