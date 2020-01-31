import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Ches implements ActionListener
{  
   int i,j,temp=0,x,y,k,c=0;
   JFrame fr;
   JPanel pa, pa1;
   GridLayout g1;
   Icon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic10,ic11,ic12,ic13;
   JLabel l1,l2,l3;
  JTextField t1,t2;
   JButton bt;
   JButton btn[] = new JButton[64];
   static int op=0;
  int play=0;
   public Ches()
   { 
      fr = new JFrame();
      pa = new JPanel();
      pa1 = new JPanel();
      fr.setSize(1800,1050);
      fr.getContentPane().add(pa);
      fr.getContentPane().add(pa1);
     l1 = new JLabel("Enter Player 1");
     l2 = new JLabel("Enter Player 2");
     l3 = new JLabel();
     bt = new JButton("RESET THE GAME");
     t1 = new JTextField(10);
     t2 = new JTextField(10);
     l3.setBounds(1500,0,300,1050);
     l1.setBounds(1500,100,100,30);
     l2.setBounds(1500,150,100,30);
     t1.setBounds(1650,100,100,30);
     t2.setBounds(1650,150,100,30);
    bt.setBackground(Color.black);
    bt.setForeground(Color.white);
    bt.setBounds(1550,600,200,70);
    pa1.add(bt);
      ic1 = new ImageIcon("elep b.png");
      ic2 = new ImageIcon("horse b.png");
      ic3 = new ImageIcon("bishopb.png");
      ic4 = new ImageIcon("king b.png");
      ic5 = new ImageIcon("queen b.png");
      ic6 = new ImageIcon("sol b.png");
      ic7 = new ImageIcon("elep w.png");
      ic8 = new ImageIcon("horse w.png");
      ic9 = new ImageIcon("bishopw.png");
      ic10 = new ImageIcon("queen w.png");
      ic11 = new ImageIcon("king w.png");
      ic12 = new ImageIcon("sol w.png");
      ic13 = new ImageIcon("cong.jpg");
      g1 = new GridLayout(8,8);
      pa.setLayout(g1);
      pa.setBounds(0,0,1500,1050);
     pa1.setBounds(1500,0,300,1050);
     pa1.setLayout(null);
      for(x=0;x<8;x++)
      {
            for(y=0;y<8;y++)
            {
	        k=((x*8)+y);

                btn[k] = new JButton();
		btn[k].addActionListener(this);
                pa.add(btn[k]);
                if(x%2==0)
                {
                   if(y%2==0)
                   {
                        btn[k].setBackground(Color.black);
                   }
                   else 
		   {	
                        btn[k].setBackground(Color.white);

		   }

               }
               else
               {
                    if(y%2==0)
		    {
                        btn[k].setBackground(Color.white);

		    }

                    else
		    {
                        btn[k].setBackground(Color.black);

                    }
               }
		if(x==1)
			btn[k].setIcon(ic6);
		if(x==6)
			btn[k].setIcon(ic12);
		
            }
        }
	btn[0].setIcon(ic1);
	btn[1].setIcon(ic2);
	btn[2].setIcon(ic3);
	btn[3].setIcon(ic5);
	btn[4].setIcon(ic4);
	btn[5].setIcon(ic3);
	btn[6].setIcon(ic2);
	btn[7].setIcon(ic1);
	btn[63].setIcon(ic7);
	btn[62].setIcon(ic8);
	btn[61].setIcon(ic9);
	btn[60].setIcon(ic10);
	btn[59].setIcon(ic11);
	btn[58].setIcon(ic9);
	btn[57].setIcon(ic8);
	btn[56].setIcon(ic7);
	bt.addActionListener(this);

	pa1.add(l3); pa1.add(l1);pa1.add(l2);pa1.add(t1);pa1.add(t2);
	fr.setVisible(true);
	fr.setDefaultCloseOperation(2);  
     }
public void actionPerformed(ActionEvent evt)
{
	t1.setEditable(false);
	t2.setEditable(false);
	if(evt.getSource()==bt)
		new Ches();
	l3.setIcon(null);
	if(temp==0)
	{
		for(int r=0;r<64;r++)
		{
			if(evt.getSource()==btn[r])
			i = r;
		}
		
		if(play==1 || play==2)
		{		
			if(play==1)
			{
				if(btn[i].getIcon()==ic1 || btn[i].getIcon()==ic2 || btn[i].getIcon()==ic3 || btn[i].getIcon()==ic4 || btn[i].getIcon()==ic5 || btn[i].getIcon()==ic6)
				{
					temp=100;
					play=2;
				}
				if(btn[i].getIcon()==ic7 || btn[i].getIcon()==ic8 || btn[i].getIcon()==ic9 || btn[i].getIcon()==ic10 || btn[i].getIcon()==ic11 || btn[i].getIcon()==ic12)
				play=2;
			}
			else
			{
				if(btn[i].getIcon()==ic7 || btn[i].getIcon()==ic8 || btn[i].getIcon()==ic9 || btn[i].getIcon()==ic10 || btn[i].getIcon()==ic11 || btn[i].getIcon()==ic12)
				{
					play=1;
					temp=100;
				}
				if(btn[i].getIcon()==ic1 || btn[i].getIcon()==ic2 || btn[i].getIcon()==ic3 || btn[i].getIcon()==ic4 || btn[i].getIcon()==ic5 || btn[i].getIcon()==ic6)
				{
					play=1;
				}	
			}
		}
		else
		{
			if(btn[i].getIcon()==ic1 || btn[i].getIcon()==ic2 || btn[i].getIcon()==ic3 || btn[i].getIcon()==ic4 || btn[i].getIcon()==ic5 || btn[i].getIcon()==ic6)
			{
				play=1;
			}
			if(btn[i].getIcon()==ic7 || btn[i].getIcon()==ic8 || btn[i].getIcon()==ic9 || btn[i].getIcon()==ic10 || btn[i].getIcon()==ic11 || btn[i].getIcon()==ic12)
			play=2;
		}	
	}
	if(temp!=0 && temp!=100)
	{
		for(int r=0;r<64;r++)
		{
			if(evt.getSource()==btn[r])
			j = r;
		}
		
		if(temp==1)
		{			
			if((i%8==j%8) || (i/8)==(j/8) && i!=j)
			{
				if(i>j)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c++;
				}
				if((i%8==j%8))
				{
					for(int m=i+8;m<=j-8;m=m+8)
					{
						if(btn[m].getIcon()!=null)
						{
							JOptionPane.showMessageDialog(fr," WRONG!!!!",i+" "+m+" & "+j,2);
							temp=100;
						}
					}
				}	
				else
				{
					for(int m=i+1;m<=j-1;m=m+1)
					{
						if(btn[m].getIcon()!=null)
						{
							JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+" "+m+" & "+j,2);
							temp=100;
						}
					}
				}
				if(c!=0)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c=0;
				}                        				
				if(btn[j].getIcon()!=null)
				{
					if((btn[i].getIcon()==ic1 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic7 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
					{
						if(btn[j].getIcon()==ic10){
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}

						 if(btn[j].getIcon()==ic5){
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);
							l3.setIcon(ic13);
							new Ches();
						}
						
						JOptionPane.showMessageDialog(fr,"killed","yoooooooo!!!",1);
						l3.setIcon(ic13);
						btn[j].setIcon(btn[i].getIcon());
						btn[i].setIcon(null);
					}
					else
					{
						JOptionPane.showMessageDialog(fr,"   "," ",1);
						temp=100;
					}
				}
				else
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}


			}
			else
			{
				JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+" & "+j,2);
				temp=100;
			}
		}
		if(temp==2)
		{
			if(j==i+15 || j==i+17 || j==i-15 || j==i-17 || j==i+6 || j==i+10 || j==i-6 || j==i-10)
			{
				if(btn[j].getIcon()!=null && i!=j)
				{
					if((btn[i].getIcon()==ic2 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic8 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
					{
						if(btn[j].getIcon()==ic10){
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}

						 if(btn[j].getIcon()==ic5){
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}
					

						JOptionPane.showMessageDialog(fr,"killed","yoooooooo!!!",1);
						l3.setIcon(ic13);
						btn[j].setIcon(btn[i].getIcon());
						btn[i].setIcon(null);
					}
					else
					{
						JOptionPane.showMessageDialog(fr,"   "," ",1);
						temp=100;
					}
				}
				else
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}
			} 
			else
			{
				JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+" & "+j,2);
				temp=100;
				
			}
 
			
		}
		if(temp==3)
		{
			if((i-j)%7==0 || ( i-j)%9==0){
			if(( i-j)%9==0)
			{
				if(i>j)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c++;
				}
				for(int m=i+9;m<=j-9;m=m+9)
				{
					if(btn[m].getIcon()!=null)
					{
						JOptionPane.showMessageDialog(fr," WRONG!!!!!!",i+" & "+j,2);
						temp=100;
					}
				}
				if(c!=0)
				{
					i=i+j;
					j=i-j;
					i=i-j;
				}
				if(btn[j].getIcon()!=null)
				{
					if((btn[i].getIcon()==ic3 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic9 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
					{
						if(btn[j].getIcon()==ic10){
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}

						 if(btn[j].getIcon()==ic5){
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}
					

						l3.setIcon(ic13);
						JOptionPane.showMessageDialog(fr,"killed","yoooooooo!!!",1);
						btn[j].setIcon(btn[i].getIcon());
						btn[i].setIcon(null);
					}
					else
					{
						JOptionPane.showMessageDialog(fr,"   "," ",1);
						temp=100;
					}
				}
				else
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}
	
			}
			else
			{
				if(i>j)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c++;
				}

				for(int m=i+7;m<=j-7;m=m+7)
				{
					if(btn[m].getIcon()!=null)
					{
						JOptionPane.showMessageDialog(fr," turn",i+" "+m+" & "+j,1);
						
					}
				}
				if(c!=0)
				{
					i=i+j;
					j=i-j;
					i=i-j;
				}
				if(btn[j].getIcon()!=null)
				{
					if((btn[i].getIcon()==ic3 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic9 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
					{
						if(btn[j].getIcon()==ic10){
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}

						 if(btn[j].getIcon()==ic5){
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);	
							l3.setIcon(ic13);
							new Ches();
						}
					
						l3.setIcon(ic13);
						JOptionPane.showMessageDialog(fr,"killed","yoooooooo!!!",1);
						btn[j].setIcon(btn[i].getIcon());
						btn[i].setIcon(null);
					}
					else
					{
						JOptionPane.showMessageDialog(fr,"   "," ",1);
						temp=100;
					}
				}
				else
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}
			}
			}
			else
			{
				JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+"& "+j,2);
				temp=100;
				
			}


	
		}
		if(temp==4)
		{
			if(i-j==1 || j-i==1 || i-j==8 || j-i==8 || i-j==9 || j-i==9 || i-j==7 || j-i==7)
			{
				if(btn[j].getIcon()!=null)
				{
					if((btn[i].getIcon()==ic5 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic10 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
					{
						if(btn[j].getIcon()==ic10){
							l3.setIcon(ic13);
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							new Ches();
						}

						 if(btn[j].getIcon()==ic5){
							l3.setIcon(ic13);
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);	
							new Ches();
						}
					
						l3.setIcon(ic13);
						JOptionPane.showMessageDialog(fr,"killed","yoooooooo!!!",1);
						btn[j].setIcon(btn[i].getIcon());
						btn[i].setIcon(null);
					}
					else
					{
						JOptionPane.showMessageDialog(fr,"   "," ",1);
						temp=100;
					}
				}
				else
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+" & "+j,2);
				temp=100;
				
			}

		}
		if(temp==5)
		{
			if((i%8==j%8) || (i/8)==(j/8) || (i-j)%7==0 || ( i-j)%9==0)
			{
			if(( i-j)%9==0)
			{
				if(i>j)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c++;
				}

				for(int m=i+9;m<=j-9;m=m+9)
				{
					if(btn[m].getIcon()!=null)
					{
						JOptionPane.showMessageDialog(fr," WRONG!!!!!",i+" & "+j,2);
						temp=100;
					}
				}
				if(c!=0)
				{
					i=i+j;
					j=i-j;
					i=i-j;
				}
	
			}
			if((i-j)%7==0)
			{
				if(i>j)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c++;
				}
				for(int m=i+7;m<=j-7;m=m+7)
				{
					if(btn[m].getIcon()!=null)
					{
						JOptionPane.showMessageDialog(fr," WRONG",i+" "+m+" & "+j,2);
						temp=100;
					}
				}
				if(c!=0)
				{
					i=i+j;
					j=i-j;
					i=i-j;
				}
			}		
			if((i%8==j%8) || (i/8)==(j/8))
			{
				if(i>j)
				{
					i=i+j;
					j=i-j;
					i=i-j;
					c++;
				}
				if((i%8==j%8))
				{
				for(int m=i+8;m<=j-8;m=m+8)
				{
					if(btn[m].getIcon()!=null)
					{
						JOptionPane.showMessageDialog(fr," WRONG!!",i+" "+m+" & "+j,2);
						temp=100;
					}
				}
				}
				if((i/8)==(j/8))
				{
				for(int m=i+1;m<=j-1;m=m+1)
				{
					if(btn[m].getIcon()!=null)
					{
						JOptionPane.showMessageDialog(fr," WRONG!!",i+" "+m+" & "+j,2);
						temp=100;
					}
				}
				}
				if(c!=0)
				{
					i=i+j;
					j=i-j;
					i=i-j;
				}
			}
				if(btn[j].getIcon()!=null)
				{
					if((btn[i].getIcon()==ic4 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic11 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
					{
						l3.setIcon(ic13);
						if(btn[j].getIcon()==ic10)
						{
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							new Ches();
						}
						 if(btn[j].getIcon()==ic5)
						{
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);	
							new Ches();
						}
					

						JOptionPane.showMessageDialog(fr,"killed","yoooooooo!!!",1);
						btn[j].setIcon(btn[i].getIcon());
						btn[i].setIcon(null);
					}
					else
					{
						JOptionPane.showMessageDialog(fr,"   "," ",1);
						temp=100;
					}
				}
				else
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+" & "+j,2);
				temp=100;
				
			}


			
		}
		if(temp==6)
		{
			if(i-j==9 || j-i==9 || i-j==7 || j-i==7 || i-j==8 || j-i==8)
			{
				if(i-j==8 && btn[i].getIcon()==ic12 || j-i==8 && btn[i].getIcon()==ic6)
				{
					btn[j].setIcon(btn[i].getIcon());
					btn[i].setIcon(null);
				}
				if((i-j==9 && btn[i].getIcon()==ic12) ||( j-i==9  && btn[i].getIcon()==ic6) ||( i-j==7  && btn[i].getIcon()==ic12) ||( j-i==7 && btn[i].getIcon()==ic6))
				{
					if(btn[j].getIcon()!=null && i!=j)
					{
						if((btn[i].getIcon()==ic6 && (btn[j].getIcon()==ic7 || btn[j].getIcon()==ic8 || btn[j].getIcon()==ic9 || btn[j].getIcon()==ic10 || btn[j].getIcon()==ic11 || btn[j].getIcon()==ic12)) || (btn[i].getIcon()==ic12 && (btn[j].getIcon()==ic1 || btn[j].getIcon()==ic2 || btn[j].getIcon()==ic3 || btn[j].getIcon()==ic4 || btn[j].getIcon()==ic5 || btn[j].getIcon()==ic6)))
						{
							if(btn[j].getIcon()==ic10){
							l3.setIcon(ic13);
							JOptionPane.showMessageDialog(fr,"WON",t1.getText()+" WON ",1);	
							new Ches();
						}

							 if(btn[j].getIcon()==ic5){
							l3.setIcon(ic13);
							JOptionPane.showMessageDialog(fr,"WON",t2.getText()+" WON ",1);	
							new Ches();
						}
					

							btn[j].setIcon(btn[i].getIcon());
							btn[i].setIcon(null);
							l3.setIcon(ic13);
							JOptionPane.showMessageDialog(fr," killed!!!!!!","yoooooooo",1);	
						}
						else
						{
							JOptionPane.showMessageDialog(fr,"wrong","    ",1);
							temp=100;
						}
					}
	
				}	
					
			}
			else
			{
				JOptionPane.showMessageDialog(fr,"WRONG!!!!",i+" & "+j,2);
				temp=100;	
			}
		}

		
	}
	if(temp==0 || temp==100)
	{
		if(temp==0)
		{
			if(btn[i].getIcon()==ic1 || btn[i].getIcon()==ic7)
				temp = 1;
			if(btn[i].getIcon()==ic2 || btn[i].getIcon()==ic8)
				temp = 2;
			if(btn[i].getIcon()==ic3 || btn[i].getIcon()==ic9)
				temp = 3;
			if(btn[i].getIcon()==ic5 || btn[i].getIcon()==ic10)
				temp = 4;
			if(btn[i].getIcon()==ic4 || btn[i].getIcon()==ic11)
				temp = 5;
			if(btn[i].getIcon()==ic6 || btn[i].getIcon()==ic12)
				temp = 6;
		}
		else
		{	
			JOptionPane.showMessageDialog(fr,"WRONG!!!!","kjhkjhkhk",2);	
			temp=0;	
			if(play==1)
				play=2;
			else
				play=1;
		}
	}
	else
	{
		temp=0;
	}
}

     	public static void main(String abc[])
     	{     
		try
		{  
        	     		new Ches();
		 	System.out.println(op);
		}
		catch(NullPointerException e)
		{
		}
	  }
}
