enum Grade {
    A(4.0, "Genius"),
    B(3.0, "Vary Good"),
    C(2.0, "Good"),
    D(1.0, "not bad"),
    F(0.0, "Fail");
    private Grade(double p, String comment){
        this.point = p;
        this.description = comment;
    };
    public final double point;
    public final String description;
};
public class BasicEnum3 {
    public static void main(String[] args) {
        Grade myGrade = Grade.B;
        System.out.println("Grade = "+myGrade+" , "+myGrade.point+" | "+myGrade.description);
    }    
}
