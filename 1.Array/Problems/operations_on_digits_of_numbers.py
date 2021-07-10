# sum of digits of number
def sum_digit(n):
    s = 0
    while n != 0:
        s += n % 10
        n //= 10
    return s



if __name__ == "__main__":
    print(sum_digit(1234))
        