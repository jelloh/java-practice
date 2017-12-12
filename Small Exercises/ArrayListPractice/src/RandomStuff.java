import java.util.ArrayList;

public class RandomStuff {
    public static void main(String[] args){

        // Part A
        ArrayList[] accounts = {new ArrayList<String>(), new ArrayList<String>()};

        /*ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        accounts[0] = usernames;
        accounts[1] = passwords;*/

        accounts[0].add("bob");
        accounts[1].add("123");

        accounts[0].add("ali");
        accounts[1].add("321");

        for(int i = 0; i < accounts[0].size(); i++){
            System.out.println(accounts[0].get(i) + "\t" + accounts[1].get(i));
        }




    }
}
