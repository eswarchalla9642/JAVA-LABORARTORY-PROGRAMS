//Demonstrate JTabbedPane. 
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*; 
public class JTabbedPaneDemo { 
public JTabbedPaneDemo() { 
 // Set up the JFrame.
 JFrame jfrm = new JFrame("JTabbedPaneDemo");
 jfrm.setLayout(new FlowLayout());
 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 jfrm.setSize(1000, 1000); 
 // Create the tabbed pane.
 JTabbedPane jtp = new JTabbedPane(); 
 jtp.addTab("Tree", new TreePanel()); 
 jtp.addTab("Table", new TablePanel()); 
 jfrm.add(jtp); 
 // Display the frame.
 jfrm.setVisible(true);
} 
public static void main(String[] args) { 
 // Create the frame on the event dispatching thread.
 SwingUtilities.invokeLater( 
   new Runnable() { 
     public void run() { 
       new JTabbedPaneDemo(); 
     } 
   } 
 ); 
}
} 
//Make the panels that will be added to the tabbed pane. 
class TreePanel extends JPanel { 
public TreePanel() { 
  // Create top node of tree. 
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options"); 
    // Create subtree of "A". 
    DefaultMutableTreeNode a = new DefaultMutableTreeNode("A"); 
    top.add(a); 
    DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1"); 
    a.add(a1); 
    DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2"); 
    a.add(a2); 
    // Create subtree of "B". 
    DefaultMutableTreeNode b = new DefaultMutableTreeNode("B"); 
    top.add(b); 
    DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1"); 
    b.add(b1); 
    DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2"); 
    b.add(b2); 
    DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3"); 
    b.add(b3); 
    // Create the tree. 
    JTree tree = new JTree(top); 
    // Add the tree to a scroll pane. 
    JScrollPane jsp = new JScrollPane(tree); 
    // Add the scroll pane to the content pane. 
    add(jsp); 
    // Add the label to the content pane. 
    JLabel jlab = new JLabel(); 
    add(jlab, BorderLayout.SOUTH); 
    // Handle tree selection events. 
    tree.addTreeSelectionListener(new TreeSelectionListener() { 
      public void valueChanged(TreeSelectionEvent tse) { 
        jlab.setText("Selection is " + tse.getPath()); 
      } 
    }); 
} 
} 
class TablePanel extends JPanel { 
public TablePanel() { 
  // Initialize column headings. 
    String[] colHeads = { "Name", "Extension", "ID#" }; 
    // Initialize data. 
    Object[][] data = { 
      { "Gail", "4567", "865" }, 
      { "Ken", "7566", "555" }, 
      { "Viviane", "5634", "587" }, 
      { "Melanie", "7345", "922" }, 
      { "Anne", "1237", "333" }, 
      { "John", "5656", "314" }, 
      { "Matt", "5672", "217" }, 
      { "Claire", "6741", "444" }, 
      { "Erwin", "9023", "519" }, 
      { "Ellen", "1134", "532" }, 
      { "Jennifer", "5689", "112" }, 
      { "Ed", "9030", "133" }, 
      { "Helen", "6751", "145" } 
    }; 
      // Create the table. 
      JTable table = new JTable(data, colHeads);  
      // Add the table to a scroll pane. 
      JScrollPane jsp = new JScrollPane(table); 
   
      // Add the scroll pane to the content pane. 
      add(jsp); 
} 
} 

