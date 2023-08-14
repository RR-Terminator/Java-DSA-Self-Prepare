package HeapsAndPQ;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {

    public static class  Student implements  Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public  int compareTo(Student s2){
            return  this.rank - s2.rank;
        }

    }


    public static void main(String[] args) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(3);
//        pq.add(4);
//        pq.add(2);
//        pq.add(1);
//
//        while(!pq.isEmpty()){
//            System.out.print(pq.remove() + " ");
//        }


        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("R",1));
        pq.add(new Student("D",30));
        pq.add(new Student("M", 2));
        pq.add(new Student("A",20));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " => " + pq.peek().rank);
            pq.remove();
        }



    }
}
