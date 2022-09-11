import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class myMagicNumber {
    //https://en.wikipedia.org/wiki/Names_of_large_numbers - source for numbers names.
    private static HashMap<Integer, String> amount = new HashMap<>() {{
        put(1, "");
        put(2, "");
        put(3, "");
        put(4, "thousand ");
        put(5, "thousand ");
        put(6, "thousand ");
        put(7, "million ");
        put(8, "million ");
        put(9, "million ");
        put(10, "billion ");
        put(11, "billion ");
        put(12, "billion ");
        put(13, "trillion ");
        put(14, "trillion ");
        put(15, "trillion ");
        put(16, "quadrillion ");
        put(17, "quadrillion ");
        put(18, "quadrillion ");
        put(19, "quintillion "); // 10 = qunt
        put(20, "quintillion ");
        put(21, "quintillion ");
        put(22, "sextillion ");
        put(23, "sextillion ");
        put(24, "sextillion ");
        put(25, "septillion ");
        put(26, "septillion ");
        put(27, "septillion ");
        put(28, "octillion ");
        put(29, "octillion ");
        put(30, "octillion ");
        put(31, "nonillion ");
        put(32, "nonillion ");
        put(33, "nonillion ");
        put(34, "decillion ");
        put(35, "decillion ");
        put(36, "decillion ");
        put(37, "undecillion ");
        put(38, "undecillion ");
        put(39, "undecillion ");
        put(40, "duodecillion ");
        put(41, "duodecillion ");
        put(42, "duodecillion ");
        put(43, "tredecillion ");
        put(44, "tredecillion ");
        put(45, "tredecillion ");
        put(46, "quattuordecillion ");
        put(47, "quattuordecillion ");
        put(48, "quattuordecillion ");
        put(49, "quindecillion ");
        put(50, "quindecillion ");
        put(51, "quindecillion ");
        put(52, "sexdecillion ");
        put(53, "sexdecillion ");
        put(54, "sexdecillion ");
        put(55, "septendecillion ");
        put(56, "septendecillion ");
        put(57, "septendecillion ");
        put(58, "octodecillion ");
        put(59, "octodecillion ");
        put(60, "octodecillion ");
        put(61, "novemdecillion ");
        put(62, "novemdecillion ");
        put(63, "novemdecillion ");
        put(64, "vigintillion ");
        put(65, "vigintillion ");
        put(66, "vigintillion ");
        put(67, "Unvigintillion ");
        put(68, "Unvigintillion ");
        put(69, "Unvigintillion ");
        put(70, "Duovigintillion ");
        put(71, "Duovigintillion ");
        put(72, "Duovigintillion ");
        put(73, "Tresvigintillion ");
        put(74, "Tresvigintillion ");
        put(75, "Tresvigintillion ");
        put(76, "Quattuorvigintillion ");
        put(77, "Quattuorvigintillion ");
        put(78, "Quattuorvigintillion ");
        put(79, "Quinvigintillion ");
        put(80, "Quinvigintillion ");
        put(81, "Quinvigintillion ");
        put(82, "Sesvigintillion ");
        put(83, "Sesvigintillion ");
        put(84, "Sesvigintillion ");
        put(85, "Septemvigintillion ");
        put(86, "Septemvigintillion ");
        put(87, "Septemvigintillion ");
        put(88, "Octovigintillion ");
        put(89, "Octovigintillion ");
        put(90, "Octovigintillion ");
        put(91, "Novemvigintillion ");
        put(92, "Novemvigintillion ");
        put(93, "Novemvigintillion ");
        put(94, "Trigintillion ");
        put(95, "Trigintillion ");
        put(96, "Trigintillion ");
        put(97, "Untrigintillion ");
        put(98, "Untrigintillion ");
        put(99, "Untrigintillion ");
        put(100, "Duotrigintillion ");
        put(101, "Duotrigintillion ");
        put(102, "Duotrigintillion ");
        put(103, "Trestrigintillion ");
        put(104, "Trestrigintillion ");
        put(105, "Trestrigintillion ");
        put(106, "Quattuortrigintillion ");
        put(107, "Quattuortrigintillion ");
        put(108, "Quattuortrigintillion ");
        put(109, "Quintrigintillion ");
        put(110, "Quintrigintillion ");
        put(111, "Quintrigintillion ");
        put(112, "Sestrigintillion ");
        put(113, "Sestrigintillion ");
        put(114, "Sestrigintillion ");
        put(115, "Septentrigintillion ");
        put(116, "Septentrigintillion ");
        put(117, "Septentrigintillion ");
        put(118, "Octotrigintillion ");
        put(119, "Octotrigintillion ");
        put(120, "Octotrigintillion ");
        put(121, "Noventrigintillion ");
        put(122, "Noventrigintillion ");
        put(123, "Noventrigintillion ");
        //Huge leaps from this point.
        put(124, "Quadragintillion ");
        put(125, "Quadragintillion ");
        put(126, "Quadragintillion ");
        put(127, "Quadragintillion ");
        put(128, "Quadragintillion ");
        put(129, "Quadragintillion ");
        put(130, "Quadragintillion ");
        put(131, "Quadragintillion ");
        put(132, "Quadragintillion ");
        put(133, "Quadragintillion ");
        put(134, "Quadragintillion ");
        put(135, "Quadragintillion ");
        put(136, "Quadragintillion ");
        put(137, "Quadragintillion ");
        put(138, "Quadragintillion ");
        put(139, "Quadragintillion ");
        put(140, "Quadragintillion ");
        put(141, "Quadragintillion ");
        put(142, "Quadragintillion ");
        put(143, "Quadragintillion ");
        put(144, "Quadragintillion ");
        put(145, "Quadragintillion ");
        put(146, "Quadragintillion ");
        put(147, "Quadragintillion ");
        put(148, "Quadragintillion ");
        put(149, "Quadragintillion ");
        put(150, "Quadragintillion ");
        put(151, "Quadragintillion ");
        put(152, "Quadragintillion ");
        put(153, "Quadragintillion ");
        //---------------------------
        put(154, "Quinquagintillion ");
        put(155, "Quinquagintillion ");
        put(156, "Quinquagintillion ");
        put(157, "Quinquagintillion ");
        put(158, "Quinquagintillion ");
        put(159, "Quinquagintillion ");
        put(160, "Quinquagintillion ");
        put(161, "Quinquagintillion ");
        put(162, "Quinquagintillion ");
        put(163, "Quinquagintillion ");
        put(164, "Quinquagintillion ");
        put(165, "Quinquagintillion ");
        put(166, "Quinquagintillion ");
        put(167, "Quinquagintillion ");
        put(168, "Quinquagintillion ");
        put(169, "Quinquagintillion ");
        put(170, "Quinquagintillion ");
        put(171, "Quinquagintillion ");
        put(172, "Quinquagintillion ");
        put(173, "Quinquagintillion ");
        put(174, "Quinquagintillion ");
        put(175, "Quinquagintillion ");
        put(176, "Quinquagintillion ");
        put(177, "Quinquagintillion ");
        put(178, "Quinquagintillion ");
        put(179, "Quinquagintillion ");
        put(180, "Quinquagintillion ");
        put(181, "Quinquagintillion ");
        put(182, "Quinquagintillion ");
        put(183, "Quinquagintillion ");
        //----------------------------
        put(184, "Sexagintillion ");
        put(185, "Sexagintillion ");
        put(186, "Sexagintillion ");
        put(187, "Sexagintillion ");
        put(188, "Sexagintillion ");
        put(189, "Sexagintillion ");
        put(190, "Sexagintillion ");
        put(191, "Sexagintillion ");
        put(192, "Sexagintillion ");
        put(193, "Sexagintillion ");
        put(194, "Sexagintillion ");
        put(195, "Sexagintillion ");
        put(196, "Sexagintillion ");
        put(197, "Sexagintillion ");
        put(198, "Sexagintillion ");
        put(199, "Sexagintillion ");
        put(200, "Sexagintillion ");
        put(201, "Sexagintillion ");
        put(202, "Sexagintillion ");
        put(203, "Sexagintillion ");
        put(204, "Sexagintillion ");
        put(205, "Sexagintillion ");
        put(206, "Sexagintillion ");
        put(207, "Sexagintillion ");
        put(208, "Sexagintillion ");
        put(209, "Sexagintillion ");
        put(210, "Sexagintillion ");
        put(211, "Sexagintillion ");
        put(212, "Sexagintillion ");
        put(213, "Sexagintillion ");
        //-------------------------
        put(214, "Septuagintillion ");
        put(215, "Septuagintillion ");
        put(216, "Septuagintillion ");
        put(217, "Septuagintillion ");
        put(218, "Septuagintillion ");
        put(219, "Septuagintillion ");
        put(220, "Septuagintillion ");
        put(221, "Septuagintillion ");
        put(222, "Septuagintillion ");
        put(223, "Septuagintillion ");
        put(224, "Septuagintillion ");
        put(225, "Septuagintillion ");
        put(226, "Septuagintillion ");
        put(227, "Septuagintillion ");
        put(228, "Septuagintillion ");
        put(229, "Septuagintillion ");
        put(230, "Septuagintillion ");
        put(231, "Septuagintillion ");
        put(232, "Septuagintillion ");
        put(233, "Septuagintillion ");
        put(234, "Septuagintillion ");
        put(235, "Septuagintillion ");
        put(236, "Septuagintillion ");
        put(237, "Septuagintillion ");
        put(238, "Septuagintillion ");
        put(239, "Septuagintillion ");
        put(240, "Septuagintillion ");
        put(241, "Septuagintillion ");
        put(242, "Septuagintillion ");
        put(243, "Septuagintillion ");
        //-------------------------
        put(244, "Octogintillion ");
        put(245, "Octogintillion ");
        put(246, "Octogintillion ");
        put(247, "Octogintillion ");
        put(248, "Octogintillion ");
        put(249, "Octogintillion ");
        put(250, "Octogintillion ");
        put(251, "Octogintillion ");
        put(252, "Octogintillion ");
        put(253, "Octogintillion ");
        put(254, "Octogintillion ");
        put(255, "Octogintillion ");
        put(256, "Octogintillion ");
        put(257, "Octogintillion ");
        put(258, "Octogintillion ");
        put(259, "Octogintillion ");
        put(260, "Octogintillion ");
        put(261, "Octogintillion ");
        put(262, "Octogintillion ");
        put(263, "Octogintillion ");
        put(264, "Octogintillion ");
        put(265, "Octogintillion ");
        put(266, "Octogintillion ");
        put(267, "Octogintillion ");
        put(268, "Octogintillion ");
        put(269, "Octogintillion ");
        put(270, "Octogintillion ");
        put(271, "Octogintillion ");
        put(272, "Octogintillion ");
        put(273, "Octogintillion ");
        //------------------------
        put(274, "Nonagintillion ");
        put(275, "Nonagintillion ");
        put(276, "Nonagintillion ");
        put(277, "Nonagintillion ");
        put(278, "Nonagintillion ");
        put(279, "Nonagintillion ");
        put(280, "Nonagintillion ");
        put(281, "Nonagintillion ");
        put(282, "Nonagintillion ");
        put(283, "Nonagintillion ");
        put(284, "Nonagintillion ");
        put(285, "Nonagintillion ");
        put(286, "Nonagintillion ");
        put(287, "Nonagintillion ");
        put(288, "Nonagintillion ");
        put(289, "Nonagintillion ");
        put(290, "Nonagintillion ");
        put(291, "Nonagintillion ");
        put(292, "Nonagintillion ");
        put(293, "Nonagintillion ");
        put(294, "Nonagintillion ");
        put(295, "Nonagintillion ");
        put(296, "Nonagintillion ");
        put(297, "Nonagintillion ");
        put(298, "Nonagintillion ");
        put(299, "Nonagintillion ");
        put(300, "Nonagintillion ");
        put(301, "Nonagintillion ");
        put(302, "Nonagintillion ");
        put(303, "Nonagintillion ");
        //-------------------------
        put(304, "Centillion ");
        put(305, "Centillion ");
        put(306, "Centillion ");
        put(307, "Centillion ");
        put(308, "Uncentillion ");
        put(309, "Uncentillion ");
        put(310, "Uncentillion ");
        put(311, "Uncentillion ");
        put(312, "Uncentillion ");
        put(313, "Uncentillion ");
        put(314, "Uncentillion ");
        put(315, "Uncentillion ");
        put(316, "Uncentillion ");
        put(317, "Uncentillion ");
        put(318, "Uncentillion ");
        put(319, "Uncentillion ");
        put(320, "Uncentillion ");
        put(321, "Uncentillion ");
        put(322, "Uncentillion ");
        put(323, "Uncentillion ");
        put(324, "Uncentillion ");
        put(325, "Uncentillion ");
        put(326, "Uncentillion ");
        put(327, "Uncentillion ");
        put(328, "Uncentillion ");
        put(329, "Uncentillion ");
        put(330, "Uncentillion ");
        put(331, "Uncentillion ");
        put(332, "Uncentillion ");
        put(333, "Uncentillion ");
        //Decicentillion - 10^333
        //Undecicentillion - 10^336
        //Viginticentillion - 10^363
        //Unviginticentillion - 10^336
        //Trigintacentillion - 10^393
        //Quadragintacentillion - 10^423
        //Quinquagintacentillion - 10^453
        //Sexagintacentillion - 10^483
        //Septuagintacentillion - 10^513
        //Octogintacentillion - 10^543
        //Nonagintacentillion - 10^573
        //Ducentillion - 10^603
        //Trecentillion - 10^903
        //Quadringentillion - 10^1203
        //Quingentillion - 10^1503
        //Sescentillion - 10^1803
        //Septingentillion - 10^2103
        //Octingentillion - 10^2403
        //Nongentillion - 10^2703
        //Millinillion - 10^3003
    }};

    private static final String[] digits = {
            "",
            "One ",
            "Two ",
            "Three ",
            "Four ",
            "Five ",
            "Six ",
            "Seven ",
            "Eight ",
            "Nine "
    };

    private static final String[] tenToNineteen = {
            "Ten ",
            "Eleven ",
            "Twelve ",
            "Thirteen ",
            "Fourteen ",
            "Fifteen ",
            "Sixteen ",
            "Seventeen ",
            "Eighteen ",
            "Nineteen "
    };

    private static final String[] tens = {
            "",
            "Ten ",
            "Twenty ",
            "Thirty ",
            "Forty ",
            "Fifty ",
            "Sixty ",
            "Seventy ",
            "Eighty ",
            "Ninety "
    };

    private static final String[] hundreds = {
            "",
            "One hundred ",
            "Two hundred ",
            "Three hundred ",
            "Four hundred ",
            "Five hundred ",
            "Six hundred ",
            "Seven hundred ",
            "Eight hundred ",
            "Nine hundred "
    };

    private ArrayList<Byte> number;

    public myMagicNumber(BigInteger largeNumber) {
        this.number = new ArrayList<>();
        int lessThan = largeNumber.toString().length();

        for (int i = 0; i < lessThan; i++) {
            this.number.add(Byte.parseByte(largeNumber.remainder(new BigInteger("10")).toString()));
            largeNumber = largeNumber.divide(new BigInteger("10"));
        }
    }

    public void printNumberWithText() {
        int digitCount = number.size(); //4
        int remainder = digitCount % 3; //1
        ArrayList<Byte> removedDigits = new ArrayList<>();
        //StringBuilder object + cutAndPrint(); to return a String value -> In order to run unit tests.
        if (remainder == 1) {
            removedDigits.add(number.get(digitCount - 1));
            cutAndPrint(number.remove(digitCount - 1), digitCount);
            digitCount--;
        } else if (remainder == 2) {
            removedDigits.add(number.get(digitCount - 1));
            removedDigits.add(number.get(digitCount - 2));
            cutAndPrint(number.remove(digitCount - 1), number.remove(digitCount - 2), digitCount);
            digitCount -= 2;
        }

        int groupsOfThreeDigits = digitCount / 3;

        for (int i = 0; i < groupsOfThreeDigits; i++) {
            cutAndPrint(number.get((digitCount - 1)), number.get((digitCount - 2)), number.get((digitCount - 3)), digitCount);
            digitCount -= 3;
        }

        for (int i = 0; i < removedDigits.size(); i++) {
            number.add(removedDigits.get(i));
        }
    }

    private static void cutAndPrint(byte digit1, byte digit2, byte digit3, int indexOfDigit) {
        if (digit2 == 1 && digit3 == 0) { // x 1 0
            System.out.println(hundreds[digit1] + tens[digit2]);
        }else if (digit2 == 0 && digit3 == 0) { // x 0 0
            System.out.println(hundreds[digit1]);
        } else if (digit3 != 0 && digit2 == 0) { // x 0 !0
            System.out.println(hundreds[digit1] + digits[digit3] + amount.get(indexOfDigit));
        } else if (digit3 == 0 && digit2 != 0 && digit1 != 0) { // !0 !0 0
            System.out.println(hundreds[digit1] + tens[digit2] + amount.get(indexOfDigit));
        } else if (digit1 == 0 && digit2 == 0 && digit3 == 0) { // 0 0 0
            //do nothing.
        } else if (digit2 == 1 && digit1 == 0) { // 0 1 x
            System.out.println(tenToNineteen[digit3] + amount.get(indexOfDigit));
        } else if (digit1 == 0 && digit3 == 0){ // 0 x 0
            System.out.println(tens[digit2] + amount.get(indexOfDigit));
        } else if (digit2 == 1 && digit3 != 0) { //x 1 !0
            System.out.println(hundreds[digit1] + tenToNineteen[digit3] + amount.get(indexOfDigit));
        } else {
            System.out.println(hundreds[digit1] + tens[digit2] + digits[digit3] + amount.get(indexOfDigit));
        }
    }

    private static void cutAndPrint(byte digit1, int indexOfDigit) {
        System.out.print(digits[digit1] + amount.get(indexOfDigit));
    }

    private static void cutAndPrint(byte digit1, byte digit2, int indexOfDigit) {
        if (digit1 == 1) {
            System.out.print(tenToNineteen[digit2] + amount.get(indexOfDigit));
        } else {
            System.out.print(tens[digit1] + digits[digit2] + amount.get(indexOfDigit));
        }
    }
}
