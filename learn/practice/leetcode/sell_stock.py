def prev_max_profit(arr):
    ''' Did not pass all testcases '''
    buy = 0
    sell = len(arr)-1
    curr_profit = 0
    max_profit = 0

    for i in range(1,len(arr)):

        if arr[buy] > arr[sell]:
            buy+=1
        if arr[sell] > arr[buy]:
            curr_profit = arr[sell]-arr[buy]
            sell -=1
        max_profit = max( max_profit , curr_profit )
    
    return max_profit

def max_profit(arr):
    buy = 0
    sell = 1
    max_profit = 0

    while sell < len(arr):
        curr_profit = arr[sell] - arr[buy]

        if arr[sell] > arr[buy]:
            max_profit = max( max_profit , curr_profit )
        else:
            buy = sell
        sell += 1
    return max_profit

arr = [7,1,5,3,6,4]

print(max_profit(arr))