class Animal:
    def __init__(self):
        self.array = []
        self.length = 0

    def __len__(self):
        return self.length
    
    def __getitem__(self, index):
        if index >= self.length:
            raise IndexError("Index out of range")
        return self.array[index]
    
    def __setitem__(self, index, value):
        if index >= self.length:
            raise IndexError("Index out of range")
        self.array[index] = value

    def append(self, value):
        self.array.append(value)
        self.length += 1

    def remove (self, value):
        self.array.remove(value)
        self.length -= 1
    
    def index(self, value):
        return self.array[value]

class DeleteAnimal:
    def __init__(self):
        self.array = []
        self.length = 0

    def __len__(self):
        return self.length
    
    def __getitem__(self, index):
        if index >= self.length:
            raise IndexError("Index out of range")
        return self.array[index]
    
    def __setitem__(self, index, value):
        if index >= self.length:
            raise IndexError("Index out of range")
        self.array[index] = value

    def append(self, value):
        self.array.append(value)
        self.length += 1

    def remove (self, value):
        self.array.remove(value)
        self.length -= 1
    
    def index(self, value):
        return self.array[value]


animal = Animal()
deleteAnimal = DeleteAnimal()

animal.append("Sapi")
animal.append("Kelinci")
animal.append("Kambing")
animal.append("Unta")
animal.append("Domba")

deleteAnimal.append("Kelinci")
deleteAnimal.append("Kambing")
deleteAnimal.append("Unta")

print("Animal : ")
print(*animal, sep = ", ")
print("\nDelete Animal : ")
print(*deleteAnimal, sep = ", ")

animal.remove(deleteAnimal.index(0))
animal.remove(deleteAnimal.index(1))
animal.remove(deleteAnimal.index(2))

print("\nAnimal : ")
print(*animal, sep = ", ")