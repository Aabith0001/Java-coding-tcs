package practiseCode;
/* id - int
company - String
balance - int
ratePerSecond - double
circle - String

1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4
*/ 
import java.util.*;
class Sim
{
	private int id;
	private String company;
	private int balance;
	private double ratepersecond;
	private  String circle;
	


public Sim(int id, String company, int balance, double ratepersecond, String circle) {
		this.id = id;
		this.company = company;
		this.balance = balance;
		this.ratepersecond = ratepersecond;
		this.circle = circle;
	}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public int getId() {
	return id;
}

public String getCompany() {
	return company;
}

public double getRatepersecond() {
	return ratepersecond;
}

public String getCircle() {
	return circle;
}

	
}
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
Sim[]sim=new Sim[4];
for(int i=0;i<sim.length;i++)
{
	int a=sc.nextInt();sc.nextLine();
	String b=sc.nextLine();
	int c=sc.nextInt();sc.nextLine();
	double d=sc.nextDouble();sc.nextLine();
	String e=sc.nextLine();
	sim[i]=new Sim(a,b,c,d,e);
}
String searchcircle=sc.nextLine();
double searchrate=sc.nextDouble();sc.nextLine();

sc.close();
//int []ans1=matchandsort(sim,searchcircle,searchrate);
List<Integer>ans1=matchandsort(sim,searchcircle,searchrate);
StringBuffer sb=new StringBuffer();
for(Integer i :ans1)
{
	sb.append(ans1.get(i-1));
}
sb.reverse();
System.out.println(sb);

}
	public static List<Integer> matchandsort(Sim[]sim,String sc,double sr)
	{
		//int id[]=new int[0];
		List<Integer>id=new ArrayList<>();
		for(int i=0;i<sim.length;i++)
		{
			if(sim[i].getCircle().equalsIgnoreCase(sc))
			{
				if(sr>sim[i].getRatepersecond())
				{
					//id=Arrays.copyOf(id, id.length+1);
					//id[id.length-1]=sim[i].getId();
					id.add(sim[i].getId());
					
				}
			}
		}
		if(!id.isEmpty())
		{
			return id;
		}
		
		return null;
		
	}
}
