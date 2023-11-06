public class AfterClass1 {
    public static void main(String[] args) {
        String text = "Have a nice day!";
        System.out.println(text.length());
        System.out.println(text.substring(0,9));
        String[] strArr = text.split(" ");
        if(strArr[(strArr.length) - 1].equals("day!")) {
            System.out.println("mhm");
        } else System.out.println("hmh");
        
    }
}
