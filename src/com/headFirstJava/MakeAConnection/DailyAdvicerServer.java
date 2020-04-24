package com.headFirstJava.MakeAConnection;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author andresr
 *
 */
public class DailyAdvicerServer {
	
	String[] adviceList = {"Take smaller bites", "Go for the tigth jeans. No they don't make you look fat",
							"One word: inappropriate", "Just for today, be honest. Tell your boss what you really think",
							"You migth want to rethink that haircut"};
	
	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			
			while (true) {
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter( sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int random = (int) ( Math.random() * adviceList.length );
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		DailyAdvicerServer server = new DailyAdvicerServer();
		server.go();

	}

}
