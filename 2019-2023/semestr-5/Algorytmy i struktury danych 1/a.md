```dot
graph base_flow {
11 -- 5;
11 -- 7;
5 -- 2;
5 -- 15;
7 -- 4;
7 -- 6;
}
```
```dot
graph base_flow {
11 -- 5;
11 -- 7;
5 -- 2;
5 -- 15;
7 -- 4;
7 -- 6;
}
```
Zamiana 15 z 5
```dot
graph base_flow {
11 -- 15;
11 -- 7;
15 -- 2;
15 -- 5;
7 -- 4;
7 -- 6;
}
```
```dot
graph base_flow {
11 -- 15;
11 -- 7;
15 -- 2;
15 -- 5;
7 -- 4;
7 -- 6;
}
```
Zamiana 15 z 11
```dot
graph base_flow {
15 -- 11;
15 -- 7;
11 -- 2;
11 -- 5;
7 -- 4;
7 -- 6;
}
```
[15] [11, 7, 2, 5, 4, 6]
```dot
graph base_flow {
11 -- 7;
11 -- 2;
7 -- 5;
7 -- 4;
2 -- 6;
}
```
```dot
graph base_flow {
11 -- 7;
11 -- 2;
7 -- 5;
7 -- 4;
2 -- 6;
}
```
Zamiana 6 z 2
```dot
graph base_flow {
11 -- 7;
11 -- 6;
7 -- 5;
7 -- 4;
6 -- 2;
}
```
[15, 11] [7, 6, 5, 4, 2]
```dot
graph base_flow {
7 -- 6;
7 -- 5;
6 -- 4;
6 -- 2;
}
```
[15, 11, 7] [6, 5, 4, 2]
```dot
graph base_flow {
6 -- 5;
6 -- 4;
5 -- 2;
}
```
[15, 11, 7, 6] [5, 4, 2]
```dot
graph base_flow {
5 -- 4;
5 -- 2;
}
```
[15, 11, 7, 6, 5] [4, 2]
```dot
graph base_flow {
4 -- 2;
}
```
[15, 11, 7, 6, 5, 4] [2]
