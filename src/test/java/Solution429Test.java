import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution429Test {

    @Test
    public void levelOrder() {
        ArrayList<Node> list1 = new ArrayList<>();
        Node node2 = new Node(2, list1);

        ArrayList<Node> list = new ArrayList<>();
        list.add(node2);
        Node node1 = new Node(1, list);

        Solution429 solution429 = new Solution429();
        List<List<Integer>> res = solution429.levelOrder(node1);
        for (List l : res){
            for (int i=0;i<l.size();i++){
                System.out.print(l.get(i)+" ");
            }
            System.out.println();
        }
    }
}