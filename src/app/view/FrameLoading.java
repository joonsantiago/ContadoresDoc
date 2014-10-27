package app.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import app.model.ContadoresDoc;

public class FrameLoading extends JFrame {
	
	ContadoresDoc contadores = new ContadoresDoc();
	public JLabel img = new JLabel("", SwingConstants.RIGHT);
	public JLabel texto = new JLabel("Aguarde Carregando...", SwingConstants.CENTER);
	Color bgColor;
	public ActionListener al;	
	public Timer t;
	int barra=0;
	
	public FrameLoading(){
		setSize(450,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		final ImageIcon tcr2 = new ImageIcon("src/imgs/loading/loader.gif");
		
		img.setIcon(tcr2);
		texto.setBounds(0,0,470,350);
		img.setBounds(-130, -100, 600, 500);
		getContentPane().add(texto);
		getContentPane().add(img);
		setUndecorated(true);
		al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if (barra < 100) {
					barra++;
				} else {
					t.stop();
					dispose();
				}
			}

		};
		t = new Timer(40, al);
		t.start();

		setVisible(true);

	}
	
	public static void main(String[] args) {new FrameLoading().setVisible(true);}
}
