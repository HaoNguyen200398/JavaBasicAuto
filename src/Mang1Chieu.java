public class Mang1Chieu {
    public static void main(String[] args) {
        //khai báo mảng rỗng chưa mang giá trị
        int a[]=new int[4];

        //gán giá trị cho mảng
        a[0]=1;
        a[1]=8;
        a[2]=90;
        a[3]=879;

        //độ dài mảng
        System.out.println("độ dài mảng:" + a.length);
        //duyệt mảng lấy giá trị
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
