# 📅 Day 19 – Type of Triangle

- 🔗 LeetCode Problem: [3024. Type of Triangle](https://leetcode.com/problems/type-of-triangle/)
- 💡 Difficulty: Easy
- 🧠 Topic Tags: Sorting, Geometry, Conditions

## ✍️ Problem Summary

Given an integer array `nums` of size 3 representing the side lengths of a triangle, classify it as:

- `"equilateral"`: All sides are equal.
- `"isosceles"`: Exactly two sides are equal.
- `"scalene"`: All sides are different.
- `"none"`: Not a valid triangle.

### Triangle Validity Rule:
For three sides `a`, `b`, and `c` to form a triangle:
- `a + b > c`, `a + c > b`, and `b + c > a`

(Since we sort the sides first, we only need to check: `a + b > c`)

## 🚧 My Approach

1. **Sort the array** so that smallest sides come first: `a ≤ b ≤ c`.
2. **Check for triangle validity** using the rule: `a + b > c`.
3. **Classify**:
   - If all equal → "equilateral"
   - If exactly two equal → "isosceles"
   - If all different → "scalene"
