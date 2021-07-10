#ratation by juggling method

def rotateArr(a, d):
    n = len(a)
    d = d % n
    g = gcd(d, n)
    for i in range(g):
        temp = a[i]
        j = i
        while True:
            k = j + d   
            if k >= n:
                k = k - n
            if k == i:
                break
            a[j] = a[k]
            j = k
        a[j] = temp

def gcd(a, b):
    if b==0:
        return a
    else:
        return gcd(b, a%b)
            



if __name__ == "__main__":
    a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    rotateArr(a, 2)
    print(a)