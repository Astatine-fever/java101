package Chapter12_THIS;

class this_ex3 {
    int rollno;
    String name, course;
    float fee;

    this_ex3(int rollno, String name, String course) // parameterised constructor 1
    {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    this_ex3(int rollno, String name, String course, float fee) // parameterised constructor 2
    {
        this(rollno, name, course);// reusing parmeterised constructor1
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

class testing_this_ex3 {
    public static void main(String args[]) {
        this_ex3 s1 = new this_ex3(111, "priya", "java");
        this_ex3 s2 = new this_ex3(112, "swetha", "java", 6000f);
        s1.display();
        s2.display();
    }
}