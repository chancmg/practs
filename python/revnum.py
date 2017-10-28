str=int(raw_input("Enter the string to rev"))

rev=0
while str>0:
	rem=str%10
	rev=(rev*10)+rem
	str/=10
print rev