file1=raw_input("Enter the read file name") + '.txt'
file2=raw_input("Enter the write file name") + '.txt'

fo=open(file1,"r")
fw=open(file2,"w")

content=fo.readlines()
for line in content:
	fw.write(line)

fo.close()
fw.close()