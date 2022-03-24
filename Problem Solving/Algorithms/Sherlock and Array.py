#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'balancedSums' function below.
#
# The function is expected to return arr STRING.
# The function accepts INTEGER_ARRAY arr as parameter.
#


def balancedSums(arr):
    # Write your code here

    left_idx = 0
    right_idx = len(arr) - 1

    left_sum = arr[left_idx]
    right_sum = arr[right_idx]

    while left_idx != right_idx:
        if left_sum < right_sum:
            left_idx += 1
            left_sum += arr[left_idx]
        else:
            right_idx -= 1
            right_sum += arr[right_idx]

    return 'YES' if (left_sum == right_sum) else 'NO'


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    T = int(input().strip())

    for T_itr in range(T):
        n = int(input().strip())

        arr = list(map(int, input().rstrip().split()))

        result = balancedSums(arr)

        fptr.write(result + '\n')

    fptr.close()
