package Pertemuan13;

// Kelas Main (satu-satunya public class dalam file)
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        
        hewan1.bersuara(); // Output: Meong!
        hewan2.bersuara(); // Output: Guk guk!
        
        AlatMusik alat1 = new Gitar();
        AlatMusik alat2 = new Piano();
        
        alat1.mainkan(); // Output: Jreng jreng...
        alat2.mainkan(); // Output: Ting ting...
    }
}

// Kelas dan interface berikut harus berada DI LUAR kelas Main
// -----------------------------------------------------------

// 1. Kelas Abstrak
abstract class Hewan {
    public abstract void bersuara();
}

// 2. Implementasi Hewan
class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
}

// 3. Interface
interface AlatMusik {
    void mainkan();
}

// 4. Implementasi Interface
class Gitar implements AlatMusik {
    @Override
    public void mainkan() {
        System.out.println("Jreng jreng...");
    }
}

class Piano implements AlatMusik {
    @Override
    public void mainkan() {
        System.out.println("Ting ting...");
    }
}