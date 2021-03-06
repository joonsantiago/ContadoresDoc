package app.model;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import app.view.FrameLoading;

public class ContadoresDoc {

	private String[] valores = new String[10];
	private static String[][] Allvalores = new String[4][10];
	private boolean ativarTela = true;
	private String text = "\n\nA impressora n�o foi acessada, motivos poss�ves\n\n"
			+ "1- A impressora est� desligada\n"
			+ "2- O endere�o de IP foi alterado\n"
			+ "3- O cabo de rede est� desconectado\n\n\n";;

	public void Impressora24() {

		Document doc;
		try {
			doc = Jsoup.connect("http://192.168.32.24/printer/maininfo.html")
					.get();
			Elements links = doc.select("td");
			int i = 0;
			int j = 0;
			for (Element link : links) {
				i++;
				if (i >= 25 && i <= 40) {
					if (i % 2 == 0) {
						setValores(j, link.text());
						// System.out.println("texto : (" + i + ","+j+") "
						// +link.text());
						j++;
					}
				}
			}
			// for (int k = 0; k <= 7; k++) {System.out.println(valores[k]);}

		} catch (IOException f) {
			JOptionPane.showMessageDialog(null, text);
			setAtivarTela(false);
			// f.printStackTrace();
		}
	}

	public void Impressora26() {

		Document doc;
		try {
			doc = Jsoup.connect("http://192.168.32.26/start/StatCntFunc.htm")
					.get();
			Element k = doc.body().tagName("table");

			String dados = String.valueOf(k);
			String dados2;

			for (int i = 0; i <= 8; i++) {
				int pos = dados.indexOf("sName[" + i + "]");
				dados2 = dados.replaceFirst("sName[" + i + "]", "  ������");
				int posF = pos + 22;
				dados = dados2;

				setValores(i, dados.substring(pos, posF));

				pos = getValores()[i].indexOf("= ") + 3;
				posF = getValores()[i].indexOf(";") - 1;

				setValores(i, getValores()[i].substring(pos, posF));

				if (i == 1) {
					pos = dados.indexOf("PaperSize[4]") + 26;
					posF = pos + 22;

					setValores(9, dados.substring(pos, posF));

					pos = getValores()[9].indexOf("= ") + 3;
					posF = getValores()[9].indexOf(";") - 1;

					setValores(9, getValores()[9].substring(pos, posF));
				}
			}
			// for(int i=0;i<=9;i++){System.out.println("valor ("+i+") =" +
			// valores[i]);}

		} catch (IOException f) {
			JOptionPane.showMessageDialog(null, text);
			setAtivarTela(false);
			// f.printStackTrace();
		}

	}

	public void Impressoras(String ip) {

		Document doc;
		try {
			doc = Jsoup.connect("http://" + ip + "/etc/mnt_info.csv").get();

			String dados = String.valueOf(doc);
			String dados2;
			int n;

			for (int i = 0; i <= 138; i++) {

				int pos = dados.indexOf("&quot;,&quot;") + 13;
				dados2 = dados.replaceFirst("&quot;,&quot;", "�������������");

				int posF = dados2.indexOf("&quot;,&quot;");

				dados = dados2;

				if (i >= 70 && i <= 79) {
					n = i - 70;
					setValores(n, dados.substring(pos, posF));
				}
			}
			// for (int i = 0; i <= 9; i++) {System.out.println(valores[i]);}

		} catch (IOException f) {

			JOptionPane.showMessageDialog(null, text);
			setAtivarTela(false);
			// f.printStackTrace();
		}
	}

