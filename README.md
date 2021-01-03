# Hector
This is my code, just practicing feel free to comment. Learning to improve on Java skills :). 

2. TASKS
You are developing a simplified contact tracing system for COVID-19. The three (3) main roles in the
system are listed below:
1) Customer – a customer has name, phone, and status. A customer can:

a) Register an account in the system.

b) Sign in the system

c) Check-in a shop

d) View the history of the shops he/she visited

e) View his/her status. A customer status can have 3 possible values: Normal, Case, Close.

i. Normal – The customer is normal.
ii. Case – The customer is a case of COVID-19 positive.
iii. Close – The customer is a close contact of a case. For simplicity, a close contact is anyone who checks in the same shop within one-hour range (inclusive) with
a case. The seconds in check-in time are ignored.

For example, if a case checks in a shop today at 12pm, then:
• A customer who checks in yesterday is not a close contact.

• A customer who checks in today at 10.59am is not a close contact.

• A customer who checks in today at 11am is a close contact.

• A customer who checks in today at 1pm is a close contact.

• A customer who checks in today at 1.01pm is not a close contact.

2) Shop – A shop has name, phone, status, and manager. A shop status can have 2 possible values: Normal, Case.

3) Admin – a government agency who can:
a) View the details of all customers, the details of all shops, the master visit history.

b) Flag (change status) a customer. When a customer is flagged as a Case, the system shall automatically flag:

i. The shop as Case.

ii. All close contacts as Close.

The histories and records shall be displayed in the following format during execution:
Master visit history:
No Date Time Customer Shop
1 2020-12-01 15:10:15 Ali Tesco
History viewed by a customer:
No Date Time Shop
1 2020-12-01 15:10:15 Tesco
List of customers viewed by admin:
No Name Phone Status
1 Ali 0121112222 Normal
List of shops viewed by admin:
No Name Phone Manager Status
1 Tesco 0388889999 Siti Normal

Design your classes, data fields, and methods wisely. You may add classes or data fields to support
inheritance, association, aggregation, composition, or significant features. Do not over design (adding
classes, data fields, or methods that do not help solving the assignment, e.g. full address).
To make testing easier and save time during interview, your program shall have the following
features:
i. Never clear screen.
ii. Pre-load with 5 customers (when the program starts).
iii. Pre-load with 4 shops.
iv. Have a feature to add 30 random visits to the master visit history (random shops, random visitors, time ranging from yesterday until current system time). 
Sort the master visit history by date and time.
