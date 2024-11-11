package Array;

 class Student{
     public String name;
     public int age;
     Student(String name, int age){
         this.name = name;
         this.age = age;
     }

}
public class Array_of_Object {
    public static void main(String[] args) {
        Student [] arr;
        arr = new Student[5];
        arr[0] = new Student("Narendar",22);
        arr[1] = new Student("Shreyash",24);
        arr[2] = new Student("Suneel",21);
        arr[3] = new Student("Shuhesh",20);
        arr[4] = new Student("Vinayak",23);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at"+" "+i+": "+arr[i].name+"   "+arr[i].age);
        }
    }
}
