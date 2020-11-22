
class Student{

    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;

    }
}

public class ObjectArray{

    public static void main(String[] args){

        Student[] students = new Student[5];

        students[0] = new Student("vinay",20); 
        students[1] = new Student("will",38); 
        students[2] = new Student("mike",23); 
        students[3] = new Student("vinayd",89); 
        students[4] = new Student("yd",8); 

        for(int i=0; i<students.length; i++){
            System.out.println("name: " + students[i].name + "  age: " + students[i].age);
        }


        
    }
}
