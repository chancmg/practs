str=raw_input("enter the char to find")

chr="Python"

for i in chr:
	if i==str:
		print "found"
		break
	else:
		continue
else:
	print "not found"
	
