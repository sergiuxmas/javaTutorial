package rate;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Rate {
    private Long id;
    private Currency from;
    private Currency to;
    private double value;
//    private Map<String, Double> defaultRates;

    public Rate() {
    }

    public Rate(Long id) {
        this.id = id;
    }

    public Rate(Currency from, Currency to, double value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    //
//    public Rate(Map<String, Double> defaultRates) {
//        this.defaultRates = defaultRates;
//    }

    //
//    static {
//        defaultRates = new HashMap<>();
//    }

    @Override
    public int hashCode() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(String.valueOf(id).getBytes());
            String hash = new String(md.digest(), "US-ASCII");
            List<Integer> listAscii = new ArrayList<>();
            for (int i: hash.getBytes()) {
                listAscii.add(i);
            }
            String hashAscii = listAscii.stream()
                    .map( e -> String.valueOf(Math.abs(e)))
                    .collect(Collectors.joining(""));
            return Integer.parseInt(hashAscii.substring(0,10));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", value=" + value +
                '}';
    }
}
