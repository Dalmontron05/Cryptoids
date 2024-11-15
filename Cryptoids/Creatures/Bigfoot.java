package Cryptoids.Creatures;

public class Bigfoot extends Cryptoid {
    // Attributes
    private String art = "+++;;;;;:;++;;;:+xxxxxxxx+x;;;xXx;;;+x+++;;;;;;;:;\r\n" + //
    "xx+;;;;;;;;;;;;;+;;+xxxx$xx;;+++xxx+xx+;+;++;;++;x\r\n" + //
    "x+++xx+xxxx++++;+xxxx+x$$$$$$$Xxxxxx+x+;x;++x;;;;x\r\n" + //
    "x+++;;++++xxxxxxxxxx+x$$$$$$$X$xxXxxx++xx++;+x+;Xx\r\n" + //
    "Xxxx++xxxxxxxxXxxxxx$X$xxX$XXxxxxxxx++xxxx;;;+;;Xx\r\n" + //
    "xxxxxxx+x+xxxxXxxx$$$$XX$X$Xxxxxxxx+++++x+x;;+;;xx\r\n" + //
    "xxxxxxxxxx+++x$$$$$$XXX$$$X$xxxxxx++x++;;+;;;;++xx\r\n" + //
    "xxxxxxxxxx+xxX$+$$xxx$$&$$$xxxxxxxxx++x+;;+;;;;++x\r\n" + //
    "xxxxxxxxxxxX$xxx$XxXX$&&$$xXxxXxxxxx+;+;;;;+++xxxx\r\n" + //
    "xxxxxxxxxxxxxxx;++;xxXX$$xXxxxxxxxxx++;;;;;;+xxxxx\r\n" + //
    "xxxxxxxxxx+;xxx++xxx$$xxx$$+x+;xx+++;;;;;;:+xx;Xxx\r\n" + //
    "xxxxxxxxxxx+xXxx+xxxxx$$xxxx+++;;;;;:;;;;;++xxxX$X\r\n" + //
    "+xxxxx$$Xxxxx+xxxx+xx;;xx;xxxxx+;;;;;:;;;;;+xxxxxx\r\n" + //
    "+++x+X&$+x$;;+Xx$$xx+;:;+;+x++;+;:::;::;;;;;xxxxxx\r\n" + //
    "+;;+;xxxxx+xxxxxxXXxx$x;;:;;::::;::.::::;:;;xxxxxx\r\n" + //
    "::::;xxx+xXX+xxxxXXxxxx+++;+;;::;::::;::;;;xxxxxxx\r\n" + //
    ";;;;;;xxX$XX+xXxx$&&$x;;;:;;+xx;;:.::;;::;xxxxxxxx\r\n" + //
    ";x+::;;$Xxxx+xx;x$$$$xxx+;;;:;;:;;::;;::;xxxxxxxxX\r\n" + //
    ";;::::;x+xxxxx+xX$Xx+;x+;;;::;:;::::;;;;xxXXXXXXXX\r\n" + //
    "::::::;;;xXxxxXx+x++;;+:;;:;:;;;::+;;;;x$$xxxxxxxx\r\n" + //
    ":::::.:xxxX$xxXXxxx;::::::;:::;;:;x;x;;xXxXxxxxxxx\r\n" + //
    ";::::.;+xxxXxxx$$xx;+;::::::x;+;:+;++++xxxxxxxxxxX\r\n" + //
    "::::::::xxxXxX$X$x$:+x;;Xx;Xxx;;::;;;;;;xxxxxXxxxx\r\n" + //
    "::::;;;;+xxxx;+xx+:+++;Xx;;;x;;::;:::;;;;xxxxXXxxx\r\n" + //
    ";+x+++;;:;;+x;+x+:+x;::x+:.:;:;:::;:::;;;+xxxxxxxx\r\n" + //
    ":;;+xx;;:;:;++xxx++x;::x::.;;;;::::::::;;;+xxxxxxx\r\n" + //
    ";xxx+xx;::::::;++;;::;:;x;::;;;::;:::;;;;;xxxxxxxx";

    
    // Constructors
    public Bigfoot(String name, String type, int attack, int hp, String art)
    {
        super(name, type, attack, hp, art);
    }


    // public Bigfoot()
    // {
    //     super(name, type, attack, hp, art);
    //     String name = "Bigfoot";
    //     String type = "Bigfoot";
    //     int attack = 10;
    //     int hp = 100;
    //     String art = "asdfj";
    // }
    
    public String getArt()
    {
        return art;
    }
}

