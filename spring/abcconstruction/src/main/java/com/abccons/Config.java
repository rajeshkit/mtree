package com.abccons;

import java.util.Arrays;
import java.util.List;

import com.abccons.entity.Construction;

public class Config {
	public static List<Construction> constructionObjects(){
		Construction cons1=new Construction();
		cons1.setCompanyEmail("bcdconstruction@gmail.com");
		cons1.setCompanyName("Bcd Construction");
		cons1.setCompanyProfit(243434);
		cons1.setCompanyRegistration(78787);
		Construction cons2=new Construction();
		cons2.setCompanyEmail("efgconstruction@gmail.com");
		cons2.setCompanyName("efg Construction");
		cons2.setCompanyProfit(9899);
		cons2.setCompanyRegistration(232323);
		return Arrays.asList(cons1,cons2); 
	}
}
