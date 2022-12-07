//============slip 8_3=========//

package Game;
import Game.Indoor;
import Game.Outdoor;
import java.io.*;
class game
{
public static void main(String arr[])throws IOException
{
int n,i;
String pn,gn;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter how many player for indoor game = ");
n=Integer.parseInt(br.readLine());
Indoor in[]=new Indoor[n];
for(i=0;i<n;i++)
{
System.out.print("Enter a game name = ");
gn=br.readLine();
System.out.print("Enter a player name = ");
pn=br.readLine();
in[i]=new Indoor(gn,pn);
}
System.out.print("Enter a game name for specific player for indoor = ");
gn=br.readLine();

for(i=0;i<n;i++)
{
in[i].In_display(gn);
}
System.out.println();

System.out.print("enter how many player for Outdoor game = ");
n=Integer.parseInt(br.readLine());
Outdoor out[]=new Outdoor[n];
for(i=0;i<n;i++)
{
System.out.print("Enter a game name = ");
gn=br.readLine();
System.out.print("Enter a player name = ");
pn=br.readLine();
out[i]=new Outdoor(gn,pn);
}
System.out.print("Enter a game name for specific player for outdoor = ");
gn=br.readLine();

for(i=0;i<n;i++)
{
out[i].Out_display(gn);
}
}
}


/*=======================output====================
smj@smj-virtual-machine:~$ javac /home/smj/Game/game.java
smj@smj-virtual-machine:~$ java Game.game
enter how many player for indoor game = 2
Enter a game name = shoot
Enter a player name = ankit
Enter a game name = fight
Enter a player name = ajit
Enter a game name for specific player for indoor = shoot
The Indoor Game player name is = ankit

enter how many player for Outdoor game = 2
Enter a game name = cricket
Enter a player name = atul
Enter a game name = basketboll
Enter a player name = shubham 
Enter a game name for specific player for outdoor = shubham
The Outdoor player name is = basketboll
smj@smj-virtual-machine:~$ 
*/
