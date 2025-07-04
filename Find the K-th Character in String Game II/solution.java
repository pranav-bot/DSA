public class solution {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 };
        System.out.println(kthCharacter(100000000000000L, arr));

    }

    public static char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] length = new long[n + 1];
        length[0] = 1;

        for (int i = 0; i < n; i++) {
            length[i + 1] = length[i]*2;
            if(length[i+1]>=k){
                n = i+1;
                break;
            }
                
        }
        return getKthCharacter(k, length, n, operations);

    }

    public static char getKthCharacter(long k, long[] length, int opI, int[] operations) {
        if(opI==0){
            return 'a';
        }
        int lastop = operations[opI-1];
        long half = length[opI-1];
        if(k<=half){
            return getKthCharacter(k, length, opI-1, operations);
        }
        else{
            if(lastop==0){
                return getKthCharacter(k-half, length, opI-1, operations);
            }
            else{
                char og = getKthCharacter(k-half, length, opI-1, operations);
                if(og=='z') return 'a';
                return (char) (og+1);
            }
        }
    }

    public static char kthCharacterBruteForce(long k, int[] operations) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        for (int i = 0; i < operations.length; i++) {
            int op = operations[i];
            if (op == 0) {
                sb.append(sb);
            }
            if (op == 1) {
                StringBuilder ts = new StringBuilder();
                for (int j = 0; j < sb.length(); j++) {
                    char nextChar = (char) (sb.charAt(j) + 1);
                    ts.append(nextChar);
                }

                sb.append(ts);
            }

        }
        return sb.charAt((int) k - 1);
    }

}
