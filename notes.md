# 1. Binary Palindrome
   ### Steps
   1. Convert the Integer to Binary String
   2. Check the string isPalindrome  
   TC: O(log n)  
        > [Click here for code](./BinaryPalindrome.java)  
---
# 2. Booth's algorithm
   >The booth’s algorithm is a multiplication algorithm that allows us to multiply the two signed binary integers in 2's complement, respectively.
   
   ------
# 3. Euclid's Algorithm
   >Euclidean algorithm or Euclid's algorithm, is an efficient method for computing the greatest common divisor (GCD) of two integers (numbers), the largest number that divides them both without a remainder.  

   TC: O(log(min(a, b))).
   ### Steps
   1. Modules the input iteratively `gcd(b%a, a)`
   2. end condition `a==0` return `b`
   
   >[Click here for code](./Eulid_s.java)

   ----- 
# 4. Karastsuba Algorithm

> Multiplication of two numbers with the large powers with the small intervel

## steps to be followed

1. consider two `4` digit numbers `x = 1234` and `y=2345`
2. divide the `n` digit numbers to `n/2`
   1. `12 34` `a b` and `23 45` `c d`
3. compute `axc = 276` 
4. compute `bxd = 1530`
5. compute `(a+b)(c+d) = 46*134 = 3128`
6. compute `5 - 4 - 3 = 3128-1530-276 = 1322`
7. FInally multiply the output of step `3` by `10^4 (10^n)`, the output of step `6`by `10^2 (10^n/2)`, and add them both with the output of step `4`.
8. `2760000+132200+1530 = 2893730`
> The product of `1234` and `5678` using karatsuba algorithm is **`3074330`**

> [Click here for code](./Karatsuba.java)


-----
# 5. Longest Sequence of 1 after flipping a bit
  > Flip the k number of bits to get longest sequence of 1 
  > sliding window

    TC: O(n)
    SP: O(1)  
  > [Click here for code](./LongestSequenceONE.java)

----
# 6. swap two nibbles in a byte
  > swap first 4 bit(nibble) and last 4 bit (nibble)
  ### Steps:
  1. get Last 4 bits using `nums & 0x0F` then shift << 4  and First 4 bits using `nums & 0xF0`  then shift >> 4
  2. Use OR operation | to add both

 > [Click here for code](./SwapNipple.java)
----
# 7. block swap algorithm
   >TC O(n)  
   >SC O(1)
   ### steps:
   1. Three swaps:
   2. first 0 to d-1
   3. second d to end-1 
   4. thrid 0 to end-1
   > [Click here for code](./BlockSwap.java)
----
# 8. Max Product subarray
   Traverse through the array find the max product Brute Force method  
   >[Click here for code](./MaxProductSub.java)
----
# 9.  Maximum sum of hour glass in matrix
   >Hourglass matrix
```
XXX
 X 
XXX
```

(R-2)*(C-2)

```
1 2 4 5 6
7 5 2 3 6
0 0 0 0 0
7 5 1 3 5
0 0 0 0 0
```
5-2*5-2 = 9 hourglass
```
m[i][j]    m[i][j+1]    m[i][j+2]
           m[i+1][j+1]
m[i+2][j]  m[i+2][j+1]  m[i+2][j+2]
```
> [Click here for code](./HourglassMax.java)
----
# 10.  Max Equilibrium Sum
   >The maximum equilibrium sum problem involves finding the split point in an array where the sum of elements on the left of that split is closest to equaling the sum of elements on the right of that split.

   TC: O(n)  
   SC: O(1)
   ### Steps:
   1. Find array of Preffix sums `preSum[i - 1] + arr[i]`
   2. Find array fo suffix sums n-2 to 0 `suff[i+1]+suff[i]`
   3. if `preSum[i] == suff[i]` return ans

   >[Click here for code](./MaxEquili.java)

-----
# 11.  Leaders in array
   > Find the element that is largest of its right sided elements   

   TC: O(n)  
   SC: O(n)
   ### steps:
   1. traverse from end of the array
   2. find if it is new max then add to array
   
   >[Click here for code](./LeadersInArray.java)
----
# 12.  Majority element
   >A majority element in an array of size n is an element that appears more than n/2 times.
   
   >[Click here for code](./MajorityEle.java)
-----
# 13.  Lexicographically first palindromic string
   ### Steps:
   1. Find the count of each alphabet
   2. find check the conditions even len string then no odd char
   3. if odd len string then one odd char
   4. get the prefix and suffix by dividing the occurance and append it to the temp then return prefix+odd+suffix  
   >[Click here for code](./LexPalindromicString.java)