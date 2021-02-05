import os 
import sys
import time 
from progress.bar import IncrementalBar


#writing into file
def writeQuery(logfile, query):   
    query = query.lower()
    query = "https://en.wikipedia.org/wiki/" + query + '\n'
    Length = len(query)
    bar = IncrementalBar('Progress', max = Length)    
    f = open(logfile, "a")
    print("\nwriting into file........")
    for i in query:
        f.write(i)
        bar.next()
        time.sleep(0.05)
    bar.finish()
    print("Task Complete , The Wiki link is successfully appended to the file -->" + logFile)
    f.close()
    
#interactive
if(len(sys.argv)==1):
    print("Enter Search Query")
    searchQuery = input()
    searchQuery = searchQuery.lower()
    print("Enter log File name")
    logFile = input()
    writeQuery(logFile, searchQuery)

#args
else:
    query = sys.argv[1]
    logFile = sys.argv[2]
    writeQuery(logFile, query)
       

    
     
    
    
