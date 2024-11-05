// extends Employee ดึงคลาสแม่เข้ามา (เรียกใช้งานจาก function จาก class Employee ได้)
class Programer extends Employee{

    public String skill = "JAVA C#";

    public Programer(String name, double salary){
        // เรียกใช้ constructure ของ class แม่
        super(name, salary);
        
        System.out.println("I'm Programer");
    }
}