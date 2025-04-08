public class GateScreen extends Observer{
    private Gate  gate;
    public GateScreen(Gate gate){
        this.gate = gate;

    }
    @Override
    public void update() {
        System.out.print("GATE "+gate.getNom());
        for(Flight flight: gate.getFlights()){
            System.out.print(flight.toString());
        }

    }
}
