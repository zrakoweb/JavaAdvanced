package uzduotis3;

import java.util.Collections;

public class HttpErrorPair <K, V extends HttpCode> implements Comparable<HttpErrorPair> {
    private K key;
    private V value;

    public HttpErrorPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HttpErrorPair{" +
                "key=" + key +
                ", value=" + value +
                '}' + '\n';
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public int compareTo(HttpErrorPair o) {
        return 0;
    }
}
