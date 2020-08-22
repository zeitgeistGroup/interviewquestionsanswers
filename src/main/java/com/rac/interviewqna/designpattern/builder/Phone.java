package com.rac.interviewqna.designpattern.builder;


import lombok.*;

@ToString
/*@Builder
@Getter
@Setter*/
public class Phone {

    private String name;
    private int ram;
    private String processor;
    private double screen;
    private String simSlot;

    public Phone(String name, int ram, String processor, double screen, String simSlot) {
        this.name = name;
        this.ram = ram;
        this.processor = processor;
        this.screen = screen;
        this.simSlot = simSlot;
    }

    public static Phone.PhoneBuilder builder(){
       return  new Phone.PhoneBuilder();
    }

    public static class PhoneBuilder{
        private String name;
        private int ram;
        private String processor;
        private double screen;
        private String simSlot;

        public PhoneBuilder(){

        }

        public Phone.PhoneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Phone.PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Phone.PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Phone.PhoneBuilder setScreen(double screen) {
            this.screen = screen;
            return this;
        }

        public Phone.PhoneBuilder setSimSlot(String simSlot) {
            this.simSlot = simSlot;
            return this;
        }

        public Phone build(){

            return new Phone(name,ram,processor, screen, simSlot);
        }
    }
}
