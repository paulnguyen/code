
##
## https://www.assemblylanguagetuts.com/mips-assembly-loops/
##	

#################################################
#					 	
#		text segment		
#						
#################################################
	
	.text
	.globl  main

main:

##
##	For(condition){
##		set of statements
##		iteration++
##	}
##

	li $t0, 10
	la $a0, msg1

for_loop:
	blt $t0, 1, Exit

	li $v0, 4
	syscall
	sub $t0, $t0, 1
 
	j for_loop
 
##
## Exit
##
Exit:
	li $v0, 10 			# syscall code 10 is for exit.
	syscall 			# make the syscall.


#################################################
#					 	
#     	 	data segment			
#						
#################################################

		.data
msg1:	.asciiz "A program in MIPS to test for loop.\n"


