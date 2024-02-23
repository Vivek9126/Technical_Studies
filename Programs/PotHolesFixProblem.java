
public class PotHolesFixProblem {
	
	//There is a machine that can fix all potholes along a road 3 units in length. 
	//A unit of Road will be represented with a period in a String.
	//For example, "..." = one section of road 3 units in length. Potholes are marked with an "X" in the road, 
	//and also count as a unit of length. The task is to take a road of length N and fix all potholes with the 
	//fewest possible sections repaired by the machine. This problem is concerned with performance over correctness.
	
	//Example 1: A road represented by ".X." would require 1 fix.
	//Example 2: A road represented by "..X...X" would require 2 fixes.
	//Example 3: A road represented by "XXX.XXXX" would require 3 fixes.
	
	//input:-   XXXX...X
	//output:-  3
	//
	//input:-   XXXX
	//output:-  2
	//
	//input:-   XX.XXX..
	//output:-  2
	
	// 3 units is considered as a section and if X is there it needs a fix. if . is there that unit is fixed.
	// Eg: X.. or ..X or XX. or ..X or .X. or .XX needs a fix and count is increased
	// Eg: ... no needs a fix
	
	public static int solution(String s) {
		  int holes = 0;
		  for (int i = 0; i < s.length(); i++) {
		    if (s.charAt(i) == 'X') {
		      holes++;
		      i += 2;
		    }
		  }
		  return holes;
		}
	
	public static void main(String[] args) {
		System.out.println(solution("XXXX...X"));
	}

}
