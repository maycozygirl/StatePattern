public class HasQuarterState implements State {
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        if (gumballMachine.getFlavor() == null) {
            System.out.println("You have to choose a flavor first");
            return;
        }
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
    }

    public void choose(String flavor) {
        System.out.println("You have chosen the flavor " + flavor);
        gumballMachine.setFlavor(flavor);
    }
}