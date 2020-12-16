package szyfr;
public class cesarcyfr {

      public static String code(String szyfr) {


            char[] tab = szyfr.toCharArray();

            for(int i=0; i<szyfr.length(); i++){
                if(tab[i] >= 65 && tab[i] <= 87 || tab[i] >= 97 && tab[i] <= 119){
                    tab[i] += 3;
                }
                switch(tab[i]){
                    case 'X': tab[i] = 'A';
                        break;
                    case 'Y': tab[i] = 'B';
                        break;
                    case 'Z': tab[i] = 'C';
                        break;
                    case 'x': tab[i] = 'a';
                        break;
                    case 'y': tab[i] = 'b';
                        break;
                    case 'z': tab[i] = 'c';
                        break;
                }

            }
          String result = String.valueOf(tab);
          return result;
        }
        public static void main(String[] args){
            String szyfr = "AaBbCcDd, XxYyZz, !.?<>";

            String result =code(szyfr);
            System.out.println("szyfrujesz : " + szyfr);
            System.out.println("zaszyfrowana wiadomość brzmi tak : " + result);


        }
    }