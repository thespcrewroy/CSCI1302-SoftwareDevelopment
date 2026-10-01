# ASCII Notation for B+ Trees

## Step 1
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/btree1.png" alt="BTree" width="500">
</p>

Draw the tree on a scratch paper

## Step 2

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/btree2.png" alt="BTree Labeled" width="500">
</p>

Number the nodes in the tree on the scratch paper left to right

## Step 3

```
#1 []
#2 []
#3 []
#4 []
```

Write the nodes using `[]` with the node numbers in front

## Step 4
```
#1 [3 5 -]
#2 [1 2 -]
#3 [3 4 -]
#4 [5 7 9]
```

Write the keys for each corresponding node looking at the scratch paper. Do this one node at a time. If the key is blank, enter a dash `-`

## Step 5

```
#1 [#2 3 #3 5 #4 -]
#2 [1 2 - #3]
#3 [3 4 - #4]
#4 [5 7 9]
```

Write the destination node number with `#` prefix in places you have pointers to nodes in the scratch paper. Complete one node at a time. If you need to enter record pointers, insert them at the leaf nodes in the right places.