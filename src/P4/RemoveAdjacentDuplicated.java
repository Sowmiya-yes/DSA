package P4;
public class RemoveAdjacentDuplicated {
    public static void main(String[] args) {
        String str = "keeksforgeek";
        StringBuilder stringBuilder = new StringBuilder("");
        char lastRemoved = '\0';
        for(char i: str.toCharArray()) {
            int n  = stringBuilder.length();
            if(n > 0 && stringBuilder.charAt(n - 1) == i) {
                lastRemoved = stringBuilder.charAt(n-1);
                stringBuilder.deleteCharAt(n - 1);
            }
            if(i != lastRemoved) {
                stringBuilder.append(i);
                lastRemoved = '\0';
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
