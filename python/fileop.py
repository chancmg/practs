try:
	file=open("FruitList.txt","r")

	lines=file.readlines()
	d={}
	linecount=0

	for line in lines:
		if(linecount>0):
			token=line.split(" ")
			d[token[1].lower()]=token[2]
		linecount+=1
	ch="y"

	while ch == 'y':
		str=raw_input("Enter the food name to be searched : ").lower()
		if str in d:
			print d[str],"\n"
		else:
			print "Item doesn't exist\n"
		ch=raw_input("Do you want to continue searching (y/n) ? : ")

except:
	print "File not found"	

