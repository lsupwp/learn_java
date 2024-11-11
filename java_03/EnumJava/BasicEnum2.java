enum Grade {
    A, B, C, D, F;
    double getPoint(){
        return switch (this) {
            case A -> 4.0;
            case B -> 3.0;
            case C -> 2.0;
            case D -> 1.0;
            default -> 0.0;
        };
    };
};
public class BasicEnum2 {
    public static void main(String[] args) {
        Grade myGrade = Grade.B;
        System.out.println("Grade = "+myGrade+" , "+myGrade.getPoint());
    }    
}
