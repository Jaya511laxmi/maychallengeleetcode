# 📅 Day 16 – Longest Unequal Adjacent Groups Subsequence II

🔗 **LeetCode Problem**: [2901. Longest Unequal Adjacent Groups Subsequence II](https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii)  
💡 **Difficulty**: Medium  
🧠 **Topic Tags**: Dynamic Programming, Memoization, Strings, Hamming Distance  

---

### ✍️ Problem Summary

You are given:
- A string array `words` and an integer array `groups`, both of length `n`.

**Goal**:  
Select the longest subsequence of indices such that:
1. Consecutive indices in the subsequence correspond to words of **equal length**.
2. Their **Hamming distance** (number of differing characters at the same position) is **exactly 1**.
3. Their **groups are not equal** (`groups[i] != groups[i+1]`).

Return the **corresponding list of words** in the selected subsequence.

---

### 🚧 My Approach

- Start from each word and try to recursively extend the subsequence.
- At each step, consider:
  - Whether the next word has the same length.
  - Whether the Hamming distance from the last word is exactly 1.
  - Whether its group differs from the last word's group.
- Use **memoization** to store and reuse previously computed results for subproblems.
- Choose the longest possible path among all possible valid subsequences.

---

### ✅ What I Learned

- How to apply **memoization** to a complex recursive state involving multiple parameters.
- Handling problems involving **custom adjacency constraints** (like unequal groups and exact hamming distance).
- Use of string hashing (`i|lastGroup|lastWord`) for creating unique keys in memoization.

---
