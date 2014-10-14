package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ContadoresDoc;
import app.view.*;

public class ImpDetalheBtn3 implements ActionListener {

    FrameDetalhe26 dados = new FrameDetalhe26();
    ContadoresDoc contadores = new ContadoresDoc();

    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        contadores.Impressora26();
        dados.valor1.setText(contadores.getValores()[0]);
        dados.valor2.setText(contadores.getValores()[9]);
        dados.valor3.setText(contadores.getValores()[1]);
        dados.valor4.setText(contadores.getValores()[2]);
        dados.valor5.setText(contadores.getValores()[3]);
        dados.valor6.setText(contadores.getValores()[4]);
        dados.valor7.setText(contadores.getValores()[5]);
        dados.valor8.setText(contadores.getValores()[6]);
        dados.valor9.setText(contadores.getValores()[7]);
        dados.valor10.setText(contadores.getValores()[8]);

        if (contadores.isAtivarTela()) {
            dados.setVisible(true);
        }

    }
}
