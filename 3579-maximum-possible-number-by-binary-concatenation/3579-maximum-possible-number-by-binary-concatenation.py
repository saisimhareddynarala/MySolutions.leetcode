class Solution(object):
    def maxGoodNumber(self, nums):
        bn = [bin(num)[2:] for num in nums]
        bn.sort(key=lambda x: x * 20, reverse = True)
        mbs = ''.join(bn)
        mn = int(mbs,2)
        return mn
        """
        :type num                 s: List[int]
        :rtype: int
        """
        