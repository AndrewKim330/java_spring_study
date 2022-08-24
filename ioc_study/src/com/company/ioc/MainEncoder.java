package com.company.ioc;

public class MainEncoder implements IEncoder{

    private IEncoder iEncoder;

//    // not good
//    public MainEncoder(){
//        this.iEncoder = new EncoderInher();
//        this.iEncoder = new UrlEncoderInher();
//    }

    public MainEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
