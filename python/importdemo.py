import random

i=random.randrange(0,100)

print "Random number is:",i

if(i<25):
	print "random number is less than 25"
elif(i<50):
	print  "random number is less than 50 greater than 25"
elif(i<75):
	print "random number is less than 75 greater than 25"
else:
	print "random number is less than 100 greater than 75"