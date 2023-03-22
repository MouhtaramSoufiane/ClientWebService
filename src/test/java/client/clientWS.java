package client;

import proxy.BanqueServiceService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class clientWS {
    public static void main(String[] args) {
        BanqueWS proxy= new BanqueServiceService().getBanqueWSPort();
        System.out.println(proxy.conversionEuroToDh(1000));
        List<Compte> list=proxy.getComptes();
        list.forEach(compte -> {
            System.out.println(compte.getCode());
            System.out.println(compte.getSolde());
            System.out.println(compte.getDateCreation());
        });
    }
}
