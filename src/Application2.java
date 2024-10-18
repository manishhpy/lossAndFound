import java.util.HashSet;
import java.util.Set;

//import java.util.StringJoiner;

public class Application2 {

	public static void main(String[] args) {
//		StringJoiner sj1 = new StringJoiner(",");
//		sj1.add("A").add("B").add("C");
//		System.out.println(sj1);
//		
//		StringJoiner sj2 = new StringJoiner(";");
//		sj2.add("p").add("Q");
//		System.out.println(sj2);
//		sj1.merge(sj2);
//		System.out.println(sj1);
		int arr1[] = {10,80,80,10,15,2,35,60};
		int arr2[] = {35,80,60,20,75};
		printIntersection(arr1,arr2);
//		unionArrays(arr1,arr2);

	}
//	static void unionArrays(int[] arr1,int[] arr2) {
//	Set<Integer> set = new HashSet<>();
//	for(int i = 0;i < arr1.length;i++) {
//		set.add(arr1[i]);
//	}
//	for(int i = 0;i < arr2.length;i++) {
//		set.add(arr2[i]);
//	}
//	System.out.println("After Removing Dups "+set);
// }

	static void printIntersection(int[] arr1,int[] arr2) {
		Set<Integer> s = new HashSet<>();
		
		for(int i = 0;i < arr1.length; i++) {
			s.add(arr1[i]);
			
		}
		
		for(int i = 0; i < arr2.length;i++) {
			if(s.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		
	}
}	