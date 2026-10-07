![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Java Exercises

---

## Project Setup

Before writing any code, complete the following steps.
All exercises should be completed within the same project.

1. Open IntelliJ IDEA and create a new **Maven** project.
2. Configure the project with the following coordinates:

   * **Group ID:** `se.lexicon`
   * **Artifact ID:** `java-fundamentals`
   * **Version:** `1.0-SNAPSHOT`

3. Verify that the standard Maven project structure has been generated:

    ```text
    java-fundamentals/
    ├── pom.xml
    └── src/
        └── main/
            └── java/
    ```

4. Create a `.gitignore` file and ensure that IntelliJ IDEA files and folders (such as `.idea/`) are not committed to GitHub.
5. Use Git regularly throughout the exercises:
   * Commit your changes after completing each exercise.
   * Write clear and meaningful commit messages.
   * Push your commits to GitHub regularly as you progress.

---

## Exercise 1 – Profile Card

### Question
Store your **name**, **age**, and **city** in variables. Then use those variables to print a formatted profile card. Do not hardcode the values directly inside `println` — they must come from variables.

**Expected output:**
```text
====================
     My Profile
====================
Name : Sofia
Age  : 22
City : Stockholm
====================
```

> **Think about it:** What data type is right for each piece of information? If you later want to change the city, how many lines of code need to change?

---

## Exercise 2 – Leap Year

### Question
Ask the user to enter a year. Print whether it is a leap year or not.

**Example interaction:**
```text
Enter a year: 2024
2024 is a leap year.
```

```text
Enter a year: 1900
1900 is NOT a leap year.
```

> **Think about it:** This has three conditions that depend on each other. What is the correct order to check them, and which logical operators (`&&`, `||`) do you need?

---

## Exercise 3 – Shopping Receipt

### Question
A customer buys **3 items**. Each item has a name, a quantity, and a price per unit. Store all values in variables, calculate the total cost for each item and the overall grand total, then print a formatted receipt.

**Expected output:**
```text
==============================
           Receipt
==============================
Apple        2 x 15.00 = 30.00 SEK
Milk         1 x 22.50 = 22.50 SEK
Bread        3 x 18.00 = 54.00 SEK
------------------------------
Grand Total:           106.50 SEK
==============================
```

> **Think about it:** What type should price be — `int` or `double`? What happens to your grand total if you use the wrong type? If you change one item's quantity, how many lines of code need to change?

---

## Exercise 4 – Average of Three Numbers

### Question
Ask the user to enter three integers. Calculate and print their average. Make sure the result shows the decimal part.

**Example interaction:**
```text
Enter first number:  23
Enter second number: 11
Enter third number:  77
Average: 37.0
```

> **Think about it:** If all three variables are `int`, what happens when you divide their sum by 3? How do you make sure the result is a decimal number?

---

## Exercise 5 – Greet the User

### Question
Ask the user to enter their first name and last name separately. Then print a personalised greeting that includes the full name.

**Example interaction:**
```text
Enter first name: Sofia
Enter last name:  Karlsson
Hello, Sofia Karlsson! Welcome aboard.
```

> **Think about it:** How do you join two separate `String` variables into one output line? What operator or method do you use?

---

## Exercise 6 – Arithmetic With User Input

### Question
Ask the user to enter two integers. Print the result of all four basic operations: addition, subtraction, multiplication, and division.

**Example interaction:**
```text
Enter first number:  20
Enter second number: 6
20 + 6 = 26
20 - 6 = 14
20 * 6 = 120
20 / 6 = 3
```

> **Think about it:** Why does `20 / 6` print `3` and not `3.33`? How would you change the code to get the decimal result?

---

## Exercise 7 – Convert Seconds

### Question
Ask the user to enter a number of seconds. Convert and print it as hours, minutes, and remaining seconds in `HH:MM:SS` format.

**Example interaction:**
```text
Enter seconds: 86399
23:59:59
```

> **Think about it:** Which operator gives you the whole hours from a total number of seconds? Which operator gives you the leftover seconds after removing the hours? Work it out step by step before writing any code.

---

## Exercise 8 – Guess the Number

### Question
Generate a random number between **1 and 500** using the `Random` class. Let the user keep guessing until they get it right. After each wrong guess, print whether it was too small or too big. When the user guesses correctly, print a congratulation message that includes how many guesses they made.

**Example interaction:**
```text
Enter your guess: 250
Too big!
Enter your guess: 125
Too small!
Enter your guess: 180
Correct! You got it in 3 guesses.
```

> **Think about it:** What kind of loop keeps running until an unknown condition is met — a `for` loop or a `while` loop? Where do you increment the guess counter?

---

## Exercise 9 – Temperature Converter

### Question
Ask the user to enter a temperature in Celsius. Convert it to both Fahrenheit and Kelvin and print all three values.

Formulas:
- `°F = °C × 9.0 / 5 + 32`
- `K  = °C + 273.15`

**Example interaction:**
```text
Enter temperature in Celsius: 100
Celsius:    100.0 °C
Fahrenheit: 212.0 °F
Kelvin:     373.15 K
```

> **Think about it:** What happens if you write `9 / 5` using two `int` literals? Try it and observe the result. Why does it go wrong, and how do you fix it?

---

## Exercise 10 – Swap Two Values Without a Temp Variable

### Question
You have two variables:

```java
int a = 15;
int b = 42;
```

Swap their values so that `a` ends up with `42` and `b` ends up with `15`. You are **not allowed to declare a third variable**.

**Expected output:**
```text
Before: a = 15, b = 42
After:  a = 42, b = 15
```

> **Think about it:** You can solve this using only addition and subtraction. What happens if you set `a = a + b`? What does `a` now contain, and how can you use that to recover the original values?

---

## Exercise 11 – FizzBuzz

### Question
Print every integer from **1 to 30**, one per line, applying these rules:

- Divisible by **3** → print `Fizz`
- Divisible by **5** → print `Buzz`
- Divisible by **both 3 and 5** → print `FizzBuzz`
- Otherwise → print the number

**Expected output (first 15 lines):**
```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

> **Think about it:** If you check divisibility by 3 first, what happens when the number is 15? Why must the combined check come before the individual ones?

---

## Exercise 12 – Grade Calculator

### Question
Ask the user to enter a score between 0 and 100. Print the matching letter grade. If the score is outside that range, print an error message.

| Score     | Grade |
|:----------|:------|
| 90 to 100 | A     |
| 80 to 89  | B     |
| 70 to 79  | C     |
| 60 to 69  | D     |
| 0 to 59   | F     |

**Example interaction:**
```text
Enter score: 85
Grade: B
```

> **Think about it:** If you order your `else if` branches from highest to lowest, how many comparisons do you actually need per branch? Can you reduce each branch to just one condition?

---

## Exercise 13 – Weekday or Weekend?

### Question
Ask the user to enter a day of the week (e.g. `Monday`). Use a `switch` statement with arrow syntax to print whether it is a **Weekday** or a **Weekend**. If the input does not match any known day, print `"Unknown day"`.

**Example interaction:**
```text
Enter day: Saturday
Weekend
```

```text
Enter day: Wednesday
Weekday
```

> **Think about it:** In modern switch syntax, a single case can match multiple values: `case "Saturday", "Sunday" ->`. How many cases do you actually need to cover all seven days?

---

## Optional Exercises (14–20)

## Exercise 14 – Multiplication Table

### Question
Ask the user for a number. Print its multiplication table from 1 to 10 using a `for` loop.

**Example interaction:**
```text
Enter a number: 7
7 x 1  = 7
7 x 2  = 14
7 x 3  = 21
7 x 4  = 28
7 x 5  = 35
7 x 6  = 42
7 x 7  = 49
7 x 8  = 56
7 x 9  = 63
7 x 10 = 70
```

> **Bonus:** Use a nested `for` loop to print the full 10 × 10 multiplication grid for all numbers from 1 to 10.

---

## Exercise 15 – Reverse a Number

### Question
Ask the user for a positive integer. Reverse its digits using **only arithmetic** — no converting to a `String`. Print the reversed number.

**Example interaction:**
```text
Enter a number: 12345
Reversed: 54321
```

Also test with `1000` — the result should be `1`, not `0001`.

> **Think about it:** Use a `while` loop. Each iteration: extract the last digit with `% 10`, attach it to your result by multiplying the result by 10 and adding that digit, then strip the last digit with `/ 10`. Stop when the number reaches 0.

---

## Exercise 16 – Running Total

### Question
The user enters integers one at a time. After each entry, print the current total and how many numbers have been entered so far. When the user enters `0`, stop and print a final summary including the average. Do **not** include `0` in the total or the count.

**Example interaction:**
```text
Enter a number (0 to stop): 10
Total: 10 | Count: 1
Enter a number (0 to stop): 30
Total: 40 | Count: 2
Enter a number (0 to stop): 20
Total: 60 | Count: 3
Enter a number (0 to stop): 0
--- Summary ---
Count:   3
Total:   60
Average: 20.0
```

> **Think about it:** `total` and `count` are both `int`. What happens when you divide them? What type must the average be, and how do you force an `int` division to produce a decimal result?

---

## Exercise 17 – Password Strength Checker

### Question
Ask the user to enter a password. Loop through every character and check three rules:

1. Length is at least **8** characters.
2. Contains at least one **uppercase letter** (`A`–`Z`).
3. Contains at least one **digit** (`0`–`9`).

Print how many rules are met and a rating.

| Rules met | Rating |
|:----------|:-------|
| 3         | Strong |
| 2         | Medium |
| 0 or 1    | Weak   |

**Example interaction:**
```text
Enter password: Hello7
Rules met: 2/3
Rating: Medium
```

> **Think about it:** You can compare a `char` directly without importing anything: `ch >= 'A' && ch <= 'Z'` checks for uppercase. Use `password.charAt(i)` to get each character inside the loop.

---

## Exercise 18 – Sum of Digits

### Question
Write a `static` method `sumOfDigits(int n)` that returns the sum of all digits in a positive integer. Call it from `main` and test it with at least three different values.

**Examples:**
```text
sumOfDigits(1234) → 10   (1+2+3+4)
sumOfDigits(9)    → 9
sumOfDigits(305)  → 8    (3+0+5)
```

> **Think about it:** Use `n % 10` to extract the last digit and `n / 10` to remove it. Repeat inside a `while` loop until `n` becomes 0. What should the loop condition be?

---

## Exercise 19 – Count the Vowels

### Question
Write a `static` method `countVowels(String s)` that returns the number of vowels (`a`, `e`, `i`, `o`, `u`, case-insensitive) in the string. Call it from `main` and test it.

**Examples:**
```text
countVowels("Hello World") → 3
countVowels("Java")        → 2
countVowels("rhythm")      → 0
```

> **Think about it:** Convert the whole string to lowercase once before the loop. Use `s.charAt(i)` to access each character. How do you compare a `char` to multiple values without a long chain of `||` conditions?

---

## Exercise 20 – Find All Prime Numbers

### Question
Write a `static` method `isPrime(int n)` that returns `true` if `n` is a prime number. Use it inside a loop in `main` to print all prime numbers from 2 to 50 on a single line.

**Expected output:**
```text
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
```

> **Think about it:** Your divisor loop inside `isPrime` only needs to go up to the square root of `n`. Why? If `n` has no divisor up to that point, what can you conclude? Also handle `n <= 1` as a special case that always returns `false`.

---
