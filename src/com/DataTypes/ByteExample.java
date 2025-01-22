package com.DataTypes;

public class ByteExample {

	static byte bytevariable;
	public static void main(String[] args) {
	System.out.println("Default value  "+bytevariable);
		
	bytevariable=50;
	System.out.println("Actual value  "+bytevariable);
	System.out.println("Bytes "+Byte.SIZE/8+" size");
	System.out.println("min value "+Byte.MIN_VALUE);
	System.out.println("max value "+Byte.MAX_VALUE);
	byte a=-128;
	}

}
