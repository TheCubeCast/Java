    build:
			gcj -c -g -O MyJavaProg.java
			gcj --main=MyJavaProg -o MyJavaProg MyJavaProg.o
			g++ -c -g -O mycxxprog.cc
			g++ -o mycxxprog mycxxprog.o
