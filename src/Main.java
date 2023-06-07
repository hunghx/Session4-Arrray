import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Khai báo mảng
        int[] arrInt = {1, 2, 3, 4};
        int arrInt1[];
        System.out.println("Mảng ban đầu =>>>" + Arrays.toString(arrInt));
//        test(arrInt); // gán giá trị của arrInt cho  tham số arr
        System.out.println("Mảng sau khi thay đổi =>>>" + Arrays.toString(arrInt));
        int[] arrInt2 = new int[5];
        System.out.println("Các giá trị chưa khởi tạo của mảng ArrInt2 là " + Arrays.toString(arrInt2));
        String arrStr[] = new String[10];
        System.out.println("Các giá trị chưa khởi tạo của mảng ArrInt2 là " + Arrays.toString(arrStr));
        //lấy ra phần tử mảng arr[index]
        System.out.println("Phần tử có index =1 trong arrInt là " + arrInt[1]);
        // thay đổi giá trị của phần tử mảng
        arrInt[2] = 100;
        System.out.println("Phần tử có index = 2 trong arrInt là " + arrInt[2]);

        // duyệt mảng
        // fori
        for (int i = 0; i < arrInt.length; i++) {
            int element = arrInt[i];
            // làm việc với phần tử tại vị trí i
            System.out.println(element
            );
        }
        // for each
        for (int e : arrInt) {
            System.out.println(e);
        }
        // khác nhau giữa static và ko có static
//        Test t = new Test();
//        t.print();

        // gọi phương thức div
//        double result= div(8.5,0);
//        System.out.println("Kết quả của 8 cho 0 là "+ result);
        // {1,2,3,4,5,6,7,8,9}
        // chèn cố 10 vào giữa số 4 và 5 (index = 5)
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b = 10;
        int index = 5;
        int arrUpdate[] = new int[10];
        insertArray(array, b, index, arrUpdate);
        System.out.println("Array " + Arrays.toString(arrUpdate));
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
