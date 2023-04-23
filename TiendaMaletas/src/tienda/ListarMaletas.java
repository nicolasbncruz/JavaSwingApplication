package tienda;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class ListarMaletas extends JDialog implements ActionListener {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scpScroll;
	private JTextArea txtAreaResultado;
	private JButton btnListar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarMaletas dialog = new ListarMaletas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public ListarMaletas() {
		setTitle("Listado de Maletas");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setBounds(100, 100, 450, 381);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 11, 414, 282);
		contentPanel.add(scpScroll);
		txtAreaResultado = new JTextArea();
		txtAreaResultado.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
		scpScroll.setViewportView(txtAreaResultado);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(89, 304, 89, 23);
		contentPanel.add(btnCerrar);
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(235, 304, 89, 23);
		contentPanel.add(btnListar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}

	// Accionamos el proceso del botón Cerrar
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	// Accionamos el proceso del botón Listar
	protected void actionPerformedBtnListar(ActionEvent e) {
		// Mostramos en pantalla los detalles de cada modelo de maleta
		txtAreaResultado.setText("");
		txtAreaResultado.setText("\nLISTADO DE MALETAS" + "\n");
		txtAreaResultado.append("\n");
		txtAreaResultado.append("Modelo " + "\t" + "\t: " + Tienda.modelo0 + "\n");
		txtAreaResultado.append("Precio " + "\t" + "\t: " + Tienda.precio0 + "\n");
		txtAreaResultado.append("Ancho " + "\t" + "\t: " + Tienda.ancho0 + "\n");
		txtAreaResultado.append("Alto " + "\t" + "\t: " + Tienda.alto0 + "\n");
		txtAreaResultado.append("Peso " + "\t" + "\t: " + Tienda.peso0 + "\n");
		txtAreaResultado.append("\n");
		txtAreaResultado.append("Modelo " + "\t" + "\t: " + Tienda.modelo1 + "\n");
		txtAreaResultado.append("Precio " + "\t" + "\t: " + Tienda.precio1 + "\n");
		txtAreaResultado.append("Ancho " + "\t" + "\t: " + Tienda.ancho1 + "\n");
		txtAreaResultado.append("Alto " + "\t" + "\t: " + Tienda.alto1 + "\n");
		txtAreaResultado.append("Peso " + "\t" + "\t: " + Tienda.peso1 + "\n");
		txtAreaResultado.append("\n");
		txtAreaResultado.append("Modelo " + "\t" + "\t: " + Tienda.modelo2 + "\n");
		txtAreaResultado.append("Precio " + "\t" + "\t: " + Tienda.precio2 + "\n");
		txtAreaResultado.append("Ancho " + "\t" + "\t: " + Tienda.ancho2 + "\n");
		txtAreaResultado.append("Alto " + "\t" + "\t: " + Tienda.alto2 + "\n");
		txtAreaResultado.append("Peso " + "\t" + "\t: " + Tienda.peso2 + "\n");
		txtAreaResultado.append("\n");
		txtAreaResultado.append("Modelo " + "\t" + "\t: " + Tienda.modelo3 + "\n");
		txtAreaResultado.append("Precio " + "\t" + "\t: " + Tienda.precio3 + "\n");
		txtAreaResultado.append("Ancho " + "\t" + "\t: " + Tienda.ancho3 + "\n");
		txtAreaResultado.append("Alto " + "\t" + "\t: " + Tienda.alto3 + "\n");
		txtAreaResultado.append("Peso " + "\t" + "\t: " + Tienda.peso3 + "\n");
		txtAreaResultado.append("\n");
		txtAreaResultado.append("Modelo " + "\t" + "\t: " + Tienda.modelo4 + "\n");
		txtAreaResultado.append("Precio " + "\t" + "\t: " + Tienda.precio4 + "\n");
		txtAreaResultado.append("Ancho " + "\t" + "\t: " + Tienda.ancho4 + "\n");
		txtAreaResultado.append("Alto " + "\t" + "\t: " + Tienda.alto4 + "\n");
		txtAreaResultado.append("Peso " + "\t" + "\t: " + Tienda.peso4 + "\n");
		txtAreaResultado.append("\n");
	}

}
