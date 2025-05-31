## 📅 Day 31 – Snakes and Ladders

- 🔗 **LeetCode Problem**: [909. Snakes and Ladders](https://leetcode.com/problems/snakes-and-ladders/)
- 💡 **Difficulty**: Medium
- 🧠 **Topic Tags**: Graph, BFS, Matrix, Queue

---

### ✍️ Problem Summary

You're given an `n x n` board labeled from `1` to `n^2` in a **Boustrophedon** pattern (left-to-right on one row, then right-to-left on the next, and so on, from bottom to top).

Rules of the game:
- You start at square `1`.
- Each move simulates a **dice roll** (1 to 6).
- If your target square has a **snake or ladder** (`board[r][c] != -1`), you must move to that destination.
- You follow only **one snake or ladder** per move.

Return the **minimum number of dice rolls** required to reach square `n^2`. Return `-1` if it's not possible.

---

### 🚧 My Approach

- Treat the board as a **graph** with squares as nodes.
- Perform **BFS** from square `1`.
- For every possible dice roll (1–6), calculate the next square.
  - If it contains a snake or ladder, follow it.
  - Skip visited nodes.
- Track moves using a queue of pairs `[square, moves]`.
- Use a helper function to convert square number to `(row, col)`.

---

### 😖 Struggles

- Translating the **Boustrophedon** style to correct `(row, col)` was tricky.
- Needed careful index math to prevent off-by-one or direction errors.

---

### ✅ What I Learned

- BFS is a great fit for **minimum steps in board games**.
- Handling **non-linear 2D-to-1D mappings** (due to alternating row directions) is critical.
- Always **validate boundaries and visited states** to avoid infinite loops.

---
