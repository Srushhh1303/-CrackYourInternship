import java.util.HashMap;
import java.util.*;

public class TaskScheduler {
    class Pair{
        int taskCount, availableTime; //availableTime denotes the time at which task will be available for exec.
        Pair(int taskCount, int availableTime)
        {
            this.taskCount = taskCount;
            this.availableTime = availableTime;
        }
    }
    public int leastInterval(char[] tasks, int n)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1); // map key is TaskName, and value is number of times to be executed.
        }
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>( //frequency sort
                (a,b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue() : a.getKey() - b.getKey());

        q.addAll(map.entrySet());

        int count=0;
        List<Map.Entry> tempList = new ArrayList<>();
        int k=n+1;
        while(k>0 && !q.isEmpty()) {
            Map.Entry<Character, Integer> top = q.remove();
            top.setValue(top.getValue() - 1); //frequence -1
            tempList.add(top);
            k--;
            count++;
            for (Map.Entry<Character, Integer> e : tempList) {
                if (e.getValue() > 0) q.add(e); // add valid tasks
            }
            if (q.isEmpty()) {
                break;
            }
            count = count + k;

        }
        return count;
    }
    public static void main(String[] args){

    }
}
