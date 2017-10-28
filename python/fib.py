t1=0
t2=1

n=int(raw_input("Enter the number"))

for i in range(1,n):
    if i==1:
	 print t1
	 continue;
    if i==2:
        print t2
        continue
    nt=t1+t2
    t1=t2
    t2=nt
    print nt
            
