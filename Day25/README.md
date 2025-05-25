# 📅 Day 25 – 2131. Longest Palindrome by Concatenating Two Letter Words  
🔗 **LeetCode Problem:** [2131. Longest Palindrome by Concatenating Two Letter Words](https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words)  
💡 **Difficulty:** Medium  
🧠 **Topic Tags:** Hash Table, Greedy, Array, String  

---

## ✍️ Problem Summary  
You're given an array of 2-letter lowercase strings.  
Goal: Form the **longest possible palindrome** by concatenating some of these strings (each used at most once).  
Return the **length** of the longest possible palindrome.

---

## 🚧 My Approach  
- Use a 26x26 matrix to count pairings of characters (`mat[i][j]` = count of string formed by (i+'a')(j+'a'))
- For every word:
  - If its reverse exists (`mat[second][first] > 0`), use both to contribute `+4` to the palindrome
  - Otherwise, store it in `mat[first][second]`
- After the loop, if any symmetric pair (like `"cc"`) exists, we can place one in the center, contributing `+2`
- Return the total length

---

## 🧮 Complexity  
- **Time Complexity:** $$O(n)$$ — we loop through the words once and do constant-time operations  
- **Space Complexity:** $$O(1)$$ — matrix is fixed size: 26 x 26  

---

## ✅ What I Learned  
- How to use a 2D frequency array for pair combinations  
- Handling special cases like palindromic strings (e.g., `"cc"`, `"aa"`)  
- Efficient greedy strategy to maximize palindrome length with limited selections

---


