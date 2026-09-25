`Lists`


Ordered collections that allow duplicate elements and positional access by integer index.


`ArrayList`

Big O: Read/Search by index O(1), search by value O(n), insertion O(1) amortized at end / O(n) at specific index, deletion O(n).

Advantages: Exceptionally fast random access by index; low memory overhead because elements are stored in a contiguous array; high cache locality.

Constraints: Inserting or removing elements in the middle requires shifting elements; array resizing incurs temporary allocation and copying costs.

`LinkedList`

Big O: Read/Search O(n), insertion/deletion O(1) at head or tail / O(n) at middle index.

Advantages: Fast O(1) insertions and deletions at both ends without array resizing; functions as both a List and a Deque.

Constraints: Poor cache locality due to non-contiguous node memory; high memory overhead from storing node references; index-based operations require traversing nodes from the head or tail.

`TreeSet`

Big O: Search, insertion, and deletion are O(\log n).

Advantages: Automatically keeps elements sorted naturally or via a custom Comparator; supports navigable range operations (e.g., subSet, headSet).

Constraints: Slower than hash-based collections; elements must implement Comparable or provide a comparator; prohibits null elements.


`LinkedHashSet`

Big O: Search, insertion, and deletion are O(1) on average.

Advantages: Combines hash-based speed with deterministic iteration order based on element insertion order.

Constraints: Consumes more memory than HashSet to maintain a doubly-linked list across all entries; slightly slower insertion performance.

`Maps`

Objects that map unique keys to values (does not implement the Collection interface directly, but part of the framework).

`HashMap`

Big O: Search, insertion, and deletion are O(1) on average, degrading to O(\log n) worst-case for bucket collisions.

Advantages: Industry standard for key-value storage; high-performance lookups and mutations.

Constraints: Provides no ordering guarantees for keys; poor hash code distribution can degrade performance; high memory overhead due to underlying node arrays.

`TreeMap`

Big O: Search, insertion, and deletion are O(\log n).

Advantages: Maintains keys in sorted order; offers rich navigation methods (e.g., firstKey, floorKey, tailMap).

Constraints: Slower lookup and insertion operations compared to HashMap; keys cannot be null.

`LinkedHashMap`

Big O: Search, insertion, and deletion are O(1) on average.

Advantages: Preserves key insertion order during iteration; can be configured as an Access-Order map to easily build LRU (Least Recently Used) caches.

Constraints: Requires additional memory for doubly-linked nodes; marginally lower insertion speed compared to HashMap.

`Queues & Deques`

Collections designed for holding elements prior to processing (FIFO, LIFO, or priority ordering).

`ArrayDeque`

Big O: Peek at ends O(1), insertion/deletion at ends O(1) amortized, search O(n).

Advantages: Outperforms both Stack and LinkedList when used as a stack or queue; resizes dynamically with minimal node allocation overhead.

Constraints: Does not allow null elements; not thread-safe; arbitrary index access is not supported.

`PriorityQueue`

Big O: Peek head O(1), insertion (offer) O(\log n), removal of head (poll) O(\log n), search/remove arbitrary element O(n).

Advantages: Automatically orders elements based on priority using an underlying min/max heap.

Constraints: Searching or deleting non-head elements is inefficient (O(n)); elements must be orderable; does not allow null elements.


Big 0 - 1 starts instantly 
constant time

Big O (log n) - exponentially
starts slowly and gets faster

Big O