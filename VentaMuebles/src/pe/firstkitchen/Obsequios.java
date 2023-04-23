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

public class Obsequios extends JDialog implements ActionListener {

	private final JPanel contentPane = new JPanel();
	private JLabel lblUnidad1;
	private JTextField txtCafetera;
	private JLabel lblUnidades2;
	private JTextField txtLicuadora;
	private JLabel lblUnidades6;
	private JTextField txtExtractor;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Obsequios dialog = new Obsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Obsequios() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 430, 137);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		lblUnidad1 = new JLabel("1 unidad");
		lblUnidad1.setBounds(10, 14, 127, 14);
		contentPane.add(lblUnidad1);

		txtCafetera = new JTextField();
		txtCafetera.setBounds(165, 11, 86, 20);
		contentPane.add(txtCafetera);
		txtCafetera.setColumns(10);

		lblUnidades2 = new JLabel("2 a 5 unidades");
		lblUnidades2.setBounds(10, 42, 127, 14);
		contentPane.add(lblUnidades2);

		txtLicuadora = new JTextField();
		txtLicuadora.setColumns(10);
		txtLicuadora.setBounds(165, 39, 86, 20);
		contentPane.add(txtLicuadora);

		lblUnidades6 = new JLabel("6 a m\u00E1s unidades");
		lblUnidades6.setBounds(10, 70, 127, 14);
		contentPane.add(lblUnidades6);

		txtExtractor = new JTextField();
		txtExtractor.setColumns(10);
		txtExtractor.setBounds(165, 67, 86, 20);
		contentPane.add(txtExtractor);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(302, 14, 89, 23);
		contentPane.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(302, 42, 89, 23);
		contentPane.add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.dispose();
	}

}
