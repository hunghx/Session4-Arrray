import java.util.Date;
import java.util.Scanner;

public class Demo {
    int i;
    public Demo(String str){

    }
    public Demo(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char nhapvao =  sc.nextLine().charAt(0); //  hung => h
        String str = "convetbietnoi";
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (nhapvao == str.charAt(i)){
                count++;
            }
        }
        Date date =new Date();
        float f = 1.3455644675f;
        System.out.printf("ky tu %c xuat hien %-20d lan o trong chuoi %-50s ,date %-40s, so thuc : %-10.3f " ,nhapvao,count,str,date,f );
    }
    public void display(){
        this.i = 10;
        System.out.println("helo");
    }
     public static Scanner scanner(){
       return new Scanner(System.in);
    }

}
