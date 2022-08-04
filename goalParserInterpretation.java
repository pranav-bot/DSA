public class goalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(command.contains("()"));
        System.out.println(interpret(command));
        String ans = command.replace("()","o");
        System.out.println(ans);
    }
    public static String interpret(String command){
        String ans  = "";
        ans = command.replace("()","o").replace("(al)", "al");
        return ans;
    }
}
