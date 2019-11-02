import java.awt.*;  
import javax.swing.JButton;	
import java.awt.event.*; 

public class pro extends Frame implements ActionListener

{
	Choice c1=new Choice();
	Frame f= new Frame();
	final Label label = new Label(); 
	public JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb115,jb16,jb17,jb18;
	int z=1000;	

	pro()
	{	Frame f3=new Frame();//first page
		jb1=new JButton("TO START PRESS HERE");
		f3.setBackground(new Color(128,218,235));
		jb1.setBounds(600,250,250,200);
		
		f3.setSize(1920,1080);  
        	f3.setLayout(null);
	          f3.setVisible(true);
		f3.add(jb1);

		jb1.addActionListener(this);
		
	}
//--------------------------------------------------------------------------
	  public void actionPerformed(ActionEvent e)
	{	if (e.getSource()==jb2)
		{
		Frame FR=new Frame();
		FR.setBackground(new Color(128,218,235));
		Label l2=new Label ("     THE          TRAIN          SELECTED         IS          "+ c1.getItem(c1.getSelectedIndex()));  
 		l2.setBounds(300,200,500,20);  
		FR.add(l2);
		Label l4=new Label("SELECT NUMBER OF PASSANGEERS ");		
		l4.setBounds(350,250,700,50);
		jb3=new JButton("1");
		jb3.setBounds(250,300,50,50);
		jb4=new JButton("2");
		jb4.setBounds(350,300,50,50);
		jb5=new JButton("3");
		jb5.setBounds(450,300,50,50);
		jb6=new JButton("4");
		jb6.setBounds(550,300,50,50);
		jb7=new JButton("5");
		jb7.setBounds(650,300,50,50);
		FR.add(l4);
		FR.add(jb3);
		FR.add(jb4);
		FR.add(jb5);
		FR.add(jb6);
		FR.add(jb7);
		FR.setSize(1920,1080);  
        	FR.setLayout(null);
		  FR.setVisible(true);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		}
//---------------------------------------------------------------------------------
		else if(e.getSource()==jb1)
		{
	 Label l1=new Label ("********* Welcome to Indian Railway Reservation *********");
		
		l1.setBounds(400,175,500,20);
		f.setBackground(new Color(128,218,235));         
        	label.setAlignment(Label.CENTER);  
        	label.setSize(400,100);  
		  jb2=new JButton("SELECT");
		
      		  jb2.setBounds(500,250,100,20);
		f.add(l1);
		setVisible(true);
		setLayout(null);
		c1.setBounds(400,200,300,20); 
		c1.add("RAGDHANI EXPRESS");  
	        c1.add("GARIBRATH ");    
		c1.add(" DURUNTOH EXPRESS");  
        	c1.add("SURYANAGRI ");
        	c1.add("CHENNAI EXPRESS");
		c1.add(" SAURASHTRA MAIL") ;
		c1.add(" SHATABDI EXPRESS");
		c1.add(" JAMMU TAVI");
		c1.add("ARAVALI EXPRESS");
		c1.add("KARNAVATI EXPRESS"); 
	        f.add(c1);
      		f.add(label);
	       f.add(jb2);	
		f.setSize(1920,1080);  
        	f.setLayout(null);
		f.setVisible(true);  
       		 jb2.addActionListener(this);
		}		
//---------------------------------------------------------------------------------
		else if(e.getSource()==jb3)
		{
			Frame f5=new Frame();
			f5.setBackground(new Color(128,218,235));
			Label l5=new Label("*******************************FINAL BILL*******************************");
			l5.setBounds(400,200,700,50);
			Label l6=new Label("NO OF TICKETs SELECTED     x1");
			Label l3=new Label("PRICE PER TICKET= "+z);
			Label l7=new Label("CGST@2.5% ="+25);
			l7.setBounds(415,350,250,20);
			Label l8=new Label("SGST@2.5% ="+25);
			l8.setBounds(415,400,250,20);
			Label l10=new Label("----------------------------------------------------------------------------------------------------");
			l10.setBounds(415,440,400,20);
			Label l9=new Label("TOTAL FARE= "+(z+25+25));
			l9.setBounds(415,480,250,20);
			l3.setBounds(415,310,250,20);
			l6.setBounds(415,255,200,20);
			jb14=new JButton("DONE");
			jb14.setBounds(500,550,100,50);
			jb14.addActionListener(this);
			f5.add(l6);
			f5.add(l3);
			f5.add(l7);
			f5.add(l8);
			f5.add(l9);
			f5.add(l5);
			f5.add(l10);
			f5.add(jb14);
			f5.setSize(1920,1080);  
        		f5.setLayout(null);
			  f5.setVisible(true);
			}
//----------------------------------------------------------------------------------------
		else if(e.getSource()==jb4)
		{
			Frame f6=new Frame();
			f6.setBackground(new Color(128,218,235));
			Label l11=new Label("*******************************FINAL BILL*******************************");
			l11.setBounds(400,200,700,50);
			Label l12=new Label("NO OF TICKETs SELECTED     x2");
			l12.setBounds(415,255,200,20);
			Label l13=new Label("PRICE PER TICKET= "+z);
			l13.setBounds(415,310,250,20);
			Label l14=new Label("CGST@2.5% ="+50);
			l14.setBounds(415,350,250,20);
			Label l15=new Label("SGST@2.5% ="+50);
			l15.setBounds(415,400,250,20);
			Label l16=new Label("----------------------------------------------------------------------------------------------------");
			l16.setBounds(415,440,400,20);
			Label l17=new Label("TOTAL FARE= "+((2*z)+50+50));
			l17.setBounds(415,480,250,20);
			jb14=new JButton("DONE");
			jb14.setBounds(500,550,100,50);
			jb14.addActionListener(this);
			f6.add(l11);
			f6.add(l12);
			f6.add(l13);
			f6.add(l14);
			f6.add(l15);
			f6.add(l16);
			f6.add(l17);
			f6.add(jb14);
			f6.setSize(1920,1080);  
        		f6.setLayout(null);
			 f6.setVisible(true);
			}

//----------------------------------------------------------------------------
		else if(e.getSource()==jb5)
		{
			Frame f7=new Frame();
			f7.setBackground(new Color(128,218,235));
			Label l18=new Label("*******************************FINAL BILL*******************************");
			l18.setBounds(400,200,700,50);
			Label l19=new Label("NO OF TICKETs SELECTED     x3");
			l19.setBounds(415,255,200,20);
			Label l20=new Label("PRICE PER TICKET= "+z);
			l20.setBounds(415,310,250,20);
			Label l21=new Label("CGST@2.5% ="+75);
			l21.setBounds(415,350,250,20);
			Label l22=new Label("SGST@2.5% ="+75);
			l22.setBounds(415,400,250,20);
			Label l23=new Label("----------------------------------------------------------------------------------------------------");
			l23.setBounds(415,440,400,20);
			Label l24=new Label("TOTAL FARE= "+((3*z)+75+75));
			l24.setBounds(415,480,250,20);
			jb14=new JButton("DONE");
			jb14.setBounds(500,550,100,50);
			jb14.addActionListener(this);
			f7.add(l18);
			f7.add(l19);
			f7.add(l20);
			f7.add(l21);
			f7.add(l22);
			f7.add(jb14);
			f7.add(l23);
			f7.add(l24);
			f7.setSize(1920,1080);  
        		f7.setLayout(null);
			 f7.setVisible(true);
			}
//----------------------------------------------------------------------------
		else if(e.getSource()==jb6)
		{
			Frame f8=new Frame();
			f8.setBackground(new Color(128,218,235));
			Label l25=new Label("*******************************FINAL BILL*******************************");
			l25.setBounds(400,200,700,50);
			Label l26=new Label("NO OF TICKETs SELECTED     x4");
			l26.setBounds(415,255,200,20);
			Label l27=new Label("PRICE PER TICKET= "+z);
			l27.setBounds(415,310,250,20);
			Label l28=new Label("CGST@2.5% ="+100);
			l28.setBounds(415,350,250,20);
			Label l29=new Label("SGST@2.5% ="+100);
			l29.setBounds(415,400,250,20);
			Label l30=new Label("----------------------------------------------------------------------------------------------------");
			l30.setBounds(415,440,400,20);
			Label l31=new Label("TOTAL FARE= "+((4*z)+100+100));
			l31.setBounds(415,480,250,20);
			jb14=new JButton("DONE");
			jb14.setBounds(500,550,100,50);
			jb14.addActionListener(this);	
			f8.add(l25);
			f8.add(l26);
			f8.add(l27);
			f8.add(l28);
			f8.add(l29);
			f8.add(l30);
			f8.add(l31);
			f8.add(jb14);
			f8.setSize(1920,1080);  
        		f8.setLayout(null);
			f8.setVisible(true);
		}	
//----------------------------------------------------------------------------
	else if(e.getSource()==jb7)
		{
			Frame f9=new Frame();
			f9.setBackground(new Color(128,218,235));
			Label f32=new Label("*******************************FINAL BILL*******************************");
			f32.setBounds(400,200,700,50);
			Label f33=new Label("NO OF TICKETs SELECTED     x5");
			f33.setBounds(415,255,200,20);
			Label f34=new Label("PRICE PER TICKET= "+z);
			f34.setBounds(415,310,250,20);
			Label f35=new Label("CGST@2.5% ="+125);
			f35.setBounds(415,350,250,20);
			Label f36=new Label("SGST@2.5% ="+125);
			f36.setBounds(415,400,250,20);
			Label f37=new Label("----------------------------------------------------------------------------------------------------");
			f37.setBounds(415,440,400,20);
			Label f38=new Label("TOTAL FARE= "+((5*z)+125+125));
			f38.setBounds(415,480,250,20);
			jb14=new JButton("DONE");
			jb14.setBounds(500,550,100,50);
			jb14.addActionListener(this);	
			f9.add(f32);
			f9.add(f33);
			f9.add(f34);
			f9.add(f35);
			f9.add(f36);
			f9.add(f37);
			f9.add(f38);
			
			f9.add(jb14);
			f9.setSize(1920,1080);  
        		f9.setLayout(null);
			f9.setVisible(true);
			}	
//----------------------------------------------------------------------------
	else if(e.getSource()==jb14)
		{
			System.exit(0);
		}

	}
//-------------------------------------------------------------------------------	
	public static void main(String args[])
	{
		pro p=new pro();
	}
}
