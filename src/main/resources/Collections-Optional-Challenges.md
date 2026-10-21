![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Optional Challenges – Java Collections

These are open-ended. There is no single right answer — focus on writing clean, efficient code.

- create a new branch for each challenge
- commit your work regularly
- merge your branch into the main branch when you're done

---

### Optional 1 – Rotate a List

Given a list and a number `k`, rotate the list to the **right** by `k` positions.

```
Input:  [1, 2, 3, 4, 5],  k = 2
Output: [4, 5, 1, 2, 3]
```

> **Think about it:** What happens when `k` is larger than the list size?

---

### Optional 2 – Longest Consecutive Sequence

Given an unsorted list of integers, find the **length** of the longest consecutive sequence.

```
Input:  [100, 4, 200, 1, 3, 2]
Output: 4    (sequence: 1, 2, 3, 4)
```

> **Think about it:** Sorting works but costs O(n log n). Can you do it in O(n) using a Set?

---

### Optional 3 – LRU Cache

Implement a simple **Least Recently Used (LRU)** cache with a fixed capacity of 3.

- `put(key, value)` — add an entry. If full, evict the least recently used entry first.
- `get(key)` — return the value, or `-1` if not found. A successful get counts as a recent use.

```
put(1, "A")  → cache: {1=A}
put(2, "B")  → cache: {1=A, 2=B}
put(3, "C")  → cache: {1=A, 2=B, 3=C}
get(1)       → "A",  cache: {2=B, 3=C, 1=A}
put(4, "D")  → evict 2, cache: {3=C, 1=A, 4=D}
```

> **Think about it:** Which Java collection maintains insertion order and gives you control over eviction?

---

### Optional 4 – Graph as Adjacency List

Represent an undirected graph using a `HashMap<String, List<String>>`.

- Add at least 5 nodes and 6 edges
- Write a method that takes a node name and prints all its neighbours
- Write a second method that checks whether two nodes are directly connected

---

### Optional 5 – Sublist with Target Sum

Given a list of integers and a target sum, find **all contiguous sublists** that add up to the target.

```
Input:  [1, 2, 3, 4, 2, 1, 5],  target = 6
Output:
  Index 0–2: [1, 2, 3]
  Index 2–4: [3, 4, 2, 1]  ← wait, does this sum to 6? Check your logic.
  Index 4–5: [2, 1, 5]     ← and this?
```

Print the start index, end index, and the matching sublist for each match.

---

## Submission

Push your project to GitHub and share the repository link with your instructor.
