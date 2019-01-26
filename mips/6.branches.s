
##
## http://people.cs.pitt.edu/~xujie/cs447/Mips/cond.html
##	

#################################################
#					 	
#		text segment		
#						
#################################################
	
	.text
	.globl  main

main:

## Translate:
##
## 	if ( i == j )
##  	i++ ;
## 	j-- ;
##
	# assuming $t1 stores i and $t2 stores j. 
	li $t1, 1 			# load 1 into $t1 (i).
	li $t2, 4 			# load 4 into $t2 (j).

    bne  $t1, $t2, L1    # branch if ! ( i == j ) 
    addi $t1, $t1, 1     # i++ 
L1: 
    addi $t2, $t2, -1    # j-- 

## Translate:
## 	if ( i == j )
##  	i++ ;
## 	else
##  	j-- ;
## 	j += i ;    

      bne  $t1, $t2, ELSE   # branch if ! ( i == j ) 
      addi $t1, $t1, 1      # i++ 
      j L2                  # jump over else  (ADD THIS!!!)
ELSE: addi $t2, $t2, -1     # j-- 
L2:   add $t2, $t2, $t1     # j += i 


	li $v0, 10 			# syscall code 10 is for exit.
	syscall 			# make the syscall.



