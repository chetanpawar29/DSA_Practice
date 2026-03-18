// User function Template for Java

class Sol {
    int getCount(String S, int N) {
        // your code here
        int[] count = new int[256]; // ASCII

        // Step 1: Count group occurrences
        for(int i = 0; i < S.length(); i++) {

            if(i == 0 || S.charAt(i) != S.charAt(i - 1)) {
                count[S.charAt(i)]++;
            }
        }

        // Step 2: Count characters with N occurrences
        int result = 0;

        for(int i = 0; i < 256; i++) {
            if(count[i] == N) {
                result++;
            }
        }

        return result;
    }
}