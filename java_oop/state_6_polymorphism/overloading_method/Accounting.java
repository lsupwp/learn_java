class Accounting extends Employee {

    public String skill = "Manage Money";
    
    public Accounting(String name, double salary){
        // เรียกใช้ constructure ของ class แม่
        super(name, salary);
        
        System.out.println("I'm accounting");
    }
}
