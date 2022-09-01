import java.util.List;

public class EqualExpense extends Expense{

	public EqualExpense(double amount, User paidBy, List<Split> splits) {
		super(amount, paidBy, splits);
		// TODO Auto-generated constructor stub
	}

	public boolean validate()
	{
		for(Split split: getSplits())
		{
			if(!(split instanceof EqualSplit))
				return false;
		}
		return true;
	}
}
