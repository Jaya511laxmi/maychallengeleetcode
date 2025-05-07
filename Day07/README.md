# 📅 Day 7 – Find Minimum Time to Reach Last Room I

🔗 **LeetCode Problem**: [3341. Find Minimum Time to Reach Last Room I](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i)  
💡 **Difficulty**: Medium  
🧠 **Topic Tags**: Graph, BFS, Priority Queue, Grid Traversal  

---

## ✍️ Problem Summary  

You're given a grid `moveTime` of size `n x m` where `moveTime[i][j]` is the earliest time you can enter room `(i, j)`.  
- You start at room `(0, 0)` at `t = 0`.  
- You can move in 4 directions and each move takes **1 second**.  
- You **must** wait if you're trying to enter a cell before its allowed `moveTime`.  

Return the **minimum time** needed to reach the **bottom-right cell** `(n-1, m-1)`.

---

## 🚧 My Approach  

- Used a **priority queue (min-heap)** to always process the cell with the current minimum time.
- At each step, computed the next time as:  
  `nextTime = max(currentTime, moveTime[nextX][nextY]) + 1`
- Maintained a `visited[][]` array to avoid revisiting processed cells.
- This acts like a **Dijkstra's algorithm** tailored for grid traversal with time constraints.

---

## 😖 Struggles  

- Initially forgot to **wait** until `moveTime[i][j]` if arriving earlier.
- Handling priority queue logic correctly with custom `Point` class took attention.

---

## ✅ What I Learned  

- Practiced **grid-based shortest path** problems with **waiting conditions**.
- Reinforced understanding of **priority queues** in graph traversal.
- Learned how to adapt Dijkstra’s logic when movement has temporal constraints.
