public class Problem_3 {
    public static void main(String[] args) {
        String s="PHYsicS";
        for (int i=0;i<s.length();i++){
            boolean flag=true;
            char ch=s.charAt(i);
            if (ch>0) continue;
            else{
                if (ch==' ') continue;
                int asc=(int)ch;
                if (asc>=97) flag=false;
                if (flag){
                    asc+=32;
                    char dh=(char)asc;
                    s=s.substring(0,i)+dh+s.substring(i+1);
                }
                else {
                    asc-=32;
                    char dh=(char)asc;
                    s=s.substring(0,i)+dh+s.substring(i+1);
                }
            }
        }
        System.out.println(s);
    }
}
