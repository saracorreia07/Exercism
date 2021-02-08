class ResistorColorDuo {

    int value(String[] colors) {

        String[] code = new String[10];

        for (int i = 0; i <= 1; i++) {

            switch (colors[i]) {
                case "black":
                    code[i] = "0";
                    break;
                case "brown":
                    code[i] = "1";
                    break;
                case "red":
                    code[i] = "2";
                    break;
                case "orange":
                    code[i] = "3";
                    break;
                case "yellow":
                    code[i] = "4";
                    break;
                case "green":
                    code[i] = "5";
                    break;
                case "blue":
                    code[i] = "6";
                    break;
                case "violet":
                    code[i] = "7";
                    break;
                case "grey":
                    code[i] = "8";
                    break;
                case "white":
                    code[i] = "9";
                    break;
            }
        }
        return Integer.parseInt(code[0] + code[1]);
    }
}
