package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.model.ContadoresDoc;
import app.view.FrameDetalhe;

public class ImpDetalheBtn2 implements ActionListener {

    FrameDetalhe dados = new FrameDetalhe();
    ContadoresDoc contadores = new ContadoresDoc();

    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        contadores.Impressora24();
        dados.valor1.setText(contadores.getValores()[0]);
        dados.valor2.setText(contadores.getValores()[1]);
        dados.valor3.setText(contadores.getValores()[2]);
        dados.valor4.setText(contadores.getValores()[3]);
        dados.valor5.setText(contadores.getValores()[4]);
        dados.valor6.setText(contadores.getValores()[6]);
        dados.valor7.setText(contadores.getValores()[7]);

        if (contadores.isAtivarTela()) {
            dados.setVisible(true);
        }

    }
}
