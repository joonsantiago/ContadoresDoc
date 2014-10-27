package app.view;

import javax.swing.*;
import app.controlers.*;

@SuppressWarnings("serial")
public class FrameContadores extends JFrame {

	JLabel lb_imp1, lb_imp2, lb_imp3, lb_imp4, lb_geral;
	JButton btn_imp1, btn_imp2, btn_imp3, btn_imp4, btn_geral;
	ImpDetalheBtn1 actionDetalheBtn1 = new ImpDetalheBtn1();
	ImpDetalheBtn2 actionDetalheBtn2 = new ImpDetalheBtn2();
	ImpDetalheBtn3 actionDetalheBtn3 = new ImpDetalheBtn3();
	ImpDetalheBtn4 actionDetalheBtn4 = new ImpDetalheBtn4();
	ImpDetalheAll actionDetalheAll = new ImpDetalheAll();

	public FrameContadores() {

		setTitle("Contadores Impressora");
		setSize(550, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		lb_imp1 = new JLabel("Impressora   //192.168.32.28   ~   DCP 8085DN");
		lb_imp2 = new JLabel("Impressora   //192.168.32.24   ~   HL- 5350DN");
		lb_imp3 = new JLabel("Impressora   //192.168.32.26   ~   FS- 4020DN");
		lb_imp4 = new JLabel("Impressora   //192.168.32.200  ~   MFC 8480DN");
		lb_geral = new JLabel("Visualize e envio todos os contadores aqui");

		btn_imp1 = new JButton("Visualizar");
		btn_imp2 = new JButton("Visualizar");
		btn_imp3 = new JButton("Visualizar");
		btn_imp4 = new JButton("Visualizar");
		btn_geral = new JButton("Visualizar Envio");

		getContentPane().setLayout(null);

		getContentPane().add(lb_imp1);
		getContentPane().add(lb_imp2);
		getContentPane().add(lb_imp3);
		getContentPane().add(lb_imp4);
		getContentPane().add(btn_imp1);
		getContentPane().add(btn_imp2);
		getContentPane().add(btn_imp3);
		getContentPane().add(btn_imp4);
		getContentPane().add(btn_geral);
		getContentPane().add(lb_geral);
		getContentPane().add(btn_geral);

		lb_imp1.setBounds(65, 110, 300, 15);
		lb_imp2.setBounds(65, 140, 300, 15);
		lb_imp3.setBounds(65, 170, 300, 15);
		lb_imp4.setBounds(65, 200, 300, 15);
		lb_geral.setBounds(135, 230, 300, 15);

		btn_imp1.setBounds(350, 110, 100, 15);
		btn_imp2.setBounds(350, 140, 100, 15);
		btn_imp3.setBounds(350, 170, 100, 15);
		btn_imp4.setBounds(350, 200, 100, 15);
		btn_geral.setBounds(180, 260, 150, 30);

		btn_imp1.addActionListener(actionDetalheBtn1);
		btn_imp2.addActionListener(actionDetalheBtn2);
		btn_imp3.addActionListener(actionDetalheBtn3);
		btn_imp4.addActionListener(actionDetalheBtn4);
		btn_geral.addActionListener(actionDetalheAll);

	}

	// public static void main(String[] args) {FrameContadores saida = new
	// FrameContadores();saida.setVisible(true);
}
