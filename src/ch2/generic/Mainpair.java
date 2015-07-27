package ch2.generic;

import java.util.Iterator;
import java.util.Random;

public class Mainpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,Double> bid;
		bid = new Pair<String, Double>("ORCL", 32.07);
		String f=bid.getFirst();
		double d=bid.getSecond();
		System.out.println(f+"\t"+d);
		
		Pair<Integer,String> bid1 = new Pair<Integer, String>(34, "Ram ji");
		int f1=bid1.getFirst();
		String d1=bid1.getSecond();
		System.out.println(f1+"\t"+d1);
		Pair x;
		x=new Pair<String, Double>("ORCL sdf", 3255.07);
		System.out.println(x.getFirst()+"\t"+x.getSecond());
		x=new Pair<Integer, String>(343, "Ram ji great");
		System.out.println(x.getFirst()+"\t"+x.getSecond());
		
		//Array in Generic class
		Pair []x1=new Pair[10];
		String  sname="abcdefghijklmonpqrstuv";
		System.out.println("========================");
		
		
		for (int i=0;i<x1.length;i++)
		{
			String na="";
			 
			for (int j=1 ;j<=new Random().nextInt(10)+2; j++)
			{
				na+=String.valueOf(sname.charAt(new Random().nextInt(sname.length())));
			}
			x1[i]=new Pair<String,Integer>(na,new Random().nextInt(100));
		//	System.out.println(na+"\t"+ new Random().nextInt(100));
		}
		
/*
		for (int i=1;i<x1.length;i++)
		{
			System.out.println(x1[i].getFirst()+"\t"+x1[i].getSecond());
		}
		*/
		for(Pair dd:x1)
		{
			System.out.println(dd.getFirst()+"\t"+dd.getSecond());
			
		}
		
		
		
	
		/*
			for(Iterator <String,Integer> kk=x1;kk.hasNext();)
		{
			System.out.println(callp.getFirst()+"\t"+callp.getSecond());
		}
		String aa="as";
		aa=aa+String.valueOf(sname.charAt(4));
		//+sname.charAt(3);
		x1[0]=new Pair<String,Double>("ram",45.4);
		
		
		
		*/
		
		

	}

}
