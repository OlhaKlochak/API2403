package java1;

public enum Curency {
    RUB("rub"),
    EUR("eur"),
    USD("usd");

    final String curency;

    Curency(String curency) {
        this.curency = curency;
    }

    public String getCurency() {
        return curency;
    }
}

