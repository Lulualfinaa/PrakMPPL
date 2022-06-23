import java.util.*;
import javax.swing.JOptionPane;

public class bandingkata {
	public static void main(String[] args) {
		
		String kata1, kata2;
		
		kata1 = JOptionPane.showInputDialog("masukkan kata pertama: ");
		kata2 = JOptionPane.showInputDialog("masukkan kata kedua: ");
	
		if (kata1.equalsIgnoreCase(kata2)){
			JOptionPane.showMessageDialog(null, kata1+" sama dengan "+kata2);
		} else {
			JOptionPane.showMessageDialog(null, kata1+" tidak sama dengan "+kata2);
		}
	}
}
