package objects;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rate extends Object {

    private Long id;
//    private String key;

//    public Rate() {
//        key = "defualt";
//    }
//
//    public Rate(String key) {
//        this.key = key;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

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
            return Integer.parseInt(hashAscii.substring(0,6));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof rate.Rate) {
            rate.Rate comparation = (rate.Rate) o;
            if (comparation.getId() == null || this.id == null)
                return false;
            return comparation.getId() == this.id;
        }
        return super.equals(o);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this.hashCode() == o.hashCode()){
//            return true;
//        }
//        return false;
//    }
}
