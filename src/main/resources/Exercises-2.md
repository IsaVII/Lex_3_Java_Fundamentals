![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Java Exercises – Part 2

---

## Project Setup

Continue using the Maven project you created in Part 1. 

Use Git regularly throughout the exercises:
* Commit your changes after completing each exercise.
* Write clear and meaningful commit messages.
* Push your commits to GitHub regularly as you progress.

---

## Exercise 1 – Word Reverser

### Question
Ask the user to enter a word. Reverse it using `StringBuilder` and print the result.

**Example interaction:**
```text
Enter a word: Stockholm
Reversed: mlohkcotS
```

---

## Exercise 2 – Email Slicer

### Question
Ask the user to enter an email address. Use `indexOf()` and `substring()` to extract and print the username and the domain separately.

**Example interaction:**
```text
Enter email: mehrdad.javan@lexicon.se
Username: mehrdad.javan
Domain  : lexicon.se
```

---

## Exercise 3 – String Stats

### Question
Ask the user to enter a sentence. Loop through every character and count how many are vowels, consonants, digits, and spaces. Print the summary.

**Example interaction:**
```text
Enter a sentence: Java 101 is fun
Vowels    : 5
Consonants: 5
Digits    : 3
Spaces    : 3
```

---

## Exercise 4 – Initials Generator

### Question
Ask the user to enter their full name (first, optional middle, last — separated by spaces). Print the initials in dot notation, all uppercase.

**Example interaction:**
```text
Enter full name: mehrdad javan
Initials: M.J.
```

---

## Exercise 5 – Palindrome Checker

### Question
Ask the user to enter a word. Check whether it is a palindrome — the same forwards and backwards — ignoring case. Print the result.

**Example interaction:**
```text
Enter a word: Racecar
Racecar is a palindrome.
```

```text
Enter a word: Java
Java is NOT a palindrome.
```

---

## Exercise 6 – Word Counter

### Question
Ask the user to enter a sentence. Count how many words it contains and how many times a specific word appears in it. The search should be case-insensitive.

**Example interaction:**
```text
Enter a sentence  : To be or not to be that is the question
Enter word to find: be
Total words : 10
"be" appears: 2 times
```

---

## Exercise 7 – Circle Calculator

### Question
Ask the user to enter the radius of a circle. Calculate and print the area and the circumference. Round both results to two decimal places.

Formulas:
- Area: `π × r²`
- Circumference: `2 × π × r`

**Example interaction:**
```text
Enter radius: 7
Area         : 153.94
Circumference: 43.98
```

---

## Exercise 8 – Power Table

### Question
Ask the user to enter a base number. Print its powers from 1 to 10 using `Math.pow`.

**Example interaction:**
```text
Enter base: 3
3 ^ 1  =       3.0
3 ^ 2  =       9.0
3 ^ 3  =      27.0
3 ^ 4  =      81.0
3 ^ 5  =     243.0
3 ^ 6  =     729.0
3 ^ 7  =    2187.0
3 ^ 8  =    6561.0
3 ^ 9  =   19683.0
3 ^ 10 =   59049.0
```

---

## Exercise 9 – Right Triangle Checker

### Question
Ask the user to enter the lengths of three sides of a triangle. Check whether it is a right triangle using the Pythagorean theorem. Also print the length of the longest side.

**Example interaction:**
```text
Enter side a: 3
Enter side b: 4
Enter side c: 5
Longest side: 5.0
This IS a right triangle.
```

```text
Enter side a: 3
Enter side b: 4
Enter side c: 6
Longest side: 6.0
This is NOT a right triangle.
```

---

## Exercise 10 – Number Cruncher

### Question
Write three `static` methods: `findMax(int a, int b, int c)`, `findMin(int a, int b, int c)`, and `average(int a, int b, int c)`. Ask the user to enter three integers, then print the maximum, minimum, and average using those methods.

**Example interaction:**
```text
Enter first number : 42
Enter second number: 7
Enter third number : 19
Maximum : 42
Minimum : 7
Average : 22.67
```

---

## Exercise 11 – Dice Statistics

### Question
Ask the user how many times to roll two six-sided dice. Roll them that many times, print each individual roll, and at the end print how many times the result was a double (both dice show the same value).

**Example interaction:**
```text
How many rolls? 5
Roll 1: 3 + 3 = 6  DOUBLE!
Roll 2: 5 + 2 = 7
Roll 3: 1 + 4 = 5
Roll 4: 6 + 6 = 12 DOUBLE!
Roll 5: 2 + 3 = 5
Doubles rolled: 2 out of 5
```

---

## Exercise 12 – Password Generator

### Question
Ask the user for a desired password length. Generate a random password of exactly that length using characters from the set: lowercase letters (`a`–`z`), uppercase letters (`A`–`Z`), and digits (`0`–`9`). Use `Math.random()` and `StringBuilder` to build the result.

**Example interaction:**
```text
Enter password length: 10
Generated password: gR4kXp1QzA
```

---

## Exercise 13 – Receipt Builder

### Question
Ask the user to enter item names and their prices one at a time. When the user types `done`, stop taking input. Use `StringBuilder` to build and print a formatted receipt including the grand total.

**Example interaction:**
```text
Enter item name (or 'done'): Apple
Enter price: 15.00
Enter item name (or 'done'): Milk
Enter price: 22.50
Enter item name (or 'done'): Bread
Enter price: 18.00
Enter item name (or 'done'): done

==============================
           Receipt
==============================
Apple                   15.00
Milk                    22.50
Bread                   18.00
------------------------------
Grand Total:            55.50
==============================
```

---

## Optional Exercises (14–20)

---

## Exercise 14 – Today's Calendar

### Question
Print today's date using `LocalDate.now()`. Display the full day name, the day number, the full month name, and the year. Also print whether it is a weekday or a weekend.

**Expected output (example):**
```text
Today is: Wednesday, 11 June 2026
It is a Weekday.
```

---

## Exercise 15 – Age Calculator

### Question
Ask the user to enter their birth year, birth month (1–12), and birth day. Print their current age in full years and how many days remain until their next birthday.

**Example interaction:**
```text
Enter birth year : 2000
Enter birth month: 3
Enter birth day  : 15
Your age            : 26 years
Days until birthday : 277
```

---

## Exercise 16 – Event Countdown

### Question
Ask the user to enter an event name and its date in `yyyy-MM-dd` format. Use `LocalDate.parse()` to read the date. If the event is in the future, print how many days remain. If it has already passed, print how many days ago it was.

**Example interaction:**
```text
Enter event name: Midsommar
Enter event date (yyyy-MM-dd): 2026-06-20
Midsommar is in 9 days!
```

```text
Enter event name: New Year
Enter event date (yyyy-MM-dd): 2026-01-01
New Year was 161 days ago.
```

---

## Exercise 17 – Appointment Planner

### Question
Ask the user to enter three appointment names and their date-times in `yyyy-MM-dd HH:mm` format. Store them and print a formatted schedule, sorted by date, using the pattern `"eeee, dd MMMM yyyy 'at' HH:mm"`.

**Example interaction:**
```text
Enter appointment 1 name: Dentist
Enter appointment 1 date-time (yyyy-MM-dd HH:mm): 2026-06-15 09:00
Enter appointment 2 name: Team Meeting
Enter appointment 2 date-time (yyyy-MM-dd HH:mm): 2026-06-12 14:30
Enter appointment 3 name: Gym
Enter appointment 3 date-time (yyyy-MM-dd HH:mm): 2026-06-11 17:00

--- Your Schedule ---
1. Gym          – Thursday, 11 June 2026 at 17:00
2. Team Meeting – Friday, 12 June 2026 at 14:30
3. Dentist      – Monday, 15 June 2026 at 09:00
```

---

## Exercise 18 – Date Range Printer

### Question
Ask the user to enter a start date and an end date in `yyyy-MM-dd` format. Print every date from start to end (inclusive), one per line, formatted as `"dd/MM/yyyy (eeee)"`.

**Example interaction:**
```text
Enter start date (yyyy-MM-dd): 2026-06-08
Enter end date   (yyyy-MM-dd): 2026-06-12
08/06/2026 (Monday)
09/06/2026 (Tuesday)
10/06/2026 (Wednesday)
11/06/2026 (Thursday)
12/06/2026 (Friday)
```

---

## Exercise 19 – Unit Converter

### Question
Create a class `UnitConverter` with three pairs of **overloaded** `convert` methods:

1. `convert(double km)` → converts kilometres to miles
2. `convert(double kg, String unit)` where `unit = "lbs"` → converts kilograms to pounds
3. `convert(double celsius, boolean toFahrenheit)` → converts Celsius to Fahrenheit (if `true`) or Kelvin (if `false`)

Ask the user to choose a conversion, enter the value, and print the result rounded to two decimal places.

**Example interaction:**
```text
Choose conversion:
1. km → miles
2. kg → lbs
3. °C → °F / K
Enter choice: 1
Enter value in km: 100
100.0 km = 62.14 miles
```

---

## Exercise 20 – Profile Card Builder

### Question
Ask the user to enter their name, birth date (`yyyy-MM-dd`), city, and email. Calculate their age from the birth date. Use `StringBuilder` to build and print a formatted profile card.

**Example interaction:**
```text
Enter name      : Sofia Karlsson
Enter birth date: 1998-04-22
Enter city      : Stockholm
Enter email     : sofia@mail.com

╔══════════════════════════════╗
║         Profile Card         ║
╠══════════════════════════════╣
║ Name  : Sofia Karlsson       ║
║ Age   : 28                   ║
║ City  : Stockholm            ║
║ Email : sofia@mail.com       ║
╚══════════════════════════════╝
```

---