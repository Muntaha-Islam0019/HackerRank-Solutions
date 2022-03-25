from collections import Counter
from itertools import groupby


def happyLadybugs(b):
    c = Counter(b)
    if "_" in c:
        for x, y in c.items():
            if y < 2 and x != "_":
                return "NO"
    else:
        for x, y in groupby(b):
            if len(list(y)) < 2:
                return "NO"
    return "YES"


for _ in range(int(input())):
    input()
    print(happyLadybugs(input()))
