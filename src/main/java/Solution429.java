import java.util.*;

/**
 * @ClassName Solution429
 * @Description 429. N叉树的层序遍历
 * @Author shishi
 * @Date 2019/11/5 14:01
 **/

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 *
 */
public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root==null) return lists;
        else {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                ArrayList<Integer> list = new ArrayList<>();
                int curSize = queue.size();
                for (int i=0;i<curSize;i++){
                    Node node = queue.poll();
                    list.add(node.val);
                    List<Node> children = node.children;
                    for (Node child : children){
                        queue.offer(child);
                    }
                }
                lists.add(new ArrayList<>(list));
            }
        }

        return lists;
    }
}
