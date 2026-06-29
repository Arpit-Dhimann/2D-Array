# 2D Arrays in Java - Notes

A **2D Array** is an array of arrays — a matrix with 
rows and columns stored in contiguous memory.

## Key Concepts

- **Declaration:** `int[][] arr = new int[rows][cols];`
- **Indexing:** 0-based — `arr[0][0]` is first element
- **Size:** rows × cols elements total
- **Traversal:** Always needs nested loops

## Memory

- Stored as array of row references
- Each row is a separate 1D array in memory

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Access / Update | O(1) |
| Traversal | O(n × m) |
| Search | O(n × m) |
| Transpose | O(n × m) |
| Spiral Order | O(n × m) |

## Space Complexity

- **O(n × m)** — n rows × m columns

## Syntax

​```java
// Declaration
int[][] arr = new int[3][3];

// Initialization
int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

// Access
arr[0][1] = 10;
System.out.println(arr[0][1]);

// Traversal
for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
​```

## Difference — 1D vs 2D

| Feature | 1D Array | 2D Array |
|---------|----------|----------|
| Structure | Single row | Rows × Columns |
| Access | arr[i] | arr[i][j] |
| Traversal | 1 loop | 2 nested loops |
| Use case | List | Matrix / Grid |

---
*Learning in public – Arpit Dhiman*