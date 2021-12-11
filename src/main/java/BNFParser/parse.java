package BNFParser;

import java.io.*;
import java.util.*;

public class parse {
    public static String ParseFile(String str , HashMap<String, String> map) {
        boolean containsKey = false;
        for(String key : map.keySet()){ //Here I am just seeing if the map has the String str as  key, in other words, if str is a non terminal or no
            if (key.equals(str)) {
                containsKey = true;
                break;
            }
        }
        if (!containsKey) return str + " ";

        String[] splitByOr = map.get(str).split("\\|+"); //split the terminal based on "or"
        Random random = new Random();
        String[] words = splitByOr[random.nextInt(splitByOr.length)].split("\\s+");
        String output = "";
        for (String iterator : words) {
            output += ParseFile(iterator ,  map);
        }
        return output;
    }

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> map = new HashMap<>();
        File file = new File("BNFParser\\parse.txt");
        Scanner console = new Scanner(file);
        while (console.hasNextLine()) {
            String[] line = console.nextLine().trim().split("::=");
            map.put(line[0], line[1]);
        }
        System.out.println(parse.ParseFile("<s>", map));
    }
}