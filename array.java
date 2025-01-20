class Student
{
    int rollno;
    int marks;
    String name;
}

public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Aaryan";
        s1.marks = 12;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Ram";
        s2.marks = 13;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Shyam";
        s3.marks = 14;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Naaam";
        s4.marks = 15;

        Student s5 = new Student();
        s5.rollno = 5;
        s5.name = "Dheeraj";
        s5.marks = 16;


        Student students[] = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for(int i = 0; i<students.length; i++)
        {
            System.out.println(students[i].name + "," + students[i].marks + "," + students[i].rollno);
        }


    }
}
