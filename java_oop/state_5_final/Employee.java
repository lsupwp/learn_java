// class อื่นๆไม่สามารถสือทอดคุณสมบัติของ class นี้ได้ (เป็นหมันไม่มีลูก)
final class Employee {
    // Attribute
    // privare => เข้าถึงได้แค่ภายใน class
    // public => ภายนอก class สามารถเข้าถึงได้
    private String id;
    private String name;
    private Double salary;

    // Static Attribute  => ไม่ต้องสร้าง Object เพื่อเข้าถึง เข้าถึงโดยการ <ClassName>.<StaticVariable||StaticFunction>
    static int minSalary = 12000;

    // Default Constructor => สร้างได้มากกว่า 1 อัน
    public Employee(){
        System.out.println("I'm Employee");
    }
    // Default Constructor => self.__init__() ใน python
    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    public void setID(String id){
        // this.<var> => <var> คือ attribute ภายนอก function | this.<var> == self.<var>(ใน python)
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
}
