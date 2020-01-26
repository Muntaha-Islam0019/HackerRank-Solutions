# Returns the original output.
# Though, it should be done with one print.
# n = int(input())

# for i in range(1, n+1):

#     a_list = []

#     for j in range(1, i+1):
#         a_list.append(j)
#     for k in range(i-1, 0, -1):
#         a_list.append(k)

#     for item in a_list:
#         print(item, end='')

#     print()


# Using integer division.
for i in range(1, int(input())+1):
    print(int((1+10**i*(-2+10**i)//81)))
