package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ContadoresDoc;
import app.view.*;

public class ImpDetalheAll extends FrameDetalheAll implements ActionListener {
	public ContadoresDoc contadores = new ContadoresDoc();
        
        public ImpDetalheAll(){
            contadores.AllImpressoras();
        }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//contadores.AllImpressoras();
		valor11.setText(contadores.getAllvalores()[0][0]);
		valor12.setText(contadores.getAllvalores()[0][1]);
		valor13.setText(contadores.getAllvalores()[0][2]);
		valor14.setText(contadores.getAllvalores()[0][3]);
		valor15.setText(contadores.getAllvalores()[0][4]);
		valor16.setText(contadores.getAllvalores()[0][6]);
		valor17.setText(contadores.getAllvalores()[0][7]);
		
		valor21.setText(contadores.getAllvalores()[2][0]);
		valor22.setText(contadores.getAllvalores()[2][4]);
		valor23.setText(contadores.getAllvalores()[2][5]);
		valor24.setText(contadores.getAllvalores()[2][6]);
		valor25.setText(contadores.getAllvalores()[2][7]);
		valor26.setText(contadores.getAllvalores()[2][8]);
		valor27.setText(contadores.getAllvalores()[2][9]);
		
		valor31.setText(contadores.getAllvalores()[1][0]);
		valor32.setText(contadores.getAllvalores()[1][1]);
		valor33.setText(contadores.getAllvalores()[1][2]);
		valor34.setText(contadores.getAllvalores()[1][3]);
		valor35.setText(contadores.getAllvalores()[1][4]);
		valor36.setText(contadores.getAllvalores()[1][5]);
		valor37.setText(contadores.getAllvalores()[1][6]);
		valor38.setText(contadores.getAllvalores()[1][7]);
		valor39.setText(contadores.getAllvalores()[1][8]);
		valor310.setText(contadores.getAllvalores()[1][9]);

		valor41.setText(contadores.getAllvalores()[3][0]);
		valor42.setText(contadores.getAllvalores()[3][4]);
		valor43.setText(contadores.getAllvalores()[3][5]);
		valor44.setText(contadores.getAllvalores()[3][6]);
		valor45.setText(contadores.getAllvalores()[3][7]);
		valor46.setText(contadores.getAllvalores()[3][8]);
		valor47.setText(contadores.getAllvalores()[3][9]);
		
		this.setVisible(true);

	}

}
