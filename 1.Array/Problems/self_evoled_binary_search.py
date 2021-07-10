def self_bin_serach(arr, s, e, key):
    mid = int(s + (e - s) / 2)
    if arr[mid] == key:
        return mid
    while s < e:
        if arr[s] == key:
            return s
        if arr[e] == key:
            return e
        s += 1
        e -= 1
    return -1

arr = [33, 44, 16, 1, 14, 6, 2, 5, 7, 9, 10]
x = self_bin_serach(arr, 0, len(arr) - 1, 9)
print(x)
