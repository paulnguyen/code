
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

# The address that is loaded by the instruction la $t3, 
# list is the address of the first '3' in the list.  
# The address of the '0' is 4 greater than that number, 
# and the address of the '6' is 16 greater than that number.
# The following snippet of code will place the value of list[6] into the $t4:

    la $t3, list         # put address of list into $t3
    li $t2, 6            # put the index into $t2
    add $t2, $t2, $t2    # double the index
    add $t2, $t2, $t2    # double the index again (now 4x)
    add $t1, $t2, $t3    # combine the two components of the address
    lw $t4, 0($t1)       # get the value from the array cell

	li $v0,10
	syscall		# goodbye!


#################################################
#					 	
#     	 	data segment			
#						
#################################################

		.data
list: 	.word 3, 0, 1, 2, 6, -2, 4, 7, 3, 7
