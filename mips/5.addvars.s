

#################################################
#					 	
#		text segment		
#						
#################################################

	.text		
    .globl main 

main:			# execution starts here

	# g = h + A[8]
    la $t3, list         # put address of list into $t3
    lw $t0, 32($t3) 	 # $t0 = A[8] (value = 4)
    li $s2, 2 			 # load 2 into $s2 (h)
    add $s1, $s2, $t0 	 # $s1 (g) = $s2 (h) + $t0 (A[8])

	li $v0,10
	syscall		# goodbye!


#################################################
#					 	
#     	 	data segment			
#						
#################################################

		.data
list: 	.word 3, 0, 1, 2, 6, -2, 4, 7, 4, 9
