public class Thor extends SuperHero implements SkillHero, Nation {
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
