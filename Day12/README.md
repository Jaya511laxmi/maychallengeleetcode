# 📅 Day 12 – Finding 3-Digit Even Numbers

- 🔗 LeetCode Problem: [2094. Finding 3-Digit Even Numbers](https://leetcode.com/problems/finding-3-digit-even-numbers)
- 💡 Difficulty: Easy
- 🧠 Topic Tags: Array, Counting, Brute Force

## ✍️ Problem Summary

Given an array of digits (`0–9`, possibly with duplicates), find all **unique** 3-digit **even numbers** that:
- Are formed using exactly three digits from the array.
- Do **not** have leading zero.
- Are **even** (i.e., end with an even digit).

Return a sorted array of all valid numbers.

### Constraints:
- `3 <= digits.length <= 100`
- `0 <= digits[i] <= 9`

## 🚧 My Approach

- First, count the frequency of each digit using an array `freq[10]`.
- Iterate through all **3-digit even numbers (100 to 998, step 2)**:
  - Extract digits `a`, `b`, `c` from the number.
  - Count their usage in a temporary array `local[10]`.
  - Check if each digit's required count in `local` is within what's available in `freq`.
  - If valid, add the number to the result list.
- Finally, convert the result list to an array.

## 😖 Struggles

- Initially overlooked numbers with **leading zeros**, but handled it automatically by checking only numbers from `100` to `998`.
- Made sure to use a **frequency map** instead of generating all permutations (which would be slower).

## ✅ What I Learned

- Reinforced how to generate valid numbers via **digit frequency comparison**.
- Practiced optimizing brute-force by avoiding unnecessary permutations.
- Learned to avoid leading zero numbers by **constraining the search space** upfront.
