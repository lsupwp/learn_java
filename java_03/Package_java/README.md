Compile
    javac -d bin src/learningjavabasic/Program.java src/mypackage/MyClass.java
    java -cp bin learningjavabasic.Program

    javac -d bin src/Main_JV/Program.java src/mypackage/Myclass.java src/utillity/Calculator.java

Package
    สิ่งที่ช่วยให้ผู้พัฒนาโปรแกรมสามารถจัดการ class และ interface ออกเป็นกลุ่มการทำงานแต่ละส่วนได้ ต้วยสิธีการแยกไฟล์ออกเป็นหมวดหมู่ต่างๆ ตามรูปแบบการทำงาน

    ส่งผลใหเโค๊ดมีความเป็นระเบียบและนำกลับมาใช้งานใหมม่ได้ง่ายและสดวกมากยิ่งขึ้น

    การนำคลาสมาใส่ในแพ็กเกจ
        package ชื่อแพ็กเกจ;
    แพ็กเกจย่อย
        package ชื่อแพ็กเกจหลัก.ชื่อแพ็กเกจย่อย;
    การอ้างอิงคลาสในแพ็กเกจ
        ชื่อแพ็กเกจ.ชื่อคลาส;

    การ import คลาสมาใส่ในแพ็กเกจอื่นๆ
        import package_name.class_name;
        หมายถึง import แฉพาะคลาสที่สนใจใน package

        import pack_age.*;
        หมายถึง import ทุกคลาสที่อยู่ใน package