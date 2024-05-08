import java.io.*;
import java.util.*;



public class Space {

    ArrayList<Integer> notVisited = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> visited = new ArrayList<>();
    ArrayList<Boolean>[][] map = new ArrayList[5][5];

    public Space(){
        populateMap();
    }

    private void populateMap(){
        loadList(notVisited, "res/Input");
        map = new ArrayList[5][5];

        System.out.println(notVisited);
        System.out.println("");

        int i = 0;
        for(int c = 1; c < notVisited.size(); c++){
            for(int r = 1; r < notVisited.size(); r++){
                Node node = new Node(notVisited.get(i++), false);
                map[r][c].add(notVisited.add(i++));
            }
        }
        System.out.println(map);
    }

    private void loadList(List list, String path){
        File file = new File(path);

        if (list == null)
            list = new ArrayList();

        try {
            Scanner scr = new Scanner(file);

            while(scr.hasNextLine()){
                scr.useRadix(16);
                list.add(scr.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
