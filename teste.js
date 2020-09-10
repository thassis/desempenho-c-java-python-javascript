#!/usr/bin/env node

//perf stat -o novo.txt --append -B -r 1 -e cpu-clock:uk,cache-misses,cpu-cycles,instructions ./teste.js
var caracteres = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'];
var password = ['t','h','i','a','g','o'];
var is_password = [];
var i;

for(var j=0;j<36;j++){
    i=0;
    is_password[i] = caracteres[j];
    for(var k=0;k<36;k++){
        i=1;
        is_password[i] = caracteres[k];
        for(var l=0;l<36;l++){
            i=2;
            is_password[i] = caracteres[l];
            for(var m=0;m<36;m++){
                i=3;
                is_password[i] = caracteres[m];
                
                for(var n=0;n<36;n++){
                    i=4;
                    is_password[i] = caracteres[n];

                    for(var o=0;o<36;o++){
                        i=5;
                        is_password[i] = caracteres[o];
                        if(is_password[0] == password[0] && is_password[1] == password[1] && is_password[2] == password[2] && is_password[3] == password[3] && is_password[4] == password[4] && is_password[5] == password[5]){
                            console.log("encontrou a senha: ", is_password);
                            return 0;
                        }
                    }
                        
                }
                    
            }
                
        }
        
    }
}