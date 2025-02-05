abstract class Employee {
    // Attribute
    private String id;
    private String name;
    private Double salary;

    static int minSalary = 12000;

    public Employee(){
        System.out.println("I'm Employee");
    }
    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+this.salary);
    }

    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }
    
    // abstract method ต้องระบุ abstract ให้กับ class ด้วย
    // ถ้า class เป็น abstract method ใน class นั้นๆจะต้องเป็น abstract method ด้วยอย่างน้อย 1 ตัว
    // ถ้ามี class ลูกจะต้องกำหนด method ที่เป็น abstract method จาก class แม่ใน class ลูกด้วย
    public abstract void bonus();
}
