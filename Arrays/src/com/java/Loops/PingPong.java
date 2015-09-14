package com.java.Loops;

public class PingPong {

		public static void main(String[] args){		
			for(int i = 1; i <= 100; i++){
				String test = "";
				test += (i % 3) == 0 ? ""
						+ "ping" : "";
				test += (i % 5) == 0 ? "Pong" : "";
				System.out.println(!test.isEmpty() ? test : i);
			}
		}
	}

