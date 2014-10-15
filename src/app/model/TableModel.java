package app.model;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

    ReferenciaMes ref = new ReferenciaMes();
    String []dados = ref.getMesRef();
    private String[] coluna = {"", "", "Referencia"};
    private static final int LUPA = 0;
    private static final int REENVIAR = 1;
    private static final int REFERENCIA = 2;

    public TableModel() {
        //arq.LerArquivo();
        dados = new String[0];
    }

    public TableModel(String[]lista) {
        dados = lista;
    }

    public int getColumnCount() {
        return coluna.length;
    }

    public int getRowCount() {
        return dados.length;
    }

    public String getColumnName(int columnIndex) {
        return coluna[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case LUPA:
                return String.class;
            case REENVIAR:
                return String.class;
            case REFERENCIA:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("coluna a mais que definidas");
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case LUPA:
                return "";
            case REENVIAR:
                return "";
            case REFERENCIA:
                //ref.setMesRef(new DadosArquivo().LerArquivo());
                return ref.getMesRef2(rowIndex);
                
            default:
                throw new IndexOutOfBoundsException("coluna a mais que definida 2");
        }
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case LUPA:
                break;
            case REENVIAR:
                break;
            case REFERENCIA:
                ref.setMesRef((String[]) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("coluna a mais que definida 3");
        
        }
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public void addReferencia(String[] referencia){
        dados = referencia;
        ref.setMesRef(referencia);
        int ultimoIndice = getRowCount()-1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    //retorna o mes da linha especificada
    public boolean isEmpty(){
        return dados.equals("");
    }
    
}
