public class Bruch {
    private int zaehler, nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Bruch(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void multi(int n) {
        this.zaehler *= n;
    }

    public void multi(Bruch b) {
        this.zaehler = this.zaehler * b.zaehler;
        this.nenner = this.nenner * b.nenner;
    }

    public void div(Bruch b) {
        this.zaehler = this.zaehler * b.nenner;
        this.nenner = this.nenner * b.zaehler;
    }

    @Override
    public String toString() {
        if (nenner != 1) {
            return zaehler + "/" + nenner;
        } else {
            return String.valueOf(zaehler);
        }
    }

    public int[] getTeiler(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        int[] erg = new int[counter];
        for (int i = 1, j = 0; i <= n; i++) {
            if (n % i == 0) {
                erg[j] = i;
                j++;
            }
        }
        return erg;
    }

    public int[] getGemeinsams(int[] a, int[] b) {
        int size;
        if (a.length < b.length) {
            size = a.length;
        } else {
            size = b.length;
        }
        int[] result = new int[size];

        for (int i = 0; i < a.length; i++) {
            if (exist(a[i], b)) {
                result[i] = a[i];
            }
        }
        return result;

    }

    public boolean exist(int n, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    public int findeGGT(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void kürze() {
        int ggt = findeGGT(this.zaehler, this.nenner);
        this.zaehler /= ggt;
        this.nenner /= ggt;
    }
}
