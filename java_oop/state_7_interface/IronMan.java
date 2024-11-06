// extends สืบทอกได้แค่ class เดียว (มีแม่ได้แค่ 1 คน)
// ต้องไปเปลี่ยน class SkillHero ให้เป็น interface และใช้ implements ในการดึงเข้ามาทำงาน
class IronMan extends SuperHero implements SkillHero, Nation {
    
    public void skill(String skill){
        System.out.println("Skill = "+skill);
    }
    public void moving(String moving){
        System.out.println("Move = "+moving);
    };
    public void weapon(String weapon){
        System.out.println("Weapon = "+weapon);
    };
    public void jumping(String jump){
        System.out.println("Jump = "+jump);
    };
    public void set_nation(String nation){
        System.out.println("Nation = "+nation);
    }
}
