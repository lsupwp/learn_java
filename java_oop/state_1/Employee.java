class Employee{
    // Attribute
    // privare => เข้าถึงได้แค่ภายใน class
    // public => ภายนอก class สามารถเข้าถึงได้
    private String id;
    private String name;
    private Double salary;
    
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