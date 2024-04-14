package ultraemojiconbate;
public class UltraEmojiConbate {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
                
        l[0] = new Lutador("Prethi Boy", "França", 31,
                11,2,1,1.75f,68.9f);
        l[1] = new Lutador("Putscript","Brasil",29,
                14,2,3,1.68f,57.8f);
        l[2] = new Lutador("Snaphedon","EUA",35,
                6,3,5,1.78f,85.5f);
        l[3] = new Lutador("","",0,
                0,0,0,0,0);
        l[4] = new Lutador("","",0,
                0,0,0,0,0);
        l[5] = new Lutador("","",0,
                0,0,0,0,0);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
    }
    
}
