## 📅 Day 30 – Find Closest Node to Given Two Nodes

- 🔗 **LeetCode Problem**: [2359. Find Closest Node to Given Two Nodes](https://leetcode.com/problems/find-closest-node-to-given-two-nodes)
- 💡 **Difficulty**: Medium
- 🧠 **Topic Tags**: Graph, DFS, Shortest Path

---

### ✍️ Problem Summary

You're given a **directed graph** where each node has **at most one outgoing edge**. This is represented by an array `edges` such that `edges[i]` is the node `i` points to, or `-1` if there is no outgoing edge.

You're also given two nodes: `node1` and `node2`.

Your task is to **find the node reachable from both `node1` and `node2` such that the maximum distance from `node1` and `node2` to this node is minimized**.  
- If multiple such nodes exist, return the one with the **smallest index**.
- If no such node exists, return `-1`.

---

### 🚧 My Approach

- Run a DFS (or simulate) starting from `node1` and `node2` separately.
- Keep track of distances to all reachable nodes in two arrays: `dist1` and `dist2`.
- For each node, check if it's reachable from both `node1` and `node2`.
  - Calculate `max(dist1[i], dist2[i])`.
  - Track the node with the **smallest max-distance**, and break ties using the **smallest index**.

---

### 😖 Struggles

- Needed to be careful with **visited tracking** to avoid infinite loops in cycles.
- Ensuring the correct use of `-1` for unreachable nodes.

---

### ✅ What I Learned

- How to simulate a path-traversal in a graph where each node has at most one edge.
- Learned to compute distance arrays separately and merge results efficiently.
- This problem is a good illustration of **shortest path comparisons** in constrained graphs.
