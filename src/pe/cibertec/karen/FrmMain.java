package pe.cibertec.karen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FrmMain extends JFrame {
	
	// Datos m�nimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;	
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static double fondo0 = 58.6;
	public static int quemadores0 = 4;
	// Datos m�nimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos m�nimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos m�nimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos m�nimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad �ptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMain() {
		setTitle("Tienda 1.0");
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 607);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(213, 213, 255));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setHorizontalAlignment(SwingConstants.CENTER);
		mnArchivo.setPreferredSize(new Dimension(115, 50));
		ImageIcon iconoarchivo = new ImageIcon(getClass().getResource("/icons/archivo.png"));
		ImageIcon imagenarchivo = new ImageIcon(iconoarchivo.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnArchivo.setIcon(imagenarchivo);
		menuBar.add(mnArchivo);
		
		mntmLogout = new JMenuItem("Logout");
		ImageIcon iconocerrar = new ImageIcon(getClass().getResource("/icons/exit.png"));
		ImageIcon imagencerrar = new ImageIcon(iconocerrar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmLogout.setIcon(imagencerrar);
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmLogout(e);
			}
		});
		mnArchivo.add(mntmLogout);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setHorizontalAlignment(SwingConstants.CENTER);
		mnMantenimiento.setPreferredSize(new Dimension(160, 50));
		ImageIcon iconomantenimiento = new ImageIcon(getClass().getResource("/icons/mantenimiento.png"));
		ImageIcon imagenmantenimiento = new ImageIcon(iconomantenimiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnMantenimiento.setIcon(imagenmantenimiento);
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmConsultarCocina = new JMenuItem("Consultar cocina");
		ImageIcon iconoconsultar = new ImageIcon(getClass().getResource("/icons/consultar.png"));
		ImageIcon imagenconsultar = new ImageIcon(iconoconsultar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConsultarCocina.setIcon(imagenconsultar);
		mntmConsultarCocina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmConsultarCocina(e);
			}
		});
		mnMantenimiento.add(mntmConsultarCocina);
		
		JMenuItem mntmModificarCocina = new JMenuItem("Modificar cocina");
		ImageIcon iconomodificar = new ImageIcon(getClass().getResource("/icons/modificar.png"));
		ImageIcon imagenmodificar = new ImageIcon(iconomodificar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmModificarCocina.setIcon(imagenmodificar);
		mnMantenimiento.add(mntmModificarCocina);
		
		JMenuItem mntmListarCocinas = new JMenuItem("Listar cocinas");
		ImageIcon iconolistar = new ImageIcon(getClass().getResource("/icons/listar.png"));
		ImageIcon imagenlistar = new ImageIcon(iconolistar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmListarCocinas.setIcon(imagenlistar);
		mnMantenimiento.add(mntmListarCocinas);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setHorizontalAlignment(SwingConstants.CENTER);
		mnVentas.setPreferredSize(new Dimension(140, 50));
		ImageIcon iconoventa = new ImageIcon(getClass().getResource("/icons/ventas.png"));
		ImageIcon imagenventa = new ImageIcon(iconoventa.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnVentas.setIcon(imagenventa);
		menuBar.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		ImageIcon iconovender = new ImageIcon(getClass().getResource("/icons/vender.png"));
		ImageIcon imagenvender = new ImageIcon(iconovender.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmVender.setIcon(imagenvender);
		mnVentas.add(mntmVender);
		
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar reportes");
		ImageIcon iconoreporte = new ImageIcon(getClass().getResource("/icons/reporte.png"));
		ImageIcon imagenreporte = new ImageIcon(iconoreporte.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmGenerarReportes.setIcon(imagenreporte);
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setHorizontalAlignment(SwingConstants.CENTER);
		mnConfiguracion.setPreferredSize(new Dimension(150, 50));
		ImageIcon iconoconfiguracion = new ImageIcon(getClass().getResource("/icons/configuracion.png"));
		ImageIcon imagenconfiguracion = new ImageIcon(iconoconfiguracion.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnConfiguracion.setIcon(imagenconfiguracion);
		menuBar.add(mnConfiguracion);
		
		JMenuItem mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.setBackground(Color.WHITE);
		ImageIcon iconofiguraciondefecto = new ImageIcon(getClass().getResource("/icons/descuento.png"));
		ImageIcon imagenconfiguraciondefecto = new ImageIcon(iconofiguraciondefecto.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarDescuentos.setIcon(imagenconfiguraciondefecto);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		JMenuItem mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.setBackground(Color.WHITE);
		ImageIcon iconoobsequio = new ImageIcon(getClass().getResource("/icons/obsequio.png"));
		ImageIcon imagenobsequio = new ImageIcon(iconoobsequio.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarObsequios.setIcon(imagenobsequio);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		JMenuItem mntmConfigurarCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmConfigurarCantidadOptima.setBackground(Color.WHITE);
		ImageIcon iconocantidad = new ImageIcon(getClass().getResource("/icons/cantidad.png"));
		ImageIcon imagencantidad= new ImageIcon(iconocantidad.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarCantidadOptima.setIcon(imagencantidad);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		JMenuItem mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuotaDiaria.setBackground(Color.WHITE);
		ImageIcon iconocuota = new ImageIcon(getClass().getResource("/icons/cuota.png"));
		ImageIcon imagencuota = new ImageIcon(iconocuota.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarCuotaDiaria.setIcon(imagencuota);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		mnAyuda.setPreferredSize(new Dimension(150, 50));
		ImageIcon icoayuda = new ImageIcon(getClass().getResource("/icons/ayuda.png"));
		ImageIcon imgayuda = new ImageIcon(icoayuda.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnAyuda.setIcon(imgayuda);
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaTienda = new JMenuItem("AcercaTienda");
		mntmAcercaTienda.setBackground(Color.WHITE);
		ImageIcon iconoacerca = new ImageIcon(getClass().getResource("/icons/acercade.png"));
		ImageIcon imagenacerca = new ImageIcon(iconoacerca.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmAcercaTienda.setIcon(imagenacerca);
		mnAyuda.add(mntmAcercaTienda);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrmMain.class.getResource("/icons/backgroud.jpeg")));
		lblNewLabel.setBounds(10, 80, 877, 425);
		contentPane.add(lblNewLabel);
		
		JLabel lblTitle = new JLabel("FIRST KITCHEN");
		lblTitle.setBackground(new Color(183, 183, 255));
		lblTitle.setForeground(new Color(121, 121, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 50));
		lblTitle.setBounds(10, 11, 545, 58);
		contentPane.add(lblTitle);
		
		JLabel lblStore = new JLabel("STORE");
		lblStore.setHorizontalAlignment(SwingConstants.LEFT);
		lblStore.setForeground(new Color(53, 215, 170));
		lblStore.setFont(new Font("Arial", Font.BOLD, 50));
		lblStore.setBackground(new Color(183, 183, 255));
		lblStore.setBounds(565, 11, 322, 58);
		contentPane.add(lblStore);
	}
	
	FrmConsultarCocina frmConsultarCocina;
	private JMenuItem mntmLogout;
	
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {		
		if(frmConsultarCocina==null) {
			frmConsultarCocina = new FrmConsultarCocina();
			frmConsultarCocina.setVisible(true);			
		}else if(this.getAccessibleContext()!=null) {
			frmConsultarCocina = new FrmConsultarCocina();
			frmConsultarCocina.setVisible(true);
		}
		
	}
	FrmLogin frmLogin;
	protected void actionPerformedMntmLogout(ActionEvent e) {		
		this.dispose();
		if(frmLogin == null) {
			frmLogin = new FrmLogin();
			frmLogin.setVisible(true);
		}else if(e.getActionCommand()!=null) {
			frmLogin = new FrmLogin();
			frmLogin.setVisible(true);
		}
	}
}
