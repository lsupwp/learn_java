class Accounting extends Employee {

    public String skill = "Manage Money";
    
    // overkiading method
    public Accounting(){
        
    }
    public Accounting(String name, double salary){
        // เรียกใช้ constructure ของ class แม่
        super(name, salary);
        
        System.out.println("I'm accounting");
    }

    public void bonus(){

    }
}
