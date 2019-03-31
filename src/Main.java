interface MyStr {
    String getValue();
}
public class Main {
    public static void main(String args[]){
        MyStr myStr = ()->"Hello man!";
        System.out.println(myStr.getValue());
        String word[]={"I","like","rock","music"};
        myStr=()->word[0];
        System.out.println("Фраза первая: "+myStr.getValue());
        myStr=()->word[1];
        System.out.println("Фраза вторая: "+myStr.getValue());
        myStr=()->word[2];
        System.out.println("Фраза третья: "+myStr.getValue());
        myStr=()->word[3];
        System.out.println("Фраза четвёртая: "+myStr.getValue());
    }
}