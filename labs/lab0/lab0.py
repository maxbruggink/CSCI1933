
import math

# Part 2


def commonChar(word):
    counter = {}
    chr = ""
    max = 0
    if word == "":
        return "error no word"
    for i in word:
        if i in counter:
            counter[i] += 1
        else:
            counter[i] = 1
    for i in word:

        if max < counter[i]:
            max = counter[i]
            chr = i

    return "The most common letter is '" + (chr) + "' and it occurs " + str(counter[chr]) + " times"


print(commonChar(""))


# Part 3
def palindrome(str):
    if len(str) == 1:
        return True
    if str == "":
        return True
    else:
        if str[0] == str[-1]:
            return palindrome(str[1:-1])
        else:
            return False
# print(palindrome("racecar"))

# Part 4


class Circle():

    def __init__(self, radius):
        self.radius = radius

    def getRadius(self):
        return self.radius

    def setRadius(newRadius):
        self.radius = newRadius

    def getArea(self):
        area = (math.pi) * (self.radius)**2
        return area

    def getDiameter(self):
        return (self.radius) * 2

    def getCircumfrence(self):
        return 2 * (math.pi) * (self.radius)

    def __eq__(self, other):
        if self.radius == other.radius:
            return True
        else:
            return False


x = Circle(3)
y = Circle(4)
"""
print(x.getArea())
print(y.getArea())
print(x.getCircumfrence())
print(y.getCircumfrence())
print(x==y)
"""
