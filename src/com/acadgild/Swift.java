package com.acadgild;

/**
 * 
 * This class Swift extends Car class. This class demonstrates IS-A relationship
 * as Swift IS A Car
 * It also shows HAS-A relationship, because Swift HAS a
 * Engine
 */
public class Swift extends Car {

	public void engineDetails(String chesisNo,int cubicCc) {
		Engine engine = new Engine();
		engine.setChesisNo(chesisNo);
		engine.setCubicCc(cubicCc);
		engine.display();

	}

}
