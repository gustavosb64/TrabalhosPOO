package SisOp;

public class Main {
    public static void main(String[] args) {
        DriverMouse dMouse = new DriverMouse(false);
        DriverImpressora dImpressora = new DriverImpressora(false);

        System.out.println("\n#######Polimorfiso entre MOUSE e IMPRESSORA#######\n");

        System.out.println("=======================");
        System.out.println("Funcionamento de: MOUSE");
        System.out.println("Status antes de ligar: "+dMouse.getStatus());
        dMouse.ligarDesligar();
        System.out.println("Status depois de ligar: "+dMouse.getStatus());
        dMouse.calibrar();

        System.out.println("=======================");
        System.out.println("Funcionamento de: Impressora");
        System.out.println("Status antes de ligar: "+dImpressora.getStatus());
        dImpressora.ligarDesligar();
        System.out.println("Status depois de ligar: "+dImpressora.getStatus());
        dImpressora.calibrar();
 
        TecladoABNT tABNT = new TecladoABNT(true, "parametroDeTecladoABNT");
        TecladoJapones tJAP = new TecladoJapones(true, "parametroDeTecladoJapones");
        TecladoGamer tGAM = new TecladoGamer(true, "parametroDeTecladoGamer");

        System.out.println("\n#######Testagem de TECLADOS#######\n");

        System.out.println("=======================");
        System.out.println("Funcionamento de: TECLADO ABNT");
        System.out.println("Status antes de desligar: "+tABNT.getStatus());
        tABNT.ligarDesligar();
        System.out.println("Status depois de desligar: "+tABNT.getStatus());
        tABNT.calibrar();
        tABNT.funcaoExclusiva();

        System.out.println("=======================");
        System.out.println("Funcionamento de: TECLADO JAPONES");
        System.out.println("Status antes de desligar: "+tJAP.getStatus());
        tJAP.ligarDesligar();
        System.out.println("Status depois de desligar: "+tJAP.getStatus());
        tJAP.calibrar();
        tJAP.funcaoExclusiva();

        System.out.println("=======================");
        System.out.println("Funcionamento de: TECLADO GAMER");
        System.out.println("Status antes de desligar: "+tGAM.getStatus());
        tGAM.ligarDesligar();
        System.out.println("Status depois de desligar: "+tGAM.getStatus());
        tGAM.calibrar();
        tGAM.funcaoExclusiva();



        System.out.println("=======================");


    }
}
