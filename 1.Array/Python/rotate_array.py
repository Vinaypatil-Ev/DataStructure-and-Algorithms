# block swap algorithm of array rotation

def rotateArr(arr, d, n):
    if d == n or d == 0:
        return
    a = d
    b = n - d
    while a != b:
        if a < b:
            swap(arr, d - a, d + b - a, a)
            b -= a
        else:
            swap(arr, d - a, d, b)
            a -= b
    swap(arr, d - a, d, b)
    
    
def swap(arr, fi, si, d):
    for i in range(d):
        temp = arr[fi + i]
        arr[fi + i] = arr[si + i]
        arr[si + i] = temp


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print("arr", arr)
rotateArr(arr, 5, len(arr))
print("arr", arr)