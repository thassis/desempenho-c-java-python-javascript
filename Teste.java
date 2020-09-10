public class Teste{
    // jar cfm Teste.jar Manifest.txt Teste.class
    // java -jar Teste.jar 
    public static void main(String[] args){
        char caracteres[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        char password[] = {'t','h','i','a','g','o'};
        char is_password[] = {'0','0','0','0','0','0'};
        int i;
        for(int j=0;j<36;j++){
            i=0;
            is_password[i] = caracteres[j];
            
            for(int k=0;k<36;k++){
                i=1;
                is_password[i] = caracteres[k];
                for(int l=0;l<36;l++){
                    i=2;
                    is_password[i] = caracteres[l];
                    for(int m=0;m<36;m++){
                        i=3;
                        is_password[i] = caracteres[m];
                        
                        for(int n=0;n<36;n++){
                            i=4;
                            is_password[i] = caracteres[n];
                            for(int o=0;o<36;o++){
                                i=5;
                                is_password[i] = caracteres[o];
                                if(is_password[0] == password[0] && is_password[1] == password[1] && is_password[2] == password[2] && is_password[3] == password[3] && is_password[4] == password[4] && is_password[5] == password[5]){
                                    System.out.println(is_password);
                                    System.exit(0);
                                }
                            }
                                
                        }
                            
                    }
                        
                }
                
            }
        }
    }
}