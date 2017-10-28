def selsort(L):
	for i in range(len(L)-1):
		minindex=i
		minval=L[i]
		j=i+1
		while j<len(L):
			if minval>L[j]:
				minindex=j
				minval=L[j]
			j+=1
		if minindex!=i:
			temp=L[i]
			L[i]=L[minindex]
			L[minindex]=temp
	return L

print selsort([5,8,1,3,7,9,2])

