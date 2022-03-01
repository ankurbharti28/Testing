import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java_Streams {
	
	
	// 1. Program to count the number of names starting with alphabet A in list
	
	// Program with regular java code
	
//	public void regular()
//	{
//		ArrayList<String> names=new ArrayList<String>();
//		names.add("Ankur");
//		names.add("Bharti");
//		names.add("Bindu");
//		names.add("Shanu");
//		names.add("Aiiisss");
//		
//		int count=0;
//		
//		for(int i=0;i<names.size();i++)
//		{
//			String actual=names.get(i);	
//			if(actual.startsWith("A"))
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//	}

		
		// Program with using JavaStreams
	
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ankur");
		names.add("Bharti");
		names.add("Bindu");
		names.add("Shanu");
		names.add("Aiiisss");
//	
		// Method 1
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		// Method 2
		Long d=Stream.of("Ankur","Bharti","Bindu","Shanu","Aiiisss").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
	// Print all the name of Arraylist which are having length >4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
	// Print first name from the names array list which is having length >4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	//Print names which have last letter as "a" and convert them in Upercase
	// We will use Map function for this
	
    public void streamMap()
    {
    	Stream.of("Ankur","Aniketa","ALoka","Bindu").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    	
    	
    	// Print names which have first letter as "A" with uppercase and sorted
        // Taking a new array and Convert that array in array list and then use that array list to convert in stream
    	List<String>names=Arrays.asList("Ankur","Aniketa","ALoka","Bindu");
    	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }
	
	}

