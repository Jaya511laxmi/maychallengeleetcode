# 📅 Day 14 – Total Characters in String After Transformations II

- 🔗 LeetCode Problem: [3337. Total Characters in String After Transformations II](https://leetcode.com/problems/total-characters-in-string-after-transformations-ii)
- 💡 Difficulty: Hard
- 🧠 Topic Tags: String, Matrix Exponentiation, Simulation

## ✍️ Problem Summary

You are given:
- A string `s` of lowercase letters
- An integer `t` for number of transformations
- An array `nums[26]`, where `nums[i]` tells how many **next characters** the letter `'a' + i` transforms into.

### Transformation rules:
- For each character `c` in `s`, replace it with the next `nums[c - 'a']` consecutive characters in the alphabet (wrapping after `'z'`).
- After `t` transformations, return the total length of the resulting string **modulo 10⁹ + 7**.

### Constraints:
- `1 <= s.length <= 10⁵`
- `1 <= t <= 10⁵`
- `nums.length == 26`

## 🚧 My Approach

- Each character's transformation can be viewed as a **transition from one character to multiple others**.
- Constructed a **26×26 matrix** `T` where `T[a][b] = 1` if character `b` transforms into character `a`.
- Applied **matrix exponentiation** on `T` to compute the transformation effect after `t` steps.
- Used an array `f` to count initial frequency of each character, then multiplied it with the resulting transformation matrix.

## 😖 Struggles

- Naively simulating the transformations quickly leads to exponential growth, which is not feasible for large `t`.
- Required careful matrix multiplication implementation to handle **modular arithmetic** and ensure performance.
- Needed to wrap around the alphabet using `(i + j) % 26`.

## ✅ What I Learned

- Efficiently modeling **character replacement rules** using **linear algebra** and **matrix exponentiation**.
- How to convert a string transformation problem into a **state transition system**.
- Importance of optimization using identity matrices and squaring in large `t` computations.
