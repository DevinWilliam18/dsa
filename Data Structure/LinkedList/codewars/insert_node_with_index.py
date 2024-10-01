def insert_nth(head, index, data):
  curr = head
  prev = None

  i = 0
  while curr:
    if index == i:
      item = Node(data)
      item.next = curr
      if index != 0:
        prev.next = item
      else:
         head = item
      break
  
  #check if index == length + 1
    if index == i + 1 and curr.next == None:
      item = Node(data)
      item.next = None
    
      curr.next = item
      i += 1
      break
  
    prev = curr
    curr = curr.next
    i += 1

  if index > i:
     raise Exception('Invalid index value should raise error.')
  if head is None:
     item = Node(data)
     item.next = None
     head = item
  return head 
