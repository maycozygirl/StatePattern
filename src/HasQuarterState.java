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
        System.out.println("You turned...");
        if (Math.random() < 0.1 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getSoldState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }    

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}