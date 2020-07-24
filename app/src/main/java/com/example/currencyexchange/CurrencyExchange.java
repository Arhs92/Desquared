package com.example.currencyexchange;

import java.util.ArrayList;
import java.util.List;


public class CurrencyExchange {

    /**
     * base : EUR
     * date : 2020-07-23
     * rates : {"AED":4.250654,"AFN":89.233416,"ALL":123.915397,"AMD":560.3067,"ANG":2.078349,"AOA":646.101672,"ARS":82.994665,"AUD":1.62586,"AWG":2.083098,"AZN":1.963586,"BAM":1.954355,"BBD":2.337856,"BDT":98.180436,"BGN":1.954924,"BHD":0.435911,"BIF":2230.835575,"BMD":1.157277,"BND":1.603304,"BOB":7.995035,"BRL":5.925026,"BSD":1.157836,"BTC":0.000122,"BTN":86.432506,"BWP":13.293381,"BYN":2.764913,"BYR":22682.620141,"BZD":2.333859,"CAD":1.549877,"CDF":2267.104581,"CHF":1.073305,"CLF":0.032206,"CLP":888.67187,"CNY":8.102784,"COP":4207.602891,"CRC":673.557442,"CUC":1.157277,"CUP":30.667828,"CVE":110.181834,"CZK":26.374102,"DJF":206.125313,"DKK":7.443835,"DOP":67.572583,"DZD":147.653402,"EGP":18.505551,"ERN":17.358785,"ETB":40.68147,"EUR":1,"FJD":2.467603,"FKP":0.912132,"GBP":0.912293,"GEL":3.541712,"GGP":0.912132,"GHS":6.715531,"GIP":0.912132,"GMD":59.970014,"GNF":11164.573156,"GTQ":8.91255,"GYD":242.049399,"HKD":8.970571,"HNL":28.639631,"HRK":7.524933,"HTG":127.981511,"HUF":347.060382,"IDR":16956.184377,"ILS":3.961832,"IMP":0.912132,"INR":86.57661,"IQD":1382.258619,"IRR":48727.12892,"ISK":157.818031,"JEP":0.912132,"JMD":168.468299,"JOD":0.82051,"JPY":124.037481,"KES":124.978633,"KGS":88.530381,"KHR":4747.257951,"KMF":492.191319,"KPW":1041.573835,"KRW":1389.368638,"KWD":0.35496,"KYD":0.96488,"KZT":478.978485,"LAK":10492.980555,"LBP":1750.893554,"LKR":215.10071,"LRD":230.703688,"LSL":19.158701,"LTL":3.417137,"LVL":0.700025,"LYD":1.604396,"MAD":10.937344,"MDL":19.544448,"MGA":4460.622545,"MKD":61.568531,"MMK":1594.946838,"MNT":3291.997535,"MOP":9.244502,"MRO":413.147852,"MUR":46.696546,"MVR":17.818144,"MWK":855.557644,"MXN":25.995591,"MYR":4.928261,"MZN":81.732622,"NAD":19.048719,"NGN":449.242986,"NIO":40.263958,"NOK":10.614158,"NPR":138.291815,"NZD":1.739196,"OMR":0.445542,"PAB":1.157836,"PEN":4.062369,"PGK":4.023098,"PHP":57.215217,"PKR":194.664549,"PLN":4.418274,"PYG":8055.789204,"QAR":4.213657,"RON":4.835798,"RSD":117.590692,"RUB":82.536387,"RWF":1109.217505,"SAR":4.339762,"SBD":9.611295,"SCR":20.418851,"SDG":64.055726,"SEK":10.264071,"SGD":1.60358,"SHP":0.912132,"SLL":11297.913646,"SOS":674.691919,"SRD":8.630933,"STD":25338.763069,"SVC":10.131441,"SYP":593.818167,"SZL":19.166599,"THB":36.682765,"TJS":11.934492,"TMT":4.062041,"TND":3.239798,"TOP":2.625743,"TRY":7.925146,"TTD":7.830557,"TWD":34.070797,"TZS":2687.195746,"UAH":32.267146,"UGX":4287.482511,"USD":1.157277,"UYU":49.897771,"UZS":11834.348093,"VEF":11.558298,"VND":26839.974084,"VUV":131.978721,"WST":3.026623,"XAF":655.467949,"XAG":0.050978,"XAU":0.000617,"XCD":3.127598,"XDR":0.829481,"XOF":655.46229,"XPF":119.761679,"YER":289.724058,"ZAR":19.232258,"ZMK":10416.88749,"ZMW":21.020916,"ZWL":372.643267}
     */

