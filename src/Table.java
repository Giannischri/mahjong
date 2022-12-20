/*Γιαννης Χριστοδουλου icsd17222
κωνσταντινος Πλατσατουρας icsd17159*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*χρηση των καταλληλων βιβλιοθηκων για την διαχειρηση των λιστων και τον gui compontents*/
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;

/*δημιουργια κλασης table στην οποια υλοποιουνται οι συναρτησεις των παρακατω κλασεων που κληρονομουνται */
public class Table extends JFrame implements  Player,Hints, Tiles, ActionListener {

    static List<String> x = new ArrayList<>();

    private static void GridLayout(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int z = 0;
    /*αρχικοποιηση του ακεραιου z kai h o οποιος βοηθαει στην σωστη χρηση των Hints(ποσες φορες μπορει να χρησημοποιησει ο χρηστης την καθε βοηθεια)*/
    int h = 0;
    int score = 0;
    /*ακεραιος σκορ ο οποιος μετραει τους ποντους του παιχτη*/
    static List<String> ftiles = new ArrayList<>();
    /*λιστα για εισαγωγη ελευθερων πλακιδιων*/
    static List<String> l = new ArrayList<>();
    /*λιστα για εισαγωγη των βαμπου,κυκλου και χαρακτηρα τυπου  πλακιδιων*/
    static List<String> f = new ArrayList<>();
    /*λιστα για εισαγωγη πλακιδιων τυποθ flower*/
    static List<String> s = new ArrayList<>();
    /*λιστα για εισαγωγη πλακιδιων τυπου season*/
    static List<String> ke = new ArrayList<>();
    /*λιστα για εισαγωγη των κενων που θα περιεχει το ταμπλο*/
    static List<String> a1 = new ArrayList<>();
    /*λιστες για τα πλακιδια της καθε πιστας*/
    static List<String> a2 = new ArrayList<>();
    static List<String> a3 = new ArrayList<>();
    static List<String> a4 = new ArrayList<>();
    JFrame frame = new JFrame("Stage1");
    /*δηλωση των καταλληλων frame για το καθε παραθυρο*/
    JFrame frame2 = new JFrame("Stag2");
    JFrame frame3 = new JFrame("Stage3");
    JFrame frame4 = new JFrame("Stage4");
    JFrame grules = new JFrame("Game Rules");
    JFrame sb = new JFrame("Player Score");
    JFrame about = new JFrame("About");
    JFrame menu = new JFrame("Main Menu");
    JFrame hc = new JFrame("Choose Help");
    JFrame helps = new JFrame("Ηelp Setup");
    JPanel pa1 = new JPanel();
    /*δηλωση των πανελ της καθε πιστας*/
    JPanel pa2 = new JPanel();
    JPanel pa3 = new JPanel();
    JPanel pa4 = new JPanel();

    JButton[] mbuttons = new JButton[5];
    /*δηλωση κουμπιων μενου*/
    JButton back = new JButton("Back");
    JButton back2 = new JButton("Back");
    JButton back3 = new JButton("Back");
    /*δηλωση κουμπιων back*/
    JButton back4 = new JButton("Back");
    JButton back5 = new JButton("Back");
    JButton back6 = new JButton("Back");
    JButton[] sbuttons = new JButton[4];
    /*δηλωση κουμπιων επιλογης πιστας*/
    JButton help = new JButton("Help");
    /*δηλωση κουμπιων help*/
    JButton help2 = new JButton("Help");
    JButton help3 = new JButton("Help");
    JButton help4 = new JButton("Help");
    JButton[] dbuttons = new JButton[3];
    /*δηλωση κουμπιων για την επιλογη δυσκολιας*/
    JButton[] hbuttons = new JButton[4];

    /*δηλωση κουμπιων για την επιλογη απο το μενου βοηθειας*/

 /*υλοποιηση της 1ης πιστας¨:    abstract μεθοδος απο την abstract κλαση stage1*/
    public void stage1() {
        System.out.println("stage bitch");
        /*ουσιαστικα δημιουργειται ενα πανελ με τα κουμπια σε gridlayout 12x13 Και ενα πανελ με κουμπια αλλαγης πιστας,βοηθειας και εξοδου,τα οποια εισαγωνται σε ενα μεγαλυτερο πανελ το pa1*/
        frame.setLayout(new FlowLayout());
        /*διαταξη flowlayout για το frame */
        frame.setVisible(true);
        /*εμφανιζει το frame*/
        frame.setPreferredSize(new Dimension(1000, 900));
        /*θετει διαστασεις*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*σε περιπτωση που ο χρηστης πατησει χ τοτε το φρειμ κλεινει*/
        frame.pack();
        /*προσπαθει να κανει το frame να ειναι ακριβος στο μεγεθος του πανελ*/

        JButton[] buttons = new JButton[156];
        /*δημιουργια 156 καινουργιων κουμπιων για το ταμπλο*/
        for (int i = 0; i < 156; i++) {
            buttons[i] = new JButton(a1.get(i));
            /*ονομασια κουμπιων με βαζει των στοιχειων της λιστας a1*/
            String png = a1.get(i).toString().concat(".png");/*δημιουργια στρινγκ το οποιο στο ονομα του καθε κουμπιου εχει και το .png στο τελος ,,,ωστε να φορτωσουν οι εικονες */
            try{
            Image img = ImageIO.read(getClass().getResource("resources/"+png));
            buttons[i].setIcon(new ImageIcon(img));/*θετει την εικονα στο καθε κουμπι αναλογα με το ειδος του*/
            System.out.println(png);
            }catch (Exception ex) {
                System.out.println(ex);
              }
            
        }

        JPanel p1 = new JPanel();
        /*δημιουργια νεου πανελ για τα πλακιδια-κουμπια της πιστας*/

        for (int i = 0; i < 156; i++) {
            p1.add(buttons[i]);
            /*βαζει τα 156 κουμπια στο πανελ*/
        }

        p1.setLayout(new GridLayout(12, 13));
        /*διαταξη gridlayout 12x13 ωστε να δημιουργηθει ενα πλεγα 12χ13 με τα κουμπια μεσα*/
        p1.setPreferredSize(new Dimension(1000, 900));
        /*θετει το μεγεθος*/
        p1.setBackground(Color.black);/*θετει το χρωμα απο πισω στο κοκκινο*/
        p1.setVisible(true);/*εμφανιζει το πανελ p1*/
        JPanel p11 = new JPanel();
        /*δημιουργια πανελ για την επιλογη πιστων βοηθειας και εξοδου μεσω κουμπιων*/
        p11.setLayout(new BoxLayout(p11, BoxLayout.Y_AXIS));
        /*διαταξη boxlayout για το πανελ P11 η οποια θα βαλει τα κουμια το ενα κατω απο το αλλο*/
        p11.setBounds(61, 11, 81, 140);
        /*θετει ορια του πανελ*/
        sbuttons[1] = new JButton("Stage2");
        /*δινει ονομασια στο κουμπι*/
        sbuttons[1].setFont(new Font("Consolas", Font.BOLD, 20));/*αλλαζει το φοντο του κουμπιου καθως και το μεγεθος και ειδος των γραμματων που περιεχει*/
        sbuttons[1].setBounds(50, 70, 150, 30);/*θετει ορια κουμπιου*/
        sbuttons[2] = new JButton("Stage3");
        sbuttons[2].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[2].setBounds(50, 70, 150, 30);
        sbuttons[3] = new JButton("Stage4");
        sbuttons[3].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[3].setBounds(50, 70, 150, 30);
        sbuttons[1].addActionListener(this);
        /*δινει στο κουμπι ενεργει οταν πατηθει*/
        sbuttons[2].addActionListener(this);
        sbuttons[3].addActionListener(this);
        help.addActionListener(this);
        back.addActionListener(this);
        help.setFont(new Font("Consolas", Font.BOLD, 20));
        help.setBounds(50, 70, 150, 30);
        for (int i = 1; i < 4; i++) {
            p11.add(sbuttons[i]);
            /*βαζει ολα τα κουμπια για την επιλογη της πιστας στο πανελ p1*/

        }
        p11.add(help);
        /*Καθως και τα κουμπια help και back*/
        p11.setBackground(Color.BLACK);
        /*αλλαζει το χρωμα του πισω μερος του πανελ p11*/
        p11.add(back);

        pa1.setBackground(Color.DARK_GRAY);/*αλλαζει το χρωμα του πιστω μερος του πανελ pa1*/
        pa1.setVisible(true);
        pa1.add(p1);
        /*βαζει το πανελ με το ταμπλο και το πανελ με τα κουμπια πιστας κτλπ στο πανελ pa1*/
        pa1.add(p11);
        frame.setContentPane(pa1);
        /*εισαγει το pa1 στο φρειμ*/

        frame.pack();

    }

    /*υλοποιηση της 2ης πιστας*/
    public void stage2() {
        /*πανομοιοτυπη υλοποιηση με του stage1*/
        frame2.setLayout(new FlowLayout());
        frame2.setVisible(true);
        frame2.setPreferredSize(new Dimension(1000, 900));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();

        JButton[] buttons = new JButton[156];
        for (int i = 0; i < 156; i++) {
            buttons[i] = new JButton(a2.get(i));
            String png = a2.get(i).toString().concat(".png");
            try{
                Image img = ImageIO.read(getClass().getResource("resources/"+png));
                buttons[i].setIcon(new ImageIcon(img));/*θετει την εικονα στο καθε κουμπι αναλογα με το ειδος του*/
                System.out.println(png);
                }catch (Exception ex) {
                    System.out.println(ex);
                  }
        }
        JPanel p2 = new JPanel();

        for (int i = 0; i < 156; i++) {
            p2.add(buttons[i]);

        }

        p2.setLayout(new GridLayout(12, 13));
        p2.setPreferredSize(new Dimension(1000, 900));
        p2.setBackground(Color.black);
        p2.setVisible(true);
        JPanel p22 = new JPanel();
        p22.setLayout(new BoxLayout(p22, BoxLayout.Y_AXIS));
        p22.setBounds(61, 11, 81, 140);
        sbuttons[0] = new JButton("Stage1");
        sbuttons[0].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[0].setBounds(50, 70, 150, 30);
        sbuttons[2] = new JButton("Stage3");
        sbuttons[2].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[2].setBounds(50, 70, 150, 30);
        sbuttons[3] = new JButton("Stage4");
        sbuttons[3].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[3].setBounds(50, 70, 150, 30);
        help2.setFont(new Font("Consolas", Font.BOLD, 20));
        help2.setBounds(50, 70, 150, 30);
        sbuttons[0].addActionListener(this);
        sbuttons[2].addActionListener(this);
        sbuttons[3].addActionListener(this);
        back2.addActionListener(this);
        help2.addActionListener(this);
        p22.setBackground(Color.BLACK);
        p22.add(sbuttons[0]);
        p22.add(sbuttons[2]);
        p22.add(sbuttons[3]);
        p22.add(back2);
        p22.add(help2);

        pa2.setVisible(true);
        pa2.add(p2);
        pa2.add(p22);
        pa2.setBackground(Color.DARK_GRAY);
        frame2.setContentPane(pa2);

        frame2.pack();

    }

    /*υλοποιηση της 3ης πιστας*/
    public void stage3() {
        /*πανομοιοτυπη υλοποιηση με του stage1*/
        frame3.setLayout(new FlowLayout());
        frame3.setVisible(true);
        frame3.setPreferredSize(new Dimension(1000, 900));
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();

        JButton[] buttons = new JButton[156];
        for (int i = 0; i < 156; i++) {
            buttons[i] = new JButton(a3.get(i));
            String png = a3.get(i).toString().concat(".png");
            try{
                Image img = ImageIO.read(getClass().getResource("resources/"+png));
                buttons[i].setIcon(new ImageIcon(img));/*θετει την εικονα στο καθε κουμπι αναλογα με το ειδος του*/
                System.out.println(png);
                }catch (Exception ex) {
                    System.out.println(ex);
                  }
        }

        JPanel p3 = new JPanel();

        for (int i = 0; i < 156; i++) {
            p3.add(buttons[i]);

        }

        p3.setLayout(new GridLayout(12, 13));
        p3.setPreferredSize(new Dimension(1000, 900));
        p3.setBackground(Color.black);
        p3.setVisible(true);
        JPanel p33 = new JPanel();
        p33.setLayout(new BoxLayout(p33, BoxLayout.Y_AXIS));
        p33.setBounds(61, 11, 81, 140);
        sbuttons[0] = new JButton("Stage1");
        sbuttons[0].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[0].setBounds(50, 70, 150, 30);
        sbuttons[1] = new JButton("Stage2");
        sbuttons[1].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[1].setBounds(50, 70, 150, 30);
        sbuttons[3] = new JButton("Stage4");
        sbuttons[3].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[3].setBounds(50, 70, 150, 30);
        help3.setFont(new Font("Consolas", Font.BOLD, 20));
        help3.setBounds(50, 70, 150, 30);
        sbuttons[0].addActionListener(this);
        sbuttons[1].addActionListener(this);
        sbuttons[3].addActionListener(this);
        help3.addActionListener(this);
        back3.addActionListener(this);
        p33.setBackground(Color.BLACK);
        p33.add(sbuttons[0]);
        p33.add(sbuttons[1]);
        p33.add(sbuttons[3]);
        p33.add(back3);
        p33.add(help3);

        pa3.setVisible(true);
        pa3.add(p3);
        pa3.add(p33);
        pa3.setBackground(Color.DARK_GRAY);
        frame3.setContentPane(pa3);

        frame3.pack();

    }

    /*υλοποιηση της 4ης πιστας*/
    public void stage4() {
        /*πανομοιοτυπη υλοποιηση με του stage1*/
        frame4.setLayout(new FlowLayout());
        frame4.setVisible(true);
        frame4.setPreferredSize(new Dimension(1000, 900));
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.pack();

        JButton[] buttons = new JButton[156];
        for (int i = 0; i < 156; i++) {
            buttons[i] = new JButton(a4.get(i));
            String png = a4.get(i).concat(".png");
            try{
                Image img = ImageIO.read(getClass().getResource("resources/"+png));
                buttons[i].setIcon(new ImageIcon(img));/*θετει την εικονα στο καθε κουμπι αναλογα με το ειδος του*/
                System.out.println(png);
                }catch (Exception ex) {
                    System.out.println(ex);
                  }
        }
       // System.out.println(System.getProperty("user.dir"));
        JPanel p4 = new JPanel();
        for (int i = 0; i < 156; i++) {
            p4.add(buttons[i]);
        }
        p4.setLayout(new GridLayout(12, 13));
        p4.setPreferredSize(new Dimension(1000, 900));
        p4.setBackground(Color.black);
        p4.setVisible(true);
        JPanel p44 = new JPanel();
        p44.setLayout(new BoxLayout(p44, BoxLayout.Y_AXIS));
        p44.setBounds(61, 11, 81, 140);
        sbuttons[0] = new JButton("Stage1");
        sbuttons[0].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[0].setBounds(50, 70, 150, 30);
        sbuttons[1] = new JButton("Stage2");
        sbuttons[1].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[1].setBounds(50, 70, 150, 30);
        sbuttons[2] = new JButton("Stage3");
        sbuttons[2].setFont(new Font("Consolas", Font.BOLD, 20));
        sbuttons[2].setBounds(50, 70, 150, 30);
        help4.setFont(new Font("Consolas", Font.BOLD, 20));
        help4.setBounds(50, 70, 150, 30);
        sbuttons[0].addActionListener(this);
        sbuttons[1].addActionListener(this);
        sbuttons[2].addActionListener(this);
        help4.addActionListener(this);
        back4.addActionListener(this);
        p44.setBackground(Color.BLACK);
        p44.add(sbuttons[0]);
        p44.add(sbuttons[1]);
        p44.add(sbuttons[2]);
        p44.add(back4);
        p44.add(help4);

        pa4.setVisible(true);
        pa4.add(p4);
        pa4.add(p44);
        pa4.setBackground(Color.DARK_GRAY);

        frame4.setContentPane(pa4);

        frame4.pack();

    }

    public void Menu() {
        /*μεθοδος η οποια διαχειριζεται το κεντρικο μενου του παιχνιδιου*/
        menu.setSize(1500, 900);
        /*θετει καποιες ιδιαιτεροτητες για το φρειμ του μενου(μεγεθος κτλπ)*/
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
        JLabel mainmenu = new JLabel("Main Menu");
        /*δημιουργια jlabel main menu */
        mainmenu.setFont(new Font("Italic", Font.PLAIN, 30));
        /*διαμορφωνει την γραμματοσειρα του jlabel*/

        mbuttons[0] = new JButton("New Game");/*δημιουργια νεου κουμπιου με ονομα ¨:new game*/
        mbuttons[0].setFont(new Font("Consolas", Font.BOLD, 20));/*διαμορφωνει την γραμματοσειρα και το φοντο του κουμπιου*/
        mbuttons[0].setBounds(50, 70, 150, 30);/*θετει τα ορια του κουμπιου*/

        mbuttons[1] = new JButton("Exit Game");
        mbuttons[1].setFont(new Font("Consolas", Font.BOLD, 20));
        mbuttons[1].setBounds(50, 70, 150, 30);

        mbuttons[2] = new JButton("Help");
        mbuttons[2].setFont(new Font("Consolas", Font.BOLD, 20));
        mbuttons[2].setBounds(50, 70, 150, 30);

        mbuttons[3] = new JButton("About");
        mbuttons[3].setFont(new Font("Consolas", Font.BOLD, 20));
        mbuttons[3].setBounds(50, 70, 150, 30);

        mbuttons[4] = new JButton("Player score");
        mbuttons[4].setFont(new Font("Consolas", Font.BOLD, 20));
        mbuttons[4].setBounds(50, 70, 150, 30);

        JPanel mp = new JPanel();
        /*δημιουργια νεου πανελ για την εισαγωγη των κουμπιων του μενου*/
        mp.setBackground(Color.red);
        mp.setBounds(61, 11, 81, 140);
        mp.setLayout(new BoxLayout(mp, BoxLayout.Y_AXIS));/*διαταξη boxlayout yaxis ωστε τα κουμπια να τοποθετηθουν το ενα κατω απο το αλλο*/
        mp.add(mainmenu);
        for (int i = 0; i < 5; i++) {
            /*εισαγει το jlabel και τα κουμπια στο πανελ mp*/
            mp.add(mbuttons[i]);
        }
        mbuttons[0].addActionListener(this);
        mbuttons[1].addActionListener(this);
        /*οταν πατηθουν τα κουμπια θα εκτελεσουν καποια ενεργεια*/
        mbuttons[2].addActionListener(this);
        mbuttons[3].addActionListener(this);
        mbuttons[4].addActionListener(this);
        menu.setContentPane(mp);
        /*θετει το περιεχομενο του φρειμ ως το πανελ mp*/
        menu.pack();

    }

    @Override
    public void buildtiles() {
        /*συναρτηση buildtiles η οποια γεμιζει τα ειδη πλακιδιων στις λιστες ,οπως και τα ελευθερα*/
        int i = 0;
        int j = 0;
        String[] ch = {"ch1", "ch2", "ch3", "ch4", "ch5", "ch6", "ch7", "ch8", "ch9"};
        /*δημιουργια πινακων με strings τα πλακιδια character (θα βοηθησει στην υλοποιηση των λιστων*/
        String[] ci = {"ci1", "ci2", "ci3", "ci4", "ci5", "ci6", "ci7", "ci8", "ci9"};
        /*πινακας πλακιδιων circle*/
        String[] ba = {"ba1", "ba2", "ba3", "ba4", "ba5", "ba6", "ba7", "ba8", "ba9"};/*πινακας πλακιδιων babboo*/
        String[] se = {"se1", "se2", "se3", "se4"};/*πινακας πλακιδιων season*/
        String[] fl = {"fl1", "fl2", "fl3", "fl4"};/*πινακας πλακιδιων flower*/
        for (int k = 0; k < 4; k++) {
            /*με δομη for αφου υπαρχουν 4 σετ πλακιδιων εισαγει καθε πλακιδιο ειδους character στην λιστα l*/
            for (i = 0; i < 9; i++) {
                l.add(j, ch[i]);
                j++;
            }
        }
        for (int k = 0; k < 4; k++) {/*εισαγωγη πλακιδιων τυπου babboo στην λιστα l*/
            for (i = 0; i < 9; i++) {
                l.add(j, ba[i]);
                j++;
            }
        }
        for (int k = 0; k < 4; k++) {
            /*εισαγωγη πλακιδιων τυπου circle στην λιστα l*/
            for (i = 0; i < 9; i++) {
                l.add(j, ci[i]);
                j++;
            }
        }
        j = 0;
        for (int k = 0; k < 2; k++) {
            /*εισαγωγη πλακιδιων τυπου flower στην λιστα f*/
            for (i = 0; i < 4; i++) {
                f.add(j, fl[i]);
                j++;
            }
        }
        j = 0;
        for (int k = 0; k < 2; k++) {
            /*εισαγωγη πλακιδιων τυπου season στην λιστα s*/
            for (i = 0; i < 4; i++) {
                s.add(j, se[i]);
                j++;
            }
        }
        j = 0;
        for (int k = 0; k < 32; k++) {
            /*εισαγωγη "κενο" στην λιστα ke*/
            ke.add(j, "keno");
            j++;
        }

        a1.addAll(l);
        /*καταλληλες υλοποιησεις ωστε οι λιστες a1,a2,a3,a4 να περιεχουν ολα τα στοιχεια των l,f,s,ke*/
        a1.addAll(s);
        a1.addAll(f);
        a1.addAll(ke);
        a2.addAll(a1);
        a3.addAll(a1);
        a4.addAll(a1);
        Collections.shuffle(a1);
        /*ανακατεμα των λιστων στην αρχη του παιχνιδιου*/
        Collections.shuffle(a2);
        Collections.shuffle(a3);
        Collections.shuffle(a4);
        String[][] S = new String[12][13];
        /*δημιουργια πινακα 12χ13 τυπου string ο οποιος θα μας βοηθησει να βρουμε τα ελευθερα πλακιδια&*/
        int k = 0;
        /*δεν εχει υλοποιηθει πληρως αφου δεν λειτουργουν οι επιλογεσ του παιχτη πανω στο ταμπλο*/
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 13; j++) {
                S[i][j] = a2.get(k);
                /*βαζει τα στοιχεια της λιστας a2 στον πινακα*/
                k++;
            }
        }
        k = 0;

