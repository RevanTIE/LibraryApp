package libapp;

import java.awt.font.LineBreakMeasurer;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("23489");
        app.searchByIsbn("33333");
        app.searchByIsbn("32456");

    }
}
