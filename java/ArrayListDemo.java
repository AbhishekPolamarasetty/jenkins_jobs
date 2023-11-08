package collectiondemos;
 
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		//ArrayList<Integer> al = new ArrayList<Integer>();
//		List al = new ArrayList();
		
        al.add("e");
        al.add(24);
        al.add(42.24);
        al.add(true);
//        al.remove(1); 
        al.add(2,35);
//        al.get(3);
        
        System.out.println(al); //[e, 24, 42.24, true]
        System.out.println(al.size( ));
        System.out.println(al.get(3));
	}
	

}
