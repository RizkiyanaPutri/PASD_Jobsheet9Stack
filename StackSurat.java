public class StackSurat {
    Surat[] stack;
    int top;
    int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Surat terakhir:");
            stack[top].tampil();
        } else {
            System.out.println("Stack kosong!");
        }
    }

    public void cari(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            // PERBAIKAN: Menggunakan getter getNamaMahasiswa()
            if (stack[i].getNamaMahasiswa().equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}