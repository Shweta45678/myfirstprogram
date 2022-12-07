//============slip 8_3=========//
package Game;
class Indoor
{
String pn,gn;
public Indoor(String  game_name,String player_name)
{
gn=game_name;
pn=player_name;
}
void In_display(String g)
{
if(g.equals(gn))
{
System.out.println("The Indoor Game player name is = "+pn);
}
}
}
