package biWeekContest;

public class OneFiveTwo {
        public int uniqueThreeDigitEvenNumbers(int[] digits) {
            boolean [] visited = new boolean[1000];
            int count = 0;
            int n = digits.length;

            for(int first = 0; first < n; first++) {
                if(digits[first] == 0) continue;
                for(int second = 0; second < n; second++) {
                    if(first == second) continue;
                    for(int third = 0; third < n; third++) {
                        if(first == third || second == third) continue;
                        if(digits[third] % 2 == 0) {
                            int num = digits[first]*100 + digits[second]*10 + digits[third];
                            if(!visited[num]){
                                visited[num] = true;
                                count++;
                            }
                        }
                    }
                }
            }

            return count;
        }
}
