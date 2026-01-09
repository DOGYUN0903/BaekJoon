import java.util.Deque;
import java.util.ArrayDeque;

// 트럭 여러 대가 일차선 다리를 정해진 순서로 건넘
// 모든 트럭이 다리를 건너려면 몇 초가 걸리는지?
// 다리에는 최대 brigde_length대 올라갈 수 있음
// 다리는 weight 이하까지의 무게를 견딜 수 있음(단, 다리에 완전히 오르지 않은 트럭의 무게는 무시함)
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> bridge = new ArrayDeque<>();
        
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        int time = 0;
        int currentWeight = 0;
        int index = 0;
        
        while (index < truck_weights.length) {
            time++;
            
            currentWeight -= bridge.poll();
            
            if (currentWeight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                currentWeight += truck_weights[index];
                index++;
            } else {
                bridge.offer(0);
            }
        }
        
        time += bridge_length;
        
        return time;
    }
}