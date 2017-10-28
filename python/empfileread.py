try:
	devflag='DEVELOPER'
	fo=open("edetails.txt","r")

	lines=fo.readlines()

	for line in lines:
		if devflag in line:
			print line

except IOError:
	print "file not found"