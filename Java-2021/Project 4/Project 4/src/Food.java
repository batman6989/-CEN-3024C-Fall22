
public class Food {
private static boolean val = false; 
public Food() {}
synchronized public int eat (String o) {
	System.out.println(o+" has started to eat");
	val = true;
	try {
		Thread.sleep((long)(150*Math.random()));
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println(o+" is done Eating");
	}
	return 0;
}

}
