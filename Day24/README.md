# 📅 Day 24 – 2942. Find Words Containing Character  
🔗 **LeetCode Problem:** [2942. Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character)  
💡 **Difficulty:** Easy  
🧠 **Topic Tags:** Array, String  

---

## ✍️ Problem Summary  
Given an array of strings `words` and a character `x`, return a list of indices where `x` appears in the words.  
The order of indices in the returned array does not matter.

---

## 🚧 My Approach  
- Loop through each word in the array using an index counter
- Use `String.contains()` to check if the character `x` exists in the current word
- If yes, add the index to the result list
- Return the list of valid indices

---

## 🧮 Complexity  
- **Time Complexity:** $$O(n \cdot m)$$, where `n` is the number of words and `m` is the average length of each word  
- **Space Complexity:** $$O(k)$$, where `k` is the number of indices that contain the character

---

## ✅ What I Learned  
- How to iterate and check for character occurrence in strings using `String.contains()`  
- Efficient use of `ArrayList` to collect conditional indices  
- Simple problem with direct application of string handling in Java

---
