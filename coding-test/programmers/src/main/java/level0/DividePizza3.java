package level0;

public class DividePizza3 {
    public int solution(int slice, int n) {
        if(n % slice == 0)
            return n / slice;
        
        return (int)Math.ceil((double)n / slice);
    }
}
