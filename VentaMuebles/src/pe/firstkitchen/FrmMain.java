package pe.firstkitchen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracin;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmConfigurarDescuento;
	private JMenuItem mntmModificarCocina;
	private JMenuItem mntmListarCocinas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmCantidadOptima;
	private JMenuItem mntmCuotaDiaria;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);

		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);

		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);

		mntmConsultarCocina = new JMenuItem("Consultar cocina");
		mntmConsultarCocina.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCocina);

		mntmModificarCocina = new JMenuItem("Modificar cocina");
		mntmModificarCocina.addActionListener(this);
		mnMantenimiento.add(mntmModificarCocina);

		mntmListarCocinas = new JMenuItem("Listar cocinas");
		mntmListarCocinas.addActionListener(this);
		mnMantenimiento.add(mntmListarCocinas);

		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);

		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);

		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);

		mntmConfigurarDescuento = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuento.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuento);

		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequios);

		mntmCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmCantidadOptima.addActionListener(this);
		mnConfiguracin.add(mntmCantidadOptima);

		mntmCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmCuotaDiaria.addActionListener(this);
		mnConfiguracin.add(mntmCuotaDiaria);

		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		mntmAyuda = new JMenuItem("Acerca de Tienda");
		mntmAyuda.addActionListener(this);
		mnAyuda.add(mntmAyuda);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmCuotaDiaria) {
			actionPerformedMntmCuotaDiaria(e);
		}
		if (e.getSource() == mntmCantidadOptima) {
			actionPerformedMntmCantidadOptima(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarCocinas) {
			actionPerformedMntmListarCocinas(e);
		}
		if (e.getSource() == mntmModificarCocina) {
			actionPerformedMntmModificarCocina(e);
		}
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmConsultarCocina(e);
		}
		if (e.getSource() == mntmConfigurarDescuento) {
			actionPerformedMntmConfigurarDescuento(e);
		}
		if (e.getSource() == mntmAyuda) {
			actionPerformedMntmAyuda(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}

	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}

	protected void actionPerformedMntmAyuda(ActionEvent e) {
		TiendaAutores frmTiendaAutores = new TiendaAutores();
		frmTiendaAutores.setVisible(true);
		frmTiendaAutores.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmConfigurarDescuento(ActionEvent e) {
		Descuento frmDescuento = new Descuento();
		frmDescuento.setVisible(true);
		frmDescuento.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		Consultar frmConsultar = new Consultar();
		frmConsultar.setVisible(true);
		frmConsultar.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmModificarCocina(ActionEvent e) {
		Modificar frmModificar = new Modificar();
		frmModificar.setVisible(true);
		frmModificar.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmListarCocinas(ActionEvent e) {
		Listado frmListado = new Listado();
		frmListado.setVisible(true);
		frmListado.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		Vender frmVender = new Vender();
		frmVender.setVisible(true);
		frmVender.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		Reportes frmReportes = new Reportes();
		frmReportes.setVisible(true);
		frmReportes.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		Obsequios frmObsequios = new Obsequios();
		frmObsequios.setVisible(true);
		frmObsequios.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmCantidadOptima(ActionEvent e) {
		CantidadOptima frmCantidadOptima = new CantidadOptima();
		frmCantidadOptima.setVisible(true);
		frmCantidadOptima.setLocationRelativeTo(this);
	}

	protected void actionPerformedMntmCuotaDiaria(ActionEvent e) {
		CuotaDiaria frmCuotaDiaria = new CuotaDiaria();
		frmCuotaDiaria.setVisible(true);
		frmCuotaDiaria.setLocationRelativeTo(this);
	}
}
