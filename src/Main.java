public class Main {
    public static void main(String[] args) {
        String nome = "Lucas";
        String sobrenome = "Assis";
        String fullname = nome.concat(" ").concat(sobrenome);
        System.out.println(fullname);
        System.out.println(nome + sobrenome);
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        System.out.println(s1.equals(s2));
        if(s1 == s3){
            System.out.println("igual");
        } else {
            System.out.println("inguaius");
        }

    }
}