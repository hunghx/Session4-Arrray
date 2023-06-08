import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Khai báo mảng
//        int[] arrInt = {1, 2, 3, 4};
//        int arrInt1[];
//        System.out.println("Mảng ban đầu =>>>" + Arrays.toString(arrInt));
//        test(arrInt); // gán giá trị của arrInt cho  tham số arr
//        System.out.println("Mảng sau khi thay đổi =>>>" + Arrays.toString(arrInt));
//        int[] arrInt2 = new int[5];
//        System.out.println("Các giá trị chưa khởi tạo của mảng ArrInt2 là " + Arrays.toString(arrInt2));
//        String arrStr[] = new String[10];
//        System.out.println("Các giá trị chưa khởi tạo của mảng ArrInt2 là " + Arrays.toString(arrStr));
//        //lấy ra phần tử mảng arr[index]
//        System.out.println("Phần tử có index =1 trong arrInt là " + arrInt[1]);
        // thay đổi giá trị của phần tử mảng
//        arrInt[2] = 100;
//        System.out.println("Phần tử có index = 2 trong arrInt là " + arrInt[2]);

        // duyệt mảng
        // fori // thay đổi giá trị mảng
//        for (int i = 0; i < arrInt.length; i++) {
//            int element = arrInt[i];
//            // làm việc với phần tử tại vị trí i
//            System.out.println(element
//            );
//        }
        // for each
//        for (int e : arrInt) {
//            System.out.println(e);
//        }
        // foreach
//        String[] arrString = {"banana","kandy","Thanh dragon"};
//        for (String str:arrString) {
//            System.out.println("Quả "+ str);
//        }
//        System.out.println("Dộ dài của mảng "+arrString.length);
//        System.out.println("Dộ dài của mảng "+arrInt2.length);
//        // index
//        arrString[1] ="Măng cụt";
//        System.out.println(arrString[1]);
//        // Phương thức mặc định
//        System.out.println(Math.pow(2,9));
//        System.out.println(Math.ceil(Math.random()*100));
//        // lớp Radom
//        int radom = new Random().nextInt(100);
//        System.out.println("Radom  "+ radom);
        // khác nhau giữa static và ko có static
//        Test t = new Test();
//        t.print();

        // gọi phương thức div
//        double result= div(8.5,0);
//        System.out.println("Kết quả của 8 cho 0 là "+ result);
        // {1,2,3,4,5,6,7,8,9}
        // chèn cố 10 vào giữa số 4 và 5 (index = 5)
//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int b = 10;
//        int index = 5;
//        int arrUpdate[] = new int[10];
//        insertArray(array, b, index, arrUpdate);
//        System.out.println("Array " + Arrays.toString(arrUpdate));
//        Demo.display();
//        Demo demo =new Demo();
//        Demo demo1 =new Demo("hùng");
//        demo.display();


        // Máy nhập
//        System.out.println("dòng 1");
//        Demo.scanner().nextLine();
//        System.out.println("dòng 2");
//        Demo.scanner().nextInt();
//        System.out.println("dòng 3");
//        Demo.scanner().nextLine();
//        System.out.println("dòng 4");
//        Demo.scanner().nextFloat();
//        System.out.println("dòng 5");
//        Demo.scanner().nextLine();
//        System.out.println("dòng 6");
//        Demo.scanner().nextInt();
        // mảng 2 chiều

        System.out.println("nhâp vào i và j");
        int r = Demo.scanner().nextInt();
        int c =Demo.scanner().nextInt();
        int[][] arr1 = new int[r][c];
//        System.out.println(arr1[2][1]);
        System.out.println(arr1.length);
        for (int i = 0; i < r  ; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = 10;
            }
        }

        for (int i = 0; i < r  ; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
        for (int i = 0; i < r  ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" "+arr1[i][j]+" ");
            }
            System.out.println();
        }
        // duyệt mảng
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j <8 ; j++) {
//
//            }
//        }

    }

    public static void test(int[] arr) {
        arr[1] = 10;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        } else {
            return a / b;
        }
    }

    // tạo phương thức chèn 1 số vào 1 vị trị trong 1 mảng
    public static void insertArray(int[] array, int value, int index, int[] arrUpdate) {
        for (int i = 0; i < arrUpdate.length; i++) {
            if (i < index) {
                arrUpdate[i] = array[i];
            } else if (i == index) {
                arrUpdate[i] = value;
            } else {
                arrUpdate[i] = array[i - 1];
            }
        }
    }

}
