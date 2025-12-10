import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    // TODO: Deklarasikan field untuk menyimpan teks pertanyaan
    private String text;
    // TODO: Deklarasikan field untuk daftar Option
    private List<Option> options;
    // TODO: Deklarasikan field untuk indeks jawaban yang benar
    private int correctAnswerIndex;

    public Question(String text) {
        this.text = text;
        this.options = new ArrayList<>();
        this.correctAnswerIndex = -1;
        // TODO: Inisialisasi teks pertanyaan dan struktur data daftar option
        // TODO: Atur nilai awal indeks jawaban benar (misalnya -1)
    }

    public void addOption(String optionText, boolean correct) {
        Option option = new Option(optionText);
        options.add(option);
        if (correct) {
            correctAnswerIndex = options.size() - 1;
        }
        // TODO: Buat objek Option baru menggunakan inner class
        // TODO: Tambahkan option ke dalam daftar
        // TODO: Jika parameter correct true, perbarui indeks jawaban benar
    }

    public void display() {
        System.out.println(text);
        for (int i = 0; i < options.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, options.get(i).getText());
        }
        // TODO: Cetak teks pertanyaan yang diakhiri newline
        // TODO: Iterasi seluruh option dan tampilkan dengan format "nomor.
        // teks<newline>"
    }

    public boolean isCorrect(int selectedOptionNumber) {
        int index = selectedOptionNumber - 1;
        return index == correctAnswerIndex;
        // TODO: Konversi nomor 1-based menjadi indeks 0-based dan bandingkan dengan
        // jawaban benar yang disimpan di dalam kelas
    }

    public boolean isValidOption(int selectedOptionNumber) {
        return selectedOptionNumber >= 1 && selectedOptionNumber <= options.size();
        // TODO: Periksa apakah nomor opsi berada dalam rentang indeks daftar option
    }

    public List<Option> getOptions() {
        return Collections.unmodifiableList(options);
    }

    public class Option {
        // TODO: Deklarasikan field untuk menyimpan teks option
        private String text;

        private Option(String text) {
            this.text = text;
            // TODO: Simpan teks option pada field yang sesuai
        }

        public String getText() {
            // TODO: Mengembalikan teks option
            return text;
        }
    }
}
