package com.tnsif.day4.Accessmodifiers;

public class Acessmodifers_Executor {
	public static void main(String[] args) {
		
		//accessing same package class
			Accessmodifiers b1=new Accessmodifiers();
			b1.methodDefault();
			b1.methodProtected();
			b1.methodPublic();
			
			b1.varDefault=11;
			b1.methodDefault();
			
			//private member can't accessible
			/*b1.varPrivate=21; 
			b1.methodPrivate();*/
			
			b1.varProtected=31;
			b1.methodProtected();
			
			b1.varPublic=41;
			b1.methodPublic();
			
			//instance of operator
			System.out.println(b1 instanceof Accessmodifiers); //returns True
			
	}
}
