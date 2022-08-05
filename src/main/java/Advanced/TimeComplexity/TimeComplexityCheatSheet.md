#Time Complexity
Time complexity represents the way the total number of operations scales with regards
to the size of the problem. Here are some general guidelines to time complexity:

1) As a general rule, every nesting of a for loop multiplies complexity by n and every tree search or binary search multiplies complexity by log(n). For our purposes, this is the extent that we need to understand. So, a single for loop has a complexity of n, a for loop inside a for loop has a complexity of n^2, a tree search inside a for loop has a complexity of nlog(n), etc.
2) Remember that 1 < log(n) < n < nlog(n) < n^2 < n^3 < 2^n < n!.
3) Basic addition, multiplication, divisions are removed from time complexity, so eg n/2 +1 resolves to n. The reason for this is that we are only concerned about the shape of the scaling of the problem as n approaches infinity, so any extra value like that become irrelevant when compared to other, multiplicative forms of complexity. This is referred to as 'amortized time complexity.'