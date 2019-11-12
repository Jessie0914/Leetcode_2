import java.util.List;

/**
 * @ClassName Node
 * @Description TODO
 * @Author shishi
 * @Date 2019/11/5 14:01
 **/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
