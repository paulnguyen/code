
##
## mips.stack2.s - building a stack
##
## Implements the following example:
## 
##     A(int tmp) {
##       if (tmp<2)
##         B();
##       printf(tmp);
##     }
##     B() {
##       C();
##     }
##     C() {
##       A(2);
##     }
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
	subu $sp,$sp,32 # stack space is 32 bytes (8 slots)
	sw $ra,28($sp)  # save return address
	sw $fp,24($sp)  # save frame pointer
	sw $s0,20($sp)  # save callee saves
	addu $fp,$sp,32 # bound stack frame
	# end stack frame setup
			
	move $s0,$a0	# get argument for A(tmp)
	li  $t0,2	
	blt $s0,$t0,CALL_B
	jr PRINT_TMP
CALL_B:
	jal  B
PRINT_TMP:	
	move $a0,$s0	# get argument pass to me
	li $v0,1		# system call to print int.  
	syscall			# print integer in $a0

	# unwind stack
	lw $ra,28($sp)  # restore return address
	lw $fp,24($sp)  # restore frame pointer
	lw $s0,20($sp)  # restore callee saves
	addu $sp,$sp,32 # restore stack pointer
	# stack unwinding done
	
	jr $ra			# return

B:
	# setup stack frame
	subu $sp,$sp,32 # stack space is 32 bytes (8 slots)
	sw $ra,28($sp)  # save return address
	sw $fp,24($sp)  # save frame pointer
	addu $fp,$sp,32 # bound stack frame
	# end stack frame setup
	
	jal C

	# unwind stack
	lw $ra,28($sp)  # restore return address
	lw $fp,24($sp)  # restore frame pointer
	addu $sp,$sp,32 # restore stack pointer
	# stack unwinding done
	
	jr $ra

C:
	# setup stack frame
	subu $sp,$sp,32 # stack space is 32 bytes (8 slots)
	sw $ra,28($sp)  # save return address
	sw $fp,24($sp)  # save frame pointer
	addu $fp,$sp,32 # bound stack frame
	# end stack frame setup
	
	li $a0,2	# $a0 = 2  
	jal A

	# unwind stack
	lw $ra,28($sp)  # restore return address
	lw $fp,24($sp)  # restore frame pointer
	addu $sp,$sp,32 # restore stack pointer
	# stack unwinding done
	
	jr $ra
#################################################
#					 	
#     	 	data segment			
#						
#################################################
		.data
str:	.asciiz "done!\n"

##
