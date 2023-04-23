package tienda;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaDeTienda extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblTie;
	private JLabel lblAutores;
	private JLabel lblCossetteMuro;
	private JLabel lblYederLaura;
	private JLabel lblYacoMedina;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDeTienda dialog = new AcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public AcercaDeTienda() {
		setTitle("Acerca de Tienda");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setBounds(100, 100, 450, 293);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblTie = new JLabel("Tienda 1.0");
			lblTie.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTie.setBounds(156, 11, 120, 33);
			contentPanel.add(lblTie);
		}
		separator = new JSeparator();
		separator.setBounds(10, 66, 414, 136);
		contentPanel.add(separator);
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAutores.setBounds(183, 75, 70, 14);
		contentPanel.add(lblAutores);
		JLabel lblEnzoBazalar = new JLabel("Enzo Bazalar");
		lblEnzoBazalar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnzoBazalar.setBounds(183, 106, 93, 14);
		contentPanel.add(lblEnzoBazalar);
		lblCossetteMuro = new JLabel("Cossette Muro");
		lblCossetteMuro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCossetteMuro.setBounds(183, 180, 93, 14);
		contentPanel.add(lblCossetteMuro);
		lblYederLaura = new JLabel("Yeder Laura");
		lblYederLaura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYederLaura.setBounds(183, 130, 93, 14);
		contentPanel.add(lblYederLaura);
		lblYacoMedina = new JLabel("Yaco Medina");
		lblYacoMedina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYacoMedina.setBounds(183, 155, 93, 14);
		contentPanel.add(lblYacoMedina);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(183, 213, 89, 23);
		contentPanel.add(btnCerrar);
	}

}
