val=int(raw_input("enter the number"))

for i in range(2,val):
	if (val%i==0):
		print "Not prime"
		break
else:
	print "prime"