package app.controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.model.DadosArquivo;
import app.model.ReferenciaMes;
import app.view.FrameVisualiza;

@SuppressWarnings("serial")
public class ImpVisualiza extends FrameVisualiza {

	DadosArquivo contadores = new DadosArquivo();
	int linha=0;
	public void Visualizar(int linha) {
		// TODO Auto-generated constructor stub
		this.linha = linha;
		ExibirDados();
	}

	public void ExibirDados() {
		// TODO Auto-generated method stub
		// contadores.AllImpressoras();
		valor11.setText(contadores.getValoresAll()[linha][0]);
		valor12.setText(contadores.getValoresAll()[linha][1]);
		valor13.setText(contadores.getValoresAll()[linha][2]);
		valor14.setText(contadores.getValoresAll()[linha][3]);
		valor15.setText(contadores.getValoresAll()[linha][4]);
		valor16.setText(contadores.getValoresAll()[linha][6]);
		valor17.setText(contadores.getValoresAll()[linha][7]);

		valor21.setText(contadores.getValoresAll()[linha][22]);
		valor22.setText(contadores.getValoresAll()[linha][26]);
		valor23.setText(contadores.getValoresAll()[linha][27]);
		valor24.setText(contadores.getValoresAll()[linha][28]);
		valor25.setText(contadores.getValoresAll()[linha][29]);
		valor26.setText(contadores.getValoresAll()[linha][30]);
		valor27.setText(contadores.getValoresAll()[linha][31]);

		valor31.setText(contadores.getValoresAll()[linha][12]);
		valor32.setText(contadores.getValoresAll()[linha][13]);
		valor33.setText(contadores.getValoresAll()[linha][14]);
		valor34.setText(contadores.getValoresAll()[linha][15]);
		valor35.setText(contadores.getValoresAll()[linha][16]);
		valor36.setText(contadores.getValoresAll()[linha][17]);
		valor37.setText(contadores.getValoresAll()[linha][18]);
		valor38.setText(contadores.getValoresAll()[linha][19]);
		valor39.setText(contadores.getValoresAll()[linha][20]);
		valor310.setText(contadores.getValoresAll()[linha][21]);

		valor41.setText(contadores.getValoresAll()[linha][33]);
		valor42.setText(contadores.getValoresAll()[linha][37]);
		valor43.setText(contadores.getValoresAll()[linha][38]);
		valor44.setText(contadores.getValoresAll()[linha][39]);
		valor45.setText(contadores.getValoresAll()[linha][40]);
		valor46.setText(contadores.getValoresAll()[linha][41]);
		valor47.setText(contadores.getValoresAll()[linha][42]);
		
		this.setVisible(true);

	}

}
