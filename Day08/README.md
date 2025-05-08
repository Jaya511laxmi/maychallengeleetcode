## 📅 Day 8 – Find Minimum Time to Reach Last Room II

**🔗 LeetCode Problem**: [3342. Find Minimum Time to Reach Last Room II](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-ii)  
**💡 Difficulty**: Medium  
**🧠 Topic Tags**: Graph, Dijkstra, Grid Traversal, Priority Queue  

---

### ✍️ Problem Summary

You’re given a 2D grid representing rooms in a dungeon.  
Each cell moveTime[i][j] specifies the earliest time you are allowed to enter that room.

🎯 **Goal**: Starting from (0, 0) at time 0, reach (n-1, m-1) using adjacent room moves.  
Movement time alternates: 1 second, then 2 seconds, then 1 second, and so on.

---

### 🚧 My Approach

🔄 This is a shortest-path problem with extra constraints:

- I used **Dijkstra's algorithm** to track the minimum time to reach each cell.
- Each state includes: `currentTime`, `(i, j)` coordinates, and the **last move duration** (1 or 2).
- Movement alternates between 1 and 2 seconds, so I stored the last move's duration and toggled it.
- When pushing a neighbor into the priority queue:
  - If the current cell time is less than moveTime[i][j], we wait.
  - Otherwise, we move immediately and update the `vis` matrix with the new min time.

⏱️ PriorityQueue ensures we always expand the path with the least time.

---

### 😖 Struggles

- Initially overlooked the need to track previous move duration.
- Misplaced logic for wait time versus direct movement.
- Needed extra care while calculating `nTime` to not overwrite better paths in the `vis` matrix.

---

### ✅ What I Learned

- How to **modify Dijkstra** when movement costs aren't constant.
- Maintaining **state information** like last move duration is critical in such grid traversal problems.
- Carefully managing the wait time for grid constraints like `moveTime[i][j]` is as important as path cost.
