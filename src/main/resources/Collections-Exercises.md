![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Exercises – Java Collections

---

### Exercise 1 – Shopping List

You are managing a shopping list.

- Create an `ArrayList<String>` and add 5 items
- Print all items numbered (1, 2, 3…)
- Remove one item by name
- Print the updated list

---

### Exercise 2 – Unique Cities

You are given the following list of cities — some appear more than once:

```
Stockholm, Gothenburg, Malmö, Stockholm, Uppsala, Gothenburg, Lund
```

- Store them in a collection that automatically handles duplicates
- Print all unique cities and the total count

---

### Exercise 3 – Phone Book

Build a simple phone book.

- Store at least 4 contacts as name → phone number pairs
- Ask the user to enter a name and look it up
- Print the phone number if found, or `Contact not found.` if not

---

### Exercise 4 – Find the Largest

Given this list of numbers:

```
14, 3, 78, 45, 22, 91, 7, 56
```

- Find and print the largest number
- Do not use `Collections.max()` — use a loop

---

### Exercise 5 – Count by Letter

Given a list of names:

```
Anna, Bob, Alice, Charlie, Amanda, David, Amy, Brian
```

- Ask the user to enter a letter
- Count and print how many names start with that letter (case-insensitive)

---

### Exercise 6 – Word Frequency

Given a list of words:

```
apple, banana, apple, orange, banana, apple, grape, orange
```

- Count how many times each word appears
- Print each word and its count, sorted alphabetically

---

### Exercise 7 – Remove Duplicates, Keep Order

Given this list of numbers:

```
4, 7, 2, 7, 9, 4, 1, 9, 3
```

- Produce a new list with duplicates removed, preserving the original order
- Print the result

> **Think about it:** Which collection can help you track what you have already seen?

---

### Exercise 8 – Merge Without Duplicates

Given two lists:

```
List A: 1, 2, 3, 4, 5
List B: 3, 4, 5, 6, 7
```

- Merge them into a single collection with no duplicates
- Print the result and the total count

---

### Exercise 9 – Choose Your Collection: Submission Tracker

You are building a homework submission tracker.

- A student can only submit once — duplicates must be rejected with a message
- You only need to know **whether** a student has submitted, not what they submitted
- The order submissions arrived in does not matter

**Before writing any code:** which collection fits this scenario, and why?  
Write your answer as a comment at the top of your class.

Then implement it:
- Add at least 8 student submissions (include some duplicates)
- Print a rejection message when a duplicate is detected
- Print all submitted students when done

---

### Exercise 10 – Choose Your Collection: Concert Queue

You are managing a waiting queue outside a concert venue.

- People join the back of the queue and are let in from the front (first in, first out)
- You need to add people and remove the next person in line efficiently

**Before writing any code:** which collection fits this scenario, and why?  
Write your answer as a comment at the top of your class.

Then implement it:
- Add at least 6 people to the queue
- Let in (remove and print) 2 people from the front
- Print the remaining queue in order

---

### Exercise 11 – Choose Your Collection: Student Grades

You need to store and look up student grades by name.

- Each student has exactly one grade (0–100)
- You need to find a student's grade quickly by name
- You also need to print all students sorted by grade from highest to lowest

**Before writing any code:** which collection fits best for storage, and how will you handle the sorting step?  
Write your answer as a comment at the top of your class.

Then implement it with at least 6 students.

---

### Exercise 12 – Group by First Letter

Given a list of names:

```
Alice, Bob, Anna, Charlie, Brian, Amanda, Carl
```

- Group the names by their first letter
- Print each group

---

### Exercise 13 – Most Frequent Word

Given a list of words:

```
cat, dog, cat, bird, dog, cat, fish, dog, dog
```

- Find the word that appears most often
- Print it and its count

---

### Exercise 14 – Common Elements

Given two lists:

```
List A: 1, 3, 5, 7, 9, 11
List B: 3, 6, 9, 12, 15
```

- Find all elements that appear in **both** lists
- Each element should appear only once in the result
- Print the common elements

---

### Exercise 15 – Two Sum

Given a list of integers and a target number:

```
Numbers: 2, 7, 11, 15, 4, 6
Target: 13
```

- Find two numbers in the list that add up to the target and print them

> **Think about it:** Can you solve this without a nested loop? Which collection lets you check for a value in constant time?

---

### Exercise 16 – Second Largest

Given a list of numbers:

```
34, 78, 23, 78, 91, 56, 91, 12
```

- Find the second largest **unique** value
- Do not sort the list

---

### Exercise 17 – Top 3 Most Frequent

Given a list of words:

```
java, python, java, c++, python, java, ruby, c++, python, ruby, java
```

- Find the 3 most frequently occurring words
- Print them in order from most to least frequent

---

## Submission

Push your project to GitHub and share the repository link with your instructor.
