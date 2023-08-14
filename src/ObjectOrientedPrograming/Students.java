package ObjectOrientedPrograming;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {

       // Student [] students = new Student[5];
       // System.out.println(Arrays.toString(students));

//        Student Rahul;
//       // System.out.println(Rahul.rollNo);
//        Rahul =new Student();
//        Rahul.rollNo =  58;
//        Rahul.name = "RahulReddy";
//        // Rahul.Marks = 8.5f;
//        System.out.println(Rahul.rollNo);
//        System.out.println(Rahul.name);
//        System.out.println(Rahul.Marks);
//
//        Student s1 = new Student(59,"Rahul Kumar",88);
//        System.out.println(s1.rollNo);
//        Student s2 = new Student();
//        System.out.println(s2.rollNo);
//
//        Student random = s1;
//        random.name = "Abc";
//        System.out.println(s1.name);

        Test test = new Test();
        test.fun();
        System.out.println(Test.a + Test.b);



    }
}
class Student{
    int rollNo;
    String name;
    float Marks = 8;

//    Student(){
//        this.rollNo =  58;
//        this.name = " Rahul Reddy";
//        this.Marks = 88.5f;
//    }
    Student(){
        this(12,"XYZ",100);
    }

    Student(int rno, String name, float marks){
        this.rollNo = rno;
        this.name =name;
        this.Marks = marks;
    }



}
class  Test{
    static int a =4;
    static int b;
    void fun(){
        b = a*10;
    }
}
