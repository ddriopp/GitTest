package com.ddriop.git;

public class SimpleNoodlesFactory {
	public static final int TYPE_LZ = 1;// Lan Zhou
	public static final int TYPE_PM = 2;// Pao Mian
	public static final int TYPE_GK = 3;// Gan Kou

	public static INoodles createNoodles(int type) {
		switch (type) {
		case TYPE_LZ:
			return new LzNoodles();
		case TYPE_PM:
			return new PaoNoodles();
		case TYPE_GK:
		default:
			return new GankouNoodles();
		}
	}
}
