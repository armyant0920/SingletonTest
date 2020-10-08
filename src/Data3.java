public class Data3 {

    private static String name2;
    private static int num2;
    private static Data3 instance;
    public  Data3(){
        name2="MS950";
        num2=4;


    }



    public void show(){

        System.out.printf("name2:%s\nnum2:%d\n",this.name2,this.num2);
    }
}

