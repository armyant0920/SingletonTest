import java.util.HashMap;
import java.util.Map;

public class TEDST {

    public static void main(String[] args) {
        Map<String,String> dataMap=new HashMap<>();
        dataMap.put("123","123");
        Data1 data1=Data1.getInstance();
        Data2 data2=Data2.getInstance();

        System.out.println("ABC");
        System.out.printf("ABC%d,%sDEF",123,"YYYY");

        data1.show();
        data2.show();

        System.out.println(data1);
        data1=Data1.getInstance();
        System.out.println(data1);

        Data3 data3=new Data3();
        System.out.println(data3);
        data3=new Data3();
        System.out.println(data3);

    }
}
