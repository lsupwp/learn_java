// abstract class จะต้องมี abstract method อย่างน้อย 1 ตัว
abstract class Student {
    private String id;
    private String name;

    // เขียนสลับกับ public ได้
    abstract public void register();
    public abstract void pre_test();
    public abstract void post_test();

    public void set_id(String id){
        this.id = id;
    }

}
