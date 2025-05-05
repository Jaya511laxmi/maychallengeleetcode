# 📅 Day 5 – Domino and Tromino Tiling

🔗 **LeetCode Problem**: [790. Domino and Tromino Tiling](https://leetcode.com/problems/domino-and-tromino-tiling)  
💡 **Difficulty**: Medium  
🧠 **Topic Tags**: Dynamic Programming, Combinatorics

---

## ✍️ Problem Summary

You're given a 2 × n board and can tile it using:

- Dominoes (2 × 1)
- Trominoes (L-shaped)

You can rotate the tiles as needed.

Return the **number of ways** to tile the board completely.  
Since the result can be large, return it modulo **10⁹ + 7**.

---

## 🚧 My Approach

- Use **Dynamic Programming** to build the number of ways up to `n`.
- Define `arr[i]` as the number of ways to tile a 2 × i board.
- Recurrence relation:  
  `arr[i] = 2 * arr[i-1] + arr[i-3]`
- Base cases:  
  - `arr[1] = 1` (only one vertical domino)  
  - `arr[2] = 2` (two vertical or two horizontal)  
  - `arr[3] = 5` (manually countable patterns)

---

## 😖 Struggles

- Initial attempts to derive recurrence were confusing due to tromino overlaps.
- Miscounted a few base cases which led to wrong values for higher `n`.
- Had to refer to LeetCode discussions to understand the `+arr[i-3]` logic.

---

## ✅ What I Learned

- Tiling problems often involve **clever DP recurrences** derived from patterns.
- Tromino introduces asymmetry, hence requires looking multiple steps back.
- Recurrence relations in tiling are similar to Fibonacci but with twists.
