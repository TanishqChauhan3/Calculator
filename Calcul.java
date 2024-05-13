import java.awt.*;
import java.awt.event.*;
import java.util.*;
class ABC extends Frame implements ActionListener
{
	Label l1,l2,l3;
	Label tf1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	String c1,c2;
	Boolean flag1=false,flag2=false,flag3=false,flag4=false,flag5=false,flag6=false;
	double b=0,c=0,a=0,d=0;
	ABC()
	{
		l1=new Label("Standard");
		l1.setBounds(30,30,150,30);
		l1.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		l1.setForeground(new Color(252, 249, 249));
		tf1=new Label();
		tf1.setBounds(0,100,400,80);
		tf1.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		tf1.setBackground(new Color(20,20,20));
		tf1.setForeground(new Color(252,249,249));
		tf1.setAlignment(Label.RIGHT);
		b1=new Button("%");
		b1.setBounds(0,180,100,70);
		b1.setBackground(new Color(31, 31, 31));
		b1.setForeground(new Color(252,249,249));
		b1.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b1.addActionListener(this);
		b2=new Button("CE");
		b2.setBounds(100,180,100,70);
		b2.setBackground(new Color(31, 31, 31));
		b2.setForeground(new Color(252,249,249));
		b2.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b2.addActionListener(this);
		b3=new Button("C");
		b3.setBounds(200,180,100,70);
		b3.setBackground(new Color(31, 31, 31));
		b3.setForeground(new Color(252,249,249));
		b3.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b3.addActionListener(this);
		b4=new Button("x");
		b4.setBounds(300,180,100,70);
		b4.setBackground(new Color(31, 31, 31));
		b4.setForeground(new Color(252,249,249));
		b4.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b4.addActionListener(this);
		b5=new Button("1/x");
		b5.setBounds(0,250,100,70);
		b5.setBackground(new Color(31, 31, 31));
		b5.setForeground(new Color(252,249,249));
		b5.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b5.addActionListener(this);
		b6=new Button("x^2");
		b6.setBounds(100,250,100,70);
		b6.setBackground(new Color(31, 31, 31));
		b6.setForeground(new Color(252,249,249));
		b6.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b6.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b6.addActionListener(this);
		b7=new Button("x^1/2");
		b7.setBounds(200,250,100,70);
		b7.setBackground(new Color(31, 31, 31));
		b7.setForeground(new Color(252,249,249));
		b7.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b7.addActionListener(this);
		b8=new Button("/");
		b8.setBounds(300,250,100,70);
		b8.setBackground(new Color(31, 31, 31));
		b8.setForeground(new Color(252,249,249));
		b8.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b8.addActionListener(this);
		b9=new Button("7");
		b9.setBounds(0,320,100,70);
		b9.setBackground(new Color(31, 31, 31));
		b9.setForeground(new Color(252,249,249));
		b9.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b9.addActionListener(this);
		b10=new Button("8");
		b10.setBounds(100,320,100,70);
		b10.setBackground(new Color(31, 31, 31));
		b10.setForeground(new Color(252,249,249));
		b10.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b10.addActionListener(this);
		b11=new Button("9");
		b11.setBounds(200,320,100,70);
		b11.setBackground(new Color(31, 31, 31));
		b11.setForeground(new Color(252,249,249));
		b11.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b11.addActionListener(this);
		b12=new Button("*");
		b12.setBounds(300,320,100,70);
		b12.setBackground(new Color(31, 31, 31));
		b12.setForeground(new Color(252,249,249));
		b12.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b12.addActionListener(this);
		b13=new Button("4");
		b13.setBounds(0,390,100,70);
		b13.setBackground(new Color(31, 31, 31));
		b13.setForeground(new Color(252,249,249));
		b13.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b13.addActionListener(this);
		b14=new Button("5");
		b14.setBounds(100,390,100,70);
		b14.setBackground(new Color(31, 31, 31));
		b14.setForeground(new Color(252,249,249));
		b14.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b14.addActionListener(this);
		b15=new Button("6");
		b15.setBounds(200,390,100,70);
		b15.setBackground(new Color(31, 31, 31));
		b15.setForeground(new Color(252,249,249));
		b15.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b15.addActionListener(this);
		b16=new Button("-");
		b16.setBounds(300,390,100,70);
		b16.setBackground(new Color(31, 31, 31));
		b16.setForeground(new Color(252,249,249));
		b16.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b16.addActionListener(this);
		b17=new Button("1");
		b17.setBounds(0,460,100,70);
		b17.setBackground(new Color(31, 31, 31));
		b17.setForeground(new Color(252,249,249));
		b17.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b17.addActionListener(this);
		b18=new Button("2");
		b18.setBounds(100,460,100,70);
		b18.setBackground(new Color(31, 31, 31));
		b18.setForeground(new Color(252,249,249));
		b18.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b18.addActionListener(this);
		b19=new Button("3");
		b19.setBounds(200,460,100,70);
		b19.setBackground(new Color(31, 31, 31));
		b19.setForeground(new Color(252,249,249));
		b19.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b19.addActionListener(this);
		b20=new Button("+");
		b20.setBounds(300,460,100,70);
		b20.setBackground(new Color(31, 31, 31));
		b20.setForeground(new Color(252,249,249));
		b20.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b20.addActionListener(this);
		b21=new Button("+/-");
		b21.setBounds(0,530,100,70);
		b21.setBackground(new Color(31, 31, 31));
		b21.setForeground(new Color(252,249,249));
		b21.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b21.addActionListener(this);
		b22=new Button("0");
		b22.setBounds(100,530,100,70);
		b22.setBackground(new Color(31, 31, 31));
		b22.setForeground(new Color(252,249,249));
		b22.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b22.addActionListener(this);
		b23=new Button(".");
		b23.setBounds(200,530,100,70);
		b23.setBackground(new Color(31, 31, 31));
		b23.setForeground(new Color(252,249,249));
		b23.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b23.addActionListener(this);
		b24=new Button("=");
		b24.setBounds(300,530,100,70);
		b24.setBackground(new Color(31, 31, 31));
		b24.setForeground(new Color(252,249,249));
		b24.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		b24.addActionListener(this);
		add(l1);
		add(tf1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		setLayout(null);
		setSize(400,600);
		setBackground(new Color(20,20,20));
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b9){
			tf1.setText(tf1.getText()+String.valueOf(7));
		}
		if(ae.getSource()==b10){
			tf1.setText(tf1.getText()+String.valueOf(8));
		}
		if(ae.getSource()==b11){
			tf1.setText(tf1.getText()+String.valueOf(9));
		}
		if(ae.getSource()==b13){
			tf1.setText(tf1.getText()+String.valueOf(4));
		}
		if(ae.getSource()==b14){
			tf1.setText(tf1.getText()+String.valueOf(5));
		}
		if(ae.getSource()==b15){
			tf1.setText(tf1.getText()+String.valueOf(6));
		}
		if(ae.getSource()==b17){
			tf1.setText(tf1.getText()+String.valueOf(1));
		}
		if(ae.getSource()==b18){
			tf1.setText(tf1.getText()+String.valueOf(2));
		}
		if(ae.getSource()==b19){
			tf1.setText(tf1.getText()+String.valueOf(3));
		}
		if(ae.getSource()==b22){
			tf1.setText(tf1.getText()+String.valueOf(0));
		}
		if(ae.getSource()==b23)
			tf1.setText(tf1.getText()+".");
			
		if(ae.getSource()==b12){
			a=Double.parseDouble(tf1.getText());
			tf1.setText("");
			flag1=true;
		}
		
		if(ae.getSource()==b20)
		{
			a=Double.parseDouble(tf1.getText());
			tf1.setText("");
			flag2=true;
		}
		
		if(ae.getSource()==b16)
		{
			a=Double.parseDouble(tf1.getText());
			tf1.setText("");
			flag3=true;
		}
		
		if(ae.getSource()==b8)
		{
			a=Double.parseDouble(tf1.getText());
			tf1.setText("");
			flag4=true;
		}
		
		if(ae.getSource()==b1 && flag1 || flag2 || flag3 || flag4)
		{
			c1=tf1.getText();
			c=Double.parseDouble(c1);
			c*=0.001;
			tf1.setText(String.valueOf(c));
		}
		
		if(ae.getSource()==b3)
		{
			tf1.setText("0");
		}
			
		if(ae.getSource()==b21)
		{
			if(Double.parseDouble(tf1.getText())<0)
			{
				a=-(Double.parseDouble(tf1.getText()));
				tf1.setText(String.valueOf(a));
			}
			else
			{
				a=-(Double.parseDouble(tf1.getText()));
				tf1.setText(String.valueOf(a));
			}
		}	
		
		if(ae.getSource()==b5)
		{
			a=Double.parseDouble(tf1.getText());
			c=1.0/a;
			c1=String.valueOf(c);
			c2=c1.substring(0,5);
			tf1.setText(c2);
		}
		
		if(ae.getSource() == b6) {
		a = Double.parseDouble(tf1.getText());
		c = a * a;
		c1 = String.valueOf(c);
		if (c1.contains(".")) {
			int decimalIndex = c1.indexOf(".");
			if (c1.length() - decimalIndex > 4) { 
            c2 = c1.substring(0, decimalIndex + 4); 
            tf1.setText(c2);
			} else {
            tf1.setText(c1);
        }
    } else {
        tf1.setText(c1);
    }
}

		
		if(ae.getSource()==b7)
		{
			a=Double.parseDouble(tf1.getText());
			c=Math.sqrt(a);
			c1=String.valueOf(c);
			if(c1.length()>5)
			c2=c1.substring(0,5);
			
			tf1.setText(c2);
		}
		if(ae.getSource()==b2)
		{
			if(flag6){
			tf1.setText(tf1.getText()+String.valueOf(d));
			flag6=false;
			}
			else{
			d=Double.parseDouble(tf1.getText());
			tf1.setText("0");
			flag6=true;
			}
		}
		
		if(ae.getSource()==b4)
		{
			c1=tf1.getText();
			if(c1.length()==1)
			tf1.setText("0");
			else{
			c2=c1.substring(0,c1.length()-1);
			tf1.setText(c2);
			}
		}	
					
		if(ae.getSource()==b24)
		{
			b=Double.parseDouble(tf1.getText());
			if(flag1){
			c=a*b;
			tf1.setText(String.valueOf(c));
			flag1=false;
			}
			
			if(flag2)
			{
				c=a+b;
				tf1.setText(String.valueOf(c));
				flag2=false;
			}
			
			if(flag3)
			{
				c=a-b;
				tf1.setText(String.valueOf(c));
				flag3=false;
			}
			
			if(flag4)
			{
				c=a/b;
				tf1.setText(String.valueOf(c));
				flag4=false;
			}
			
			
		}
	}
	
	public static void main(String args[])
	{
		new ABC();
	}
}