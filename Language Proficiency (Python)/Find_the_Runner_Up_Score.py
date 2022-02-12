if __name__ == '__main__':
    n = int(input())
    arr = list(set(map(int, input().split())))
    arr.sort()
    print(arr[-2] if len(arr) > 1 else arr[0])
