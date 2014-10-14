package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ContadoresDoc;
import app.view.*;

public class ImpDetalheAll implements ActionListener {
	FrameDetalheAll dados = new FrameDetalheAll();
	public ContadoresDoc contadores = new ContadoresDoc();
        
        public ImpDetalheAll(){
            contadores.AllImpressoras();
        }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//contadores.AllImpressoras();
		dados.valor11.setText(contadores.getAllvalores()[0][0]);
		dados.valor12.setText(contadores.getAllvalores()[0][1]);
		dados.valor13.setText(contadores.getAllvalores()[0][2]);
		dados.valor14.setText(contadores.getAllvalores()[0][3]);
		dados.valor15.setText(contadores.getAllvalores()[0][4]);
		dados.valor16.setText(contadores.getAllvalores()[0][6]);
		dados.valor17.setText(contadores.getAllvalores()[0][7]);
		
		dados.valor21.setText(contadores.getAllvalores()[2][0]);
		dados.valor22.setText(contadores.getAllvalores()[2][4]);
		dados.valor23.setText(contadores.getAllvalores()[2][5]);
		dados.valor24.setText(contadores.getAllvalores()[2][6]);
		dados.valor25.setText(contadores.getAllvalores()[2][7]);
		dados.valor26.setText(contadores.getAllvalores()[2][8]);
		dados.valor27.setText(contadores.getAllvalores()[2][9]);
		
		dados.valor31.setText(contadores.getAllvalores()[1][0]);
		dados.valor32.setText(contadores.getAllvalores()[1][1]);
		dados.valor33.setText(contadores.getAllvalores()[1][2]);
		dados.valor34.setText(contadores.getAllvalores()[1][3]);
		dados.valor35.setText(contadores.getAllvalores()[1][4]);
		dados.valor36.setText(contadores.getAllvalores()[1][5]);
		dados.valor37.setText(contadores.getAllvalores()[1][6]);
		dados.valor38.setText(contadores.getAllvalores()[1][7]);
		dados.valor39.setText(contadores.getAllvalores()[1][8]);
		dados.valor310.setText(contadores.getAllvalores()[1][9]);

		dados.valor41.setText(contadores.getAllvalores()[3][0]);
		dados.valor42.setText(contadores.getAllvalores()[3][4]);
		dados.valor43.setText(contadores.getAllvalores()[3][5]);
		dados.valor44.setText(contadores.getAllvalores()[3][6]);
		dados.valor45.setText(contadores.getAllvalores()[3][7]);
		dados.valor46.setText(contadores.getAllvalores()[3][8]);
		dados.valor47.setText(contadores.getAllvalores()[3][9]);
		
		dados.setVisible(true);

	}

}
