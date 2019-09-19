import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class Gui extends JFrame {
	private JTextArea leftTextArea; 
	private JTextArea rightTextArea; 

	
	public Gui() {
		super("Title");
	
	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(100, 100);
    this.setLocation(200, 200);
    this.setLayout(new GridLayout(1, 2)); // row and col
    
    this.leftTextArea = new JTextArea("Unsorted:"+"\n", 5, 20);
    this.rightTextArea = new JTextArea("Sorted:" + "\n", 5, 20);
    
    this.getContentPane().add(leftTextArea);
    this.getContentPane().add(rightTextArea); 
       		
    }	
	  public void showGui()
	    {
	        this.pack();
	        this.setVisible(true);
	    }
	   public void SortedAndUnsorted(Car[] unsorted, Car[] sorted,int size) 
	    {

	      for(int i=0;i<size;i++) {
	    	  this.leftTextArea.append(unsorted[i]+"\n");
	      }
	      for(int i=0;i<size;i++) {
	    	  this.rightTextArea.append(sorted[i]+"\n");
	      }
	    }
}
