# 📅 Day 2 – Push Dominoes

🔗 **LeetCode Problem**: [838. Push Dominoes](https://leetcode.com/problems/push-dominoes/)  
💡 **Difficulty**: Medium  
🧠 **Topic Tags**: Two Pointers, Simulation, String

---

## ✍️ Problem Summary

Given a string representing dominoes pushed in different directions (`'L'`, `'R'`, `'.'`), simulate the falling process and return the final configuration.

- `'L'`: Domino pushed to the left  
- `'R'`: Domino pushed to the right  
- `'.'`: Domino standing upright

> Dominoes fall each second and affect their immediate neighbor. If two opposing dominoes meet, the standing one remains upright.

---

## 🚧 My Approach

- Used a **two-pointer + force simulation** method:
  - Assign positive force when pushing right (`R`) and negative force when pushing left (`L`).
  - For each domino, calculate net force by traversing twice (left to right and right to left).
  - Convert final forces back to `'L'`, `'R'`, or `'.'`.

---

## 😖 Struggles

- At first, I tried simulating second-by-second — too slow for large inputs.
- Realized it’s better to calculate "influence" as a force system instead of simulating each second.

---

## ✅ What I Learned

- Efficient simulations often come down to **preprocessing and propagation** rather than step-by-step movement.
- Force systems are great for problems involving competing influences.

---
