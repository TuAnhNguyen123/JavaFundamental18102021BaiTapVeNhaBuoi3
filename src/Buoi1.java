import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Buoi1 {
    public static void main(String[] args) {
       /* {
//        String name = "Nguyễn Anh Tú";
//        int age = 24;
//        String address = "Quận 1";
//        float height = 1.75f;
//        boolean isMale = true;
//        System.out.print("Tên: " + name + " Tuổi: "+ age + " Chiều cao: "+ height+ " Giới tính: "+ isMale);
//       System.out.println(name +"\n"+ age+"\n"+address+"\n"+isMale +"\n" + height );}*/
        //Toán tử
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
        //Do you 18+
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
        //Tax
      /*  int total = 100000;
        if (total>0) {
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
    }*/
        /*
        String [] arrNames = {"Teo","Ti","Tun"};
        System.out.println(arrNames[0]);
        System.out.println(arrNames.length);
        arrNames[0] = "Tuan";
        System.out.println(arrNames[0]);
        // vòng lặp
        for(int i =0; i< arrNames.length;i++){
            System.out.println(i);
        }*/
      /* for(int i = 2; i<=100;i+=2){
             System.out.println(i);
            }*/
          //Chi in ra so le
      /*for(int i = 1; i<=100;i+=2){
            System.out.println(i);
        }
        // Chi in ra so chia 3 du 1
        for(int i = 1; i<=100;i+=3){
            System.out.println(i);
        }*/
        //BMI
      /*  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height: ");
        float height = scanner.nextInt();
        System.out.println("Enter your weight: ");
        float weight = scanner.nextInt();
        if (ChieuCao <= 0 && CanNang <= 0) {
            System.out.println("Error!!! ");
        } else {
            float BMI = CanNang / (ChieuCao * ChieuCao);
            System.out.println("BMI của bạn là : " + BMI);
            if (BMI < 18.5) {
                System.out.println("Thiếu cân");
            } else if (BMI > 25) {
                System.out.println("Thừa cân");
            } else {
                System.out.println("Bình thường");
            }
        }
        scanner.close();
    }*/
        //Kiễm tra số nguyên tố
       /* {
            int temp = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            if (number < 2) {
                System.out.println("Your number is not Prime!! ");
            } else {
                for (int i = 2; i <= sqrt(number); i++) {
                    if (number % i == 0) {
                        temp++;
                    }
                }
                if (temp == 0) {
                    System.out.println("Your number is Prime!! ");
                } else {
                    System.out.println("Your number is not Prime!! ");
                }
            }
        }*/
       /* int total = Sum(5,10);
        System.out.println(total);*/
    }
       /* public static int Sum(int a, int b){
            return a+b;
        }*/


        }



