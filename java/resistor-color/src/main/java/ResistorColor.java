class ResistorColor {

    int colorCode(String color) {

        String[] colors = colors();
        int code = 0;

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)) {
                code = i;
            }
        }
        return code;
    }

    String[] colors() {

        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
