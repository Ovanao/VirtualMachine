
import java.util.ArrayList;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TooOmy
 */
public class VirtualMachine {
    public static void main(String[] args){
       		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
                                VM vm = new VM();
				VmGui mw = new VmGui(vm); //
				mw.setVisible(true);
			}
		});

    }
}
