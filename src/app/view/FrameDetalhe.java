package app.view;

import javax.swing.*;
@SuppressWarnings("serial") 
public class FrameDetalhe extends JFrame {

	public JLabel valor1 =new JLabel("",SwingConstants.RIGHT); 
	public JLabel valor2 =new JLabel("",SwingConstants.RIGHT); 
	public JLabel valor3 =new JLabel("",SwingConstants.RIGHT); 
	public JLabel valor4 =new JLabel("",SwingConstants.RIGHT); 
	public JLabel valor5 =new JLabel("",SwingConstants.RIGHT); 
	public JLabel valor6 =new JLabel("",SwingConstants.RIGHT); 
	public JLabel valor7 =new JLabel("",SwingConstants.RIGHT); 
	JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	

	public FrameDetalhe() {
		setTitle("Detalhes");
		setSize(350, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
                setLocationRelativeTo(null);

		label1 = new JLabel("Model Nome");
		label2 = new JLabel("Serial Nº");
		label3 = new JLabel("Firmware Version");
		label4 = new JLabel("Sub Firmware Version");
		label5 = new JLabel("Memory Size");
		label8 = new JLabel("-------------------------Device Status-------------------------");
		label6 = new JLabel("Page Counter");
		label7 = new JLabel("Drum Count");

		getContentPane().setLayout(null);

		getContentPane().add(label1);
		getContentPane().add(label2);
		getContentPane().add(label3);
		getContentPane().add(label4);
		getContentPane().add(label5);
		getContentPane().add(label6);
		getContentPane().add(label7);
		getContentPane().add(label8);
		getContentPane().add(valor1);
		getContentPane().add(valor2);
		getContentPane().add(valor3);
		getContentPane().add(valor4);
		getContentPane().add(valor5);
		getContentPane().add(valor6);
		getContentPane().add(valor7);

		label1.setBounds(30, 110, 200, 15);
		label2.setBounds(30, 140, 200, 15);
		label3.setBounds(30, 170, 200, 15);
		label4.setBounds(30, 200, 200, 15);
		label5.setBounds(30, 230, 200, 15);
		label8.setBounds(30, 260, 300, 15);
		label6.setBounds(30, 290, 200, 15);
		label7.setBounds(30, 320, 200, 15);

		valor1.setBounds(190, 110, 122, 15);
		valor2.setBounds(190, 140, 100, 15);
		valor3.setBounds(190, 170, 100, 15);
		valor4.setBounds(190, 200, 100, 15);
		valor5.setBounds(190, 230, 100, 15);
		valor6.setBounds(190, 290, 100, 15);
		valor7.setBounds(190, 320, 100, 15);
	}

}
