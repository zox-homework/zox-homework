import datetime

name = input("Enter your nickname: ")

current_data = datetime.datetime.now()

print("Hello, " + name + "!")

print("Today is: " + current_data.strftime("%d %m %Y %H:%M"))