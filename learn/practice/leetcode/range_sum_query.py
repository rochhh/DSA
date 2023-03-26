class NumArray:

    def __init__(self, nums: List[int]):
        self.prefix = []
        count = 0

        for num in nums:
            count += num
            self.prefix.append(count)

    def sumRange(self, left: int, right: int) -> int:

        left_sum = self.prefix[left - 1] if left > 0 else 0
        right_sum = self.prefix[right]

        return right_sum - left_sum

        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)