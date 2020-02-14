

import java.util.Scanner;

public class showPictures {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1.ve hinh chu nhat");
        System.out.println("2.vetam giac vuong duoi");
        System.out.println("3.vetam giac vuong tren");
        System.out.println("4.ve tam giac can");
        System.out.println("5.thoat");
        while (true) {
            int luachon = input.nextInt();
            switch (luachon) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle1();
                    break;
                case 3:
                    printSquareTriangle2();
                    break;
                case 4:
                    printIsoscelesTriangle();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("k co lua chon");


            }
        }
    }
    private static void printRectangle(){
        for (int i =0;i<=4;i++){
            for (int j=0;j<=6;j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    private static void  printSquareTriangle1(){
        for (int i=0;i<=4;i++){
            for (int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void printSquareTriangle2(){
        for (int i=7;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

      private static void printIsoscelesTriangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (6 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*i + 1; j++)

                System.out.print("*");
                System.out.println();


        }

    }

}


