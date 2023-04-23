package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCantidadOptima extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblCantidadOptima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarCantidadOptima dialog = new ConfigurarCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarCantidadOptima() {
		setTitle("Configurar Cantidad \u00F3ptima");
		setBounds(100, 100, 560, 133);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCantidadOptima = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
			lblCantidadOptima.setBounds(23, 15, 285, 14);
			contentPanel.add(lblCantidadOptima);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.setBounds(307, 12, 50, 20);
			contentPanel.add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(394, 11, 100, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(394, 38, 100, 23);
			contentPanel.add(btnCancelar);
		}
		// Mostrar los datos de la cantidad óptima asignado en Tienda.
		txtCantidadOptima.setText("" + Tienda.cantidadOptima);
	}

	// Direcionamos los eventos tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	// Configuramos el Botón Aceptar
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		Tienda.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
	}

	// Configuramos el Botón Cancelar
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

}
