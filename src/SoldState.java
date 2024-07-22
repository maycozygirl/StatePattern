public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        String flavor = gumballMachine.getFlavor();
        gumballMachine.releaseBall();
        System.out.println("A " + flavor + " gumball comes rolling out the slot");
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }

        gumballMachine.setFlavor(null);
    }

    public void choose(String flavor) {
        System.out.println("You can't choose a flavor now, you already turned the crank");
    }
}