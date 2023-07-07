package java1;

public enum Curency {
    RUB("rub"),
    EUR("eur"),
    USD("usd");

     String curency;

    Curency(String curency) {
        this.curency = curency;
    }

    public String getCurency() {
        return curency;
    }
}

