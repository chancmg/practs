class Employee:
	empcount=0

	def __init__(self,name,salary):
		self.name=name
		self.salary=salary
		Employee.empcount+=1

	def displaycount(self):
		print "Total employee %d"%Employee.empcount

	def displayEmployee(self):
		print "Name:",self.name,",Salary:",self.salary

emp1=Employee("chan",23000)
emp2=Employee("murali",15000)

emp1.displayEmployee()
emp2.displaycount()
emp2.displayEmployee()

print "total %d"%Employee.empcount