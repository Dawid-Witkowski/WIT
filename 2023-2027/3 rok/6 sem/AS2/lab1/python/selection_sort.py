# author: @y3snt

from read import read_file

arr = read_file()

n = len(arr)
total_swaps = 0
total_comparisons = 0
for i in range(n - 1, -1, -1):
    max_idx = i
    for j in range(0, i):
        total_comparisons += 1
        if arr[j] > arr[max_idx]:
            max_idx = j

    if arr[i] != arr[max_idx]:
        arr[i], arr[max_idx] = arr[max_idx], arr[i]
        total_swaps += 1

print("Sorted array:", arr)
print(f"Total swaps: {total_swaps}")
print(f"Total comparisons: {total_comparisons}")
