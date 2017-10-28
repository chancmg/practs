try :
	fo=open("FruitList.txt","r")
	lines=fo.readlines()

	dict={}

	line_number=0

	for line in lines :

		if (line_number>0) :
			token=line.split(" ")
			dict[token[1].lower()]=token[2]
		
		line_number+=1



	ch="y"


	while(ch=="y") :


		str=raw_input("Enter the food name to be searched : ").lower()

		if (str in dict) :
			print dict[str],"\n"
		else :
			print "Item doesn't exist\n"

		ch=raw_input("Do you want to continue searching (y/n) ? : ")

	fo.close()


except :
	print "Either the file doesn't exist or an error occured while reading from file"
