import java.util.List;

public class PercentExpense extends Expense{

	public PercentExpense(double amount, User paidBy, List<Split> splits) {
		super(amount, paidBy, splits);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		for (Split split : getSplits()) {
            if (!(split instanceof PercentSplit)) {
                return false;
            }
        }

        double totalPercent = 100;
        double sumSplitPercent = 0;
        for (Split split : getSplits()) {
            PercentSplit percentSplit = (PercentSplit) split;
            sumSplitPercent += percentSplit.getPercent();
        }

        if (totalPercent != sumSplitPercent) {
            return false;
        }

        return true;
	}

}
