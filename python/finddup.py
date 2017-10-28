def finddup(dlist):
	clist=set()
	for i in dlist:
		clist.add(i)
	return list(clist)

inlist=[2,3,4,2,3,6,7,3]

newlist= finddup(inlist)

print newlist