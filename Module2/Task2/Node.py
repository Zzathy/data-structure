class Node :
    def __init__(self, data = None):
        self.data = data
        self.next = None
    
class LinkedList:
    def __init__(self):
        self.head = None
    
    def _len_(self):
        count = 0
        node = self.head
        while node:
            count += 1
            node = node.next
        return count
    
    def _getitem_(self, index):
        if index >= len(self):
            raise IndexError('Index out of range')
        node = self.head
        for i in range(index):
            node = node.next
        return node.data
    
    def append(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = new_node
    
    def insert(self, index, value):
        new_node = Node(value)
        if index == 0:
            new_node.next = self.head
            self.head = new_node
        else:
            node = self.head
            for i in range(index - 1):
                node = node.next
                if node is None:
                    raise IndexError('Index out of range')
            new_node.next = node.next
            node.next = new_node  
    
    def remove(self, value):
        if self.head is None:
            raise ValueError('Value not found')
        elif self.head.data == value:
            self.head = self.head.next
        else:
            node = self.head
            while node.next and node.next.data != value:
                node = node.next
            if node.next is None:
                raise ValueError('Value not found')
            else:
                node.next = node.next.next
    
    def pop(self, index =- 1):
        if self.head is None:
            raise IndexError('Index out of range')
        elif index == 0:
            value = self.head.data
            self.head = self.head.next
        else:
            node = self.head
            for i in range(index - 1):
                node = node.next
                if node is None:
                    raise IndexError('Index out of range')
            if index == -1:
                index = len(self) - 1
            value = node.next.data
            node.next = node.next.next
        return value
    
    def index(self, value):
        index = 0
        node = self.head
        while node and node.data != value:
            node = node.next
            index += 1
        if node is None:
            raise ValueError('Value not found')
        else:
            return index
    
    def printList(self):
        printval = self.head
        print("Before : ", end="")
        while printval is not None:
            print(str(printval.data), end=" ")
            printval = printval.next
    
    def clear(self):
        self.head = None
    
    def sorting(self):
        array = []
        elements = self.head
        while elements:
            array.append(elements.data)
            elements = elements.next
        array.sort()
        print("\nAfter  : ", end="")
        print(*array)        

linkedlist = LinkedList()

linkedlist.append(8)
linkedlist.append(7)
linkedlist.append(1)
linkedlist.append(4)
linkedlist.append(6)
linkedlist.append(2)
linkedlist.append(3)

linkedlist.printList()

linkedlist.sorting()