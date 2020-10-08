public class Data2 {

    private static String name2;
    private static int num2;
    private static Data2 instance;
    private  Data2(){
        name2="MS950";
        num2=4;


    }

    public static Data2 getInstance(){
        if(instance==null){
            synchronized (Data1.class) {
                instance =new  Data2();
            }

        }

        return instance;


    }

    public void show(){

        System.out.printf("name2:%s\nnum2:%d\n",this.name2,this.num2);
    }
}

