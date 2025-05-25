package sections.section3;

public class MegaBytesConverter {
    /*
        General Information
        1 MB = 1024 Bytes
    */
    final int oneMega = 1024;
    public void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = kiloBytes/oneMega;
            int remainingKiloBytes = kiloBytes%oneMega;

            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainingKiloBytes);
        }
    }
}
