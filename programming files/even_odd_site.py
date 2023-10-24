# Opens file numbers.html with the ability to write to the file
with open("numbers.html", "w") as f:
    # Writes html code to the file
    f.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n")
    f.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n")
    # Adds table row elements 50 times
    for i in range(1, 50):
        if i % 2 == 0:
            f.write("<tr><td>{}</td><td></td></tr>\n".format(i))
        else:
            f.write("<tr><td></td><td>{}</td></tr>\n".format(i))
    f.write("</table>\n</body>\n</html>")
# Reads the file
with open("numbers.html", "r") as f:
    print(f.read())
    
