def max_sub_seq(arr, n):
    a = -1000000000000000000
    b = 0
    z = []
    for i in range(n):
        b = b + arr[i]
        if a < b:
            z.append(i)
            a = b
        if b < 0:
            b = 0
    print(arr, z, a)
        
x = [-2, -3, 4, -1, -2, 1, 5, -3]
max_sub_seq(x, len(x))