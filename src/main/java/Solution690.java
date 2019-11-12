import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Solution690
 * @Description TODO
 * @Author shishi
 * @Date 2019/11/1 12:02
 **/

/**
 * 输入: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
 * 输出: 11
 */
public class Solution690 {
    public int getImportance(List<Employee> employees, int id) {
        Employee startEmployee = null;
        int sum_importance = 0;

        // 先找到第一个员工，再去遍历他的下属
        for (int i=0;i<employees.size();i++){
            if (employees.get(i).id==id){
                startEmployee = employees.get(i);
                sum_importance += startEmployee.importance;
                break;
            }
        }

        // 遍历他的下属
        List<Integer> subordinates = startEmployee.subordinates;
        if (subordinates==null) return sum_importance;
        Iterator<Integer> iterator = subordinates.iterator();
        while (iterator.hasNext()){
            int subId = iterator.next();
            int importance = getImportance(employees, subId);
            sum_importance += importance;
        }

        return sum_importance;
    }

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };
}
