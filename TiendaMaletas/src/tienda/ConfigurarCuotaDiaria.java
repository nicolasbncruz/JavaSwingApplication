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

public class ConfigurarCuotaDiaria extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtCuotaDiaria;
	private JLabel lblCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarCuotaDiaria dialog = new ConfigurarCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarCuotaDiaria() {
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 559, 135);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCuotaDiaria = new JLabel("Cuota diaria esperada (S/.)");
			lblCuotaDiaria.setBounds(10, 11, 216, 14);
			contentPanel.add(lblCuotaDiaria);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(410, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(410, 40, 93, 23);
			contentPanel.add(btnCancelar);
		}
		{
			txtCuotaDiaria = new JTextField();
			txtCuotaDiaria.setBounds(241, 8, 109, 20);
			contentPanel.add(txtCuotaDiaria);
			txtCuotaDiaria.setColumns(10);
		}
		// Mostramos el dato de la cuota diaria en asignado en Tienda.
		txtCuotaDiaria.setText("" + Tienda.cuotaDiaria);
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

	// Configuramos el Botón Cancelar
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

	// Configuramos el Botón Aceptar
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		// Capturamos y obtemos el dato doble.
		Tienda.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());
	}

}
