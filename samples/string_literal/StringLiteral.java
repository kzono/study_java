class StringLiteral {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";

        if(s1 == s2){
            System.out.println("s1 == s2 : true");
        }else{
            System.out.println("s1 == s2 : false");
        }
    }
}
//  実行結果
//  s1 == s2 : true
//