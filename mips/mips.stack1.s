##
## mips.stack1.s - building a stack
##                 This version uses argument
##                 registers as an optimization
##                 instead of pushing arguments 
##                 on the stack.
##
## Implements the following example:
## 
##    A(int tmp) {
##      printf(tmp);
##    }
##    main() {
##      A(1);
##    }	
##

#################################################
#					 	
#		text segment			
#						
#################################################

		.text		
       	.globl main 
main:				# execution starts here

	# setup stack frame
	subu $sp,$sp,32
	sw $ra,28($sp)
	sw $fp,24($sp)
	addu $fp,$sp,32
	# end stack frame setup
	# 
	li $a0,1		# $a0 = 1  
	jal A			# call A(1)
	la $a0,str		# $a0 = address of "done!\n"
	li $v0,4		# system call to print
	syscall			# print done!

	# unwind stack back to top
	lw $ra,28($sp)  # restore return address
	lw $fp,24($sp)  # restore frame pointer
	addu $sp,$sp,32 # restore stack pointer
	# stack unwinding done
			
	li $v0,10       # exit system call
	syscall			# end program

A:			# function A(). Takes int 
            # argument in $a0
	# setup stack frame
	subu $sp,$sp,32
	sw $ra,28($sp)
	sw $fp,24($sp)
	addu $fp,$sp,32
	# end stack frame setup
	li $v0,1		# system call to print int.  
	syscall			# print integer in $a0
	# unwind stack
	lw $ra,28($sp)  # restore return address
	lw $fp,24($sp)  # restore frame pointer
	addu $sp,$sp,32 # restore stack pointer
	# stack unwinding done
	jr $ra			# return

#################################################
#					 	
#     	 	data segment			
#						
#################################################
		.data
str:	.asciiz "done!\n"

##
