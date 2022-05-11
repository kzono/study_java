class StringLiteralNew {
    public static void main(String[] args){
        String x, y, z;
        {
            // "abc", "def" などの文字列リテラルは
            // constant pool に配置される。
            // では、s1 + s2 で新しく作成される String オブジェクトは
            // どんなメモリ領域に配置される？
            String s1 = "abc";
            String s2 = "def";
            String s3 = s1 + s2;
            x = s1 + s2;
            if(s3 == x){
                System.out.println("s3 == x: true");
            }
        }
        {
            // String を new するとヒープにオブジェクトが作成される。
            // s1 + s2 で新しく作成されるオブジェクトは
            // どんなメモリ領域に配置される？
            String s1 = new String("abc");
            String s2 = new String("def");
            String s3 = s1 + s2;
            y = s1 + s2;
            if(s3 == y){
                System.out.println("s3 == y: true");
            }
        }
        {
            // s1 + s2 で新しく作成されるオブジェクトは
            // どんなメモリ領域に配置される？
            String s1 = "abc";
            String s2 = new String("def");
            String s3 = s1 + s2;
            z = s1 + s2;
            if(s3 == z){
                System.out.println("s3 == z: true");
            }
        }
        if(x == y){
            System.out.println("x == y: true");
        }
        if(y == z){
            System.out.println("y == z: true");
        }
        if(z == x){
            System.out.println("z == x: true");
        }

    }
}