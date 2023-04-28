#include <stdio.h>

int main(void)
{
	printf("Hello world!\n");
#ifdef LEARN_CFLAGS_VAR
    printf ("Learn CFLAGS variable when define\n");
#else
    printf ("Learn the CFLAGS variable when not define\n");
#endif

	return 0;
}