        for (i = 0; i < 12; i++) {
            if (S[i][0] == "keno") {
                /* οταν βρει κενο στην πιο αριστερη στηλη του πινακα*/
                ftiles.add(k, S[i][1]);
                k++;

            } else if (S[i][12] == "keno") {
                /*οταν βρει κενο στην πιο δεξια στηλη του πινακα*/
                ftiles.add(k, S[i][11]);
                k++;
            }
        }
        for (i = 0; i < 12; i++) /*σκαναρει ολο τον πινακα*/ {
            for (j = 1; j < 12; j++) {
                if (S[i][j] != "keno") /*αν βρει κατι διαφορο του κενου*/ {
                    if (S[i][j + 1] == "keno" || S[i][j - 1] == "keno") /*και εχει ειτε δεξια ειτε αριστερα κενο */ {
                        ftiles.add(k, S[i][j]);
                        k++;
                    }
                   
                    /*εισαγει τα στοιχεια στην λιστα ftiles(ελευθερα πλακιδια)*/
                }
            }
        }

    }

    @Override
    public void about() {
/*υλοποιηση του frame about το οποιο ειναι προσβασιμο απο το μενου και περιεχει πληροφοριεσ σχετικα με τους κατασκευαστες του παιχνιδιου*/
        JPanel ab = new JPanel(); /*δημιουργια νεου πανελ ab*/
        JTextArea ta = new JTextArea( /*δημιουργια jtextarea η οποια θα περιεχει το κειμενο*/
                "A game made by J.Christodoulou and K.Platsatouras"
                + ".The team worked hard to make this game and minor bugs may occur,"
                + "so feel free to send them to us", 6, 20);
        ta.setFont(new Font("Serif", Font.ITALIC, 25));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);       /*καταλληλες συναρτησεις για την διαμορφωση του jtextarea*/
        ta.setOpaque(false);
        ta.setEditable(false);
        ab.setLayout(new CardLayout()); /*cardlayout για το πανελ ab */
        ab.setVisible(true);
        ab.setBackground(Color.red);
        ab.add(ta);                /*βαζει τα κουμπια στο πανελ ab*/
        ab.add(back5);
        back5.setFont(new Font("Consolas", Font.BOLD, 20));   /*διαμορφωση του κουμπιου back*/
        back5.setBounds(50, 70, 150, 30);                
        back5.addActionListener(this);   /*δινει ιδιοτητα στο κουμπι οταν πατηθει να εκτελεσει κατι*/
        about.setContentPane(ab);   /*εισαγωγη του πανελ στο φρειμ*/
        about.setVisible(true);    /*εμφανιση φρειμ*/
        about.pack();

    }

    @Override
    public void gamerules() {
/*υλοποιηση του φρειμ gamerules το οποιο ενημερωνει τον χρηστη σχετικα με τους κανονες του παιχνιδιου*/
        JPanel pgr = new JPanel(); /*δημιουργια πανελ pgr το οποιο θα περιεχει το panel pgr2 kai pgr3*/
        JPanel pgr2 = new JPanel();
        JPanel pgr3 = new JPanel();
        JTextArea ta = new JTextArea( /*δημιουργια Jtextarea ta το οποιο θα περιεχει το επιθυμητο κειμενο*/
                "You have to pair up the free tiles. "
                + "A tiles is free when there is blank either to its left or to its right."
                + "Pairs must be identifical.Season type tiles can pair up together and Flower type too. "
                + "You win when there are no tiles on the table", 6, 20);
        ta.setFont(new Font("Serif", Font.ITALIC, 25));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);   /*διαφορες συναρτησεις για την διαμορφωση του ta*/
        ta.setOpaque(false);
        ta.setEditable(false);
        pgr.setLayout(new CardLayout()); /*pgr οριζεται σε cardlayout και εισαγεται σε αυτο το ta*/
        pgr.setBackground(Color.red);
        pgr.setVisible(true);
        pgr.add(ta);
        back6.setFont(new Font("Consolas", Font.BOLD, 20)); /*διαμορφωση του κουμπιου μπακ*/
        back6.setBounds(50, 70, 150, 30);
        back6.addActionListener(this);
        pgr2.add(back6);
        pgr2.setBackground(Color.GREEN);  /*εισαγωγη του κουμπιου στο pgr2*/
        pgr2.setVisible(true);
        pgr3.setVisible(true);
        pgr3.setBackground(Color.BLACK);
        pgr3.add(pgr2);  /*εισαγει το πανελ pgr2 kai pgr στο πανελ pgr3*/
        pgr3.add(pgr);
        grules.setVisible(true);
        grules.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grules.getContentPane().add(pgr3); /*θετει το περιεχομενο του frame ως το πανελ pgr3*/

        grules.pack();
    }

    @Override /*συναρτηση η οποια ελεγχει τα κουμπια*/
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mbuttons[1]) {
            System.exit(0);  /*αν ο χρηστης επιλεξει απο το μενου το exit game*/
        } else if (e.getSource() == mbuttons[0]) {
            helpsetup();   /*αν ο χρηστης επιλεξει απο το μενου το new game φορτωνει την συναρτηση helpsetup η οποια εμφανιζει το αντιστοιχο frame*/

        } else if (e.getSource() == mbuttons[2]) {
            gamerules();   /*αν ο χρηστης επιλεξει απο το μενου το help*/
        } else if (e.getSource() == mbuttons[3]) {
            about();         /*αν ο χρηστης επιλεξει απο το μενου το about*/
        } else if (e.getSource() == mbuttons[4]) {
            scoreboard();         /*αν ο χρηστης επιλεξει απο το μενου το scoreboard*/
        } else if (e.getSource() == sbuttons[0]) {
            stage1();                     /*αν ο χρηστης επιλεξει απο το παιχνιδι την πιστα 1*/
            frame2.setVisible(false);      /*κλεινει ολα τα frame Πιστων(αμα ειναι ανοιχτα)*/
            frame3.setVisible(false);
            frame4.setVisible(false);
        } else if (e.getSource() == sbuttons[1]) {
            stage2();                      /*αν ο χρηστης επιλεξει απο το παιχνιδι την πιστα 2*/
            frame.setVisible(false);
            frame3.setVisible(false);          /*κλεινει ολα τα frame Πιστων(αμα ειναι ανοιχτα)*/
            frame4.setVisible(false);

        } else if (e.getSource() == sbuttons[2]) {
            stage3();                       /*αν ο χρηστης επιλεξει απο το παιχνιδι την πιστα 3*/
            frame2.setVisible(false);
            frame.setVisible(false);               /*κλεινει ολα τα frame Πιστων(αμα ειναι ανοιχτα)*/
            frame4.setVisible(false);
        } else if (e.getSource() == sbuttons[3]) {
            stage4();                         /*αν ο χρηστης επιλεξει απο το παιχνιδι την πιστα 4*/
            frame.setVisible(false);
            frame2.setVisible(false);                   /*κλεινει ολα τα frame Πιστων(αμα ειναι ανοιχτα)*/
            frame3.setVisible(false);
        } else if (e.getSource() == back) {
            frame.setVisible(false);     /*αν επιλεξει το back στην πιστα 1 τοτε την κλεινει και εμφανιζει το μενου*/
            menu.setVisible(true);
        } else if (e.getSource() == back2) {
            frame2.setVisible(false);        /*αν επιλεξει το back στην πιστα 2 τοτε την κλεινει και εμφανιζει το μενου*/
            menu.setVisible(true);
        } else if (e.getSource() == back3) {
            frame3.setVisible(false);
            menu.setVisible(true);         /*αν επιλεξει το back στην πιστα 3 τοτε την κλεινει και εμφανιζει το μενου*/
        } else if (e.getSource() == back4) {
            frame4.setVisible(false);
            menu.setVisible(true);        /*αν επιλεξει το back στην πιστα 4 τοτε την κλεινει και εμφανιζει το μενου*/
        } else if (e.getSource() == back5) {
            about.setVisible(false);        /*αν επιλεξει το back στο παραθυρο about τοτε τo κλεινει και εμφανιζει το μενου*/
            menu.setVisible(true);
        } else if (e.getSource() == back6) {
            grules.setVisible(false);        /*αν επιλεξει το back στο παραθυρο gamerules τοτε τo κλεινει και εμφανιζει το μενου*/
            menu.setVisible(true);
        } else if (e.getSource() == help || e.getSource() == help2 || e.getSource() == help3 || e.getSource() == help4) {
            helpchoose();     /*αν ο χρηστης επιλεξει οποιοδηποτε help*/
        } else if (e.getSource() == dbuttons[0]) {  /*αν ο χρηστης επιλεξει ευκολο*/
            z = 3;                       
            h = 3;  /*οριζει τα ζ και η τα οποια ειναι ποσες φορες μπορει να χρησημοποιησει τις 2 πρωτες και τις 2 τελευταιες βοηθειες*/
            helps.setVisible(false);  /*κλεινει το παραθυρο που επιλεγει δυσκολια*/
            stage1();                 /*φορτωνει stage 2*/
        } else if (e.getSource() == dbuttons[1]) { /*αν ο χρηστης επιλεξει κανονικο*/
            z = 2; /*οριζει τα ζ και η τα οποια ειναι ποσες φορες μπορει να χρησημοποιησει τις 2 πρωτες και τις 2 τελευταιες βοηθειες*/
            h = 2;
            helps.setVisible(false); /*κλεινει το παραθυρο που επιλεγει δυσκολια*/
            stage2();   /*φορτωνει stage 3*/
        } else if (e.getSource() == dbuttons[2]) {  /*αν ο χρηστης επιλεξει δυσκολο*/
            z = 1;  /*οριζει τα ζ και η τα οποια ειναι ποσες φορες μπορει να χρησημοποιησει τις 2 πρωτες και τις 2 τελευταιες βοηθειες*/
            h = 1;
            helps.setVisible(false); /*κλεινει το παραθυρο που επιλεγει δυσκολια*/
            stage3(); /*φορτωνει stage 4*/
        } else if (e.getSource() == hbuttons[0]) { /*οταν ο χρηστης επιλεξει show free tiles*/
            helps.setVisible(false); /*κλεινουν τα παραθυρα βοηθειας και εκτελειται η showfreetiles*/
            showfreetiles();         
            hc.setVisible(false);
        } else if (e.getSource() == hbuttons[1]) { /*οταν ο χρηστης επιλεξει refresh tiles*/
            help.setVisible(false);
            tilesrefresh(); /*κλεινουν τα παραθυρα βοηθειας και εκτελειται η tilesrefresh*/
            hc.setVisible(false);
        } else if (e.getSource() == hbuttons[2]) { /*οταν ο χρηστης επιλεξει show free pair*/
            help.setVisible(false);
            showfreepair();            /*κλεινουν τα παραθυρα βοηθειας και εκτελειται η showfreepair*/
            hc.setVisible(false);
        } else if (e.getSource() == hbuttons[3]) { /*οταν ο χρηστης επιλεξει random free pair*/
            help.setVisible(false);
            randomfreepair();          /*κλεινουν τα παραθυρα βοηθειας και εκτελειται η random free pair*/
            hc.setVisible(false);
        }
    }

    @Override
    public void showfreetiles() {
        
        /*μεθοδος η οποια ανηκει στο interface hints και εμφανιζει τα ελευθερα πλακιδια στο ταμπλο*/
        
        /*λογο ελειψης χρονου η παρακατω συναρτηση δεν υλοποιηθηκε στην 2η φαση...πιθανον με την χρηση της ftiles θα αλλαζει χρωμα στα κουμπια ωστε να ειναι ευκολα αντιληπτα απο τον χρηστη
       /* int k = 0;

        for (int i = 0; i < 12; i++) {
            /*σκαναρει ολο τον πινακα
            for (int j = 0; j < 13; j++) {
                if (T[i][j] != " ") {
                    /*σε περιπτωση που βρει πλακιδιο
                    if (T[i][j + 1] == " " || T[i][j - 1] == " ") {
                        /*και αν ειναι ελευθερο
                        if (x.contains(T[i][j])) {
                            /*και ανηκει στην παραπανω λιστα των ελευθερων πλακιδιων
                            String x = T[i][j].replace(",", "!");
                            /*δημιουργει καινουργιο string και αντικαθηστα το κομμα με ερωτηματικο στο πλακιδιο
                            T[i][j] = x;
                        }
                    }
                }
            }
        }

        System.out.println("Free Tiles are marked !");
        for (String[] row : T) {
            /*εκτυπωνει πινακα
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                if (T[i][j] != " ") {
                    /*ιδια μεθοδος με την παραπανω για να επιστρεψει στην κανονικη του μορφη,δεν γινεται να φαινονται συνεχεια τα ελευθερα
                    if (T[i][j + 1] == " " || T[i][j - 1] == " ") {

                        String y = T[i][j].replace("!", ",");
                        T[i][j] = y;

                    }
                }
            }
        }*/

    }

    @Override
    public void tilesrefresh() {
        /*μεθοδος που ανηκει στο interface hints ..."ανακατευει" τα πλακιδια*/

        
        Collections.shuffle(a1); /*ανακατεμα των λιστων της καθε πιστας*/
        Collections.shuffle(a2);
        Collections.shuffle(a3);
        Collections.shuffle(a4);
        stage1();

    }

    @Override
    public void showfreepair() {
        /*μεθοδος εμφανισης ελευθερου ζευγαριου apo interface hints(δεν εχει υλοποιηθει πληρως ακομα*/
 /*παρομια υλοποιηση με την συναρτηση showfreetiles*/
 /*
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                if (T[i][j] != " ") {
                    if (T[i][j + 1] == " " || T[i][j - 1] == " ") {
                        if (x.contains(T[i][j])) {
                            String x = T[i][j].replace(",", "!");
                            T[i][j] = x;

                        }
                    }

                }

            }
        }
        for (String[] row : T) {
            System.out.println(Arrays.toString(row));
        }
*/
    }

    @Override
    public void randomfreepair() {
        /*
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                if (T[i][j] != " ") {
                    if (T[i][j + 1] == " " || T[i][j - 1] == " ") {
                        if (x.contains(T[i][j])) {
                            String x = T[i][j].replace(",", "!");
                            T[i][j] = x;
                        }
                    }

                }
            }
        }
        for (String[] row : T) {
            System.out.println(Arrays.toString(row));
        }
*/
    }

    @Override
    public void helpsetup() {
        /*μεθοδος που ανηκει στο Interface hints και οριζει ποσες βοηθειες μπορει να επιλεξει ο χρηστης*/

        JPanel ph = new JPanel(new FlowLayout()); /*δημιουργια νεου πανελ με flowlayout*/
        JLabel ds = new JLabel("Please select difficulty");  /*δημιουργια label */
        dbuttons[0] = new JButton("Easy");     /*ορισμος των κουμπιων για την επιλογη δυσκολιας*/
        dbuttons[1] = new JButton("Normal");
        dbuttons[2] = new JButton("Hard");
        for (int i = 0; i < 3; i++) {
            dbuttons[i].setFont(new Font("Consolas", Font.BOLD, 20));  /*διαμορφωση των κουμπιων*/
            dbuttons[i].setBounds(50, 70, 150, 30);
            dbuttons[i].addActionListener(this);

        }
        ph.add(ds);       /*εισαγωγη των κουμπιων και του Jlabel στο πανελ ph*/
        ph.add(dbuttons[0]);
        ph.add(dbuttons[1]);
        ph.add(dbuttons[2]);
        ph.setBackground(Color.red);
        ph.setVisible(true);
        helps.setVisible(true);
        helps.setContentPane(ph);  /*θετει το περιεχομενο του frame ως το πανελ πη*/
        helps.pack();

    }

    @Override
    public void helpchoose() {
        /*μεθοδος που ανηκει στο interface hints και δινει την δυνατοτητα στον χρηστη να επιλεξει ειδος βοηθειας*/

        JPanel hcp = new JPanel(new FlowLayout()); /*δημιουργια πανελ*/
        hbuttons[0] = new JButton("Show free tiles");   /*ορισμος κουμπιων*/
        hbuttons[1] = new JButton("Refresh the board tiles");
        hbuttons[2] = new JButton("Show a free pair of tiles");
        hbuttons[3] = new JButton("Delete a free pair");
        for (int i = 0; i < 4; i++) {
            hbuttons[i].setFont(new Font("Consolas", Font.BOLD, 20));
            hbuttons[i].setBounds(50, 70, 150, 30);     /*διαμορφωση κουμπιων*/
            hbuttons[i].addActionListener(this);

        }
        hcp.add(hbuttons[0]);
        hcp.add(hbuttons[1]);    /*εισαγωγη κουμπιων στο πανελ*/
        hcp.add(hbuttons[2]);
        hcp.add(hbuttons[3]);
        hcp.setBackground(Color.red);
        hcp.setVisible(true);
        hc.setVisible(true);
        hc.setContentPane(hcp); /*θετει το περιεχομενο του frame ως το πανελ hcp*/
        hc.pack();

    }

    @Override
    public void scoreboard() {
        /*Μεθοδος η οποια ανοιγει παραθυρο και αναγραφει την βαθμολογια του χρηστη αναλογα με τα πλακιδια που εχει αφαιρεσει*/
        JPanel sbp = new JPanel(new FlowLayout());/*δημιουργια νεου πανελ*/
        sbp.setBackground(Color.red);
        sbp.setVisible(true);
        JLabel sbm = new JLabel("Current User Points:" + score); /*δημιουργια label το οποιο αναγραφει το score*/
        sbp.add(sbm);
        sbp.setVisible(true);
        sb.setContentPane(sbp);
        sb.setVisible(true);
        sb.pack();
    }

}
