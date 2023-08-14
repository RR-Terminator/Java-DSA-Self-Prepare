package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// LeetCode  Problem 1700
public class SandwichProblem {

    public static void main(String[] args) {

        int [] students = {1,1,1,0,0,1};

        int [] sandwiches = {1,0,0,0,1,1};

        System.out.println(countStudent(students,sandwiches));

    }

    public static int countStudents(int[] students, int[] sandwiches) {
        // Student Queue
        Queue<Integer> q1 = new LinkedList<>();

        for (int student: students ) {
            q1.add(student);
        }
        int rounds = 0;
        int index = 0;
        int canEat = 0 ;
        while(!q1.isEmpty()){

            if (rounds > q1.size()) {
                return q1.size();
            }
            if (q1.peek() == sandwiches[index]) {
                canEat++;
                q1.remove();
                index++;
                rounds = 0;
            }

            else {
                rounds++;
                q1.add(q1.remove());
            }
        }
        return 0;

    }

    public static int countStudent(int[] students, int[] sandwiches) {
        int [] count = {0,0};
        for(int std : students) count[std]++;
        for(int sand : sandwiches){
            if(count[sand] > 0) count[sand] --;
           else break;

        }
        return count[0]+count[1];
    }


}
