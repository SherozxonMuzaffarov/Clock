import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	ImageIcon frameIcon;
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.setSize(350,220);
		this.setTitle("Clock");
	
		frameIcon = new ImageIcon("Clock.jpg");
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");
		
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("MV Boli",Font.PLAIN,50));
		timeLabel.setForeground(Color.green);
		timeLabel.setBackground(Color.gray);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Verdana",Font.PLAIN,35));

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));

		
		this.setIconImage(frameIcon.getImage());
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
	
		setFont();
		
	}
	public void setFont() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
	
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
