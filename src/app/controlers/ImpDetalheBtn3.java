package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ContadoresDoc;
import app.view.*;

public class ImpDetalheBtn3 extends FrameDetalhe26 implements ActionListener {

	ContadoresDoc contadores = new ContadoresDoc();

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		contadores.Impressora26();
		valor1.setText(contadores.getValores()[0]);
		valor2.setText(contadores.getValores()[9]);
		valor3.setText(contadores.getValores()[1]);
		valor4.setText(contadores.getValores()[2]);
		valor5.setText(contadores.getValores()[3]);
		valor6.setText(contadores.getValores()[4]);
		valor7.setText(contadores.getValores()[5]);
		valor8.setText(contadores.getValores()[6]);
		valor9.setText(contadores.getValores()[7]);
		valor10.setText(contadores.getValores()[8]);

		if (contadores.isAtivarTela()) {
			this.setVisible(true);
		}

	}
}
