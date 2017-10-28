num=input()
s=0
while num>0:
	rem=num%10
	s=s+rem
	num/=10
print "sum of digits :",s	