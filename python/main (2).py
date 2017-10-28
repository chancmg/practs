def is_Leap_Year(y) :
	if (y%400==0) :
		print "Is a Leap Year\n"
	elif (y%100==0) :
		print "Is not a Leap Year\n"
	elif (y%4==0) :
		print "Is a Leap Year\n"
	else :
		print "Is not a Leap Year\n"
	return



year=int(raw_input("Enter the year to check for : "))

is_Leap_Year(year)
