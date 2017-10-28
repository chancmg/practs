'''factorial function'''
def fact(i):
	if(i==0):
		return 1
	else:
		return (i*fact(i-1))
num=input('enter the number')
if(num>=1):
	print "Factorial is:",fact(num)
