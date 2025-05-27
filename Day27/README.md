# 📅 Day 27 – 2894. Divisible and Non-divisible Sums Difference  
🔗 **LeetCode Problem:** [2894. Divisible and Non-divisible Sums Difference](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference)  
💡 **Difficulty:** Easy  
🧠 **Topic Tags:** Math, Looping  

---

## ✍️ Problem Summary  
Given two positive integers `n` and `m`, compute:
- `num1`: sum of numbers in range `[1, n]` **not divisible by `m`**
- `num2`: sum of numbers in range `[1, n]` **divisible by `m`**  
Return `num1 - num2`

---

## 🚧 My Approach  
- Traverse from `1` to `n`
- For each `i`, check:
  - If `i % m != 0`, add to `num1`
  - Else, add to `num2`
- Return `num1 - num2`

---

## ✅ What I Learned  
- Straightforward problems like this are great for warm-ups  
- Optimizations using arithmetic progressions are possible but unnecessary for small `n` (≤ 1000)  
- Always check edge cases like `m = 1` or `m > n`

---
