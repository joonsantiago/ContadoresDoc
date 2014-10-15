package app.view;

import app.controlers.ImpEmail;
import app.model.DadosArquivo;
import app.model.Imagem;
import app.model.TableModel;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
@SuppressWarnings("serial") 
public class FrameDetalheAll extends JFrame {
	
    ImpEmail actionEmail = new ImpEmail();
    
	//Imp 28  -------
	public JLabel valor11 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor12 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor13 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor14 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor15 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor16 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor17 = new JLabel("",SwingConstants.RIGHT);
	public JLabel label11, label12, label13, label14, label15, label16, label17, label18;
	///////////////
	
	//Imp 24 --------
	public JLabel valor21 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor22 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor23 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor24 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor25 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor26 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor27 = new JLabel("",SwingConstants.RIGHT);
	public JLabel label21, label22, label23, label24, label25, label26, label27, label28;
	/////////
	
	//Imp 26 Kyocera --
	public JLabel valor31 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor32 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor33 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor34 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor35 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor36 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor37 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor38 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor39 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor310 = new JLabel("",SwingConstants.RIGHT);
	public JLabel label31, label32, label33, label34, label35, label36, label37, 
	label38, label39, label310, label311;
	//////////////
	
	//Imp 200 ---------
	public JLabel valor41 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor42 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor43 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor44 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor45 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor46 = new JLabel("",SwingConstants.RIGHT);
	public JLabel valor47 = new JLabel("",SwingConstants.RIGHT);
	public JLabel label41, label42, label43, label44, label45, label46, label47, label48;
	//////////
        
        public JButton enviar = new JButton("Enviar Email");
        
        public JScrollPane scroll = new JScrollPane();
        public JTable tabela = new JTable();
        public JPanel panelTable = new JPanel();
        private TableModel model = new TableModel(); 
        String[] referencia = new DadosArquivo().LerArquivo();
        
