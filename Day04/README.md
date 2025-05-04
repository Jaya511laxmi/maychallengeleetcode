## 📅 Day 4 – Number of Equivalent Domino Pairs

**🔗 LeetCode Problem**: [1128. Number of Equivalent Domino Pairs](https://leetcode.com/problems/number-of-equivalent-domino-pairs/)  
**💡 Difficulty**: Easy  
**🧠 Topic Tags**: Array, Hash Table, Counting

---

### ✍️ Problem Summary

You’re given a list of dominoes, where each domino is a 2-element array. A domino [a, b] is considered equivalent to [b, a] since they can be rotated.

🎯 **Goal**: Count the number of equivalent domino pairs (i, j) such that 0 ≤ i < j < dominoes.length.

---

### 🧠 My Approach

**Step 1**: Normalize each domino to a canonical form — always represent [a, b] as the smaller value first (e.g., [2, 1] → [1, 2]).  
**Step 2**: Use a frequency array of size 100 (since 1 ≤ a, b ≤ 9) to map each domino pair to a unique key (10 * a + b).  
**Step 3**: For each domino, add its current count to the result and increment the count.

---

### 😖 Struggles

- Initially thought of sorting each pair manually — realized it's overkill for 2 elements.
- Needed a simple but consistent way to create unique keys — the trick was to use `min * 10 + max`.

---

### ✅ What I Learned

- Problems involving symmetry (like [a, b] == [b, a]) can often be reduced to a **normalized form**.
- Simple hashing tricks (like 2-digit encoding) can replace more complex data structures.
- You don’t always need HashMap — fixed-size arrays are faster when input bounds are small.
