package Arrays;

public class frogsAndJumps {
    public static void main(String[] args) {
        int [] arr = {1,3,5};
        System.out.println(unvisitedLeaves(arr.length,6,arr));
    }


    public static int unvisitedLeaves(int N, int leaves, int [] frogs) {

        boolean [] visited = new boolean[leaves+1];
        visited[0] = true;
        for (int i = 0; i < N; i++) {
            int strength = frogs[i];
            check(visited,strength,leaves);
        }
        int count = 0 ;
        for (boolean b : visited) {
            if (!b) {
                count++;
            }
        }
         return count;
    }

    public static void check(boolean[] visited, int strength, int leaves){


        for (int i = strength; i <= leaves; i += strength ) {
            if (!visited[i]) {
                visited[i] = true;
            }
        }
    }



//    Set<Integer> visitedLeaves = new HashSet<>();
//   for(int i=0;i<N;i++)
//    {
//        int pos=frogs[i];
//        if(pos<=leaves && !visitedLeaves.contains(pos)){
//            int temp=pos;
//            while(temp<=leaves)
//            {
//                visitedLeaves.add(temp);
//                temp+=pos;
//            }
//        }
//    }
//   return leaves - visitedLeaves.size();

}
