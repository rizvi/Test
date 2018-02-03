package com.rizvi.array;

public class HostName {
	public static void main(String[] args) throws Exception {
		System.out.println(java.net.InetAddress.getLocalHost().getHostName());
	}
}