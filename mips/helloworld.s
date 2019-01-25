
##
## helloworld.s - prints out "hello world"
##
##	a0 - points to the string
##

#################################################
#					 	
#		text segment		
#						
#################################################

	.text		
    .globl main 

main:			# execution starts here
	la $a0,str	# put string address into a0
	li $v0,4	# system call to print
	syscall		# out a string

	li $v0,10
	syscall		# goodbye!


#################################################
#					 	
#     	 	data segment			
#						
#################################################

		.data
str:	.asciiz "hello world\n"

##
## end of file helloworld.s