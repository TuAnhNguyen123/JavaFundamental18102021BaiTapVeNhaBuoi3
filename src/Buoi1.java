import java.util.function.IntToDoubleFunction;

public class Buoi1 {
    public static void main(String[] args) {
//        String name = "Nguyễn Anh Tú";
//        int age = 24;
//        String address = "Quận 1";
//        float height = 1.75f;
//        boolean isMale = true;
//        System.out.print("Tên: " + name + " Tuổi: "+ age + " Chiều cao: "+ height+ " Giới tính: "+ isMale);
//       System.out.println(name +"\n"+ age+"\n"+address+"\n"+isMale +"\n" + height );
        /*int a = 5;
        int b=6;
        int ketQua = a++ - --b + --b - a++ + b-- -a-- - b++ - --a;

        //5 - --b + --b - a++ + b-- -a-- - b++ - --a; a = 6; b = 6
        //5 - 5 + --b - a++ + b-- -a-- - b++ - --a; a = 6; b = 5
        //5 - 5 + 4 - a++ + b-- -a-- - b++ - --a; a = 6; b = 4
        //5 - 5 + 4 - 6 + b-- -a-- - b++ - --a; a = 7; b = 4
        //5 - 5 + 4 - 6 + 4 -a-- - b++ - --a; a = 7; b = 3
        //5 - 5 + 4 - 6 + 4 -7 - b++ - --a; a = 6; b = 3
        //5 - 5 + 4 - 6 + 4 -7 - 3 - --a; a = 6; b = 4
        //5 - 5 + 4 - 6 + 4 -7 - 3 -5; a = 5; b = 4
        //int x =  5-5+4-6+4-7-3-5 = -13; a = 5; b = 4
        System.out.println(ketQua);//-13
        System.out.println(a);
        System.out.println(b);

        int ketQua2 = ++a - --b - --a -b-- + a-- +b-- - b++;*/
        //             6 - 5  - 5 - 5 + 5 + 4 - 3
        //b = 4; a = 4
       /* int age = 18;
        if(age <18){
            System.out.println("Dưới vị thành niên");
        }else{
            System.out.println("Trên vị thành niên");
        }
        }*/
      /*  int a = 5;
        int b = 6;
        if(a-b >0){
            System.out.println(1);
        }else if(a-b <0 ){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }*/
        int total = 100000;
        if (total>) {
            if (total > 100000) {
                total = (int) (total * 0.9);
                System.out.println("Bạn được giảm 10%, tiền cần thanh toán: " + total);
            } else if (total > 500000) {
                total = total * 80 / 100;
                System.out.println("Bạn được giảm 20%, tiền cần thanh toán: " + total);
            } else if (200000 < total && total < 500000) {
                total = total * 85 / 100;
                System.out.println("Bạn được giảm 15%, tiền cần thanh toán: " + total);
            } else {
                System.out.println("Bạn được giảm 0%, tiền cần thanh toán: " + total);
            }
        }else{
            System.out.println("Error!!");
        }
    }
}

