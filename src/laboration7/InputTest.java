package laboration7;

import javax.swing.JOptionPane;

public class InputTest {
    public static void main(String[] args) {
    	Input in = new Input();
        int nbr1, nbr2;
        double nbr3;
        Long nbr4;
        nbr1 = Input.getInt("Mata in ett heltal");
        nbr2 = Input.getInt("Mata in ett heltal till");
        JOptionPane.showMessageDialog( null, "nbr1=" + nbr1 + "\nnbr2=" + nbr2 );
        nbr3 = in.getDouble("Mata in ett double");
        nbr4 = in.getLong("Mata in ett long");
        JOptionPane.showMessageDialog( null, "nbr1=" + nbr3 + "\nnbr2=" + nbr4 );
    }
}
