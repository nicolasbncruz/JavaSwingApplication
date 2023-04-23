package pe.firstkitchen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class TiendaAutores extends JDialog implements ActionListener {

	private final JPanel contentPane = new JPanel();
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JButton btnCerrar;
	private JLabel lblGonzalesLeyvaJhonatan;
	private JLabel lblLopezSanchezRicardo;
	private JLabel lblPeregrinoCubaDiego;
	private JLabel lblTrujilloAstoMartn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TiendaAutores dialog = new TiendaAutores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TiendaAutores() {
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 539, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		lblTienda = new JLabel("FIRST KITCHEN S.A.");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTienda.setBackground(new Color(0, 0, 255));
		lblTienda.setBounds(127, 26, 324, 40);
		contentPane.add(lblTienda);

		separator = new JSeparator();
		separator.setBounds(54, 78, 414, 2);
		contentPane.add(separator);

		lblNewLabel = new JLabel("Cruz Carpio, Karen");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel.setBounds(159, 91, 171, 27);
		contentPane.add(lblNewLabel);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(215, 266, 103, 40);
		contentPane.add(btnCerrar);

		lblGonzalesLeyvaJhonatan = new JLabel("Gonzales Leyva, Jhonatan");
		lblGonzalesLeyvaJhonatan.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblGonzalesLeyvaJhonatan.setBounds(159, 116, 246, 23);
		contentPane.add(lblGonzalesLeyvaJhonatan);

		lblLopezSanchezRicardo = new JLabel("Lopez Sanchez, Ricardo");
		lblLopezSanchezRicardo.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblLopezSanchezRicardo.setBounds(159, 141, 206, 23);
		contentPane.add(lblLopezSanchezRicardo);

		lblPeregrinoCubaDiego = new JLabel("Peregrino Cuba, Diego");
		lblPeregrinoCubaDiego.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblPeregrinoCubaDiego.setBounds(159, 164, 192, 23);
		contentPane.add(lblPeregrinoCubaDiego);

		lblTrujilloAstoMartn = new JLabel("Trujillo Asto, Mart\u00EDn");
		lblTrujilloAstoMartn.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblTrujilloAstoMartn.setBounds(159, 189, 171, 25);
		contentPane.add(lblTrujilloAstoMartn);
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
