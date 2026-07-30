package com.tka.client;

import com.tka.service.IPLService;

public class IPLClient {

	public static void main(String[] args) {

		IPLService service = new IPLService();
		
		System.out.println(service.getOnePlayer(1));
		
		service.getallPlayer().forEach(n->System.out.println(n));
	
	}

}