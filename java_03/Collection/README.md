Example Collection
    ArrayList => จัดการข้อมูลแบบ Array ในรูปแบบของ Dynamic Size
    HashSet => จัดการข้อมูลไม่ซ้ำกัน
    HashMap => จัดการความสัมพันธ์ของข้อมูล

การใช้งาน Collection
    import java.util.ชื่อคลาส;

    inport java.util.*;

methods for ArrayList
    add(element) => เพิ่มสมาชิกใหม่ 1 รายการ
    add(index, element) => เพิ่มสมาชิกใหม่ 1 รายการไปยัง index ที่กำหนด
    addAll([element]) => เพิ่มสมาชิกใหม่หลายรายการ
    addAll(index, [element]) => เพิ่มสมาชิกใหม่หลายรายการไปยัง index ที่กำหนด
    size() => ดูจำนวนสมาชิกในArrayList
    get(index) => ดึงข้อมูลสมาชิกใน ArrayList จาก index ที่กำหนด
    set(index, element) => เปลี่ยนแปลงข้อมูลสมาชิกใน ArrayList จาก index ที่กำหนด
    contains(element) => ตรวจสอบว่ามีสมาชิกใน ArrayList หรือไม่
    clear() => ลบสมาชิกทั้งหมดออกจาก ArrayList
    remove(element) => ลบสมาชิกที่ระบุออกจาก ArrayList
    remove(index) => ลบสมาชิกตาม index ที่ระบุออกจาก ArrayList
    indexOf(element) => ตรวจสอบสมาชิกใน ArrayList

HashSet
    มีลักษณะการทำงานคล้าย ArrayList โดยข้อมูลหรือสมาชิกที่เก็บใน HashSet นั้นต้องมี "ค่าไม่ซ้ำกัน" แต่สมาชิก HashSet นั้นจะ "ไม่มีการเรียงลำดับ" ที่ถูกเพิ่มเข้ามา

    การสร้าง HashSet
        import java.util.HashSet;

        HashSet<Type_Class_Name> <var_name> = new HashSet<>();

    methods
        add(element) => เพิ่มสมาชิกใหม่ 1 รายการ
        size() => หาจำนวนสมาชิกทั้งหมดใน HashSet
        contains(element) => ตรวจสอบว่ามีสมาชิกใน HashSet หรือไม่
        clear() => ลบข้อมูลทั้งหมดออกจาก HashSet
        remove(element) => ลบสมาชิกที่ระบุออกจาก HashSet

LinkedHashSet & TreeSet
    LinkedHashSet มีลักษณะคล้ายกับ HashSet แต่สมาชิกจะเรียงลำดับที่ถูกเพิ่มเข้ามา

    TreeSet มีลักษณะคล้ายกับ HashSet แต่สมาชิกขะเรียงลำดับจากมากไปน้อย , ตามลำดับตัวอักษร หรือ ลำดับอื่นๆตามที่กำหนด

HashMap
    เป็นรูปแบบการเก็บความสัมพันธ์ของข้อมูลในลักษณะของ key และ value กล่าวคือ จะใช้ key เป็น index ในการเข้าถึงข้อมูล(value) แต่ละตัวซึ่งค่า key นั้นต้องไม่ซ้ำกัน

    การสร้าง HashMap
        import java.util.HashMap;

        HashMap<key_type, value_type> ชื่อตัวแปร = new HashMap<>();
    
    Methods
        put(key, element) => เพิ่มสมาชิกใหม่
        get(kay) => ดึงสมาชิกจากตีย์ที่กำหนด
        size() => จำนวนสมาชิกใน HashMap
        clear() => ลบสมาชิกทั้งหมดออกจาก HashMap
        remove(key) => ลบสมาชิกตามคีย์ที่ระบุออกจาก HashMap
        containsKey(key) => ตรวจสอบว่ามีคีย์ใน HashMap หรือไม่
        cintainsValue(value) => ตรวจสอบว่ามีค่าข้อมูลใน HashMap หรือไม่