from datetime import datetime as dt

input_format = '%a %d %b %Y %H:%M:%S %z'
for i in range(int(input())):
    print(int(abs((dt.strptime(input(), input_format) -
                   dt.strptime(input(), input_format)).total_seconds())))
