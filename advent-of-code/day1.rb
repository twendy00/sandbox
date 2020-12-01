=begin
--- Day 1: Report Repair ---
After saving Christmas five years in a row, you've decided to take a vacation at a nice resort on a tropical island. Surely, Christmas will go on without you.
The tropical island has its own currency and is entirely cash-only. The gold coins used there have a little picture of a starfish; the locals just call them stars. None of the currency exchanges seem to have heard of them, but somehow, you'll need to find fifty of these coins by the time you arrive so you can pay the deposit on your room.
To save your vacation, you need to get all fifty stars by December 25th.
Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar; the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!
Before you leave, the Elves in accounting just need you to fix your expense report (your puzzle input); apparently, something isn't quite adding up.
Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.
For example, suppose your expense report contained the following:

1721
979
366
299
675
1456

In this list, the two entries that sum to 2020 are 1721 and 299. Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.
Of course, your expense report is much larger. Find the two entries that sum to 2020; what do you get if you multiply them together?

  PART 2:
The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had left over from a past vacation. They offer you a second one if you can find three numbers in your expense report that meet the same criteria.
Using the above example again, the three entries that sum to 2020 are 979, 366, and 675. Multiplying them together produces the answer, 241861950.
In your expense report, what is the product of the three entries that sum to 2020?
=end

file = File.open("day1_inputs.txt")
file_data = file.readlines.map(&:chomp)
file.close

expense_report = 
  file_data.map do |expense|
    expense.to_i
  end

expense_2020 = []

def identify_2020_expenses(report, array)
  report.each do |expense|
    report.each do |other_expense|
      report.each do |third_expense|
        summed_entry = expense + other_expense + third_expense
        if summed_entry == 2020
          array << expense
          array << other_expense
          array << third_expense
          break
        end
      end
    end
  end
end

def multiply_2020_expenses(expenses)
  expenses.uniq!
  multiplied_expenses = expenses[0] * expenses[1] * expenses[2]
end

identify_2020_expenses(expense_report, expense_2020)
multiplied_2020_expenses = multiply_2020_expenses(expense_2020)
p multiplied_2020_expenses
