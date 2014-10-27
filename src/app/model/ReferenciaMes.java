/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

/**
 *
 * @author jonatas
 */
public class ReferenciaMes {

	private String[] mesRef;
	private static String[] idMes;
	
	public String[] getIdMes() {
		return idMes;
	}

	public void setIdMes(String[] idMes) {
		this.idMes = idMes;
	}

	public String getMesRef2(int rowIndex) {
		return mesRef[rowIndex];
	}

	public String[] getMesRef() {
		return mesRef;
	}

	public void setMesRef(String[] mesRef) {
		this.mesRef = mesRef;
	}

}
