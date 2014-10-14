package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ContadoresDoc;
import app.view.*;

public class ImpDetalheBtn1 implements ActionListener {

    FrameDetalhe dados = new FrameDetalhe();
    ContadoresDoc contadores = new ContadoresDoc();

    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        contadores.Impressoras("192.168.32.28");
        dados.valor1.setText(contadores.getValores()[0]);
        dados.valor2.setText(contadores.getValores()[4]);
        dados.valor3.setText(contadores.getValores()[5]);
        dados.valor4.setText(contadores.getValores()[6]);
        dados.valor5.setText(contadores.getValores()[7]);
        dados.valor6.setText(contadores.getValores()[8]);
        dados.valor7.setText(contadores.getValores()[9]);

        if (contadores.isAtivarTela()) {
            dados.setVisible(true);
        }

    }
}
