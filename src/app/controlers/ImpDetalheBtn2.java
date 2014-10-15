package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.model.ContadoresDoc;
import app.view.FrameDetalhe;

public class ImpDetalheBtn2  extends FrameDetalhe implements ActionListener {

    ContadoresDoc contadores = new ContadoresDoc();

    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        contadores.Impressora24();
        valor1.setText(contadores.getValores()[0]);
        valor2.setText(contadores.getValores()[1]);
        valor3.setText(contadores.getValores()[2]);
        valor4.setText(contadores.getValores()[3]);
        valor5.setText(contadores.getValores()[4]);
        valor6.setText(contadores.getValores()[6]);
        valor7.setText(contadores.getValores()[7]);

        if (contadores.isAtivarTela()) {
            this.setVisible(true);
        }

    }
}
