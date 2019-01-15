public class DeplasariAdapter implements Deplasari {
    DeplasariAvansate deplasariAvansate;

    public DeplasariAdapter(String tip) {

        if (tip.equalsIgnoreCase("TeamBuilding")) {
            deplasariAvansate = new TeamBuilding();

        } else if (tip.equalsIgnoreCase("Conferinta")) {
            deplasariAvansate = new Conferinte();
        }
    }

    @Override
    public void CreareDeplasare(String locatie, String tip) {

        if (tip.equalsIgnoreCase("TeamBuilding")) {
            deplasariAvansate.CreareTeamBuilding(locatie);
        } else if (tip.equalsIgnoreCase("Conferinta")) {
            deplasariAvansate.CreareConferinte(locatie);
        }
    }
}
