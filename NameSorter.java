public class NameSorter {
    public static void main(String[] args) {
        String names = "James, Lars, Kirk, Mustaine, Ringo, Grohl";
        String[] namesArray = names.split(", "); // split the string by ", "

        // This is a basic implementation of the bubble sort algorithm
        // The outer loop, which starts at index 0 and goes up to the length of the
        // array,
        // is used to iterate through each element of the array.
        for (int i = 0; i < namesArray.length; i++) {
            // The inner loop, which starts at the index following the outer loop's current
            // index
            // and goes up to the length of the array, is used to compare each element with
            // the next one.
            for (int j = i + 1; j < namesArray.length; j++) {
                // On each iteration of the inner loop, the `compareTo()` method is used to
                // compare the current element (`namesArray[i]`) with the next element
                // (`namesArray[j]`).
                if (namesArray[i].compareTo(namesArray[j]) > 0) {
                    // If the current element is lexicographically greater than the next element,
                    // the elements are swapped using a temporary variable `temp`.
                    String temp = namesArray[i];
                    namesArray[i] = namesArray[j];
                    namesArray[j] = temp;
                }
            }
        }

        for (String loopNames : namesArray) {
            System.out.println(loopNames);
        }
    }
}