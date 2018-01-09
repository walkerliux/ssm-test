package com.paytong.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DoubleList {
	
	public static void main(String[] args) {
		List<Double> list = DoubleList.getList();
		/*for (int i = 0; i < list.size(); i++) {
			Double dob = list.get(i);
			double ss=sub100(dob);
			if(ss>=401.5){
				list.remove(i);
			}
			System.out.println(list.get(i));
		}*/
		Iterator<Double> it = list.iterator();
		while(it.hasNext()){
			Double next = it.next();
			double ss=sub100(next);
			if(ss>=401.5){
				it.remove();//
			}
		}
		for (Double double1 : list) {
			System.out.println(double1);
		}
	}
	private static double sub100(double sd) {
		// TODO Auto-generated method stub
		BigDecimal b1 = new BigDecimal(Double.toString(sd));
		BigDecimal b2 = new BigDecimal(100);
		return b1.multiply(b2).doubleValue();
		
	}
	public static List<Double> getList(){
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(1.004);
		list.add(2.003);
		list.add(4.015);
		list.add(5.003);
		return list;
	}
}
