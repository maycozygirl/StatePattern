public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void choose(String flavor); 
}