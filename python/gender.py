class parent:
	def getgender(self):
		return 'unknown'
	
class male(parent):
	def getgender(self):
		return 'male'

class female(parent):
	def getgender(self):
		return 'female'

m=male()
f=female()
print m.getgender()
print f.getgender()