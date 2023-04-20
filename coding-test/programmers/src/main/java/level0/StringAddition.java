package level0;

import java.math.BigInteger;

public class StringAddition {
    public String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)) + "";
    }
}
