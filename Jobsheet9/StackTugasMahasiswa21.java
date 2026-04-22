package Jobsheet9;

public class StackTugasMahasiswa21 {
    Mahasiswa21[] stack;
    int size;
    int top;

    // Constructor
    public StackTugasMahasiswa21(int size) {
        this.size = size;
        stack = new Mahasiswa21[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa21 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa21 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa21 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada data tugas.");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.println(
                stack[i].nama + "\t" +
                stack[i].nim + "\t" +
                stack[i].kelas + "\t" +
                stack[i].nilai
            );
        }
    }
}