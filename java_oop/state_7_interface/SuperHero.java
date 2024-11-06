abstract public class SuperHero {
    
    private String name;
    private String age;
    private String job;

    public void set_name(String name){
        this.name = name;
    }
    public void set_age(String age){
        this.age = age;
    }
    public void display_hero(){
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age);
    }

    public abstract void skill(String skill);
}
