import java.util.*;

class Maths {
    public void Quiz() {
        Scanner sc = new Scanner(System.in);// Creating a scanner class for taking user input
        Random rd = new Random();
        String[] str = { "+", "-", "*", "//" };
        var dict = new HashMap<String, Integer>(); // creating a hashmap with key as string and value as integer
        System.out.println("Welcome to the Math Quiz Test....");
        System.out.println(
                " @Description: This is a MathQuiz , test your Maths skills Here and boost up your Knowledge....");
        System.out.println("Let's test your math skills!...");
        System.out.println("Ready, let's go!");
        try {
            while (true) {
                int highestScore = 0;
                System.out.println("Enter Your Name: ");
                String name = sc.nextLine();
                for (int i = 0; i < 5; i++) { // Running loop for five times i.e 5 questions are raised
                    int var = rd.nextInt(10);
                    int var2 = rd.nextInt(10);
                    if (var2 == 0)
                        var2 = var2 + 1;
                    int opt = rd.nextInt(4);
                    String q = str[opt];
                    System.out.println(var + " " + q + " " + var2 + " Equals to...?");
                    System.out.println("Enter Your Answer Below --->: ");
                    int userAns = sc.nextInt();
                    int ans = 0;
                    switch (q) {
                        case "+":
                            ans = var + var2;
                            break;
                        case "-":
                            ans = var - var2;
                            break;
                        case "*":
                            ans = var * var2;
                            break;
                        case "//":
                            ans = var / var2;
                            break;
                    }
                    if (ans == userAns) {
                        System.out.println("Correct..");
                        highestScore++;
                    } else {
                        System.out.println("Incorrect..");
                    }
                }
                System.out.println("Total Questions: " + 5);
                System.out.println("Highest Score: " + highestScore);
                if (highestScore == 5) {
                    System.out.println("Excellent Score....");
                }
                dict.put(name, highestScore);
                System.out.println("If You want to continue press 1 else press any number: ");
                int rot = sc.nextInt();
                sc.nextLine();
                if (rot == 1) {
                    continue;
                } else {
                    break;
                }
            }
            sc.close();
            System.out.println("Results are: " + dict);
        } catch (Exception e) {
            System.out.println("Sorry! Wrong Format of answer entered....");
        }
    }
}

class Numguess {
    public void NumG() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Welcome to Mind-Reader Game....");
        System.out.println();
        System.out.println(
                " @Description: The System tries to find your Number i.e you thought in your Mind as Mind Reader...");
        System.out.println("Think of any number that you like!..");
        System.out.println("Enter the number of digits in your number:");
        int val = sc2.nextInt();
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lis.add(i);
        }
        int rang = (int) Math.ceil(10.0 / val);
        List<List<Integer>> mt = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < rang; i++) {
            List<Integer> empty = new ArrayList<>();
            for (int j = 0; j < val; j++) {
                System.out.print(lis.get(count) + " ");
                empty.add(lis.get(count));
                count++;
                if (count == 10) {
                    break;
                }
            }
            System.out.println();
            mt.add(empty);
        }
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            System.out.println("Enter the number array index value (row):");
            q.add(sc2.nextInt() - 1);
        }
        List<List<Integer>> sec = new ArrayList<>();
        for (int i : q) {
            System.out.println(mt.get(i));
            sec.add(mt.get(i));
        }
        List<Integer> fin = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            System.out.println("Enter the number index in column:");
            fin.add(sc2.nextInt() - 1);
        }
        String st = "";
        int count2 = 0;
        for (int i : fin) {
            st += sec.get(count2).get(i);
            count2++;
        }
        System.out.println(st);
        sc2.close();
    }
}

