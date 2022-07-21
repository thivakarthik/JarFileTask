import java.util.Scanner;

public class UseRandomName {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean state=true;
        while(state){
            if(s.nextInt() == 0){
                state=false;
            }
            else{
                System.out.println(RandomName.randomName());
            }
        }
        s.close();
    }
}

