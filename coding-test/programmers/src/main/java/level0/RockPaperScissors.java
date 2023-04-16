package level0;

public class RockPaperScissors {
    public String solution(String rsp) {
        String[] games = rsp.split("");
        
        StringBuilder result = new StringBuilder();
        
        for(String game : games) {
            RSP winn = game.equals(RSP.ROCK.getNumber()) ? RSP.PAPER : game.equals(RSP.PAPER.getNumber()) ? RSP.SCISSORS : RSP.ROCK;
            
            result.append(winn.getNumber());
        }
        
        return result.toString();
    }
    
    enum RSP {
        ROCK("0"), SCISSORS("2"), PAPER("5");
        
        private String number;
        
        RSP(String number) {
            this.number = number;
        }
    
        public String getNumber() {
            return number;
        }
    }
}
