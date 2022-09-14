package task5;

public class NumberWord {
    private int number;
    private String numWord;

    private String convertNum(int num) {
        switch (num) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "Invalid number";
    }

    private String convertSecondToLast(int num, int nextNum) {
        switch (num) {
            case 0:
                return "";
            case 1:
                switch (nextNum) {
                    case 0:
                        return "ten";
                    case 1:
                        return "eleven";
                    case 2:
                        return "twelve";
                    case 3:
                        return "thirteen";
                    case 4:
                        return "fourteen";
                    case 5:
                        return "fifteen";
                    case 6:
                        return "sixteen";
                    case 7:
                        return "seventeen";
                    case 8:
                        return "eighteen";
                    case 9:
                        return "nineteen";
                }
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
       return "Invalid number";
    }

    public String setNumWord(String numWord) {
        this.number = Integer.parseInt(numWord);
        StringBuilder sb = new StringBuilder();
        int lastNum = Integer.parseInt(numWord.charAt(numWord.length() - 1) + "");

        if (numWord.equals("0")) {
            this.numWord = "zero";
            return this.numWord;
        }

        for (int i = 0; i < numWord.length() - 1; i++) {
            int num;
            try {
                num = Integer.parseInt(numWord.charAt(i) + "");
            } catch (NumberFormatException e) {
                if (i == 0) {
                    if (numWord.charAt(0) == '-') {
                        sb.append("minus ");
                    }
                    if (numWord.charAt(0) == '+') {
                        sb.append("plus ");
                    }
                }
                continue;
            }

            if (i == numWord.length() - 10) {
                sb.append(addNumWord(num, " billion "));
            } else if (i == numWord.length() - 7) {
                sb.append(addNumWord(num, " million "));
            } else if (i == numWord.length() - 4) {
                sb.append(addNumWord(num, " thousand "));
            } else if (i == numWord.length() - 3 || i == numWord.length() - 9 ||
                       i == numWord.length() - 6) {
                sb.append(addNumWord(num, " hundred "));
            } else if (i == numWord.length() - 2 || i == numWord.length() - 5 ||
                       i == numWord.length() - 8) {
                if (num != 0) {
                    String toAdd = convertSecondToLast(num, lastNum);
                    sb.append(toAdd).append(" ");
                }
            }
        }

        if ((numWord.length() > 1 && numWord.charAt(numWord.length() - 2) != '1') ||
                numWord.length() == 1) {
            sb.append(convertNum(lastNum));
        }

        if (sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);}

        this.numWord = sb.toString();

        return this.numWord;
    }

    private String addNumWord(int num, String numName)  {
        StringBuilder sb = new StringBuilder();
        if (num != 0) {
            sb.append(convertNum(num));
            sb.append(numName);
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return number + " - " + numWord;
    }
}
