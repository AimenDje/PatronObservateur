public class AirportScreen extends Observer {
    private Airport airport;
    private String nom;

    public AirportScreen(Airport airport, String nom){
        this.airport = airport;
        this.nom = nom;
    }

    @Override
    public void update() {
        System.out.println(nom);
        for(Flight flight: airport.getFlights()){
            System.out.println(flight.toString());
        }
    }
}
