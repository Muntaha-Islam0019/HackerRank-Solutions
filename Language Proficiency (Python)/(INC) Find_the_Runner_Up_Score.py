# Incomplete
# Gets WA on 2 cases

if __name__ == '__main__':
    n = int(input())
    arr = list(set(map(int, input().split())))

    sorted(arr)
    print(arr[len(arr) - 2])
