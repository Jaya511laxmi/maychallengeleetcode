# 📅 Day 13 – Total Characters in String After Transformations I

- 🔗 LeetCode Problem: [3335. Total Characters in String After Transformations I](https://leetcode.com/problems/total-characters-in-string-after-transformations-i)
- 💡 Difficulty: Medium
- 🧠 Topic Tags: String, Simulation, Frequency Array

## ✍️ Problem Summary

You're given a string `s` and an integer `t`, representing the number of transformations.  
In each transformation:
- Replace each `'z'` with `"ab"` (length increases by 1 per `'z'`).
- Replace all other characters with their **next** character in the alphabet.

Return the final length of the string **after `t` transformations**, modulo `10⁹ + 7`.

## 🚧 My Approach

- Used a frequency array `freq[26]` to count characters.
- For each transformation:
  - Track the number of `'z'`s.
  - Shift character frequencies rightward (simulate advancing alphabet).
  - Add `'z'` frequency to both `'a'` and `'b'` since `'z'` → `"ab"`.
- Avoided building actual strings to stay within time/memory limits.
- At the end, summed up all frequencies to get final string length.

## 😖 Struggles

- Initially considered building the string iteratively, but it became clear that would exceed time limits for large inputs.
- Needed to think in terms of **count transformations**, not actual string manipulation.

## ✅ What I Learned

- How to simulate character transformation efficiently using frequency arrays.
- Importance of **modular arithmetic** in problems with large numbers.
- Efficient approach to avoid O(n × t) complexity by working with **counts instead of strings**.
      
