public class OOPSBannerApp {
    public static void main(String[] args){
        String[] l = new String[9];
        l[0]=(String.join(" ","    ***    ","    ***    ","******   ","   *****"));
        l[1]=(String.join(" "," **     ** "," **     ** ","**    ** "," **     "));
        l[2]=(String.join(" ","**       **","**       **","**     **","**      "));
        l[3]=(String.join(" ","**       **","**       **","**    ** "," **     "));
        l[4]=(String.join(" ","**       **","**       **","******   ","   ***  "));
        l[5]=(String.join(" ","**       **","**       **","**       ","     ** "));
        l[6]=(String.join(" ","**       **","**       **","**       ","      **"));
        l[7]=(String.join(" "," **     ** "," **     ** ","**       ","     ** "));
        l[8]=(String.join(" ","    ***    ","    ***    ","**       ","*****   "));

        for(int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
		}
	}
}