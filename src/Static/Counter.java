package Static;

public class Counter {
    static int count= 0;// sẽ lấy bộ nhớ mới khi khởi tạo lại class hoặc gọi lại biến này
     Counter(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Counter c1= new Counter();//khởi tạo lần 1
        Counter c2= new Counter();//khởi tạo lần 2
        Counter c3= new Counter();//khởi tạo lần 3

    }
}
