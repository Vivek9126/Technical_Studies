//Find the numbers between Ranges 1-10,11-20,21-30,31-40....

public class NumberOccurencesInArrayRange {

	public static void main(String[] args) {
		
        int[] inputArray = {1, 5, 6, 10, 17, 19, 25, 30, 75, 100};
        Map<String, Integer> outputMap = new LinkedHashMap<>();

        //Java7
        for (int a : inputArray) {
            int range = (a - 1) / 10 + 1;
            String key = "between " + ((range - 1) * 10 + 1) + " to " + (range * 10);
            outputMap.put(key, outputMap.getOrDefault(key, 0) + 1);
        }

        System.out.println("Output--->" + outputMap);
        
        
        //Java8
        Arrays.stream(inputArray)
        .mapToObj(a -> {
            int range = (a - 1) / 10 + 1;
            return "between " + ((range - 1) * 10 + 1) + " to " + (range * 10);
        })
        .forEach(key -> outputMap.put(key, outputMap.getOrDefault(key, 0) + 1));

        System.out.println("Output--->" + outputMap);
	}

}

Input: {1, 5, 6, 10, 17, 19, 25, 30, 75, 100}
Output: {between 1 to 10=4, between 11 to 20=2, between 21 to 30=2, between 71 to 80=1, between 91 to 100=1}


