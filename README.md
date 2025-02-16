# Assignment_4
Bank Automation App Development
Student Name: Md Monjurul Karim

Problem Statement
------------------
Part- 1
You're building an app to automate investing. In this app, every time a payment is received, we will select which account the funds should be invested in. Create a method that takes 3 parameters: savingsAccountBalance, indexFundBalance, and depositAmount. If the savings account contains over $50,000, add the deposit amount to the index funds. Otherwise, add the amount to the savings account. Return a string that specifies which account was updated, and what the new balance is. For example:
"Savings account updated. New balance: $500.22"

Part- 2 (Bonus Part)
BONUS (2 points): (must be submitted before the due date to receive bonus)
What if the savings account contained an amount less than 50,000 but the added funds would bring the amount over 50,000. Find a way to split the new funds such that we bring the savings account to 50,000 and then add the additional funds to the indexFund. Return a string as follows:

"Savings account updated. New balance: $50000.00.
Index Funds updated. New balance: $23,000.56"
