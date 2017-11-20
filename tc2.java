package secP;

import java.io.IOException;

/**
 * Created by pieterholleman on 11/15/17.
 */
public class tc2 {

    public static void main(String[] args) {

        try{
            ChatClient one = new ChatClient("127.0.0.1", 1984, "Moby");
            System.out.println("Connected!");

        } catch (IOException e){
            System.out.println("Connect");
            e.printStackTrace();
        }
    }
}
