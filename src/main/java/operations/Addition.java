package operations;

public class Addition {
    private final int operator1, operator2;

    public Addition(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public int add() {
        return this.operator1 + this.operator2;
    }
}