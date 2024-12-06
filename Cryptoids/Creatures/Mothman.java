package Cryptoids.Creatures;

import ANSI.ConsoleColors;

public class Mothman extends Cryptoid
{
    // Constructor
    public Mothman()
    {
        // Calls constructor and passes subclass-specific attributes to there
        super
        (
            "Mothman", 
            "Flying", 
            15, 
            100, 
            100, 
            "..................................................\r\n" + //
            "...... ..... ........... .........................\r\n" + //
            ". ........ .............. ........................\r\n" + //
            "................. ........... ........ ...........\r\n" + //
            "..................... .. .............:...........\r\n" + //
            ". .......@@@@@-. ..... ............:@@@@@.........\r\n" + //
            "........@@@@@@@%.... .............#@@@@@@@........\r\n" + //
            ".......@@@@@@@@@@=....:@@@@:....=@@@@@@@@@@.......\r\n" + //
            ".... .*@@@@@@@@@@@@@@@@%@@%@@@@@@@@@@@@@@@@+..... \r\n" + //
            "......%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......\r\n" + //
            "......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......\r\n" + //
            ".....:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:.....\r\n" + //
            ".....:@@@@@@@@@@@@@@*@@@@@@@@#@@@@@@@@@@@@@@-.....\r\n" + //
            ".....:@@@@@@@@@@@@@...@@@@@@...@@@@@@@@@@@@@-.....\r\n" + //
            "......@@@@@@@@@@@@@...@@@@@@...@@@@@@@@@@@@@:.... \r\n" + //
            ".. ...@@@@@@@@@@....-@@@@@@@@.....@@@@@@@@@@... ..\r\n" + //
            "... ..%@@@@@...%.. -@@@@..@@@@-...*...@@@@@%.... .\r\n" + //
            ". ....-@@@@@.......%@@#....#@@+... ...@%@@@=......\r\n" + //
            ".......@@:. ..... ..@@#....@@#..........-@@.... ..\r\n" + //
            " ..... .@............+@....@=............@........\r\n" + //
            "........+. .........=%@*..#@%=...........-....... \r\n" + //
            ".. ................@@-......-@@. .. ..... .. .....\r\n" + //
            "................................. ..... ..... ....\r\n" + //
            ". ................................................\r\n" + //
            "....................... ........... ..............\r\n" + //
            ".................................... .............\r\n" + //
            "....... ........... .............. .............. " +
            ConsoleColors.RESET
        );
    }
}

// ".... .*@@@@@@@@@@@@@@@@" + ConsoleColors.RED_BACKGROUND_BRIGHT + "%" + ConsoleColors.RESET + "@@" + ConsoleColors.RED_BACKGROUND_BRIGHT + "%" + ConsoleColors.RESET + "@@@@@@@@@@@@@@@@+..... \r\n" + //