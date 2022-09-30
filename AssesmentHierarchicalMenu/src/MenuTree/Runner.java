package MenuTree;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Runner {
	public static void main(String[] ar) {
		
		JFrame jFrame= new JFrame("Assesment-Menu Hierarchy");
        JMenuBar m=new JMenuBar();
        
		MenuFunctionality.displayMenu(m);
		
		jFrame.setJMenuBar(m);
        jFrame.setVisible(true);
        jFrame.setExtendedState(jFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

}
