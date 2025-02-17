// This file should be parseable by the Assignment 2 starter-file grammar.
// Note that it has semantic errors, such as references to undefined
// and mismatched types--but these will not be caught until Assignment 3
// and Assignment 4.
class Main { 
  /* this is a comment */
  /*/ this is another comment */
  /*   /* this is another comment */

  int c;
  
  public int main() {
    int b = 3;
    int n = 3+4*5;
    boolean nn = (int[][])(String)(Object)z;
    int k = - - - -n;

    if(b <4) {
      b++;
    } else {
      n--;
    }

    if(b < 10) {
      b++;
    }

    int x = 0;
    int y = 0;
    do {
      x = x * 2;
      y = y - x;
    } while(y < 0);

    switch(n) {
      case 1: x++; break;
      case 2: case 3: y++; break;
      default: x--; y--; break;
      case 100: x = 0; break;

      default: x++; break;
    }

    return n;
  }
}
