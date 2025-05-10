## 📅 Day 10 – Minimum Equal Sum of Two Arrays After Replacing Zeros  
**🔗 LeetCode Problem**: [2918. Minimum Equal Sum of Two Arrays After Replacing Zeros](https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros)  
**💡 Difficulty**: Medium  
**🧠 Topic Tags**: Arrays, Greedy, Math  

---

### ✍️ Problem Summary:
You are given two integer arrays `nums1` and `nums2` containing positive integers and zeros. Replace each `0` with a strictly positive integer such that:
- The total sum of both arrays becomes equal.

**Goal**: Return the **minimum possible equal sum** of the arrays after replacement, or `-1` if it’s **impossible**.

---

### 🚧 My Approach:
1. Replace each `0` with the **minimum valid value**, i.e., `1`, and compute the total sum.
2. Track the number of `0`s in both arrays.
3. After replacing with `1`s:
   - If one array still has a **smaller sum** and **no more zeros to adjust**, it's impossible → return `-1`.
4. Otherwise, return the **maximum** of the two adjusted sums — since we’ll have to increase the smaller one to match.

---

### ✅ What I Learned:
- When constrained to **minimal values**, replacing 0s with `1` is a good baseline.
- If the array with a **lower sum has zeros**, we can "increase" their values to match the higher sum.
- But if the array **without zeros** already has a lower sum, it's **impossible** to match — no way to increase it.

---

### 😖 Struggles:
- Initially thought of brute-forcing combinations, but it would be too slow.
- Realized greedy with minimal replacements works because of strict positivity and sum equality condition.
