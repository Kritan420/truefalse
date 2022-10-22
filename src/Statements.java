public class Statements {  
    private String Statement;
    private boolean bool;

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
        return Statement;
    }

    public boolean getBool() {
        return bool;
    }
    
}