    private String base;
    private String date;
    /**
     "AED":4.250654,
     "AFN":89.233416,
     "ALL":123.915397,"
     AMD":560.3067,
     "ANG":2.078349,
     "AOA":646.101672,
     "ARS":82.994665,
     "AUD":1.62586,
     "AWG":2.083098,
     "AZN":1.963586,
     "BAM":1.954355,"
     BBD":2.337856,
     "BDT":98.180436,
     "BGN":1.954924,
     "BHD":0.435911,
     "BIF":2230.835575,
     "BMD":1.157277,
     "BND":1.603304,
     "BOB":7.995035,
     "BRL":5.925026,
     "BSD":1.157836,
     "BTC":0.000122,
     "BTN":86.432506,
     "BWP":13.293381,
     "BYN":2.764913,
     "BYR":22682.620141,
     "BZD":2.333859,
     "CAD":1.549877,
     "CDF":2267.104581,
     "CHF":1.073305,
     "CLF":0.032206,
     "CLP":888.67187,
     "CNY":8.102784,
     "COP":4207.602891,
     "CRC":673.557442,
     "CUC":1.157277,
     "CUP":30.667828,
     "CVE":110.181834,
     "CZK":26.374102,
     "DJF":206.125313,
     "DKK":7.443835,
     "DOP":67.572583,
     "DZD":147.653402,
     "EGP":18.505551,
     "ERN":17.358785,
     "ETB":40.68147,
     "EUR":1,
     "FJD":2.467603,
     "FKP":0.912132,
     "GBP":0.912293,
     "GEL":3.541712,
     "GGP":0.912132,
     "GHS":6.715531,
     "GIP":0.912132,
     "GMD":59.970014,
     "GNF":11164.573156,
     "GTQ":8.91255,
     "GYD":242.049399,
     "HKD":8.970571,
     "HNL":28.639631,
     "HRK":7.524933,
     "HTG":127.981511,
     "HUF":347.060382,
     "IDR":16956.184377,
     "ILS":3.961832,
     "IMP":0.912132,
     "INR":86.57661,
     "IQD":1382.258619,
     "IRR":48727.12892,
     "ISK":157.818031,
     "JEP":0.912132,
     "JMD":168.468299,
     "JOD":0.82051,
     "JPY":124.037481,
     "KES":124.978633,
     "KGS":88.530381,
     "KHR":4747.257951,
     "KMF":492.191319,
     "KPW":1041.573835,
     "KRW":1389.368638,
     "KWD":0.35496,
     "KYD":0.96488,
     "KZT":478.978485,
     "LAK":10492.980555,
     "LBP":1750.893554,
     "LKR":215.10071,
     "LRD":230.703688,
     "LSL":19.158701,
     "LTL":3.417137,
     "LVL":0.700025,
     "LYD":1.604396,
     "MAD":10.937344,
     "MDL":19.544448,
     "MGA":4460.622545,
     "MKD":61.568531,
     "MMK":1594.946838,
     "MNT":3291.997535,
     "MOP":9.244502,
     "MRO":413.147852,
     "MUR":46.696546,
     "MVR":17.818144,
     "MWK":855.557644,
     "MXN":25.995591,
     "MYR":4.928261,
     "MZN":81.732622,
     "NAD":19.048719,
     "NGN":449.242986,
     "NIO":40.263958,
     "NOK":10.614158,
     "NPR":138.291815,
     "NZD":1.739196,
     "OMR":0.445542,
     "PAB":1.157836,
     "PEN":4.062369,
     "PGK":4.023098,
     "PHP":57.215217,
     "PKR":194.664549,
     "PLN":4.418274,
     "PYG":8055.789204,
     "QAR":4.213657,
     "RON":4.835798,
     "RSD":117.590692,
     "RUB":82.536387,
     "RWF":1109.217505,
     "SAR":4.339762,
     "SBD":9.611295,
     "SCR":20.418851,
     "SDG":64.055726,
     "SEK":10.264071,
     "SGD":1.60358,
     "SHP":0.912132,
     "SLL":11297.913646,
     "SOS":674.691919,
     "SRD":8.630933,
     "STD":25338.763069,
     "SVC":10.131441,
     "SYP":593.818167,
     "SZL":19.166599,
     "THB":36.682765,
     "TJS":11.934492,
     "TMT":4.062041,
     "TND":3.239798,
     "TOP":2.625743,
     "TRY":7.925146,
     "TTD":7.830557,
     "TWD":34.070797,
     "TZS":2687.195746,
     "UAH":32.267146,
     "UGX":4287.482511,
     "USD":1.157277,
     "UYU":49.897771,
     "UZS":11834.348093,
     "VEF":11.558298,
     "VND":26839.974084,
     "VUV":131.978721,
     "WST":3.026623,
     "XAF":655.467949,
     "XAG":0.050978,
     "XAU":0.000617,
     "XCD":3.127598,
     "XDR":0.829481,
     "XOF":655.46229,
     "XPF":119.761679,
     "YER":289.724058,
     "ZAR":19.232258,
     "ZMK":10416.88749,
     "ZMW":21.020916,
     "ZWL":372.643267
     */

