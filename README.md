# Java
Just for our reference while we learn java.

We are using Eclipse Nano to do our projects. 
The info below is mainly for use without an IDE. For example if you wanted to code java with atom, or notepad++

----------------------------------------------------
### Setup Bash:

follow [HowToGeek](https://www.howtogeek.com/249966/how-to-install-and-use-the-linux-bash-shell-on-windows-10/) to set up the bash shell on win10

Then in bash, type
```
sudo apt-get update

#This will install cnu/gnc/g++ compiler etc
sudo apt-get install build-essential

sudo apt-get update

#Install the javac compiler
sudo apt-get install default-jdk

sudo apt-get update
```

---
### How to run the java code from bash

`cd` into the git/java file directory

then type `javac FILENAME.java`

to run you type `java FILENAME`

---
### Running C++ code from bash

The c++ is also already installed, you installed it when u ran `sudo apt-get install build-essential`

`cd` into the file directory

then type `g++ -o FILENAME.cpp FILENAME`

to run you type `./ FILENAME`
