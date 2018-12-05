import java.awt.BorderLayout;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MainClass {

  public static void main(final String args[]) {
    final String labels[] = { "A", "B", "C", "D", "E" };
    JFrame frame = new JFrame("Selecting JComboBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComboBox comboBox = new JComboBox(labels);
    frame.add(comboBox, BorderLayout.SOUTH);

    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Command: " + actionEvent.getActionCommand());
        ItemSelectable is = (ItemSelectable)actionEvent.getSource();
        System.out.println(", Selected: " + selectedString(is));
      }
    };
    comboBox.addActionListener(actionListener);
    frame.setSize(400, 200);
    frame.setVisible(true);

  }
  static private String selectedString(ItemSelectable is) {
    Object selected[] = is.getSelectedObjects();
    return ((selected.length == 0) ? "null" : (String)selected[0]);
  }  
}