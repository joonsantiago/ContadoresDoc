package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ContadoresDoc;
import app.view.*;

public class ImpDetalheBtn1 extends FrameDetalhe implements ActionListener {

	ContadoresDoc contadores = new ContadoresDoc();

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		contadores.Impressoras("192.168.32.28");
		valor1.setText(contadores.getValores()[0]);
		valor2.setText(contadores.getValores()[4]);
		valor3.setText(contadores.getValores()[5]);
		valor4.setText(contadores.getValores()[6]);
		valor5.setText(contadores.getValores()[7]);
		valor6.setText(contadores.getValores()[8]);
		valor7.setText(contadores.getValores()[9]);

		if (contadores.isAtivarTela()) {
			this.setVisible(true);
		}

	}
}
