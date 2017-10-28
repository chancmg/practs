class parent:
	parentattr=100
	def __init__(self):
		print 'parent constructor'
	def parentmethod(self):
		print 'parent method'

	def setparentattr(self,a):
		parent.parentattr=a

	def getparentattr(self):
		print "Parent attr:",parent.parentattr

class child(parent):
	def __init__(self):
		print "child Constructor"
	def childmethod(self):
		print "child method"

c=child()
c.childmethod()
c.parentmethod()
c.setparentattr(200)
c.getparentattr()

print issubclass(child,parent)

print isinstance(c,child)