
## add.s
## A program that computes the sum of 1 and 2,
## leaving the result in register $t0.
## Registers used:
## 	t0 		- used to hold the result.
## 	t1 		- used to hold the constant 2.
## 	$v0 	- syscall parameter.
	

#################################################
#					 	
#		text segment		
#						
#################################################
	
	.text
	.globl  main

main:
	li $t1, 3 			# load 3 into $t1.
	sub $t0, $t1, 2 	# $t0 = $t1 - 2.
	li $v0, 10 			# syscall code 10 is for exit.
	syscall 			# make the syscall.

# end of add.s