import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonFrame extends JFrame
{
	private JPanel panel;
	private JButton start;
	private JButton stop;

	public ButtonFrame()
	{
		panel = new JPanel();
		start = new JButton("Start");
		stop = new JButton("Stop");

		start.addActionListener(new StartButtonListener());
		stop.addActionListener(new StopButtonListener());

		panel.add(start);
		panel.add(stop);

		add(panel);
	}

	private class StartButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Start button was pressed");
		}
	}

	private class StopButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Stop button was pressed");	
		}
	}
}