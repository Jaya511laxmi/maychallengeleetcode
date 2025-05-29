## 📅 Day 29 – Maximize the Number of Target Nodes After Connecting Trees II

- 🔗 **LeetCode Problem**: [3373. Maximize the Number of Target Nodes After Connecting Trees II](https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-ii)
- 💡 **Difficulty**: Hard
- 🧠 **Topic Tags**: Tree, Graph, DFS, Even/Odd Distance

---

### ✍️ Problem Summary

You are given two undirected trees:
- Tree1 with `n` nodes labeled from `0` to `n - 1`
- Tree2 with `m` nodes labeled from `0` to `m - 1`

You must connect **one node from Tree1 to one node from Tree2**, such that **node `u` is considered a target to node `v` if the number of edges on the path from `u` to `v` is even** (including `0`, so every node is a target to itself).

Return an array `answer` of length `n` where `answer[i]` is the maximum number of target nodes node `i` in Tree1 can reach **after connecting to an optimal node in Tree2**.

---

### 🚧 My Approach

- Perform a **DFS traversal** of each tree to:
  - Assign a parity color (`0` for even, `1` for odd) to every node based on depth.
  - Count how many nodes are at even and odd depths.
- For each node `i` in Tree1:
  - It will only be able to reach even-distance nodes if the **combined parity** of the depth from `i` and the connected node in Tree2 is even.
  - So, for each node `i`, determine:
    - `count1[color1[i]]` from Tree1 (nodes at even distance from `i`)
    - Best `count2[x]` from Tree2 such that total parity remains even.

---

### 😖 Struggles

- Understanding how parity affects path length.
- Identifying that we must **maximize the second tree contribution** for a fixed parity.

---

### ✅ What I Learned

- Leveraged the **even/odd parity trick** for path lengths using depth-first search.
- Realized that the parity of a path length is simply the sum of the node depths modulo 2.
- Practiced using **coloring** and **DFS** to split trees based on depth parity.

---
