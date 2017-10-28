str=raw_input()

strrev=reversed(str)

if list(str)==list(strrev):
    print "palindrome"
else:
    print "not a palindrome"
