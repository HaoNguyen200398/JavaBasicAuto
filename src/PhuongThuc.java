public class PhuongThuc {

    //biến toàn cục

    public int sum;
    public double Result;

    //hàm k trả về kết quả
    public void cong2So(){
        int a=5;
        int b= 8;
        sum=a+b;
        System.out.println(sum);
    }

    public void cong2So(int number1,int number2){
        System.out.println("tong 2 so: " + (number1+number2));
    }

    //hàm trả về kết quả
    public double nhan2So(){
        int a=7;
        int b=9;
        Result=a*b;
        System.out.println(Result);
        return  Result;
    }

    public long nhan3So(int a, int b,int c){
        return a*b*c;
    }


    public void SaySomething(){
        System.out.println("url");
        System.out.println("click menu");
        System.out.println("thành công");
    }


    public static void main(String[] args) {
        int a=10;
        int b=20;
        PhuongThuc phuongThuc= new PhuongThuc();
        phuongThuc.cong2So();
        phuongThuc.SaySomething();
        phuongThuc.cong2So(3,4);
       // phuongThuc.nhan3So(4,6,7);
        System.out.println("nhan 3 số : "+ phuongThuc.nhan3So(4,6,7));
//        phuongThuc.nhan2So();
        //System.out.println(phuongThuc.cong2So());
        System.out.println(phuongThuc.nhan2So()+10);
        // HÀM toán tử
        System.out.println("tổng a+b: " + (a+b));

        //hàm so sánh và logic
        System.out.println(a>b||b>5);
        System.out.println();
    }
}
