public class ApiDeliveryChannel implements DeliveryChannel {
    private String token;

    public ApiDeliveryChannel(String token) {
        if (token == null) {
            this.token = "BLANK";
        } else {
            this.token = token;
        }
    }

    public String deliver(String response, Chatbot chatbot) {
        if (response == null) {
            return "";
        }
        return "[API token=" + token + "] " + chatbot.getName() + ": " + response;
    }
    // TODO:
    // Kelas ini harus mengimplementasikan interface Delivery channel

    // TODO:
    // Kelas ini harus memiliki sebuah attribute token dengan tipe String
    // Inisialisasi token dilakukan dalam konstruktor kelas, apabila token yang
    // di-passing dalam parameter konstruktor kelas adalah null, maka beri nilai
    // default yaitu: "BLANK"

    // TODO:
    // Kelas ini harus method deliver dari DeliveryChannel dengan ketentuan:
    // 1. Ketika responsenya adalah null maka return string kosong ("")
    // 2. Ketika responsenya valid, return: "[API token=<token>] <chatbot name>: <response>"
}
