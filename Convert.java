public class Convert{
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));
    }
    
    
    public static int convert(int minutes){
        int seconds = 0;
        seconds = minutes * 60;
        return seconds;
    }
}


