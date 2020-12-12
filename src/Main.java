public class Main {

    public static void main(String[] args){
        OrderHandler serviceComptable=new ServiceComptable();
        OrderHandler servicePatrimoine=new ServicePatrimoine();

        serviceComptable.nextHandler=servicePatrimoine;
        servicePatrimoine.nextHandler=serviceComptable;
        Demande demande=new Demande(70.0);
        Budget budget=new Budget(120.0);
        demande.ajoute(budget);
        budget.setDemande(demande);
        serviceComptable.handleRequest(demande,budget);
        System.out.println(budget.getBudget());
        System.out.println(budget.getBloque());
        System.out.println(demande.getState());
    }
}
