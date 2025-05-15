# 📅 Day 15 – Longest Unequal Adjacent Groups Subsequence I

- 🔗 LeetCode Problem: [2900. Longest Unequal Adjacent Groups Subsequence I](https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i)
- 💡 Difficulty: Easy
- 🧠 Topic Tags: Greedy, Array, Subsequence

## ✍️ Problem Summary

You're given:
- A `String[] words` and a `binary int[] groups`, both of length `n`.

### Goal:
Select the **longest subsequence** from `words` such that the corresponding `groups` alternate (i.e., no two consecutive `0`s or `1`s in the selected subsequence).

## 🚧 My Approach

- Always pick the **first word**.
- Then iterate through the list:
  - Add the word to the result **only if** its group is different from the previous added group's value.
- This greedy method ensures the longest possible alternating subsequence.

## 😖 Struggles

- Initially didn't consider edge case when `n == 1`.
- Needed to distinguish between **consecutive elements in the full list vs. selected subsequence**.

## ✅ What I Learned

- How to extract the longest alternating subsequence using a **greedy approach**.
- Importance of **tracking last added group's value**, not just comparing adjacent original group values.
