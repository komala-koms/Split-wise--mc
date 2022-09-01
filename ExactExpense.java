import java.util.List;

public class ExactExpense extends Expense{

	public ExactExpense(double amount, User paidBy, List<Split> splits) {
		super(amount, paidBy, splits);
		// TODO Auto-generated constructor stub
	}
	
	public boolean validate() {
        for (Split split : getSplits()) {
            if (!(split instanceof ExactSplit)) {
                return false;
            }
        }
	double totalAmount = getAmount();
	double sumSplitAmount = 0;
	for(Split split : getSplits())
	{
		sumSplitAmount += split.getAmount();
	}
	if(totalAmount != sumSplitAmount)
		return false;
	return true;
	}
}