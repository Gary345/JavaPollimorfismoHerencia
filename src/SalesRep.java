public class SalesRep extends Employee {
	
    private double salesMade;

    
    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesMade = salesMade;
    }// constructor

    
    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

    // getter y setter
    public double calculateCommission() {
    	
        return 0.1 * salesMade;
        
    }// metodo calcular comision
}
