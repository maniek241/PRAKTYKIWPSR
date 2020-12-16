package szyfr;
public class cesarcyfr {

      public static String code(String szyfr) {


            char[] arr = szyfr.toCharArray();

            for(int i=0; i<szyfr.length(); i++){
                if(arr[i] >= 65 && arr[i] <= 87 || arr[i] >= 97 && arr[i] <= 119){
                    arr[i] += 3;
                }
                switch(arr[i]){
                    case 'X': arr[i] = 'A';
                        break;
                    case 'Y': arr[i] = 'B';
                        break;
                    case 'Z': arr[i] = 'C';
                        break;
                    case 'x': arr[i] = 'a';
                        break;
                    case 'y': arr[i] = 'b';
                        break;
                    case 'z': arr[i] = 'c';
                        break;
                }

            }
          String result = String.valueOf(arr);
          return result;
        }
        public static void main(String[] args){
            String szyfr = "AaBbCcDd, XxYyZz, !.?<>";

            String result =code(szyfr);
            System.out.println("szyfrujesz : " + szyfr);
            System.out.println("zaszyfrowana wiadomość brzmi tak : " + result);


        }
    }