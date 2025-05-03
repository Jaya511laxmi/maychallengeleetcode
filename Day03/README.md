## 📅 Day 3 – Minimum Domino Rotations For Equal Row

**🔗 LeetCode Problem**: [1007. Minimum Domino Rotations For Equal Row](https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/)  
**💡 Difficulty**: Medium  
**🧠 Topic Tags**: Array, Greedy  

---

### ✍️ Problem Summary

You’re given two arrays representing the top and bottom values of dominoes. You can rotate each domino to swap its top and bottom.

🎯 **Goal**: Find the minimum number of rotations needed so that all values in `tops` or `bottoms` are the same.  
Return `-1` if it's not possible.

---

### 🧠 My Approach

**Step 1**: Only two potential values can fill all positions: `tops[0]` or `bottoms[0]`.  
**Step 2**: For each candidate value, check all dominoes:
- If neither top nor bottom has the candidate, break.
- Else, count rotations needed for both `tops` and `bottoms`.

**Step 3**: Track the minimum number of valid rotations across both candidates.

---

### 😖 Struggles

- Initially thought of brute-forcing all values from 1 to 6 — unnecessary.
- Missed that the only valid values are `tops[0]` and `bottoms[0]`.
- Logic was tricky when handling invalid dominoes early in the loop.

---

### ✅ What I Learned

- **Reduce the candidate space** by analyzing problem constraints first.
- You don’t always need to check all possibilities — use what’s given (e.g., index 0 values).
- Problems about uniformity often boil down to checking feasibility + greedy rotations.
