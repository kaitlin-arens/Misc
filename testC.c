//
//  testC.c
//  
//
//  Created by Kaitlin Arens on 6/3/21.
//

#include "testC.h"
//#include "stdin.h"
#include "stdio.h"

uint8_t xor_buf(uint8_t *p, int nbytes){
    uint8_t acc = 0;
    for(int i = 0;i<nbyte; i++){
        acc = acc ^ p[i];
    }
    return acc;
}

int main(){
    uint8_t buf[4] = {1, 2, 3, 4};
    uint8_t res = xor_buf(buf, 4);
    printf("%x\n", res);
    return 0;
}
