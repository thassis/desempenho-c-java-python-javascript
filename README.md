# desempenho-c-java-python-javascript
Comparar o desempenho de diferentes linguagens, executando o mesmo algoritmo.
Resultado do arquivo gerado pelo perf, utilizando os eventos: cpu-clock, cache-misses, cpu-cycles e instructions.

# Programa em Python - executado pelo python 2.7.17 no Linux


 Performance counter stats for './teste.py':

        244.848,99 msec cpu-clock:uk              #    0,999 CPUs utilized          
        80.737.700      cache-misses                                                
   581.990.248.188      cpu-cycles                #    2,377 GHz                    
 1.814.652.345.830      instructions              #    3,12  insn per cycle         

     245,147866674 seconds time elapsed

     244,671324000 seconds user
       0,171946000 seconds sys


# Programa em Javascript - executado pelo node 8.10.0 no Linux


 Performance counter stats for './teste.js':

          6.442,96 msec cpu-clock:uk              #    0,999 CPUs utilized          
         1.939.226      cache-misses                                                
    21.350.066.312      cpu-cycles                #    3,314 GHz                    
    68.301.063.395      instructions              #    3,20  insn per cycle         

       6,451262513 seconds time elapsed

       6,436693000 seconds user
       0,008005000 seconds sys


# Programa em C - executado pelo gcc 7.5.0 no Linux


 Performance counter stats for './a.out':

          2.579,38 msec cpu-clock:uk              #    1,000 CPUs utilized          
            69.551      cache-misses                                                
     8.427.557.868      cpu-cycles                #    3,267 GHz                    
    16.771.957.354      instructions              #    1,99  insn per cycle         

       2,580541538 seconds time elapsed

       2,579869000 seconds user
       0,000000000 seconds sys


# Progama em Java - executado pelo OpenJDK 8


 Performance counter stats for './testeJava.sh':

            800,06 msec cpu-clock:uk              #    1,029 CPUs utilized          
         1.534.873      cache-misses                                                
     2.497.022.307      cpu-cycles                #    3,121 GHz                    
    10.288.109.339      instructions              #    4,12  insn per cycle         

       0,777487939 seconds time elapsed

       0,769958000 seconds user
       0,036366000 seconds sys



