package Static;

public class WebUI {

    public static String URL ="chatgpt.com";
    public static String  userName="Hao";
    public static String Password="123456";
    public static void openURL(String URL){
        System.out.println(URL);

    }
    public static void Element (String ElementName){
        System.out.println("ElementName:" + ElementName);

    }
    public static void setTest(String setTest){
        System.out.println("Set test:"+ setTest);

    }
    public static String getElement(String j){
        return "Text";
    }

    public static void main(String[] args) {
        openURL("chatgpt.com");
        Element("How are u ?");
        setTest("tình trạng tốt");
        System.out.println(getElement("hihi"));
        openURL(URL);
        setTest(userName);
        setTest(Password);

    }
}
