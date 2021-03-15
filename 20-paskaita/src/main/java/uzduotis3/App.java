package uzduotis3;

import java.util.List;

import static uzduotis3.DnsProvider.FACEBOOK;
import static uzduotis3.DnsProvider.GOOGLE;

public class App {

    public static void main(String[] args) {

        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();
        Mapas<String, String> stringMapas = new Mapas<>();

        dnsMapas.ideti(GOOGLE, new DnsServer("8.8.8", "8.4.4"));
        dnsMapas.ideti(FACEBOOK, new DnsServer("1.1.", "1.0.1"));
        DnsServer googlseDns = dnsMapas.gauti(GOOGLE);
        System.out.println(googlseDns);
        DnsServer facebookDns = dnsMapas.gauti(FACEBOOK);
        System.out.println(facebookDns);

        Mapas<String, String> zodynoMapas = new Mapas<>();
        zodynoMapas.ideti("Labas", "Hello");

        String labas = zodynoMapas.gauti("Labas");
        System.out.println(labas);


    }
}
