public class SportsmenCommandSwim implements SportsmenCommand
{
   @Override public String execute(Sportsmen sportsmen) { return sportsmen.swim(); }
   @Override public String toString() { return "Swim"; }
}
