# author: @y3snt

from read import read_file

my_array = read_file()

n = len(my_array)
total_swaps = 0
total_comparisons = 0
for i in range(1, n):
    j = i
    while j > 0:
        total_comparisons += 1
        if my_array[j] < my_array[j - 1]:
            my_array[j], my_array[j - 1] = my_array[j - 1], my_array[j]
            total_swaps += 1
            j -= 1
        else:
            break


print("Sorted array:", my_array)
print(f"Total swaps: {total_swaps}")
print(f"Total comparisons: {total_comparisons}")
