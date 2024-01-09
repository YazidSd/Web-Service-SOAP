import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.convertionEuroToDH(150));

        Compte cp = proxy.getCompte(7);
        System.out.println("code : "+cp.getCode());
        System.out.println("solde : "+cp.getSolde());
        System.out.println("date création : "+cp.getDateCréation());

        List<Compte> compteList = proxy.listComptes();
        for (Compte c : compteList){
            System.out.println("----------------");
            System.out.println("code : "+c.getCode());
            System.out.println("solde : "+c.getSolde());
            System.out.println("date création : "+c.getDateCréation());
        }


    }
}
