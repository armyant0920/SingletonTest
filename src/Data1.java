import java.util.HashMap;
import java.util.Map;

public class Data1 {

    private  String name1;
    private  int num1;



    private  static Data1 instance;
    private  Data1(){
        name1="utf-8";
        num1=2;




    }

    public static Data1 getInstance(){
        if(instance==null){
            synchronized (Data1.class) {
                instance =new  Data1();
            }

        }

            return instance;


    }

    public void show(){

        System.out.printf("name1:%s\nnum1:%d\n",this.name1,this.num1);
    }


}
