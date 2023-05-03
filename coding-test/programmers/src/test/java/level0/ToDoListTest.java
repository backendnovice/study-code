package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    
    @Test
    public void solution() {
        ToDoList test = new ToDoList();
        
        assertArrayEquals(test.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false}), new String[]{"practiceguitar", "studygraph"});
    }
}