import java.util.HashMap;

public class SalesManager extends Employee {
	
    public HashMap<Integer, SalesRep> salesTeam;

    
    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, HashMap<Integer, SalesRep> salesTeam) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesTeam = salesTeam;
    }// constructor

    
    public HashMap<Integer, SalesRep> getSalesTeam() {
        return salesTeam;
    }

    public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
        this.salesTeam = salesTeam;
    }
    // getter y setter
    
   
    public void calculateCommission() {
    	
        double totalSales = 0;
        for (SalesRep rep : salesTeam.values()) {
            totalSales += rep.getSalesMade();
     }//for salesrep
    
        double commission = 0.03 * totalSales;
        System.out.println("La comisión del Sales Manager es: " + commission);
    }//metodo calcular comision 
}
