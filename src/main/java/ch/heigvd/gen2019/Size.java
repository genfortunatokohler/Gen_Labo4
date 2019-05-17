package ch.heigvd.gen2019;

abstract class Size {
    public static class XS extends Size {
        public XS() {
            super(1, "XS");
        }
    }

    public static class S extends Size {
        public S() {
            super(2, "S");
        }
    }

    public static class M extends Size {
        public M() {
            super(3, "M");
        }
    }

    public static class L extends Size {
        public L() {
            super(4, "L");
        }
    }

    public static class XL extends Size {
        public XL() {
            super(5, "XL");
        }
    }

    public static class XXL extends Size {
        public XXL() {
            super(6, "XXL");
        }
    }

    public Size(int value, String str) {
        this.value = value;
        this.str = str;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return str;
    }

    private int value;
    private String str;
}
