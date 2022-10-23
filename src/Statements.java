public class Statements {  
    private String Statement;
    private boolean bool;
    private int count = 0;

    public Statements(String statement, String bool) {
        this.Statement = statement;
        if (bool.equals("T")) {
            this.bool = true;
        }
        else if (bool.equals("F")) {
            this.bool = false;
        }
    }

    public String getStatement() {
        count++;
        return Statement; 
    }

    public boolean getBool() {
        return bool;
    }

    public int getCount() {
        return count;
    }

    void reset() {
        count = 0;
    }
    
}
