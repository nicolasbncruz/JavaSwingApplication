package tienda;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JDialog implements ActionListener {
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblObsequio1;
	private JLabel lblObsequio2;
	private JLabel lblObsequio3;
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar Obsequios");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setBounds(100, 100, 450, 132);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblObsequio1 = new JLabel("1 unidad");
			lblObsequio1.setBounds(10, 11, 109, 14);
			contentPanel.add(lblObsequio1);
		}
		{
			lblObsequio2 = new JLabel("2 a 5 unidades");
			lblObsequio2.setBounds(10, 36, 109, 14);
			contentPanel.add(lblObsequio2);
		}
		{
			lblObsequio3 = new JLabel("6 a m\u00E1s unidades");
			lblObsequio3.setBounds(10, 61, 109, 14);
			contentPanel.add(lblObsequio3);
		}
		{
			txtObsequio1 = new JTextField();
			txtObsequio1.setBounds(123, 8, 123, 20);
			contentPanel.add(txtObsequio1);
			txtObsequio1.setColumns(10);
		}
		{
			txtObsequio2 = new JTextField();
			txtObsequio2.setBounds(123, 33, 123, 20);
			contentPanel.add(txtObsequio2);
			txtObsequio2.setColumns(10);
		}
		{
			txtObsequio3 = new JTextField();
			txtObsequio3.setBounds(123, 58, 123, 20);
			contentPanel.add(txtObsequio3);
			txtObsequio3.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(296, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(296, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}
		// Mostrar los datos del primer modelo de mochila
		txtObsequio1.setText(Tienda.obsequio1);
		txtObsequio2.setText(Tienda.obsequio2);
		txtObsequio3.setText(Tienda.obsequio3);
	}

	// Direccionamos eventos Action Event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	// Accionamos el Botón Cancelar
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

	// Accionamos el Botón Aceptar
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		String obsequio1 = txtObsequio1.getText();
		Tienda.obsequio1 = obsequio1;
		dispose();
		String obsequio2 = txtObsequio2.getText();
		Tienda.obsequio2 = obsequio2;
		dispose();
		String obsequio3 = txtObsequio3.getText();
		Tienda.obsequio3 = obsequio3;
		dispose();
	}

}
