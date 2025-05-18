# 📅 Day 18 – Painting a Grid With Three Different Colors

- 🔗 LeetCode Problem: [1931. Painting a Grid With Three Different Colors](https://leetcode.com/problems/painting-a-grid-with-three-different-colors/)
- 💡 Difficulty: Hard
- 🧠 Topic Tags: Dynamic Programming, Bitmasking, Graph Theory

## ✍️ Problem Summary

You're given integers `m` and `n` representing an `m x n` grid.  
Each cell must be painted **either red, green, or blue** such that:

- **No two adjacent cells** (horizontal or vertical) share the same color.

### Goal:
Return the total number of valid coloring ways modulo **10⁹ + 7**.

## 🚧 My Approach

🔹 This problem is solved using **Dynamic Programming with Bitmasking**.

### Steps:
1. **Generate all valid column colorings (`states`)** for height `m` using DFS (`generateStates`).
   - Each color is encoded in base-3 (0 = red, 1 = green, 2 = blue).
   - No two adjacent cells in a column have the same color.

2. **Precompute all valid state transitions** (`isCompatible`) between adjacent columns.

3. **Use DP** to count the number of ways to build the grid:
   - `dp[state]` = number of ways to form up to the current column ending with `state`.
   - For each column from 1 to `n-1`, compute new `dp` values based on compatible previous states.

4. Sum all DP values at the end to get the total number of valid grids.

## 😖 Struggles

- Handling base-3 encoding and ensuring that adjacent vertical and horizontal cells differ in color was tricky.
- Generating valid column states and managing transitions required careful bitmasking and integer manipulation.
- Ensuring transitions only between compatible states took time to debug.

## ✅ What I Learned

- How to represent colorings using base-3 encoding to handle 3 distinct colors efficiently.
- Powerful use of **precomputed states and transitions** for optimization in grid-based coloring problems.
- A deep dive into **bitmasking + dynamic programming** to solve combinatorially hard problems efficiently.