	public void AllImpressoras() {
		
		new FrameLoading().setVisible(true);
		Document doc;
		try {

			doc = Jsoup.connect("http://192.168.32.24/printer/maininfo.html")
					.get();
			Elements links = doc.select("td");
			int i = 0;
			int j = 0;
			for (Element link : links) {
				i++;
				if (i >= 25 && i <= 40) {
					if (i % 2 == 0) {
						setAllvalores(0, j, link.text());
						// valores[j] = link.text();
						// System.out.println("texto : (" + i + ","+j+") "
						// +link.text());
						j++;
					}
				}
			}

			// for (int k = 0; k <= 7; k++) {Allvalores[0][k]=valores[k];}

			// ///////////////////////////////////////////////////////////////

			doc = Jsoup.connect("http://192.168.32.26/start/StatCntFunc.htm")
					.get();
			Element k = doc.body().tagName("table");

			String dados = String.valueOf(k);
			String dados2;
			int pos;
			int posF;

			for (i = 0; i <= 8; i++) {
				pos = dados.indexOf("sName[" + i + "]");
				dados2 = dados.replaceFirst("sName[" + i + "]", "  ������");
				posF = pos + 22;
				dados = dados2;

				setValores(i, dados.substring(pos, posF));

				pos = getValores()[i].indexOf("= ") + 3;
				posF = getValores()[i].indexOf(";") - 1;

				setAllvalores(1, i, getValores()[i].substring(pos, posF));

				if (i == 1) {
					pos = dados.indexOf("PaperSize[4]") + 26;
					posF = pos + 22;

					setValores(9, dados.substring(pos, posF));

					pos = getValores()[9].indexOf("= ") + 3;
					posF = getValores()[9].indexOf(";") - 1;

					setAllvalores(1, 9, getValores()[9].substring(pos, posF));
				}
			}
			// for(int i=0;i<=9;i++){System.out.println("valor ("+i+") =" +
			// valores[i]);}

			// ///////////////////////////////////////////////////////////////

			doc = Jsoup.connect("http://192.168.32.28/etc/mnt_info.csv").get();

			dados = String.valueOf(doc);
			int n;

			for (i = 0; i <= 138; i++) {

				pos = dados.indexOf("&quot;,&quot;") + 13;
				dados2 = dados.replaceFirst("&quot;,&quot;", "�������������");

				posF = dados2.indexOf("&quot;,&quot;");

				dados = dados2;

				if (i >= 70 && i <= 79) {
					n = i - 70;
					setAllvalores(2, n, dados.substring(pos, posF));
				}
			}

			// ///////////////////////////////////////////////////////////////

			doc = Jsoup.connect("http://192.168.32.200/etc/mnt_info.csv").get();

			dados = String.valueOf(doc);

			for (i = 0; i <= 138; i++) {

				pos = dados.indexOf("&quot;,&quot;") + 13;
				dados2 = dados.replaceFirst("&quot;,&quot;", "�������������");

				posF = dados2.indexOf("&quot;,&quot;");

				dados = dados2;

				if (i >= 70 && i <= 79) {
					n = i - 70;
					setAllvalores(3, n, dados.substring(pos, posF));
				}
			}

		} catch (IOException f) {
			JOptionPane.showMessageDialog(null, text);
			setAtivarTela(false);
			// f.printStackTrace();
		}
		
	}

	// public static void main(String[] args) {new
	// ContadoresDoc().AllImpressoras();}

	/**
	 * @return the valores
	 */
	public String[] getValores() {
		return valores;
	}

	public void setValores(int i, String valor) {
		this.valores[i] = valor;
	}

	/**
	 * @param valores
	 *            the valores to set
	 */
	public void setValores(String[] valores) {
		this.setValores(valores);
	}

	/**
	 * @return the Allvalores
	 */
	public String[][] getAllvalores() {
		return Allvalores;
	}

	/**
	 * @param Allvalores
	 *            the Allvalores to set
	 */
	public void setAllvalores(String[][] Allvalores) {
		this.setAllvalores(Allvalores);
	}

	public void setAllvalores(int linha, int coluna, String valor) {
		this.Allvalores[linha][coluna] = valor;
	}

	/**
	 * @return the ativarTela
	 */
	public boolean isAtivarTela() {
		return ativarTela;
	}

	/**
	 * @param ativarTela
	 *            the ativarTela to set
	 */
	public void setAtivarTela(boolean ativarTela) {
		this.ativarTela = ativarTela;
	}

	// public static void main(String[]args){new
	// ContadoresDoc().Impressoras("192.168.32.28");};
}
