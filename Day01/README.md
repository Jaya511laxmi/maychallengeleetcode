# 📅 Day 1 – Maximum Number of Tasks You Can Assign

🔗 **LeetCode Problem**: [2071. Maximum Number of Tasks You Can Assign](https://leetcode.com/problems/maximum-number-of-tasks-you-can-assign/)  
💡 **Difficulty**: Hard  
🧠 **Topic Tags**: Binary Search, Greedy, TreeMap, Simulation

---

## ✍️ Problem Summary

You're given an array of task difficulties and worker strengths. Each worker can do a task if their strength is ≥ task difficulty. You can also give pills to temporarily boost a worker’s strength by a fixed amount.

> Goal: Find the **maximum number of tasks** that can be assigned under these constraints.

---

## 🚧 My Approach

- **Step 1**: Sort tasks in ascending difficulty.
- **Step 2**: Use **binary search** on number of tasks (0 → min(tasks.length, workers.length)).
- **Step 3**: For each mid, check if it’s possible to assign using a **TreeMap** to pick best-fit workers.
- **Step 4**: Simulate task assignment with/without pills in a greedy way.

---

## 😖 Struggles

- First tried greedy with no structure — failed on edge cases with leftover pills.
- Took time to realize TreeMap helps efficiently find the best available worker for each task.
- Needed to simulate carefully from hardest task down to make assignment optimal.

---

## ✅ What I Learned

- You can use **binary search** on an *answer*, not just arrays.
- `TreeMap` is powerful when you need efficient ceiling/floor operations.
- Don’t always assign the easiest task first — sometimes assigning the **hardest feasible** one gives better results.

---
