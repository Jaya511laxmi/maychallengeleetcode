## 📅 Day 21 – Set Matrix Zeroes  
🔗 LeetCode Problem: [73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)  
💡 Difficulty: Medium  
🧠 Topic Tags: Array, Matrix, In-Place, Simulation  

### ✍️ Problem Summary  
Given an `m x n` matrix, if an element is 0, set its entire row and column to 0. This must be done **in-place**, i.e., without using additional memory proportional to matrix size.

---

### 🚧 My Approach  
- Used two separate arrays `row[]` and `col[]` to track which rows and columns need to be zeroed.
- First pass:
  - Identify the rows and columns that contain at least one zero.
- Second pass:
  - Set matrix[i][j] = 0 if either the i-th row or j-th column is marked.

✅ **Time Complexity:** O(m * n)  
✅ **Space Complexity:** O(m + n)  

---

### 😖 Struggles  
- Initially thought of modifying the matrix directly while iterating, which causes incorrect zero propagation.
- Realized we must **first mark** and **then apply** the zeroing.

---

### ✅ What I Learned  
- In-place problems may still allow **O(m + n)** extra space if we’re not using another full matrix.
- Always be cautious with **modifying input during traversal**—consider doing it in two passes.
- There is also an **O(1) space solution** using the matrix’s first row and column as markers, worth trying next!
