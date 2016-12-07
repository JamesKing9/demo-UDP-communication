package com.cheng;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 */
public class Receive {
	public static void main(String[] args) throws Exception {
		//创建Socket相当于创建码头
		DatagramSocket socket = new DatagramSocket(6666);
		//创建Packet相当于创建集装箱
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		
		// 卸下货物
		byte[] data = packet.getData();
		int length = packet.getLength();
		System.out.println(new String(data,0,length));
		socket.close();
	}
}
