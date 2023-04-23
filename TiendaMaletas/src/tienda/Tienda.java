package tienda;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {

	// Datos declaración mínima de variables globales que almacenarán los datos de
	// cada maleta:
	// Datos mínimos de nuestra primera maleta
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	public static String modelo0 = "Aviator";
	public static double precio0 = 134.90;
	public static int ancho0 = 50;
	public static int alto0 = 70;
	public static int fondo0 = 25;
	public static double peso0 = 2.4;
	// Datos mínimos de nuestra segunda maleta
	public static String modelo1 = "Lucca";
	public static double precio1 = 169.90;
	public static int ancho1 = 60;
	public static int alto1 = 90;
	public static int fondo1 = 35;
	public static double peso1 = 4.8;
	// Datos mínimos de nuestra tercera maleta
	public static String modelo2 = "Samsonite";
	public static double precio2 = 136.90;
	public static int ancho2 = 55;
	public static int alto2 = 75;
	public static int fondo2 = 30;
	public static double peso2 = 3.2;
	// Datos mínimos de nuestra cuarta maleta
	public static String modelo3 = "Century";
	public static double precio3 = 119.90;
	public static int ancho3 = 45;
	public static int alto3 = 60;
	public static int fondo3 = 27;
	public static double peso3 = 2.3;
	// Datos mínimos de nuestra quinta maleta
	public static String modelo4 = "Saxoline";
	public static double precio4 = 159.90;
	public static int ancho4 = 70;
	public static int alto4 = 80;
	public static int fondo4 = 37;
	public static double peso4 = 5.2;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Lapicero";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "USB";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	// Acumuladores de incrementos para Generar Reportes
	public static int varventamaleta0 = 0;
	public static int varunidadmaleta0 = 0;
	public static int varventamaleta1 = 0;
	public static int varunidadmaleta1 = 0;
	public static int varventamleta2 = 0;
	public static int varunidadmaleta2 = 0;
	public static int varventamleta3 = 0;
	public static int varunidadmaleta3 = 0;
	public static int varventamleta4 = 0;
	public static int varunidadmaleta4 = 0;

	/*-----------------------------------------------------------------------*/
	// Acumulando maleta 0
	public void agregarventa0() {
		varventamaleta0++;
	}

	public void agregarunidad0(int unidades) {
		varunidadmaleta0 += unidades; // var = var + uni
	}

	// mostrando maleta0
	public int totalventamaleta0() {
		return varventamaleta0;
	}

	public int totalunidad0() {
		return varunidadmaleta0;
	}

	/*-----------------------------------------------------------------------*/
	// Acumulando maleta 1
	public void agregarventa1() {
		varventamaleta1++;
	}

	public void agregarunidad1(int unidades) {
		varunidadmaleta1 += unidades;
	}

	// mostrando maleta1
	public int totalventamaleta1() {
		return varventamaleta1;
	}

	public int totalunidad1() {
		return varunidadmaleta1;
	}

	/*-----------------------------------------------------------------------*/
	// acumulando maleta 2
	public void agregarventa2() {
		varventamleta2++;
	}

	public void agregarunidad2(int unidades) {
		varunidadmaleta2 += unidades;
	}

	// mostrando maleta2
	public int totalventamaleta2() {
		return varventamleta2;
	}

	public int totalunidad2() {
		return varunidadmaleta2;
	}

	/*-----------------------------------------------------------------------*/
	// acumulando maleta 3
	public void agregarventa3() {
		varventamleta3++;
	}

	public void agregarunidad3(int unidades) {
		varunidadmaleta3 += unidades;
	}

	// mostrando maleta3
	public int totalventamaleta3() {
		return varventamleta3;
	}

	public int totalunidad3() {
		return varunidadmaleta3;
	}

	/*-----------------------------------------------------------------------*/
	// acumulando maleta 4
	public void agregarventa4() {
		varventamleta4++;
	}

	public void agregarunidad4(int unidades) {
		varunidadmaleta4 += unidades;
	}

	// mostrando maleta4
	public int totalventamaleta4() {
		return varventamleta4;
	}

	public int totalunidad4() {
		return varunidadmaleta4;
	}

	private JPanel contentPane;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarMaleta;
	private JMenu mnMantenimiento;
	private JMenuItem mntmListarMaletas;
	private JMenuItem mntmModificarMaleta;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfiguracion;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null, "BIENVENIDOS AL MUNDO VIRTUAL DE LAS
		// MALETAS");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setTitle("Tienda 1.0");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 300);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// Icono archivo
		mnArchivo = new JMenu("Archivo");		
		ImageIcon iconoarchivo = new ImageIcon(getClass().getResource("/icons/archivo.png"));
		ImageIcon imagenarchivo = new ImageIcon(iconoarchivo.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnArchivo.setIcon(imagenarchivo);
		menuBar.add(mnArchivo);
		
		// Icono cerrar
		mntmSalir = new JMenuItem("Salir");		
		ImageIcon iconocerrar = new ImageIcon(getClass().getResource("/icons/exit.png"));
		ImageIcon imagencerrar = new ImageIcon(iconocerrar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmSalir.setIcon(imagencerrar);
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		// Icono mantenimiento
		mnMantenimiento = new JMenu("Mantenimiento");		
		ImageIcon iconomantenimiento = new ImageIcon(getClass().getResource("/icons/mantenimiento.png"));
		ImageIcon imagenmantenimiento = new ImageIcon(iconomantenimiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnMantenimiento.setIcon(imagenmantenimiento);
		menuBar.add(mnMantenimiento);
		
		// Icono consultar
		mntmConsultarMaleta = new JMenuItem("Consultar Maleta");		
		ImageIcon iconoconsultar = new ImageIcon(getClass().getResource("/icons/consultar.png"));
		ImageIcon imagenconsultar = new ImageIcon(iconoconsultar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConsultarMaleta.setIcon(imagenconsultar);
		mntmConsultarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmConsultarMaleta);
		
		// Icono modificar
		mntmModificarMaleta = new JMenuItem("Modificar Maleta");		
		ImageIcon iconomodificar = new ImageIcon(getClass().getResource("/icons/modificar.png"));
		ImageIcon imagenmodificar = new ImageIcon(iconomodificar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmModificarMaleta.setIcon(imagenmodificar);
		mntmModificarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmModificarMaleta);
		
		// Icono listar
		mntmListarMaletas = new JMenuItem("Listar Maletas");		
		ImageIcon iconolistar = new ImageIcon(getClass().getResource("/icons/listar.png"));
		ImageIcon imagenlistar = new ImageIcon(iconolistar.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmListarMaletas.setIcon(imagenlistar);
		mntmListarMaletas.addActionListener(this);
		mnMantenimiento.add(mntmListarMaletas);
		
		// Icono venta
		mnVentas = new JMenu("Ventas");		
		ImageIcon iconoventa = new ImageIcon(getClass().getResource("/icons/ventas.png"));
		ImageIcon imagenventa = new ImageIcon(iconoventa.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnVentas.setIcon(imagenventa);
		menuBar.add(mnVentas);
		
		// Icono vender
		mntmVender = new JMenuItem("Vender");		
		ImageIcon iconovender = new ImageIcon(getClass().getResource("/icons/vender.png"));
		ImageIcon imagenvender = new ImageIcon(iconovender.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmVender.setIcon(imagenvender);
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		// Icono reporte
		mntmGenerarReportes = new JMenuItem("Generar Reportes");		
		ImageIcon iconoreporte = new ImageIcon(getClass().getResource("/icons/reporte.png"));
		ImageIcon imagenreporte = new ImageIcon(iconoreporte.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmGenerarReportes.setIcon(imagenreporte);
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		// Icono configuración
		mnConfiguracion = new JMenu("Configuraci\u00F3n");		
		ImageIcon iconoconfiguracion = new ImageIcon(getClass().getResource("/icons/configuracion.png"));
		ImageIcon imagenconfiguracion = new ImageIcon(iconoconfiguracion.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnConfiguracion.setIcon(imagenconfiguracion);		
		menuBar.add(mnConfiguracion);
		
		// Icono Descuento
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");		
		ImageIcon iconofiguraciondefecto = new ImageIcon(getClass().getResource("/icons/descuento.png"));
		ImageIcon imagenconfiguraciondefecto = new ImageIcon(iconofiguraciondefecto.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarDescuentos.setIcon(imagenconfiguraciondefecto);
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);

		// Icono Obsequio
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		ImageIcon iconoobsequio = new ImageIcon(getClass().getResource("/icons/obsequio.png"));
		ImageIcon imagenobsequio = new ImageIcon(iconoobsequio.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarObsequios.setIcon(imagenobsequio);	
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		// Icono cantidad optima
		mntmConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad Optima");
		ImageIcon iconocantidad = new ImageIcon(getClass().getResource("/icons/cantidad.png"));
		ImageIcon imagencantidad= new ImageIcon(iconocantidad.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarCantidadOptima.setIcon(imagencantidad);
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		// Icono cuota diaria
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		ImageIcon iconocuota = new ImageIcon(getClass().getResource("/icons/cuota.png"));
		ImageIcon imagencuota = new ImageIcon(iconocuota.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmConfigurarCuotaDiaria.setIcon(imagencuota);
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		// Icono ayuda
		ImageIcon icoayuda = new ImageIcon(getClass().getResource("/icons/ayuda.png"));
		ImageIcon imgayuda = new ImageIcon(icoayuda.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		mnAyuda.setIcon(imgayuda);
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		ImageIcon iconoacerca = new ImageIcon(getClass().getResource("/icons/acercade.png"));
		ImageIcon imagenacerca = new ImageIcon(iconoacerca.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		mntmAcercaDeTienda.setIcon(imagenacerca);
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}

	// Conexiones de las ventana JDialog
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConsultarMaleta) {
			actionPerformedMntmConsultarMaleta(e);
		}
		if (e.getSource() == mntmModificarMaleta) {
			actionPerformedMntmModificarMaleta(e);
		}
		if (e.getSource() == mntmListarMaletas) {
			actionPerformedMntmListarMaletas(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(e);
		}
		if (e.getSource() == mntmConfigurarCuotaDiaria) {
			actionPerformedMntmConfigurarCuotaDiaria(e);
		}
		if (e.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}

	// Métodos Action Event de cada JDialog
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0); // Salir de la pantalla.
	}

	protected void actionPerformedMntmConsultarMaleta(ActionEvent e) {
		// codigo de cada accion de procesar y borrar
		// Creamos el JDialog ConsultarMaleta usando la palabra reservada
		ConsultarMaleta ac = new ConsultarMaleta();
		ac.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		ac.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmModificarMaleta(ActionEvent e) {
		ModificarMaleta bc = new ModificarMaleta();
		bc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		bc.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmListarMaletas(ActionEvent e) {
		ListarMaletas cc = new ListarMaletas();
		cc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		cc.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		Vender dc = new Vender();
		dc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		dc.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		GenerarReportes ec = new GenerarReportes();
		ec.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		ec.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		ConfigurarDescuento fc = new ConfigurarDescuento();
		fc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		fc.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		ConfigurarObsequios gc = new ConfigurarObsequios();
		gc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		gc.setLocationRelativeTo(this); // Para centrar nuestro JDialog
	}

	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent e) {
		ConfigurarCantidadOptima hc = new ConfigurarCantidadOptima();
		hc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		hc.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmConfigurarCuotaDiaria(ActionEvent e) {
		ConfigurarCuotaDiaria jc = new ConfigurarCuotaDiaria();
		jc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		jc.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmAcercaDeTienda(ActionEvent e) {
		AcercaDeTienda kc = new AcercaDeTienda();
		kc.setVisible(true); // Hacemos aparecer nuestra ventana JDialog
		kc.setLocationRelativeTo(this);
	}

}
