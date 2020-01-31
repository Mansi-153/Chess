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
		if(evt.getSource()==btn[0])
		i = 0;
		if(evt.getSource()==btn[1])
		i = 1;
		if(evt.getSource()==btn[2])
		i = 2;
		if(evt.getSource()==btn[3])
		i = 3;
		if(evt.getSource()==btn[4])
		i = 4;
		if(evt.getSource()==btn[5])
		i = 5;
		if(evt.getSource()==btn[6])
		i = 6;
		if(evt.getSource()==btn[7])
		i = 7;
		if(evt.getSource()==btn[8])
		i = 8;
		if(evt.getSource()==btn[9])
		i = 9;
		if(evt.getSource()==btn[10])
		i = 10;
		if(evt.getSource()==btn[11])
		i = 11;
		if(evt.getSource()==btn[12])
		i = 12;
		if(evt.getSource()==btn[13])
		i = 13;
		if(evt.getSource()==btn[14])
		i = 14;
		if(evt.getSource()==btn[15])
		i = 15;
		if(evt.getSource()==btn[16])
		i = 16;
		if(evt.getSource()==btn[17])
		i = 17;
		if(evt.getSource()==btn[18])
		i = 18;
		if(evt.getSource()==btn[19])
		i = 19;
		if(evt.getSource()==btn[20])
		i = 20;
		if(evt.getSource()==btn[21])
		i = 21;
		if(evt.getSource()==btn[22])
		i = 22;
		if(evt.getSource()==btn[23])
		i = 23;
		if(evt.getSource()==btn[24])
		i = 24;
		if(evt.getSource()==btn[25])
		i = 25;
		if(evt.getSource()==btn[26])
		i = 26;
		if(evt.getSource()==btn[27])
		i = 27;
		if(evt.getSource()==btn[28])
		i = 28;
		if(evt.getSource()==btn[29])
		i = 29;
		if(evt.getSource()==btn[30])
		i = 30;
		if(evt.getSource()==btn[31])
		i = 31;
		if(evt.getSource()==btn[32])
		i = 32;
		if(evt.getSource()==btn[33])
		i = 33;
		if(evt.getSource()==btn[34])
		i = 34;
		if(evt.getSource()==btn[35])
		i = 35;
		if(evt.getSource()==btn[36])
		i = 36;
		if(evt.getSource()==btn[37])
		i = 37;
		if(evt.getSource()==btn[38])
		i = 38;
		if(evt.getSource()==btn[39])
		i = 39;
		if(evt.getSource()==btn[40])
		i = 40;
		if(evt.getSource()==btn[41])
		i = 41;
		if(evt.getSource()==btn[42])
		i = 42;
		if(evt.getSource()==btn[43])
		i = 43;
		if(evt.getSource()==btn[44])
		i = 44;
		if(evt.getSource()==btn[45])
		i = 45;
		if(evt.getSource()==btn[46])
		i = 46;
		if(evt.getSource()==btn[47])
		i = 47;
		if(evt.getSource()==btn[48])
		i = 48;
		if(evt.getSource()==btn[49])
		i = 49;
		if(evt.getSource()==btn[50])
		i = 50;
		if(evt.getSource()==btn[51])
		i = 51;
		if(evt.getSource()==btn[52])
		i = 52;
		if(evt.getSource()==btn[53])
		i = 53;
		if(evt.getSource()==btn[54])
		i = 54;
		if(evt.getSource()==btn[55])
		i = 55;
		if(evt.getSource()==btn[56])
		i = 56;
		if(evt.getSource()==btn[57])
		i = 57;
		if(evt.getSource()==btn[58])
		i = 58;
		if(evt.getSource()==btn[59])
		i = 59;
		if(evt.getSource()==btn[60])
		i = 60;
		if(evt.getSource()==btn[61])
		i = 61;
		if(evt.getSource()==btn[62])
		i = 62;
		if(evt.getSource()==btn[63])
		i = 63;

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
		if(evt.getSource()==btn[0])
		j = 0;
		if(evt.getSource()==btn[1])
		j = 1;
		if(evt.getSource()==btn[2])
		j = 2;
		if(evt.getSource()==btn[3])
		j = 3;
		if(evt.getSource()==btn[4])
		j = 4;
		if(evt.getSource()==btn[5])
		j = 5;
		if(evt.getSource()==btn[6])
		j = 6;
		if(evt.getSource()==btn[7])
		j = 7;
		if(evt.getSource()==btn[8])
		j = 8;
		if(evt.getSource()==btn[9])
		j = 9;
		if(evt.getSource()==btn[10])
		j = 10;
		if(evt.getSource()==btn[11])
		j = 11;
		if(evt.getSource()==btn[12])
		j = 12;
		if(evt.getSource()==btn[13])
		j = 13;
		if(evt.getSource()==btn[14])
		j = 14;
		if(evt.getSource()==btn[15])
		j = 15;
		if(evt.getSource()==btn[16])
		j = 16;
		if(evt.getSource()==btn[17])
		j = 17;
		if(evt.getSource()==btn[18])
		j = 18;
		if(evt.getSource()==btn[19])
		j = 19;
		if(evt.getSource()==btn[20])
		j = 20;
		if(evt.getSource()==btn[21])
		j = 21;
		if(evt.getSource()==btn[22])
		j = 22;
		if(evt.getSource()==btn[23])
		j = 23;
		if(evt.getSource()==btn[24])
		j = 24;
		if(evt.getSource()==btn[25])
		j = 25;
		if(evt.getSource()==btn[26])
		j = 26;
		if(evt.getSource()==btn[27])
		j = 27;
		if(evt.getSource()==btn[28])
		j = 28;
		if(evt.getSource()==btn[29])
		j = 29;
		if(evt.getSource()==btn[30])
		j = 30;
		if(evt.getSource()==btn[31])
		j = 31;
		if(evt.getSource()==btn[32])
		j = 32;
		if(evt.getSource()==btn[33])
		j = 33;
		if(evt.getSource()==btn[34])
		j = 34;
		if(evt.getSource()==btn[35])
		j = 35;
		if(evt.getSource()==btn[36])
		j = 36;
		if(evt.getSource()==btn[37])
		j = 37;
		if(evt.getSource()==btn[38])
		j = 38;
		if(evt.getSource()==btn[39])
		j = 39;
		if(evt.getSource()==btn[40])
		j = 40;
		if(evt.getSource()==btn[41])
		j = 41;
		if(evt.getSource()==btn[42])
		j = 42;
		if(evt.getSource()==btn[43])
		j = 43;
		if(evt.getSource()==btn[44])
		j = 44;
		if(evt.getSource()==btn[45])
		j = 45;
		if(evt.getSource()==btn[46])
		j = 46;
		if(evt.getSource()==btn[47])
		j = 47;
		if(evt.getSource()==btn[48])
		j = 48;
		if(evt.getSource()==btn[49])
		j = 49;
		if(evt.getSource()==btn[50])
		j = 50;
		if(evt.getSource()==btn[51])
		j = 51;
		if(evt.getSource()==btn[52])
		j = 52;
		if(evt.getSource()==btn[53])
		j = 53;
		if(evt.getSource()==btn[54])
		j = 54;
		if(evt.getSource()==btn[55])
		j = 55;
		if(evt.getSource()==btn[56])
		j = 56;
		if(evt.getSource()==btn[57])
		j = 57;
		if(evt.getSource()==btn[58])
		j = 58;
		if(evt.getSource()==btn[59])
		j = 59;
		if(evt.getSource()==btn[60])
		j = 60;
		if(evt.getSource()==btn[61])
		j = 61;
		if(evt.getSource()==btn[62])
		j = 62;
		if(evt.getSource()==btn[63])
		j = 63;

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