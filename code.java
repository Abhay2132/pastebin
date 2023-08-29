import javax.swing.*;
import java.awt.*;

public class Main {
	Main(){
		JFrame jFrame = new JFrame();
		jFrame.setSize(600, 400);
		jFrame.setVisible(true);
		jFrame.setTitle("Calender");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame.setLayout(new BorderLayout(1,1));
//		jFrame.add(new Label("Abhay"));

		jFrame.add(new Panel("Top").getPanel(), BorderLayout.NORTH);
		jFrame.add(new Panel("Center").getPanel(), BorderLayout.CENTER);
		jFrame.add(new Panel("Bottom").getPanel(), BorderLayout.SOUTH);

	}
	public static void main(String[] args) {
		new Main();
		System.out.println("Hello world!");
	}
}

class Panel{
	JPanel panel;
	public Panel (String buttonText){
		this.panel = new JPanel();
		this.panel.setLayout(new BorderLayout());
		JButton button = new JButton(buttonText);
		this.panel.add(button, BorderLayout.CENTER);
		this.panel.setVisible(true);
//		this.panel.setSize(100, 100);
	}

	public JPanel getPanel (){
		return this.panel;
	}
}
