# 📅 Day 26 – 1857. Largest Color Value in a Directed Graph  
🔗 **LeetCode Problem:** [1857. Largest Color Value in a Directed Graph](https://leetcode.com/problems/largest-color-value-in-a-directed-graph)  
💡 **Difficulty:** Hard  
🧠 **Topic Tags:** Graph, Topological Sort, Dynamic Programming  

---

## ✍️ Problem Summary  
Given a directed graph of `n` nodes (each with a lowercase English letter color) and `m` directed edges:  
- Find the **maximum number of most frequent colors** that can appear along any valid **acyclic path**  
- If the graph contains a cycle, return **-1**

---

## 🚧 My Approach  
- Represent the graph using an **adjacency list**
- Use **Kahn’s algorithm** for topological sorting to detect cycles
- Track frequency of each color (26 lowercase letters) per node using a DP array `dp[node][color]`
- For each node in topological order, update the DP values of its neighbors:
  - `dp[nei][c] = max(dp[nei][c], dp[curr][c] + (colors[nei] == c ? 1 : 0))`
- Track the **maximum color frequency** across all paths

---

## ✅ What I Learned  
- Topological sorting is an effective way to detect cycles and process graphs with dependencies  
- Using a DP matrix for each node to maintain frequency of character counts is a powerful pattern for graph problems with states  
- `Kahn’s algorithm` is preferable when you need the topological order explicitly

---
