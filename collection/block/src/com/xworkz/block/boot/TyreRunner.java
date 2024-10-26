package com.xworkz.block.boot;

import java.lang.reflect.InvocationTargetException;

import com.xworkz.block.things.Tyre;

public class TyreRunner {
	
	public static void main(String[] args)  {
		
		try {
			Class.forName("com.xworkz.block.things.Tyre").getConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
