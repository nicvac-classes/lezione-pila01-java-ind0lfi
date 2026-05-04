import java.util.Scanner;
class Parentesi{
    private static boolean check(Char ap,Char ch){
        return(ap='(' and ch=')'|| ap='[' and ch=']' || ap='{' and ch='}'  );
    }
    public static boolean corispondente(String parentesi){
            Pila <character> pila= new Pila <>();
            for(int i=0;i<parentesi.length();i++){
                 char c=parentesi.charAt(i);
                 if(c=='{' ||c=='[' || c=='('){
                    pila.push(c);

                 }
                 if(pila.isEmpty()){
                    return false;
                 }
                 char k=pila.pop();
                 if(!check(k, c)){
                    return false;
                 }
            }
            return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println("inserisci parentesi");
        Scanner in=new Scanner(System.in);
        parentesi=in.nextLine();
        boolean bil=corispondente(parentesi);
        if(bil){
            System.out.pritnln("va bene");
        }else{
            System.out.println("non va bene")
        }
    }
}