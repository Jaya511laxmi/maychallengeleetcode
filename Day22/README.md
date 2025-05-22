# 📅 Day 22 – Zero Array Transformation III  
🔗 LeetCode Problem: [3362. Zero Array Transformation III](https://leetcode.com/problems/zero-array-transformation-iii/)  
💡 Difficulty: Medium  
🧠 Topic Tags: Greedy, Priority Queue, Sorting  

---

### ✍️ Problem Summary  
You are given an array `nums` and a list of `queries`, where each query allows you to decrement elements in a range `[li, ri]` **by at most 1**.  
You can remove some of the queries.  
Return the **maximum number of queries that can be removed**, such that `nums` can still be transformed into a **zero array**.  
Return `-1` if it's impossible even without removing any queries.

---

### 🚧 My Approach  
- **Sort the queries** by their start index.
- Use a **greedy + max-heap** (PriorityQueue with reverse order) to always apply the query with the **latest end** if needed.
- Use a **difference array** to track prefix sums and decrement effects efficiently.
- Traverse the array, and if the current total operations are less than required (`nums[i]`), use queries from the heap until it satisfies the condition.
- Keep track of the number of queries used.

---

### 😖 Struggles
- Needed careful handling of query addition to the heap based on current index.
- Off-by-one indexing while applying effect through the difference array was tricky.

### ✅ What I Learned
- Greedy + PriorityQueue can simulate range application in real-time.
- Sorting queries and using prefix/difference arrays helps efficiently apply changes.
- Always check heap bounds and end conditions carefully in greedy strategies.
