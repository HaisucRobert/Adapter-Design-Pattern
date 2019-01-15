public class ImpDeplasare implements Deplasari{
    DeplasariAdapter deplasariAdapter;

    @Override
    public void CreareDeplasare(String locatie, String tip) {


        if(tip.equalsIgnoreCase("Delegatie")){
            System.out.println("Locatia este in  " + locatie + " si tipul este " + tip);
        }

        else if(tip.equalsIgnoreCase("TeamBuilding") || tip.equalsIgnoreCase("Conferinta")){
            deplasariAdapter = new DeplasariAdapter(tip);
            deplasariAdapter.CreareDeplasare(locatie, tip);

        }

        else{
            System.out.println("Tipul " + tip + " nu este cunoscut");
        }
    }
}
