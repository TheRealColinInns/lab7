public class Judge {
    public int findJudge (int N, int [][] trust){
        //create a array to store the amount of people that trust each person, represented by the index
        int [] citizens = new int[N+1];
        //add one at the index with the number that is trusted for each trusted citizen
        for (int i = 0; i < trust.length; i++) {
            citizens[trust[i][1]] += 1;
            
        }
        //check to see which index has a number equivelent to everyone in the town but themselves
        for (int i = 0; i<citizens.length; i++) {
            if(citizens[i]==N-1){
                return i;
            }
        }
        
        
        return -1;

    }
    public static void main(String[] args){
        Judge tester = new Judge();
        int [][] trust ={{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int N = 4;
        System.out.println(tester.findJudge(N, trust));
    }
}
