# 📅 Day 11 – Three Consecutive Odds

- 🔗 LeetCode Problem: [1550. Three Consecutive Odds](https://leetcode.com/problems/three-consecutive-odds)
- 💡 Difficulty: Easy
- 🧠 Topic Tags: Array

## ✍️ Problem Summary

Given an integer array `arr`, determine whether the array contains **three consecutive odd numbers**.  
Return `true` if such a sequence exists, otherwise return `false`.

### Constraints:
- `1 <= arr.length <= 1000`
- `1 <= arr[i] <= 1000`

## 🚧 My Approach

- Initialize a counter `count = 0`.
- Traverse the array:
  - If the current number is odd (`arr[i] % 2 != 0`), increment `count`.
  - If it's even, reset `count = 0`.
  - If `count` reaches 3 at any point, return `true`.
- If loop ends without finding 3 consecutive odds, return `false`.

## 😖 Struggles

This was a straightforward problem with no significant blockers. Mainly focused on handling reset logic properly.

## ✅ What I Learned

- Reinforced the use of simple counters in linear scans.
- Practiced early exits in loops for performance optimization.
- Recalled how to check for odd numbers using modulus operator.
