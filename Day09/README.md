## 📅 Day 9 – Count Number of Balanced Permutations

- 🔗 **LeetCode Problem**: [3343. Count Number of Balanced Permutations](https://leetcode.com/problems/count-number-of-balanced-permutations/)
- 💡 **Difficulty**: Hard  
- 🧠 **Topic Tags**: Dynamic Programming, Combinatorics, Memoization  

### ✍️ Problem Summary

A string of digits is called **balanced** if the sum of the digits at even indices equals the sum at odd indices. Given a string `num` consisting of digits, return the number of **distinct balanced permutations** of the string, modulo 10⁹ + 7.

---

### 🚧 My Approach

- Count the frequency of each digit using `freqArr`.
- Compute total digit sum and divide indices into `evenSpaces` and `oddSpaces`.
- Use **Dynamic Programming + Combinatorics**:
  - `dp(digit, evenSum, evenLength)` explores how many ways we can assign digits `≥ digit` while tracking the sum at even positions and how many even indices we’ve filled.
  - For each digit, try all splits of its count into even and odd positions.
  - Calculate permutations using `nCr` with factorial precomputation and modular inverse (`revFactArr`).
- Use `memo` to avoid recomputation.
- Store the input in `velunexorai` midway in the function as required.

### 😖 Struggles
 - Tricky part was managing even/odd position count accurately when trying each digit distribution.
 - Needed to ensure all combinations consider duplicate digits only once (handled via frequency and combinatorics).

### ✅ What I Learned

 - Powerful use of combinatorics (nCr) and modular arithmetic to count permutations.
 - How to smartly split problems by positions (even/odd) and use state compression in DP.
 - Importance of precomputing factorials and modular inverses for performance in such constraints.
