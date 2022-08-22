
//Faith Iyere
//February 14,2022
import javax.swing.JOptionPane;

public class CellPhoneService {

	public static void main(String[] args) {

		// Declaring Varibles
		String result;
		double maxTalkMins;
		double maxTextMessageSent;
		double maxDataUsed;

		result = JOptionPane.showInputDialog("Enter maximum monthly talk minutes used:");
		maxTalkMins = Double.parseDouble(result);

		result = JOptionPane.showInputDialog("Enter maximum monthly text message sent:");
		maxTextMessageSent = Double.parseDouble(result);

		result = JOptionPane.showInputDialog("Enter maximum gigaytes of data used:");
		maxDataUsed = Double.parseDouble(result);

		int planA = 49, planB = 55, planC = 61, planD = 70, planE = 79, planF = 87;

		// recommending Plan for users
		if (maxTalkMins < 500 && maxTextMessageSent == 0 && maxDataUsed == 0) {
			JOptionPane.showMessageDialog(null, "We recommend Plan A at $" + planA);
		}

		else if (maxTalkMins < 500 && maxTextMessageSent > 0) {
			JOptionPane.showMessageDialog(null, "We recommend Plan B at $" + planB);
		}

		else if (maxTalkMins > 500 && maxDataUsed == 0) {
			JOptionPane.showMessageDialog(null, "We recommend Plan C for up to 100 messages at $" + planC);
		}

		else if (maxTextMessageSent > 100) {
			JOptionPane.showMessageDialog(null, "We recommend Plan D for up to 100 messages at $" + planD);
		}

		else if (maxDataUsed <= 3) {
			JOptionPane.showMessageDialog(null, "We recommend Plan E for up to 3 gigabytes at $" + planE);
		}

		else if (maxDataUsed > 3) {
			JOptionPane.showMessageDialog(null, "We recommend Plan F at $" + planF);

		}
	}
}
