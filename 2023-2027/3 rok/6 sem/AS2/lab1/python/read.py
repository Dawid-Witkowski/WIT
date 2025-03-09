# author: @y3snt

def read_file():
    with open("Selection_Insert_Bubble_0001.csv") as f:
        parsed_file = f.read().split('\n')[:-1]
        array = [int(x) for x in parsed_file]
        print(array)

    return array
