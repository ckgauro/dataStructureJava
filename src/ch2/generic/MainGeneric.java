package ch2.generic;

public class MainGeneric {

	public static void main(String[] args) {
		ObjectPair x=new ObjectPair("ram", 4);
		String f=(String) x.getFirst();
		Integer s=(Integer)x.getSecond();
		System.out.println(f+"\t"+s);
		x=new ObjectPair(43.56, "Ramasd");
		Double f1=(Double) x.getFirst();
		String s1=(String)x.getSecond();
		
		System.out.println(f1+"\t"+s1);


	}

}
