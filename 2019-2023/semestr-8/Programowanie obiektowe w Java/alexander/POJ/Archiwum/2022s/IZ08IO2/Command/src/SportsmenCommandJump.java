public class SportsmenCommandJump implements SportsmenCommand
{
   @Override public String execute(Sportsmen sportsmen)
   {
      return sportsmen.Jump();
   }

   @Override public String toString() { return "Jump"; }
}
