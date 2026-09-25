1. `O(1)O(1) — Constant Time (The Vending Machine)`
   The Analogy: You walk up to a vending machine, push button B4, and your snack drops.
   Why it scales: Whether the vending machine has 10 snacks or 10,000 snacks, pushing button B4 takes the exact same 2 seconds.
   In Code: Looking up an item in a HashMap by its key, or reading an array by index (array[5]).

2. `O(log⁡n)O(logn) — Logarithmic Time (The Old-School Phone Book)`
   The Analogy: You want to find someone with the last name "Miller" in a 1,000-page printed phone book.
   You don't read page 1, then page 2.
   You open the phone book right in the middle (letter M).
   If you land on "Parker", you tear the entire second half of the book off and throw it in the trash!
   You repeat: cut the remaining pages in half every single step.
   Why it scales: Even if the phone book doubles in size from 1,000 pages to 2,000 pages, you only need one extra flip!
   In Code: Binary Search on a sorted array.

3. `O(n)O(n) — Linear Time (The Lost Keys in a House)`
   The Analogy: You lost your car keys in an apartment with nn rooms. You must walk into every single room and search it one by one.
   Why it scales:
   If your apartment has 3 rooms, it takes 3 minutes.
   If you move into a mansion with 300 rooms, it takes 300 minutes.
   Double the rooms = double the time.
   In Code: A simple for loop searching for a value in an unsorted list.

4. `O(nlog⁡n)O(nlogn) — Linearithmic Time (The Organized Card Dealer)`
   The Analogy: You have a messy pile of 52 playing cards to sort from Ace to King.
   Trying to scan the whole deck repeatedly is slow.
   Instead, you split the deck into two smaller piles, split those into smaller piles, sort the small piles, and neatly merge them back together like a zipper.
   Why it scales: This is the gold standard speed for sorting. It is slightly slower than O(n)O(n), but far faster than clumsy methods.
   In Code: Merge Sort, TimSort (Collections.sort()), QuickSort.

5. `O(n2)O(n2) — Quadratic Time (The Awkward Party Handshake)`
   The Analogy: You host a networking party with nn people, and every single person must shake hands with every other person in the room.
   Why it scales:
   If 5 people attend: 10 handshakes. (Easy).
   If 50 people attend: 1,225 handshakes. (Tiring).
   If 1,000 people attend: Nearly 500,000 handshakes!
   In Code: A nested loop inside another loop (e.g. comparing every item in a list against every other item, like Bubble Sort).

6. `O(2n)O(2n) — Exponential Time (Guessing a Padlock Combination)`
   The Analogy: You want to crack a padlock where each dial has 2 positions (0 or 1).
   1 dial: 2 combinations.
   2 dials: 4 combinations.
   3 dials: 8 combinations.
   10 dials: 1,024 combinations.
   30 dials: Over 1 BILLION combinations!
   Why it scales: Every single time you add just 1 more item, the entire amount of work DOUBLES.
   In Code: Brute-force recursive algorithms (e.g., naive Fibonacci recursion).

7. `O(n!)O(n!) — Factorial Time (The Traveling Salesman / Seating Chart)`
   The Analogy: You are planning a wedding with nn guests at a circular table. You insist on testing every possible seating permutation to see which one has the best conversation vibe.
   Why it scales:
   5 guests: 120 seating charts to test.
   10 guests: 3.6 million charts.
   20 guests: 2.4×10182.4×1018 charts. Even the fastest supercomputer on Earth would take thousands of years to calculate this.
   In Code: Brute-force Traveling Salesperson Problem.
 