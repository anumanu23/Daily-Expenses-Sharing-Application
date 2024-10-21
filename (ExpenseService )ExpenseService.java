@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public void addExpense(Expense expense) {
        // Validate input, calculate splits based on method, and save expense
    }

    // Other methods for retrieving expenses and generating balance sheets
}
