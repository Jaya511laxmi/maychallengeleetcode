# 📅 Day 17 – Sort Colors

- 🔗 LeetCode Problem: [75. Sort Colors](https://leetcode.com/problems/sort-colors/)
- 💡 Difficulty: Medium
- 🧠 Topic Tags: Array, Two Pointers, Sorting

## ✍️ Problem Summary

You're given an array `nums` where:
- Each element is either `0`, `1`, or `2` (representing red, white, and blue respectively).

### Goal:
Sort the array **in-place** such that:
- All `0`s (red) come first,
- followed by `1`s (white),
- and finally `2`s (blue).


## 🚧 My Approach

🔹 **Current Implementation:** Merge Sort  
- I implemented merge sort manually with:
  - `mergesort()` for recursive division
  - `merge()` for combining sorted halves

🔹 **Note:**  
This solution **uses O(n) space** and **more than one pass**, so it doesn't meet the follow-up requirements but works correctly for sorting.

## 😖 Struggles

- I initially focused on implementing a correct sorting algorithm and chose merge sort, which isn't the most optimal for this specific case.
- Didn't initially implement the **Dutch National Flag algorithm**, which is optimal here.

## ✅ What I Learned

- Practiced implementing a full merge sort from scratch.
- Understood that for problems with **limited element range (0, 1, 2)**, a **counting sort or two-pointer approach (Dutch National Flag algorithm)** is more efficient.
