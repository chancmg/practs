try :
	fo=open("AutomobileList.txt","r")
	lines=fo.readlines()

	dict={}

	line_number=0

	for line in lines :

		if (line_number>0) :
			token=line.split(" ")
			dict[token[0]]=token[1]
		
		line_number+=1



	print dict.keys(),"\n"
	print dict.values()

		




	fo.close()


except :
	print "Either the file doesn't exist or an error occured while reading from file"
