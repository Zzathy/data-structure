# Make empty object | add animals
animals = []

animals.append("Goose")
animals.append("Duck")
animals.append("House Lizard")
animals.append("Sheep")
animals.append("Eagle")
animals.append("Elephant")

# add new element | counting duck | index position
animals.append("Rhino")
animals.append("Duck")

print("Output : ")
print(*animals, sep=", ")
print("Duck : ", animals.count("Duck"))

print("Index Position : ", end="")
for index, animal in enumerate(animals):
    if animal == "Duck":
        print(index, end=" ")

# delete duck index 1
animals.remove("Duck")

print("\n\nOutput : ")
print(*animals, sep=", ")

# show animal index 0 and 2, next delete index 0
print("\nIndex 0 : ", animals[0])
print("Index 2 : ", animals[2])

animals.remove(animals[0])
print("Output : ")
print(*animals, sep=", ")

# change index 0 from "House Lizard" to "Snake", and add new animal on index 2 with "Little Duck"
animals[0] = "Snake"
print("\nOutput : ")
print(*animals, sep=", ")
animals.insert(2, "Little Duck")
print(*animals, sep=", ")

# delete animal range index 1 to 5
del animals[2:5]
print("\nOutput : ")
print(*animals, sep=", ")

# show first and last animal
size = len(animals)
print("\nOutput : ")
print("First Animal : ", animals[0])
print("Last Animal : ", animals[size-1])

# show total animal on ArrayList
print("\nTotal Animals : ", len(animals))

# search index position of "Rhino"
print("\nRhino Index Position : ", animals.index("Rhino"))