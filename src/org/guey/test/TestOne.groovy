package org.guey.test

class TestOne {
	
	public static void main(def args){
		def a="hello";
		repeat(a);
	}

	static def repeat(def a){
		for(i in 0..5){
			println a;
		}
	}
}
