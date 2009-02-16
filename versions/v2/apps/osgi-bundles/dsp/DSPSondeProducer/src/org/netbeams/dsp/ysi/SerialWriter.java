package org.netbeams.dsp.ysi;

import java.io.OutputStream;
import java.io.IOException;

/**
 * 
 * @author Teresa L. Johnson <gamma.particle@gmail.com>
 *
 */
public class SerialWriter implements Runnable {

	private OutputStream out;
	
	public SerialWriter(OutputStream out) {
		this.out = out;
	}
	
	public void run() {
		try {
			int ch = 0;
			while ((ch = System.in.read()) > -1) {
				this.out.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	
}