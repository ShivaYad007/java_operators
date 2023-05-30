public class UnaryOperators1
{
	public static void main(String [] args)
{
	int x=3;
	int y=x--+--x-x++-x--+x++-x--+--x+x++;
	System.out.println(x+","+y);
}
}