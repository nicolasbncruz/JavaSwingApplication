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
import java.awt.Color;

public class ConfigurarDescuento extends JDialog implements ActionListener {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuento dialog = new ConfigurarDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarDescuento() {
		setTitle("Configurar porcentajes de descuento");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setBounds(100, 100, 450, 174);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		lblPorcentaje1 = new JLabel("1 a 5 unidades");
		lblPorcentaje1.setBounds(21, 22, 130, 14);
		contentPanel.add(lblPorcentaje1);
		lblPorcentaje2 = new JLabel("6 a 10 unidades");
		lblPorcentaje2.setBounds(21, 47, 130, 14);
		contentPanel.add(lblPorcentaje2);
		lblPorcentaje3 = new JLabel("11 a 15 unidades");
		lblPorcentaje3.setBounds(21, 72, 130, 14);
		contentPanel.add(lblPorcentaje3);
		lblPorcentaje4 = new JLabel("M\u00E1s de 15 unidades");
		lblPorcentaje4.setBounds(21, 97, 130, 14);
		contentPanel.add(lblPorcentaje4);
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setBounds(155, 19, 123, 20);
		contentPanel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setBounds(155, 44, 123, 20);
		contentPanel.add(txtPorcentaje2);
		txtPorcentaje2.setColumns(10);
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setBounds(155, 69, 123, 20);
		contentPanel.add(txtPorcentaje3);
		txtPorcentaje3.setColumns(10);
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setBounds(153, 94, 125, 20);
		contentPanel.add(txtPorcentaje4);
		txtPorcentaje4.setColumns(10);
		label = new JLabel("%");
		label.setBounds(288, 22, 25, 14);
		contentPanel.add(label);
		label_1 = new JLabel("%");
		label_1.setBounds(288, 47, 25, 14);
		contentPanel.add(label_1);
		label_2 = new JLabel("%");
		label_2.setBounds(288, 72, 25, 14);
		contentPanel.add(label_2);
		label_3 = new JLabel("%");
		label_3.setBounds(288, 97, 25, 14);
		contentPanel.add(label_3);
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(Color.LIGHT_GRAY);
		btnAceptar.setBounds(323, 18, 99, 23);
		btnAceptar.addActionListener(this);
		contentPanel.add(btnAceptar);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.LIGHT_GRAY);
		btnCancelar.setBounds(323, 43, 99, 23);
		btnCancelar.addActionListener(this);
		contentPanel.add(btnCancelar);
		// Mostrar los porcentajes de la primera mochila.
		txtPorcentaje1.setText("" + Tienda.porcentaje1);
		txtPorcentaje2.setText("" + Tienda.porcentaje2);
		txtPorcentaje3.setText("" + Tienda.porcentaje3);
		txtPorcentaje4.setText("" + Tienda.porcentaje4);

	}

	// Accionamos eventos tipo Action Event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	// Configuramos la acción del botón Aceptar, este guardará los cambios.
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		// Obtenemos y capturamos los porcentajes de descuentos que está en Tienda y
		// mostrarlos.
		// double porcentaje1, porcentaje2, porcentaje3, porcentaje4;
		Tienda.porcentaje1 = Double.parseDouble(txtPorcentaje1.getText());
		Tienda.porcentaje2 = Double.parseDouble(txtPorcentaje2.getText());
		Tienda.porcentaje3 = Double.parseDouble(txtPorcentaje3.getText());
		Tienda.porcentaje4 = Double.parseDouble(txtPorcentaje4.getText());
		// dispose();
	}

	// Configuramos la acción del boton Cancelar
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

}
