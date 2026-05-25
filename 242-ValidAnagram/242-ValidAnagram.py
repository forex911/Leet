# Last updated: 5/25/2026, 11:10:44 AM
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        return sorted(s)==sorted(t)
        