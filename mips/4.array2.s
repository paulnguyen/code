
##
## http://people.cs.pitt.edu/~xujie/cs447/AccessingArray.htm
##

#################################################
#					 	
#		text segment		
#						
#################################################

	.text		
    .globl main 

main:			# execution starts here

    la $t3, list         # put address of list into $t3
    lw $t4, 0($t3)       # list[0]
    lw $t4, 4($t3)       # list[1]
    lw $t4, 8($t3)       # list[2]
    lw $t4, 1($t3)       # ???

	li $v0,10
	syscall		# goodbye!


#################################################
#					 	
#     	 	data segment			
#						
#################################################

		.data
list: 	.word 3, 0, 1, 2, 6, -2, 4, 7, 3, 7
