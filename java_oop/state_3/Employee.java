public class Employee {
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

    }
    public Employee(String id){
        this.id = id;
    }
    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }
    // Default Constructor => self.__init__() ใน python
    public Employee(String id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
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
        System.out.println("ID = "+this.id);
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
