package level0;

import java.util.stream.IntStream;

public class ToDoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, finished.length).filter(i -> !finished[i]).mapToObj(i -> todo_list[i]).toArray(String[]::new);
    }
}
