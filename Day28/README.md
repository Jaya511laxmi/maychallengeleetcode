# 📅 Day 28 – 3372. Maximize the Number of Target Nodes After Connecting Trees I  
🔗 **LeetCode Problem:** [3372. Maximize the Number of Target Nodes After Connecting Trees I](https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-i)  
💡 **Difficulty:** Medium  
🧠 **Topic Tags:** Tree, Graph, BFS  

---

## ✍️ Problem Summary  
You are given two trees:
- First tree with `n` nodes and edges: `edges1`
- Second tree with `m` nodes and edges: `edges2`

Also given an integer `k`.

**A node u is target to v** if the number of edges in the path from u to v is ≤ k.

For each node `i` in the first tree, connect it to **one** node in the second tree such that the number of reachable nodes (within distance `k`) from `i` is **maximized**.

Return an array `answer[]` of size `n` where `answer[i]` = max number of target nodes when `i` is connected to any node in second tree.

---

## 🚧 My Approach  
- Create trees using adjacency lists.
- Precompute for each node in the second tree: maximum number of reachable nodes within `k-1` distance.
- For each node `i` in the first tree:
  - Run BFS to count how many nodes are reachable from it within `k` steps.
  - Add this to the `maxTarget` of the second tree (precomputed) to form final answer.

---
## 🧮 Complexity  
- **Time Complexity:**  
  - `O(n * k + m * k)` → BFS runs from every node in both trees, depth bounded by `k`
- **Space Complexity:**  
  - `O(n + m)` for storing trees and visited flags

---

## ✅ What I Learned  
- BFS is extremely efficient when depth (`k`) is small.
- Important optimization: Reuse the `max` result from second tree rather than computing it repeatedly for each query.
- Connecting trees dynamically and calculating reachability mimics real-world problems like network merging.

---

