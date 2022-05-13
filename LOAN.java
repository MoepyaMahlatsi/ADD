public class LOAN{
	public stactic void main(string[] args){
// create an object of Scanner class
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();
   System.out.print("Enter the time: ");
    double time = input.nextDouble();
    double interest = (principal * time * 7) / 100;
    System.out.println("Simple Interest: " + interest);
    input.close();
  }
}