	public FrameDetalheAll() {
		setTitle("Detalhes");
		setSize(1180, 850);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
                setLocationRelativeTo(null);

		//CamposImp28();
		label11 = new JLabel("Model Nome");
		label12 = new JLabel("Serial Nº");
		label13 = new JLabel("Firmware Version");
		label14 = new JLabel("Sub Firmware Version");
		label15 = new JLabel("Memory Size");
		label18 = new JLabel(
				"-------------------------Device Status-------------------------");
		label16 = new JLabel("Page Counter");
		label17 = new JLabel("Drum Count");
                
                tabela.setModel(model);
                
                TableCellRenderer tcr = new Imagem("src/imgs/reenviar.gif");
                TableColumn column = tabela.getColumnModel().getColumn(1);
                column.setCellRenderer(tcr);
                
                tcr = new Imagem("src/imgs/lupa.gif");
                column = tabela.getColumnModel().getColumn(0);
                column.setCellRenderer(tcr);        
                
                scroll.setViewportView(tabela);
                tabela.setRowHeight(25);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
                tabela.getColumnModel().getColumn(1).setPreferredWidth(10);
                
                //tabela.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                //tabela.getColumnModel().getColumn(2).
                
                panelTable.add(scroll);
                panelTable.setLayout(new GridLayout(1,0));
                panelTable.setBounds(955, 370, 190, 250);
	
			getContentPane().setLayout(null);
	                
			getContentPane().add(panelTable);
			getContentPane().add(label11);
			getContentPane().add(label12);
			getContentPane().add(label13);
			getContentPane().add(label14);
			getContentPane().add(label15);
			getContentPane().add(label16);
			getContentPane().add(label17);
			getContentPane().add(label18);
			getContentPane().add(valor11);
			getContentPane().add(valor12);
			getContentPane().add(valor13);
			getContentPane().add(valor14);
			getContentPane().add(valor15);
			getContentPane().add(valor16);
			getContentPane().add(valor17);
	
			label11.setBounds(580, 110, 200, 15);
			label12.setBounds(580, 140, 200, 15);
			label13.setBounds(580, 170, 200, 15);
			label14.setBounds(580, 200, 200, 15);
			label15.setBounds(580, 230, 200, 15);
			label18.setBounds(580, 260, 300, 15);
			label16.setBounds(580, 290, 200, 15);
			label17.setBounds(580, 320, 200, 15);
	
			valor11.setBounds(730, 110, 122, 15);
			valor12.setBounds(730, 140, 100, 15);
			valor13.setBounds(730, 170, 100, 15);
			valor14.setBounds(730, 200, 100, 15);
			valor15.setBounds(730, 230, 100, 15);
			valor16.setBounds(730, 290, 100, 15);
			valor17.setBounds(730, 320, 100, 15);
			///////////////////////
			
			//CamposImp24(); ----------
			label21= new JLabel("Model Nome");
			label22= new JLabel("Serial Nº");
			label23 = new JLabel("Firmware Version");
			label24 = new JLabel("Sub Firmware Version");
			label25 = new JLabel("Memory Size");
			label28 = new JLabel(
					"-------------------------Device Status-------------------------");
			label26 = new JLabel("Page Counter");
			label27 = new JLabel("Drum Count");
			 
			getContentPane().add(label21);
			getContentPane().add(label22);
			getContentPane().add(label23);
			getContentPane().add(label24);
			getContentPane().add(label25);
			getContentPane().add(label26);
			getContentPane().add(label27);
			getContentPane().add(label28);
			getContentPane().add(valor21);
			getContentPane().add(valor22);
			getContentPane().add(valor23);
			getContentPane().add(valor24);
			getContentPane().add(valor25);
			getContentPane().add(valor26);
			getContentPane().add(valor27);
	
			label21.setBounds(145, 110, 200, 15);
			label22.setBounds(145, 140, 200, 15);
			label23.setBounds(145, 170, 200, 15);
			label24.setBounds(145, 200, 200, 15);
			label25.setBounds(145, 230, 200, 15);
			label28.setBounds(145, 260, 300, 15);
			label26.setBounds(145, 290, 200, 15);
			label27.setBounds(145, 320, 200, 15);
	
			valor21.setBounds(290, 110, 122, 15);
			valor22.setBounds(290, 140, 100, 15);
			valor23.setBounds(290, 170, 100, 15);
			valor24.setBounds(290, 200, 100, 15);
			valor25.setBounds(290, 230, 100, 15);
			valor26.setBounds(290, 290, 100, 15);
			valor27.setBounds(290, 320, 100, 15);
			////////////////////////////
			
			//CamposKyocera();----------
			label31 = new JLabel("Model Nome                        Kyocera Command Center");
			label32 = new JLabel("Total");
			label33 = new JLabel("A4");
			label34 = new JLabel("B5");
			label35 = new JLabel("A5");
			label38 = new JLabel("Fólio");
			label36 = new JLabel("Legal EUA");
			label37 = new JLabel("Letter");
			label311 = new JLabel("Statement");
			label39 = new JLabel("Outra(Duplo)");
			label310 = new JLabel("Outra(Único)");
	
			getContentPane().add(label31);
			getContentPane().add(label32);
			getContentPane().add(label33);
			getContentPane().add(label34);
			getContentPane().add(label35);
			getContentPane().add(label36);
			getContentPane().add(label37);
			getContentPane().add(label38);
			getContentPane().add(label39);
			getContentPane().add(label310);
			getContentPane().add(label311);
	
			getContentPane().add(valor31);
			getContentPane().add(valor32);
			getContentPane().add(valor33);
			getContentPane().add(valor34);
			getContentPane().add(valor35);
			getContentPane().add(valor36);
			getContentPane().add(valor37);
			getContentPane().add(valor38);
			getContentPane().add(valor39);
			getContentPane().add(valor310);
	
			label31.setBounds(580, 410, 400, 15);
			label32.setBounds(580, 440, 200, 15);
			label33.setBounds(580, 470, 200, 15);
			label34.setBounds(580, 500, 200, 15);
			label35.setBounds(580, 530, 200, 15);
			label38.setBounds(580, 560, 300, 15);
			label36.setBounds(580, 590, 200, 15);
			label37.setBounds(580, 620, 200, 15);
			label311.setBounds(580, 650, 200, 15);
			label39.setBounds(580, 680, 200, 15);
			label310.setBounds(580, 710, 200, 15);
	
			valor31.setBounds(730, 440, 122, 15);
			valor32.setBounds(730, 500, 100, 15);
			valor33.setBounds(730, 530, 100, 15);
			valor34.setBounds(730, 560, 100, 15);
			valor35.setBounds(730, 590, 100, 15);
			valor36.setBounds(730, 620, 100, 15);
			valor37.setBounds(730, 650, 100, 15);
			valor38.setBounds(730, 680, 100, 15);
			valor39.setBounds(730, 710, 100, 15);
			valor310.setBounds(730, 470, 100, 15);
			////////////////////////////////
			
			//Campos200();-----------------
			label41 = new JLabel("Model Nome");
			label42 = new JLabel("Serial Nº");
			label43 = new JLabel("Firmware Version");
			label44 = new JLabel("Sub Firmware Version");
			label45 = new JLabel("Memory Size");
			label48 = new JLabel(
					"-------------------------Device Status-------------------------");
			label46 = new JLabel("Page Counter");
			label47 = new JLabel("Drum Count");
	
			getContentPane().add(label41);
			getContentPane().add(label42);
			getContentPane().add(label43);
			getContentPane().add(label44);
			getContentPane().add(label45);
			getContentPane().add(label46);
			getContentPane().add(label47);
			getContentPane().add(label48);
			getContentPane().add(valor41);
			getContentPane().add(valor42);
			getContentPane().add(valor43);
			getContentPane().add(valor44);
			getContentPane().add(valor45);
			getContentPane().add(valor46);
			getContentPane().add(valor47);
	                getContentPane().add(enviar);
	
			label41.setBounds(145, 410, 200, 15);
			label42.setBounds(145, 440, 200, 15);
			label43.setBounds(145, 470, 200, 15);
			label44.setBounds(145, 500, 200, 15);
			label45.setBounds(145, 530, 200, 15);
			label48.setBounds(145, 560, 300, 15);
			label46.setBounds(145, 590, 200, 15);
			label47.setBounds(145, 620, 200, 15);
	
			valor41.setBounds(290, 410, 122, 15);
			valor42.setBounds(290, 440, 100, 15);
			valor43.setBounds(290, 470, 100, 15);
			valor44.setBounds(290, 500, 100, 15);
			valor45.setBounds(290, 530, 100, 15);
			valor46.setBounds(290, 590, 100, 15);
			valor47.setBounds(290, 620, 100, 15);
	                
	                enviar.setBounds(220,680,150,35);
	                enviar.addActionListener(actionEmail);
	                model.addReferencia(referencia);
	                tabela.addMouseListener(new MouseListener() {
	
	                    @Override
	                    public void mouseClicked(MouseEvent me) {
	                        if(me.getClickCount()==1 && tabela.getSelectedColumn()==0){
	                            JOptionPane.showMessageDialog(null,"OIAAA "+ tabela.getSelectedRow());
	                        }
	                        if(me.getClickCount()==1 && tabela.getSelectedColumn()==1){
	                            JOptionPane.showConfirmDialog(null,"Vc tem certeza?");
	                        }
	                    }
	
	                    @Override
	                    public void mousePressed(MouseEvent me) {
	                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	                    }
	
	                    @Override
	                    public void mouseReleased(MouseEvent me) {
	                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	                    }
	
	                    @Override
	                    public void mouseEntered(MouseEvent me) {
	                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	                    }
	
	                    @Override
	                    public void mouseExited(MouseEvent me) {
	                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	                    }
	                });
			///////////////////////////////
	}

	//public static void main(String[] args) {new FrameDetalheAll().setVisible(true);}

}
