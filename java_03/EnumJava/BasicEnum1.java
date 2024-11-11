/*
    enum <EnumName> {   // การกำหนดตัวเลือก 0 และข้อมูลไม่สามารถคำนวณได้
        Value_1,
        Value_2,
        ...,
        Value_n
    }
*/
enum Grade {
    A, B, C, D, F
};
enum Gender{
    Female, Male
}
enum Season{
    Summer, Rainy, Winter
}

public class BasicEnum1 {

    public static void main(String[] args) {
        Grade myGrade = Grade.A;
        System.out.println(myGrade);
        // See all value in enum
        // for (Grade g:Grade.values()){
        //     System.out.println(g);
        // }
        System.out.println(Gender.Female);
        Season myFavorite = Season.Winter;
        System.out.println(myFavorite);
    }
}
