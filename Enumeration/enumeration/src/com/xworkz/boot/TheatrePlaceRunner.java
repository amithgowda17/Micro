package com.xworkz.boot;

import com.xworkz.constants.TheatrePlaceEnum;

public class TheatrePlaceRunner {
	
	public static void main(String[] args) {
		
		String theatre = TheatrePlaceEnum.HEGGANHALLI_CROSS.getTheatreName();
		int totalScreens=TheatrePlaceEnum.HEGGANHALLI_CROSS.getNoOfScreen();
		
		String theatre1 = TheatrePlaceEnum.RAJGOPALNAGAR.getTheatreName();
		int totalScreens1=TheatrePlaceEnum.RAJGOPALNAGAR.getNoOfScreen();
		
		String theatre2 = TheatrePlaceEnum.DASARAHALLI.getTheatreName();
		int totalScreens2=TheatrePlaceEnum.DASARAHALLI.getNoOfScreen();
		
		String theatre3 = TheatrePlaceEnum.KAMAKSHIPALYA.getTheatreName();
		int totalScreens3=TheatrePlaceEnum.KAMAKSHIPALYA.getNoOfScreen();
		
		String theatre4 = TheatrePlaceEnum.SUMMANHALLI.getTheatreName();
		int totalScreens4=TheatrePlaceEnum.SUMMANHALLI.getNoOfScreen();
		
		String theatre5 = TheatrePlaceEnum.TOLGATE.getTheatreName();
		int totalScreens5=TheatrePlaceEnum.TOLGATE.getNoOfScreen();
		
		String theatre6 = TheatrePlaceEnum.GT_MALL.getTheatreName();
		int totalScreens6=TheatrePlaceEnum.GT_MALL.getNoOfScreen();
		
		String theatre7 = TheatrePlaceEnum.MAGADI_ROAD.getTheatreName();
		int totalScreens7=TheatrePlaceEnum.MAGADI_ROAD.getNoOfScreen();
		
		
		System.out.println("theatre==="+theatre);
		System.out.println("totalScreens==="+totalScreens);
		
		System.out.println("theatre1==="+theatre1);
		System.out.println("totalScreens1==="+totalScreens1);
		
		System.out.println("theatre2==="+theatre2);
		System.out.println("totalScreens2==="+totalScreens2);
		
		System.out.println("theatre3==="+theatre3);
		System.out.println("totalScreens3==="+totalScreens3);
		
		System.out.println("theatre4==="+theatre4);
		System.out.println("totalScreens4==="+totalScreens4);
		
		System.out.println("theatre5==="+theatre5);
		System.out.println("totalScreens5==="+totalScreens5);
		
		System.out.println("theatre6==="+theatre6);
		System.out.println("totalScreens6==="+totalScreens6);
		
		System.out.println("theatre7==="+theatre7);
		System.out.println("totalScreens7==="+totalScreens7);
		
	}

}
