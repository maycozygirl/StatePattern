public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You need to choose a flavor first");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void choose(String flavor) {
        System.out.println("You can't choose a flavor without inserting a quarter");
    }
}