    private RatesEntity rates;

    public List<Currency> getCurrencyList(){
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("AUD", rates.getAUD()));
        currencyList.add(new Currency("BGN", rates.getBGN()));
        currencyList.add(new Currency("BRL", rates.getBRL()));
        currencyList.add(new Currency("CAD", rates.getCAD()));
        currencyList.add(new Currency("CHF", rates.getCHF()));

        currencyList.add(new Currency("CNY", rates.getCNY()));
        currencyList.add(new Currency("CZK", rates.getCZK()));
        currencyList.add(new Currency("DKK", rates.getDKK()));
        currencyList.add(new Currency("GBP", rates.getGBP()));
        currencyList.add(new Currency("HKD", rates.getHKD()));

        currencyList.add(new Currency("HRK", rates.getHRK()));
        currencyList.add(new Currency("HUF", rates.getHUF()));
        currencyList.add(new Currency("IDR", rates.getIDR()));
        currencyList.add(new Currency("ILS", rates.getILS()));
        currencyList.add(new Currency("INR", rates.getINR()));

        currencyList.add(new Currency("JPY", rates.getJPY()));
        currencyList.add(new Currency("KRW", rates.getKRW()));
        currencyList.add(new Currency("MXN", rates.getMXN()));
        currencyList.add(new Currency("MYR", rates.getMYR()));
        currencyList.add(new Currency("NOK", rates.getNOK()));

        currencyList.add(new Currency("NZD", rates.getNZD()));
        currencyList.add(new Currency("PHP", rates.getPHP()));
        currencyList.add(new Currency("PLN", rates.getPLN()));
        currencyList.add(new Currency("RON", rates.getRON()));
        currencyList.add(new Currency("RUB", rates.getRUB()));

        currencyList.add(new Currency("SEK", rates.getSEK()));
        currencyList.add(new Currency("SGD", rates.getSGD()));
        currencyList.add(new Currency("THB", rates.getTHB()));
        currencyList.add(new Currency("TRY", rates.getTRY()));
        currencyList.add(new Currency("USD", rates.getUSD()));

        currencyList.add(new Currency("ZAR", rates.getZAR()));

        return currencyList;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesEntity getRates() {
        return rates;
    }

    public void setRates(RatesEntity rates) {
        this.rates = rates;
    }

    public static class RatesEntity {
        private double AUD;
        private double BGN;
        private double BRL;
        private double CAD;
        private double CHF;
        private double CNY;
        private double CZK;
        private double DKK;
        private double GBP;
        private double HKD;
        private double HRK;
        private double HUF;
        private double IDR;
        private double ILS;
        private double INR;
        private double JPY;
        private double KRW;
        private double MXN;
        private double MYR;
        private double NOK;
        private double NZD;
        private double PHP;
        private double PLN;
        private double RON;
        private double RUB;
        private double SEK;
        private double SGD;
        private double THB;
        private double TRY;
        private double USD;
        private double ZAR;

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getBGN() {
            return BGN;
        }

        public void setBGN(double BGN) {
            this.BGN = BGN;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }

        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getCHF() {
            return CHF;
        }

        public void setCHF(double CHF) {
            this.CHF = CHF;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getCZK() {
            return CZK;
        }

        public void setCZK(double CZK) {
            this.CZK = CZK;
        }

        public double getDKK() {
            return DKK;
        }

        public void setDKK(double DKK) {
            this.DKK = DKK;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getHKD() {
            return HKD;
        }

        public void setHKD(double HKD) {
            this.HKD = HKD;
        }

        public double getHRK() {
            return HRK;
        }

        public void setHRK(double HRK) {
            this.HRK = HRK;
        }

        public double getHUF() {
            return HUF;
        }

        public void setHUF(double HUF) {
            this.HUF = HUF;
        }

        public double getIDR() {
            return IDR;
        }

        public void setIDR(double IDR) {
            this.IDR = IDR;
        }

        public double getILS() {
            return ILS;
        }

        public void setILS(double ILS) {
            this.ILS = ILS;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getMXN() {
            return MXN;
        }

        public void setMXN(double MXN) {
            this.MXN = MXN;
        }

        public double getMYR() {
            return MYR;
        }

        public void setMYR(double MYR) {
            this.MYR = MYR;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getPHP() {
            return PHP;
        }

        public void setPHP(double PHP) {
            this.PHP = PHP;
        }

        public double getPLN() {
            return PLN;
        }

        public void setPLN(double PLN) {
            this.PLN = PLN;
        }

        public double getRON() {
            return RON;
        }

        public void setRON(double RON) {
            this.RON = RON;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getSGD() {
            return SGD;
        }

        public void setSGD(double SGD) {
            this.SGD = SGD;
        }

        public double getTHB() {
            return THB;
        }

        public void setTHB(double THB) {
            this.THB = THB;
        }

        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }
    }
}
