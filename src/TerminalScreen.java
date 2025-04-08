public class TerminalScreen extends Observer {
    private Terminal terminal;
    private String nom;

    public TerminalScreen(Terminal terminal, String nom){
        this.terminal = terminal;
        this.nom= nom;
    }

    @Override
    public void update() {
        System.out.print(nom);
        for(Flight flight : terminal.getFlights()){
            System.out.print(flight.toString());
        }
    }
}