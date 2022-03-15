import java.awt.*;
import java.awt.event.*;
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
public class MouseEventDemo extends Frame implements KeyListener
{
	TextField tf=new TextField(20);
	Label l1=new Label("Digits");
	Label l2=new Label("Characters");
	int dig=0,cha=0;
	MouseEventDemo()
	{
		setTitle("GUI");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		add(tf);
		add(l1);
		add(l2);
		tf.addKeyListener(this);
		addWindowListener(new MyWindowAdapter());
	}
	public void keyPressed(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke)
	{
		
	}
	public void keyTyped(KeyEvent ke)
	{
		char c=ke.getKeyChar();
		if(c>='0' && c<'9')
		{
			dig++;
			l1.setText("Digits: "+String.valueOf(dig));
		}
		else if((c>='A' && c<='Z') || (c>='a' && c<='z'))
		{
			cha++;
			l2.setText("Characters: "+String.valueOf(cha));
		}
		
	}

	public static void main(String[] args) 
	{
		MouseEventDemo obj=new MouseEventDemo();
	}

}
