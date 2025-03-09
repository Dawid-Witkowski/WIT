# author: @y3snt

from read import read_file

my_array = read_file()

total_swaps = 0
total_comparisons = 0
n = len(my_array)
for i in range(n-1):
    current_swaps = 0
    for j in range(n-i-1):
        total_comparisons += 1
        if my_array[j] > my_array[j+1]:
            my_array[j], my_array[j+1] = my_array[j+1], my_array[j]
            current_swaps += 1
    if current_swaps == 0:
        break
    else:
        total_swaps += current_swaps

print("Sorted array:", my_array)
print(f"Total swaps: {total_swaps}")
print(f"Total comparisons: {total_comparisons}")
