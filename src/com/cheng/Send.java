package com.cheng;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 发送端
 */
public class Send {

	public static void main(String[] args) throws Exception{
		String str = "干什么呢？";
		
		//  创建DatagramSocket, 随机端口号,相当于创建码头
		DatagramSocket socket = new DatagramSocket();
		// 创建Packet相当于集装箱,,存放要发送的数据
		DatagramPacket packet = new DatagramPacket(str.getBytes(),
				str.getBytes().length, 
				InetAddress.getByName("127.0.0.1"),6666);
		
		// //发货,将数据发出去
		socket.send(packet);
		socket.close();
	}
}
