Function to find sum of elements in an array
def sum_of_elements(arr):
    total = 0
    for num in arr:
        total += num
    return total

# Example usage
array = [1, 2, 3, 4, 5]
result = sum_of_elements(array)
print(f"The sum of elements in the array is: {result}")
