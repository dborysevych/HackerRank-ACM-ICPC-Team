class Result {

    /*
     * Complete the 'acmTeam' function below.
     * Solution for ACM ICPC Team problem from HackerRank
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
    int maxKnown = -1;
    int countMaxKnown = 0;
    int [][] coincidenceArr = new int[topic.size()][topic.size()];
    
     
    for(int i = 0; i < topic.size() - 1;i++) {
        String topic1 = topic.get(i); 
        
        for(int j = i + 1; j  < topic.size();j++) {
            String topic2 = topic.get(j);
            
            coincidenceArr[i][j] = count1(topic1, topic2);
            maxKnown = Math.max(maxKnown, coincidenceArr[i][j]);
            
        }

    }
    
    
    
    for(int i = 0; i < topic.size();i++) {
       
        for(int j = 0; j  < topic.size();j++) {
            if(coincidenceArr[i][j] == maxKnown)
                countMaxKnown++;   
        }
    }
    
    
    return Arrays.asList(maxKnown, countMaxKnown);
    }
    
    
    public static int count1(String topic1, String topic2) {
        int count = 0;
        
        for(int i = 0; i < topic1.length(); i++) {
            if(topic1.charAt(i) == '1' || topic2.charAt(i) == '1')
                count++;
        }
        
        return count;
    }
    
}
