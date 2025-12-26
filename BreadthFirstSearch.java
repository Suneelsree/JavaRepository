import java.util.*;
class main1
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter vertix");
  int n=s.nextInt();
  int a[][]=new int[n][n];
  int qu[]=new int[n];
  int visit[]=new int[n];
  bfs b=new bfs();
  b.input(a);
  b.logic(a,qu,visit);
  s.close();
}
}
class bfs
{
  int st,n;
  void input(int a[][])
  {
  Scanner s=new Scanner(System.in);
  n=a.length;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
        System.out.println("enter vertix    "+i+"  &  "+j);
        a[i][j]=s.nextInt();
    }
  }
  System.out.println("enter starting vertix");
  st=s.nextInt();
  s.close();
}
void logic(int a[][],int visit[],int qu[])
{
  int front=0;
  int rear=0;
  qu[rear++]=st;
  visit[st]=1;
  for(int i=front;i<rear;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(a[qu[i]][j]==1&&visit[j]!=1)
      {
        qu[rear++]=j;
        visit[j]=1;
      }
    }
  }
  System.out.println("matrix");
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
        System.out.print(a[i][j]+"	");
    }
    System.out.println();
  }
  System.out.println("BFS VERTIX");
  for(int i=front;i<rear;i++)
  	System.out.println(qu[i]);
  }
}
