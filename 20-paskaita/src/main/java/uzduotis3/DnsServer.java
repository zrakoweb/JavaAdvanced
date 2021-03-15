package uzduotis3;

public class DnsServer <K, V> {
    K ip1;
    V ip2;

    @Override
    public String toString() {
        return "DnsServer{" +
                "ip1=" + ip1 +
                ", ip2=" + ip2 +
                '}';
    }

    public DnsServer(K ip1, V ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    public K getIp1() {
        return ip1;
    }

    public void setIp1(K ip1) {
        this.ip1 = ip1;
    }

    public V getIp2() {
        return ip2;
    }

    public void setIp2(V ip2) {
        this.ip2 = ip2;
    }
}
