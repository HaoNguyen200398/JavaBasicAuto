public class Bien {

    String address = "Vĩnh Phúc";// biến toàn cục ( chỉ trong class ) biến dùng trong nhiều hàm
    static String Age= "21";
//hàm thứ nhất
    public void sayHello() {
        int n = 10;                     // Đây là biến local ( biến cucj bộ)chỉ trong hàm
        System.out.println("Gia tri cua n la: " + n);
        System.out.println(address);
    }

    //hàm thứ  2

    public void getInfor()
    {
        System.out.println(address);
    }
        public static void main (String[]args){
         Bien bien = new Bien();
         //bien.getInfor();
        // bien.sayHello();
            System.out.println(bien.address);

            //đây la ghi chú
            //khai báo biến
            int number1 = 9869453;
            int number2 = 1234;
            String name = "hao";
            String name2 = "Loan";
            System.out.println(number1);
            System.out.println(name);
            System.out.println(name2);
            //System.out.println(address);
            System.out.println(Age);


        }


}
