// extends Employee ดึงคลาสแม่เข้ามา (เรียกใช้งานจาก function จาก class Employee ได้)
class Programer extends Employee{

    // Overloading Method
    public void skill(){
        System.out.println("No skill");
    }
    // public void skill(String language){
    //     System.out.println("Skill = "+language);
    // }
    public void skill(String...language){
        String text = "";
        for (String s:language){
            text+=(s+", ");
        }
        System.out.println("Skill = "+text);
    }
}