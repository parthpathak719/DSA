# DSA Practice

103 Java files organized by the main approach used in each implementation. Each
file has one home; recursive solutions are included in `dp`.

| Folder | Java files | Topics |
| --- | ---: | --- |
| [arrays](arrays/) | 16 | Array operations, matrices, binary search, Kadane's algorithm, continuous increasing sequences |
| [strings](strings/) | 13 | String manipulation, parsing, comparisons, two pointers |
| [greedy](greedy/) | 23 | Scheduling, intervals, jump games, local choices, fractional knapsack |
| [dp](dp/) | 22 | Dynamic programming and recursion: knapsack, subsequences, palindromes, coin change |
| [sliding window](sliding%20window/) | 8 | Fixed and variable windows, anagrams, substring and subarray problems |
| [stack](stack/) | 8 | Stack basics, nearest greater/smaller elements, stock span, histograms |
| [queue](queue/) | 1 | Sliding-window maximum using a monotonic deque |
| [math](math/) | 2 | GCD/LCM and water-bottle exchange simulation |
| [hashmap](hashmap/) | 10 | Hash maps, membership checks, character frequencies, grouping and counting |

## Problems that fit multiple topics

- The optimized [sliding-window maximum](queue/sliding_window_max.java) is in
  `queue` because it uses `ArrayDeque`. Its
  [brute-force version](sliding%20window/sliding_window_maximum_BF.java) is in
  `sliding window`.
- Palindrome solutions that build DP tables are in `dp`; direct string checks
  are in `strings`.
- The [DP subsequence solution](dp/isSubsequence_DP.java) is in `dp`, while the
  [two-pointer solution](strings/isSubsequence_TwoPointer.java) is in `strings`.
- Character-frequency arrays are grouped with hashing in `hashmap`. Anagram
  solutions that maintain a moving window are in `sliding window`.
- [Valid Parenthesis String](greedy/valid_parenthesis_string.java) uses greedy
  bounds on unmatched parentheses, so it is in `greedy`.
- Fractional knapsack is in `greedy`; recursive and DP 0/1 knapsack are in `dp`.

## Notes and practice guides

- [Knapsack notes](dp/kanpsack%20notes/)
- [Greedy problem notes](greedy/greedy.txt)
- [Java conversions](CONVERSIONS%20IN%20JAVA.txt)
- [LeetCode practice list](leetcode_practice_list.md)
