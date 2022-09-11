package task5;

public class NumberWord {
    private int number;
    private String numWord;

    public String convertNum(int num) throws Exception {
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
        throw new Exception("Invalid number");
    }

    public String convertSecondToLast(int num, int nextNum) throws Exception {
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
        throw new Exception("Invalid number");
    }

    public void setNumWord(String numWord) throws Exception {
        this.number = Integer.parseInt(numWord);
        StringBuilder sb = new StringBuilder();
        int lastNum = Integer.parseInt(numWord.charAt(numWord.length() - 1) + "");

        if (numWord.length() == 1 && Character.isDigit(numWord.charAt(0))) {
            this.numWord = "zero";
            return;
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

            if (i == numWord.length() - 10 ) {
                if (num!=0) {
                    sb.append(convertNum(num));
                    sb.append(" billion ");
                }
            }
            if (i == numWord.length() - 7 ) {
                if (num!=0) {
                    sb.append(convertNum(num));
                    sb.append(" million ");
                }
            }
            if (i == numWord.length() - 4) {
                if (num!=0) {
                    sb.append(convertNum(num));
                    sb.append(" thousand ");
                }
            }

            if (i == numWord.length() - 3) {
                if (num!=0) {
                    sb.append(convertNum(num));
                    sb.append(" hundred ");
                }
            }

            if (i == numWord.length() - 2) {
                if (num!=0) {
                    String toAdd = convertSecondToLast(num, lastNum);
                    sb.append(toAdd).append(" ");
                }
            }
        }

        if ((numWord.length() > 1 && numWord.charAt(numWord.length() - 2) != '1') ||
                numWord.length() == 1) {
            sb.append(convertNum(lastNum));
        }

        this.numWord = sb.toString();
    }

    @Override
    public String toString() {
        return number + " - " + numWord;
    }
}
