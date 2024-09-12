package BroJava;

class arrayOfObjects {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ashwath", 1);
        students[1] = new Student("Malini", 2);
        students[2] = new Student("Anush    ", 3);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name + " Roll No: " + students[i].roll_no);
        }
    }
    
}

class Student{
    String name;
    int roll_no;
    
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}