class Paper {
    public void decide() {
        Scanner sc3 = new Scanner(System.in); /* 0 pap 1 sci 2 sto */
        Random random = new Random();
        System.out.println("Welcome to the Game");
        System.out.println(
                " @Description: <---Stone--Paper--Scissor---> Choose Your option within this and enjoy playing with the computer and try to win commputer...");
        System.out.println("You Will have five Chances highest won will be declared as winner");
        System.out.println("0 : Paper");
        System.out.println("1 : Scissor");
        System.out.println("2 : Stone");
        System.out.println("Let's Begin select your Option");
        int comp = 0;
        int use = 0;
        for (int o = 1; o <= 5; o++) {
            int cominput = random.nextInt(2);
            System.out.println("User's choice ");
            int user = sc3.nextInt();
            System.out.println("Computer choice is!..>" + cominput);
            System.out.println();
            if (user == 0 && cominput == 1) {
                System.out.println("Computer Wins...");
                comp++;
            } else if (user == 0 && cominput == 2) {
                System.out.println("Hurray! You win...:)");
                use++;
            } else if (user == 0 && cominput == 0) {
                System.out.println("Alas! It's a tie.....");
            } else if (user == 1 && cominput == 0) {
                System.out.println("Hurray! You win...:)");
                use++;
            } else if (user == 1 && cominput == 2) {
                System.out.println("Computer Wins...");
                comp++;
            } else if (user == 1 && cominput == 1) {
                System.out.println("Alas! It's a tie.....");
            } else if (user == 2 && cominput == 0) {
                System.out.println("Computer Wins...");
                comp++;
            } else if (user == 2 && cominput == 1) {
                System.out.println("Hurray! You win...:)");
                use++;
            } else if (user == 2 && cominput == 2) {
                System.out.println("Alas! It's a tie....");
            } else {
                System.out.println("wrong choice entered");
            }
        }
        System.out.println("Completed!...results declared below --->:");
        if (use > comp)
            System.out.println("Congratulations!.... You Won the trophy :)");
        else
            System.out.println("Just Close Enough!.. You loose Good try Although ");
        sc3.close();
    }
}

class Love {
    public void love() {
        System.out.println("Welcome to Love Calculator...");
        System.out.println(" @Description: This is used to calculate your love bondage between your crush/Friend....");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String first = sc4.nextLine();
        System.out.println("Enter your crush/friend name: ");
        String second = sc4.nextLine();
        String Combine = (first + second).toLowerCase();
        int t = 0, r = 0, u = 0, e1 = 0, l = 0, o = 0, v = 0, e2 = 0;
        for (char c : Combine.toCharArray()) {
            if (c == 't') {
                t++;
            }
            if (c == 'r') {
                r++;
            }
            if (c == 'u') {
            }
            if (c == 'e') {
                e1++;
                e2++;
            }
            if (c == 'l') {
                l++;
            }
            if (c == 'o') {
                o++;
            }
            if (c == 'v') {
                v++;
            }
        }
        int mix = (t + r + u + e1) + 5;
        int mix2 = (l + o + v + e2) + 5;
        if (mix > 9) {
            mix = 9;
        }
        if (mix2 > 9) {
            mix2 = 9;
        }
        String tot = String.valueOf(mix);
        String tot1 = String.valueOf(mix2);
        String total = tot + tot1;
        System.out.println("Your true Bonding Percentage is: " + total + " %");
        sc4.close();
    }
}

public class Gbox {
    public static void main(String[] args) {
        Maths math = new Maths();
        Numguess num = new Numguess();
        Paper pap = new Paper();
        Love lov = new Love();
        System.out.println("Welcome to Gbox!...");
        System.out.println("Enjoy yourself with playing the exciting Games Here...");
        System.out.println("Press 1 to Display the Games to play for U....");
        Scanner sc1 = new Scanner(System.in);
        int opt = sc1.nextInt();
        if (opt == 1) {
            System.out.println("Here's The Exciting Games For You For Free Below --->:");
            System.out.println("     1. MathsQuiz Game...");
            System.out.println("     2. MindReader...");
            System.out.println("     3. StonePaperScisscor...");
            System.out.println("     4. Love Calculator...");
        } else {
            System.exit(0);
        }
        System.out.println("Select AnyOne From Them......");
        int gem = sc1.nextInt();
        if (gem == 1) {
            math.Quiz();
        }
        if (gem == 2) {
            num.NumG();
        }
        if (gem == 3) {
            pap.decide();
        }
        if (gem == 4) {
            lov.love();
        }
        sc1.close();
    }
}