package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
        private String arrivalAirport;

        public Flight (String departureAirport, String arrivalAirport){
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
        }

        public String getDepartureAirport(){
            return this.departureAirport;
        }

        public String getArrivalAirport(){
            return this.arrivalAirport;
        }
}