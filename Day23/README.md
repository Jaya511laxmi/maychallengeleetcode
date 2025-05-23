# 📅 Day 23 – 3068. Find the Maximum Sum of Node Values  
🔗 **LeetCode Problem:** [3068. Find the Maximum Sum of Node Values](https://leetcode.com/problems/find-the-maximum-sum-of-node-values)  
💡 **Difficulty:** Hard  
🧠 **Topic Tags:** Bit Manipulation, Greedy, Tree  

---

## ✍️ Problem Summary  
You are given a tree of `n` nodes with node values `(nums[])` and an integer `k`. An operation lets you XOR both endpoints of any edge with k. You can perform this operation **any number of times** (including zero). Your task is to **maximize the total sum** of `nums[]` after any number of such operations.

---

## 🚧 My Approach

- For each node, compute its XOR with `k` → `X = num ^ k`
- If `X > num`, then flipping improves the sum. Add `X` to the total sum and increment a counter `cnt`.
- If `X <= num`, just add `num` to the sum (no benefit in flipping).
- Track the minimum difference between `num` and `X` where flipping was considered.
- If the count of beneficial flips `(cnt)` is odd, we need to undo one flip (to keep operations balanced via edges) → subtract the smallest difference to make `cnt` even.
- Return the final sum accordingly.

---

## 🧮 Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

---

## ✅ What I Learned

- XOR tricks can improve values conditionally.
- Edge-based operations in trees often require even pairing for realizability.
- Tracking minimal gain loss helps when one beneficial operation must be undone.
