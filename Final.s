	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 11
	.section	__TEXT,__literal4,4byte_literals
	.align	2
LCPI0_0:
	.long	1084856730              ## float 5.30000019
	.section	__TEXT,__text,regular,pure_instructions
	.globl	_main
	.align	4, 0x90
_main:                                  ## @main
	.cfi_startproc
## BB#0:
	pushq	%rbp
Ltmp0:
	.cfi_def_cfa_offset 16
Ltmp1:
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
Ltmp2:
	.cfi_def_cfa_register %rbp
	subq	$48, %rsp
	leaq	L_.str(%rip), %rdi
	movss	LCPI0_0(%rip), %xmm0    ## xmm0 = mem[0],zero,zero,zero
	movl	$0, -4(%rbp)
	movss	%xmm0, -20(%rbp)
	movb	$0, %al
	callq	_printf
	movq	__ZNSt3__13cinE@GOTPCREL(%rip), %rdi
	leaq	-8(%rbp), %rsi
	movl	%eax, -24(%rbp)         ## 4-byte Spill
	callq	__ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi
	movl	$2, %ecx
	movl	-8(%rbp), %edx
	imull	-8(%rbp), %edx
	movq	%rax, -32(%rbp)         ## 8-byte Spill
	movl	%edx, %eax
	cltd
	idivl	%ecx
	movl	%eax, -12(%rbp)
	movl	$0, -16(%rbp)
LBB0_1:                                 ## =>This Inner Loop Header: Depth=1
	cmpl	$10, -16(%rbp)
	jge	LBB0_4
## BB#2:                                ##   in Loop: Header=BB0_1 Depth=1
	leaq	L_.str1(%rip), %rdi
	movb	$0, %al
	callq	_printf
	movl	%eax, -36(%rbp)         ## 4-byte Spill
## BB#3:                                ##   in Loop: Header=BB0_1 Depth=1
	movl	-16(%rbp), %eax
	addl	$1, %eax
	movl	%eax, -16(%rbp)
	jmp	LBB0_1
LBB0_4:
	movl	-4(%rbp), %eax
	addq	$48, %rsp
	popq	%rbp
	retq
	.cfi_endproc

	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"Escribe: "

L_.str1:                                ## @.str1
	.asciz	"Hola"


.subsections_via_symbols
