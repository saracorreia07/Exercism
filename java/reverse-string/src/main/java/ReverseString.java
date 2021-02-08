class ReverseString {

    String reverse(String inputString) {

        String newWord = "";

        if(inputString != null) {

            for (int i = inputString.length() - 1; i >= 0; i--) {

                newWord += inputString.substring(i, i + 1);
            }

            return newWord;
        }

        return "";
    }
  
}
