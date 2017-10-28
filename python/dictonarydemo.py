d={1:'chan',2:'cmg',3:"murali",4:'ganesh'}
w={5:'sekar'}
print d,w
d.update(w)
x=d.copy()  #copy dictionary
print x
w.clear()  #clear dictionary
print w

print x.items()