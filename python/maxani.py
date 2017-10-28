animals = { 'a': ['art'], 'b': ['balloon'], 'c': ['coat'], 'd': ['den','dog','deer']}

def big(adict):
	result=None
	biggest=0
	for i in adict.keys():
		if(len(adict[i])>=biggest):
			result=i
		biggest=len(adict[i])
	return result
print big(animals)