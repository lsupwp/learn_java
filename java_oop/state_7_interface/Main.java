public class Main {
    public static void main(String[] args) {
        IronMan h1 = new IronMan();
        h1.set_name("Tony");
        h1.set_age("40");
        h1.display_hero();
        h1.skill("Shooting");

        Thor h2 = new Thor();
        h2.set_name("Thor");
        h2.set_age("1000");
        h2.display_hero();
        h2.weapon("Hamer");
        h2.moving("20");
        // h2.jumping("100");
        h2.skill("Tunder");
    }
}
