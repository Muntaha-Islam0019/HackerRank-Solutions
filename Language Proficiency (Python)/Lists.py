from operator import le


if __name__ == '__main__':
    N = int(input())
    the_list = []
    
    for _ in range(N):
        query_name, *line = input().split()
        values = list(map(int, line))
        item_count = len(values) + 1
        if item_count == 3:
            the_list.insert(values[0], values[1])
        elif item_count == 2:
            if query_name == "remove":
                the_list.remove(values[0])
            elif query_name == "append":
                the_list.append(values[0])
        elif item_count == 1:
            if query_name == "print":
                print(the_list)
            elif query_name == "sort":
                the_list.sort()
            elif query_name == "pop":
                the_list.pop()
            elif query_name == "reverse":
                the_list.reverse()
