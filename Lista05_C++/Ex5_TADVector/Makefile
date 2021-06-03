#Nome do projeto
PROJ_NOME=main

#.c files
C_SOURCE = $(wildcard *.cpp)

#.h files
H_SOURCE = $(wildcard *.h)

#Object files
OBJ = $(C_SOURCE: .c=.o)

#Compiler
CC=g++

#Flags for compiler
CC_FLAGS =-c 	\
		  -g 	\
		  -W 	\
		  -Wall	\
		  -ansi	\
		  -pedantic\
		  -Werror \

#compilation and linking
all: $(PROJ_NOME)

$(PROJ_NOME): $(OBJ)
	$(CC) -o $@ $^ -g

valgrind:
	valgrind ./$(PROJ_NOME)

%.o: %.c %.h
	$(cc) -o $@ $< $(CC_FLAGS)

main.o: main.c $(H_SOURCE)
	$(CC) -o $@ $< $(CC_FLAGS)

run:
	./$(PROJ_NOME)

clean: 
	rm -rf *.o $(PROJ_NOME) *~

