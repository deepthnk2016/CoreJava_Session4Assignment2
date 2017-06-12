package com.acadgild;

/**
 * 
 * Engine class through which HAS-A relationship is maintained by Swift class
 *
 */
public class Engine {
	private String chesisNo;
	private int cubicCc;

	public String getChesisNo() {
		return chesisNo;
	}

	public void setChesisNo(String chesisNo) {
		this.chesisNo = chesisNo;
	}

	public int getCubicCc() {
		return cubicCc;
	}

	public void setCubicCc(int cubicCc) {
		this.cubicCc = cubicCc;
	}

	public void display() {
		System.out.println("Chesis No. of Engine::" + chesisNo);
		System.out.println("Volume of Engine::" + cubicCc);
	}
}
