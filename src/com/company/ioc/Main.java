package com.company.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // no brain
        Encoder encoder = new Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

        UrlEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);

        // using interface
        IEncoder encoder2 = new EncoderInher();
        String result2 = encoder2.encode(url);
        System.out.println(result2);

        IEncoder urlEncoder2 = new UrlEncoderInher();
        String urlResult2 = urlEncoder2.encode(url);
        System.out.println(urlResult2);

        // DI concept
//        MainEncoder mainEncoder = new MainEncoder(new EncoderInher());
        MainEncoder mainEncoder = new MainEncoder(new UrlEncoderInher());
        String result3 = mainEncoder.encode(url);
        System.out.println(result3);


    }
}
