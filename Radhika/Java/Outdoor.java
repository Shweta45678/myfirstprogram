//============slip 8_3=========//

package Game;
class Outdoor
{
String pn,gn;
public Outdoor(String player_name,String game_name)
{
pn=player_name;
gn=game_name;
}
void Out_display(String g)
{
if(gn.equals(g))
{
System.out.println("The Outdoor player name is = "+pn);
}
}
}
