#!/usr/bin/env python
import sys
#perf stat -o novo.txt --append -B -r 1 -e cpu-clock:uk,cache-misses,cpu-cycles,instructions ./teste.js
caracteres = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9']
password = ['t','h','i','a','g','o']
is_password = ['0','0','0','0','0','0']

for j in range(36):
    i=0
    is_password[i] = caracteres[j]
    for k in range(36):
        i=1
        is_password[i] = caracteres[k]
        for l in range(36):
            i=2
            is_password[i] = caracteres[l]
            for m in range(36):
                i=3
                is_password[i] = caracteres[m]
                
                for n in range(36):
                    i=4
                    is_password[i] = caracteres[n]

                    for o in range(36):
                        i=5
                        is_password[i] = caracteres[o]
                        if(is_password[0] == password[0] and is_password[1] == password[1] and is_password[2] == password[2] and is_password[3] == password[3] and is_password[4] == password[4] and is_password[5] == password[5]):
                            print(is_password)
                            sys.exit(0)
