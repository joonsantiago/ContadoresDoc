package app.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DadosArquivo {

    ReferenciaMes meses = new ReferenciaMes();
    String[][] valor = new String[4][11];
    String[][] valoresAll;
    String[] referencia;

    public int QuantidadeLinhas() {
        File arquivo = new File("C:\\Users\\jonatas\\Desktop\\testeArq.txt");
        int qtd = 0;
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                br.readLine();
                ++qtd;
            }

        } catch (Exception e) {
        }
        return qtd;
    }

    public String FormatarData(String data) {
        data = data.substring(4, 6) + "/" + data.substring(6, 8) + "/" + data.substring(8, 12);
        return data;
    }

    public String[] LerArquivo() {

        File arquivo = new File("C:\\Users\\jonatas\\Desktop\\testeArq.txt");
        int i = 0, j = 0, k = 0, pos = 0, posF = 0;
        String linha2;
        referencia = new String[QuantidadeLinhas() / 4];
        valoresAll = new String[QuantidadeLinhas() / 4][44];
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                if (i < 4) {
                    //leitura de todass as linhas
                    String linha = br.readLine();
                    referencia[j] = FormatarData(linha.substring(0, linha.indexOf("##")));
                    while (k <= 10) {
                        //percorre a linha 11 vezes
                        pos = linha.indexOf("##");

                        linha2 = linha.replaceFirst("##", "@@");
                        posF = linha2.indexOf("##");
                        linha = linha2;
                        if (pos != -1 && posF != -1) {
                            valor[i][k] = linha.substring((pos + 2), posF);
                            if(i==0){
                                valoresAll[j][k] = valor[i][k];
                            }else{
                                int col = ((k+i)+10)+(10*(i-1));
                                valoresAll[j][col] = valor[i][k];
                            }
                        }
                        k++;
                    }
                    k = 0;
                    i++;
                } else {
                    i = 0;
                    ++j;
                }
            }
            br.close();
            fr.close();

        } catch (Exception e) {
        }            
        
       /** for(String[] valoresAll1: valoresAll){
            for(int m=0;m<44;m++){
                System.out.print(valoresAll1[m]+" # ");
            }
            System.out.println();
        }
        * **/
        //for(int q = 0;q<=referencia.length;q++){System.out.println(referencia[q]);}
        return referencia;
    }

    //public static void main(String[] args) {new DadosArquivo().LerArquivo();}
}
