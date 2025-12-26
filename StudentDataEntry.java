import java.util.*;
class joker
{
public static void main(String args[])throws Exception
{
	int a=0,b=0,k;
	int ch=0,n,c=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter total room");
	n=s.nextInt();
	details d[][]=new details[n][4];
	int r[]=new int[n];
	do
	{
		if(n<=0)
			break;
		else
		{
		System.out.println("1.Student detail entry\n2.Student search\n3.Room available");
		ch=s.nextInt();
		if(ch==1)
		{
			if(c==-1)
			{
				System.out.println("rooms Filled");
			}
			else if((a>=0&&a<n)||c!=-1)
			{
				System.out.println("a="+(a+1));
				if(b<4)
				{
					System.out.println("b="+(b+1));
					d[a][b]=new details();
					d[a][b].stentry();
					r[a]=r[a]+1;
					b++;
					if(b==4)
					{
						b=0;
						a++;
					}
					if(a==n)
						c=-1;
				}
			}
		}
		else if(ch==2)
		{
			int se=0,rn=-1,sn=-1;
			long sregno;
			System.out.print("enter Search student registerno :");
			sregno=s.nextLong();
			if(c==-1)
				k=a-1;
			else 
				k=a;
			for(int i=0;i<=k;i++)
			{
				for(int j=0;j<r[i];j++)
				{
					if((d[i][j].regno)==sregno)
					{
						rn=i;
						sn=j;
						se++;
					}
					
				}
			}
			if(se==1)
			{
				System.out.println("********      Student Exists      *******/n");
				System.out.println("******     Student Details       *******/n");
				System.out.println("Student Register no           :"+(d[rn][sn].regno));
				System.out.println("Student Roomno                :"+(rn+1));
				System.out.println("Student Name                     :"+(d[rn][sn].name));
				System.out.println("Student Department          :"+(d[rn][sn].dep));
				System.out.println("Student Address     	       :"+(d[rn][sn].address));
				System.out.println("Student Phoneno     	       :"+(d[rn][sn].phoneno));
				se=0;
			}
			else if(se>1)
			{
				System.out.println("Students register numbers are same");
			}
			else 
				System.out.println("Student Not Exists");
		}
		else if(ch==3)
		{
			if(c==-1)
				k=a-1;
			else
				k=a;
			int seats_ava=0;
			int rooms_ava=0;
			rooms_ava=n-(k+1);
			if(r[k]>1&&r[k]<=5)
			{
				seats_ava=(rooms_ava*4)+(4-r[k]);
				System.out.println("Rooms & Seats available   :"+rooms_ava+" / "+seats_ava);
			}
			else
			{
				seats_ava=(rooms_ava*4);
				System.out.println("Rooms & Seats available   :"+rooms_ava+" / "+seats_ava);
	
			}
		}
		}
	System.out.println("do you continue press 1");
	ch=s.nextInt();
	}while(ch==1);
	s.close();
}
}
class details
{
	String name,dep,address,phoneno;
	long regno;
	void stentry()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Student name        :");
		name=s.nextLine();
		System.out.print("Student department      :");
		dep=s.nextLine();
		System.out.print("Student regno     :");
		regno=s.nextLong();
		s.nextLine();
		System.out.print("Student address     :");
		address=s.nextLine();
		System.out.print("Student phoneno       :");
		phoneno=s.nextLine();
		s.close();
	}
}
