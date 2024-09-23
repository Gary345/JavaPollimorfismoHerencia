import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
 
        SalesRep rep1 = new SalesRep("Ivan", "Roman", 101, 26, 360, 2, 12500, 1, 500);
        SalesRep rep2 = new SalesRep("Alondra", "Gonzales", 102, 23, 720, 5, 17000, 3, 1500);

  
        HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
        salesTeam.put(101, rep1);
        salesTeam.put(102, rep2);

       
        SalesManager manager = new SalesManager("Alice", "Johnson", 201, 45, 1440, 7, 80000, 20, salesTeam);

        
        System.out.println("Días para la jubilación de "+ rep1.firstName + ": "+ rep1.timeToRetirement() );
        System.out.println("Vacaciones restantes de " + rep1.firstName + ": " + rep1.vacationTimeLeft());
        System.out.println("Bonificación de " + rep1.firstName + ": " + rep1.calculateBonus());
        
        System.out.println("Días para la jubilación de " + rep2.firstName + ": " + rep2.timeToRetirement());
        System.out.println("Vacaciones restantes de " + rep2.firstName + ": " + rep2.vacationTimeLeft());
        System.out.println("Bonificación de " + rep2.firstName + ": " + rep2.calculateBonus());
        
        System.out.println("Comisión de "+ rep1.firstName + ": " + rep1.calculateCommission());
        System.out.println("Comisión de "+ rep2.firstName + ": " + rep2.calculateCommission());

        
        manager.calculateCommission();
    }
}
