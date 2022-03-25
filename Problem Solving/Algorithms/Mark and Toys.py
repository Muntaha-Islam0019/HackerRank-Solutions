#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'maximumToys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY prices
#  2. INTEGER k
#

def maximumToys(prices, k):
    # Write your code here
    s = 0
    for i in prices:
        if i <= k:
            s += 1
            k -= i
        else:
            break
    return s

if __name__ == '__main__':
    n,k = map(int,input().split())
    prices = sorted(map(int,input().split()))
    print(maximumToys(prices, k))
