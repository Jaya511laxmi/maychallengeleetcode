# 📅 Day 20 – Zero Array Transformation I

- 🔗 LeetCode Problem: [3355. Zero Array Transformation I](https://leetcode.com/problems/zero-array-transformation-i/)
- 💡 Difficulty: Medium
- 🧠 Topic Tags: Prefix Sum, Difference Array, Greedy, Queries

## ✍️ Problem Summary

You're given:
- An array `nums` of length `n`
- A list of `queries`, each query `[li, ri]` represents a **range of indices**

For each query:
- You may choose **any subset of indices** from `li` to `ri`
- Decrease the selected elements by **1**

**Return** `true` if it's possible to convert `nums` into a **Zero Array** (all elements = 0) **after processing all queries**, else return `false`.

## 🚧 My Approach

1. **Track the number of available decrements** for each index using a **difference array technique**:
   - For each query `[l, r]`, we increment `diff[l]++` and decrement `diff[r+1]--`
2. Calculate prefix sum of `diff[]` to know how many times each index is covered.
3. At each index, check:
   - If `available_decrements < nums[i]`, it's **impossible** to reach 0 → return `false`.
  
  
## 😖 Struggles

- Initially tried simulating actual value changes which led to **TLE**.
- The trick is to **count how many times each index is _eligible_ to be decremented** (not the actual decrements).

## ✅ What I Learned

- **Difference arrays** are powerful for efficient range updates and queries.
- You don’t need to simulate queries literally — just **ensure capacity is enough** for every `nums[i]`.
- This is a neat use case of greedy logic + prefix sum.


