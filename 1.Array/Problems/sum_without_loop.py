def sum_without_loop(arr, n):
    if n == 0:
        return arr[0]
    return arr[n] + sum_without_loop(arr, n-1)

def sum_using_formula(arr, n):
    """ It works only if array is sequential"""
    return n * (n + 1) / 2

arr = [1, 2, 3, 4, 5, 6, 7]
print(len(arr))
print(sum(arr))
print(sum_using_formula(arr, len(arr)))
# print(sum_using_formula(arr, len(arr)))

