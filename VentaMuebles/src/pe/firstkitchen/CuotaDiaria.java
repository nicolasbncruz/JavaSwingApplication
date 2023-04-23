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

public class CuotaDiaria extends JDialog implements ActionListener{

	private final JPanel contentPane = new JPanel();	
	private JLabel lblCuota;
	private JTextField txtCuota;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CuotaDiaria dialog = new CuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CuotaDiaria() {
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 485, 121);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		lblCuota = new JLabel("Cuota diaria esperada (S/)");
		lblCuota.setBounds(10, 21, 160, 14);
		contentPane.add(lblCuota);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(176, 18, 126, 20);
		contentPane.add(txtCuota);
		txtCuota.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(363, 17, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(363, 43, 89, 23);
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
