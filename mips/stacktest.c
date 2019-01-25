
#include <stdio.h>

A(int tmp ) {
  if (tmp<2)
    B();
  printf( "%d\n", tmp );
}

B() {
  C();
}

C() {
  A(2);
}

int main (int argc, char **argv)
{
  A(1);
  return 0;
}
