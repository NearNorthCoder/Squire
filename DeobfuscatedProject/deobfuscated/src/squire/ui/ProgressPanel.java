/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import c.r.m.squireDir;
import squire.ui.ButtonHoverListener;
import squire.ui.DeleteButtonListener;
import squire.ui.RefreshButtonListener;
import squire.ui.ProgressHtmlLabel;
import squire.ui.LoginFrame;
import squire.auth.SquireAuthHandler;
import squire.ui.ComboBoxEditor;
import squire.ui.ThemeColors;
import squire.ui.ScrollBarUI;
import squire.ui.FontManager;
import squire.ui.LogoSidePanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.runelite.launcher.Launcher;

class ProgressPanel
extends JPanel {
    private final /* synthetic */ JScrollPane scrollPane;
    private final /* synthetic */ JLabel progressLabel;
    private final /* synthetic */ JPanel buttonPanel;
    private final /* synthetic */ JLabel descriptionLabel;
    static final /* synthetic */ Dimension PANEL_SIZE;
    private final /* synthetic */ JProgressBar progressBar;
    private /* synthetic */ DefaultComboBoxModel<String> accountModel;
    private static final /* synthetic */ int MAX_ACCOUNTS;
    public static final /* synthetic */ File SQUIRE_DIR;
    private final /* synthetic */ JLabel titleLabel;
    private final /* synthetic */ JLabel statusLabel;
    private static final /* synthetic */ Dimension PROGRESS_SIZE;
    private static /* synthetic */ String[] lllllI;
    private static /* synthetic */ int[] llllll;

    private static String lIIIIIIl(String llllIlIlIIllIII, String llllIlIlIIlIlIl) {
        try {
            SecretKeySpec llllIlIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlIlIIllIlI = Cipher.getInstance("Blowfish");
            llllIlIlIIllIlI.init(llllll[3], llllIlIlIIllIll);
            return new String(llllIlIlIIllIlI.doFinal(Base64.getDecoder().decode(llllIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIlIIllIIl) {
            llllIlIlIIllIIl.printStackTrace();
            return null;
        }
    }

    public JLabel L() {
        return this.titleLabel;
    }

    private static String lIIIIIII(String llllIlIIlllIIIl, String llllIlIIlllIIII) {
        try {
            SecretKeySpec llllIlIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), llllll[16]), "DES");
            Cipher llllIlIIlllIlIl = Cipher.getInstance("DES");
            llllIlIIlllIlIl.init(llllll[3], llllIlIIlllIllI);
            return new String(llllIlIIlllIlIl.doFinal(Base64.getDecoder().decode(llllIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIIlllIlII) {
            llllIlIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIll() {
        llllll = new int[29];
        z.llllll[0] = (0x5F ^ 0x47 ^ (0x91 ^ 0x86)) & (0x3D ^ 0x44 ^ (0x52 ^ 0x24) ^ -1);
        z.llllll[1] = 1;
        z.llllll[2] = 0xA0 ^ 0xC4;
        z.llllll[3] = 2;
        z.llllll[4] = 0x1C ^ 0x7E ^ (0xC5 ^ 0xAC);
        z.llllll[5] = 0x53 ^ 0x4A;
        z.llllll[6] = 0x76 ^ 0x56;
        z.llllll[7] = 0x89 ^ 0x9D;
        z.llllll[8] = 0x31 ^ 0x6F ^ (0x3F ^ 0x7E);
        z.llllll[9] = 3;
        z.llllll[10] = 0x69 ^ 0x63;
        z.llllll[11] = 0x21 ^ 0x13;
        z.llllll[12] = 0x2E ^ 0x33 ^ (0x49 ^ 0x51);
        z.llllll[13] = 0x86 ^ 0x82;
        z.llllll[14] = 0x73 ^ 0x75;
        z.llllll[15] = 0xAF ^ 0xA8;
        z.llllll[16] = 0xDD ^ 0x87 ^ (0x69 ^ 0x3B);
        z.llllll[17] = 0xA4 ^ 0xAD;
        z.llllll[18] = 0x5A ^ 0x60 ^ (0x4E ^ 0x5C);
        z.llllll[19] = 118 + 35 - 130 + 179 ^ 87 + 71 - 88 + 128;
        z.llllll[20] = 136 + 58 - 86 + 71 ^ 61 + 157 - 205 + 177;
        z.llllll[21] = 0x30 ^ 0x3E;
        z.llllll[22] = 4 + 123 - 15 + 25 ^ 95 + 17 - -11 + 11;
        z.llllll[23] = 0xA2 ^ 0xB2;
        z.llllll[24] = 0x7E ^ 0x5E ^ (0x52 ^ 0x63);
        z.llllll[25] = 0x54 ^ 0x46;
        z.llllll[26] = 0xD4 ^ 0xC7;
        z.llllll[27] = 0x7E ^ 0x60;
        z.llllll[28] = 0xB6 ^ 0xA3;
    }

    private static boolean lIIIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIII(Object object) {
        return object != null;
    }

    public JPanel g() {
        return this.buttonPanel;
    }

    private static void lIIIIIlI() {
        lllllI = new String[llllll[28]];
        z.lllllI[z.llllll[0]] = z."Squire Launcher";
        z.lllllI[z.llllll[1]] = z."Doing something important";
        z.lllllI[z.llllll[3]] = z."Private client for Oldschool with the best technology and the best people.";
        z.lllllI[z.llllll[9]] = z."Would you like to launch the stable or nightly version?";
        z.lllllI[z.llllll[13]] = z."Select your Jagex account!";
        z.lllllI[z.llllll[12]] = z."launcher.dat";
        z.lllllI[z.llllll[14]] = z.":";
        z.lllllI[z.llllll[15]] = z."You do not have any Jagex accounts imported, running the importer...";
        z.lllllI[z.llllll[16]] = z."Squire Launcher";
        z.lllllI[z.llllll[17]] = z."Launch";
        z.lllllI[z.llllll[10]] = z."Delete selected account";
        z.lllllI[z.llllll[4]] = z."Import more accounts";
        z.lllllI[z.llllll[19]] = z."launcher.dat";
        z.lllllI[z.llllll[20]] = z.":";
        z.lllllI[z.llllll[21]] = z."
";
        z.lllllI[z.llllll[22]] = z."launcher.dat";
        z.lllllI[z.llllll[23]] = z.":";
        z.lllllI[z.llllll[24]] = z."<html";
        z.lllllI[z.llllll[25]] = z."You do not have any Jagex accounts imported, running the importer...";
        z.lllllI[z.llllll[26]] = z."Squire Launcher";
        z.lllllI[z.llllll[7]] = z."user.home";
    }

    z(boolean bl) {
        JComponent jComponent;
        this.titleLabel = new JLabel(lllllI[llllll[0]]);
        this.progressLabel = new JLabel(lllllI[llllll[1]]);
        this.progressBar = new JProgressBar(llllll[0], llllll[2]);
        this.setPreferredSize(PANEL_SIZE);
        this.setLayout(new GridBagLayout());
        this.setBackground(k.BACKGROUND_COLOR);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = llllll[3];
        gridBagConstraints.anchor = llllll[4];
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridx = llllll[0];
        gridBagConstraints.gridy = llllll[0];
        gridBagConstraints.ipady = llllll[5];
        this.titleLabel.setFont(new Font(m.j().getName(), m.j().getStyle(), llllll[6]));
        this.titleLabel.setHorizontalAlignment(llllll[0]);
        this.titleLabel.setForeground(Color.WHITE);
        this.add((Component)this.titleLabel, gridBagConstraints);
        gridBagConstraints.gridy += llllll[1];
        this.descriptionLabel = this.a(lllllI[llllll[3]]);
        if (z.lIIIIlII(bl ? 1 : 0)) {
            jComponent = this.H();
            0;
            
        } else {
            z llllIlIlllIIIII;
            jComponent = llllIlIlllIIIII.descriptionLabel;
        }
        this.scrollPane = new JScrollPane(jComponent, llllll[7], llllll[8]);
        this.scrollPane.setBorder(new EmptyBorder(llllll[0], llllll[0], llllll[0], llllll[0]));
        this.scrollPane.getVerticalScrollBar().setUI(new l());
        JViewport jViewport = this.scrollPane.getViewport();
        jViewport.setForeground(Color.WHITE);
        jViewport.setBackground(k.BACKGROUND_COLOR);
        jViewport.setOpaque(llllll[1]);
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = llllll[1];
        this.add((Component)this.scrollPane, gridBagConstraints);
        gridBagConstraints.gridy += llllll[1];
        this.statusLabel = this.a(lllllI[llllll[9]]);
        this.add((Component)this.statusLabel, gridBagConstraints);
        gridBagConstraints.gridy += llllll[1];
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new GridLayout(llllll[1], llllll[3], llllll[10], llllll[10]));
        this.buttonPanel.setBorder(new EmptyBorder(llllll[11], llllll[10], llllll[11], llllll[10]));
        this.buttonPanel.setBackground(k.BACKGROUND_COLOR);
        this.buttonPanel.setOpaque(llllll[1]);
        this.statusLabel.setVisible(llllll[0]);
        this.buttonPanel.setVisible(llllll[0]);
        this.add((Component)this.buttonPanel, gridBagConstraints);
        gridBagConstraints.gridy += llllll[1];
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.ipady = llllll[12];
        this.progressLabel.setFont(m.j());
        this.progressLabel.setHorizontalAlignment(llllll[0]);
        this.progressLabel.setForeground(Color.WHITE);
        this.progressLabel.setBorder(new EmptyBorder(llllll[12], llllll[0], llllll[12], llllll[0]));
        this.add((Component)this.progressLabel, gridBagConstraints);
        gridBagConstraints.gridy += llllll[1];
        this.progressBar.setBackground(k.SECONDARY_COLOR.darker());
        this.progressBar.setForeground(k.PRIMARY_COLOR);
        this.progressBar.setMinimumSize(PROGRESS_SIZE);
        this.progressBar.setMaximumSize(PROGRESS_SIZE);
        this.progressBar.setBorder(new MatteBorder(llllll[0], llllll[0], llllll[0], llllll[0], Color.LIGHT_GRAY));
        this.progressBar.setUI(new squireDir(this));
        this.progressBar.setFont(m.j());
        this.progressBar.setVisible(llllll[1]);
        this.add((Component)this.progressBar, gridBagConstraints);
        gridBagConstraints.gridy += llllll[1];
    }

    void i(String string) {
        this.titleLabel.setText(string);
        this.titleLabel.revalidate();
        this.titleLabel.repaint();
    }

    public JButton g(String string, String string2) {
        JButton jButton = new JButton(string);
        jButton.setToolTipText(string2);
        jButton.setPreferredSize(new Dimension(llllll[18], llllll[18]));
        jButton.setFont(new Font(m.j().getName(), m.o().getStyle(), llllll[23]));
        jButton.setForeground(Color.WHITE);
        jButton.setOpaque(llllll[0]);
        jButton.setContentAreaFilled(llllll[0]);
        jButton.setFocusPainted(llllll[0]);
        jButton.setBorder(BorderFactory.createLineBorder(k.BORDER_COLOR));
        jButton.setCursor(Cursor.getPredefinedCursor(llllll[19]));
        this.buttonPanel.add(jButton);
        0;
        return jButton;
    }

    void h(String object) {
        if (z.lIIIlIII(object) && z.lIIIlIIl(((String)object).startsWith(lllllI[llllll[24]]) ? 1 : 0)) {
            object = "<html><div style='text-align:center;'>" + (String)object + "</div></html>";
        }
        this.descriptionLabel.setText((String)object);
        this.descriptionLabel.revalidate();
        this.descriptionLabel.repaint();
    }

    public JLabel M() {
        return this.descriptionLabel;
    }

    private static boolean lIIIIlII(int n2) {
        return n2 != 0;
    }

    void K() {
        this.statusLabel.setVisible(llllll[1]);
        this.buttonPanel.setVisible(llllll[1]);
        this.titleLabel.revalidate();
        this.titleLabel.repaint();
    }

    public JLabel O() {
        return this.progressLabel;
    }

    private static String lllllll(String llllIlIlIIIlIII, String llllIlIlIIIIIlI) {
        llllIlIlIIIlIII = new String(Base64.getDecoder().decode(llllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIlIIIIllI = new StringBuilder();
        char[] llllIlIlIIIIlIl = llllIlIlIIIIIlI.toCharArray();
        int llllIlIlIIIIlII = llllll[0];
        char[] llllIlIIllllllI = llllIlIlIIIlIII.toCharArray();
        int llllIlIIlllllIl = llllIlIIllllllI.length;
        int llllIlIIlllllII = llllll[0];
        while (z.lIIIlIlI(llllIlIIlllllII, llllIlIIlllllIl)) {
            char llllIlIlIIIlIIl = llllIlIIllllllI[llllIlIIlllllII];
            llllIlIlIIIIllI.append((char)(llllIlIlIIIlIIl ^ llllIlIlIIIIlIl[llllIlIlIIIIlII % llllIlIlIIIIlIl.length]));
            0;
            ++llllIlIlIIIIlII;
            ++llllIlIIlllllII;
            0;
            if (((0xF7 ^ 0xAA) & ~(0x14 ^ 0x49)) >= 0) continue;
            return null;
        }
        return String.valueOf(llllIlIlIIIIllI);
    }

    public JProgressBar P() {
        return this.progressBar;
    }

    private static boolean lIIIIlll(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void I() {
        Object llllIlIlIlllIll2;
        Object llllIlIlIllllII2;
        Closeable llllIlIlIllllIl2;
        void llllIlIllIIIIII;
        z llllIlIllIIIIIl;
        Object object = this.accountModel.getSelectedItem();
        if (z.lIIIIlll(object)) {
            return;
        }
        llllIlIllIIIIIl.accountModel.removeElement(llllIlIllIIIIII);
        File llllIlIlIllllll = new File(SQUIRE_DIR, lllllI[llllll[19]]);
        ArrayList<Object> llllIlIlIlllllI = new ArrayList<Object>();
        try {
            llllIlIlIllllIl2 = new Scanner(llllIlIlIllllll);
            try {
                while (z.lIIIIlII(((Scanner)llllIlIlIllllIl2).hasNextLine() ? 1 : 0)) {
                    llllIlIlIllllII2 = ((Scanner)llllIlIlIllllIl2).nextLine();
                    llllIlIlIlllIll2 = ((String)llllIlIlIllllII2).split(lllllI[llllll[20]]);
                    if (z.lIIIIlIl(((String[])llllIlIlIlllIll2).length, llllll[12])) {
                        String llllIlIlIlllIlI = llllIlIlIlllIll2[llllll[13]];
                        if (z.lIIIIlII(llllIlIlIlllIlI.equalsIgnoreCase(llllIlIllIIIIII.toString()) ? 1 : 0)) {
                            0;
                            continue;
                            return;
                        }
                        llllIlIlIlllllI.add(llllIlIlIllllII2);
                        0;
                    }
                    0;
                    if (-(0x17 ^ 0x4B ^ (0x12 ^ 0x4A)) <= 0) continue;
                    return;
                }
                ((Scanner)llllIlIlIllllIl2).close();
                0;
            }
            catch (Throwable llllIlIlIllllII2) {
                try {
                    ((Scanner)llllIlIlIllllIl2).close();
                    0;
                }
                catch (Throwable llllIlIlIlllIll2) {
                    llllIlIlIllllII2.addSuppressed(llllIlIlIlllIll2);
                }
                if (((0x5A ^ 0xC) & ~(0x41 ^ 0x17)) > 0) {
                    return;
                }
                throw llllIlIlIllllII2;
            }
            if (-(0xE9 ^ 0x8A ^ (0x51 ^ 0x36)) >= 0) {
                return;
            }
            0;
        }
        catch (FileNotFoundException llllIlIlIllllIl2) {
            // empty catch block
        }
        
        try {
            llllIlIlIllllll.createNewFile();
            0;
            llllIlIlIllllIl2 = new FileWriter(llllIlIlIllllll, llllll[0]);
            try {
                llllIlIlIllllII2 = llllIlIlIlllllI.iterator();
                while (z.lIIIIlII(llllIlIlIllllII2.hasNext() ? 1 : 0)) {
                    llllIlIlIlllIll2 = (String)llllIlIlIllllII2.next();
                    ((Writer)llllIlIlIllllIl2).write((String)llllIlIlIlllIll2);
                    ((Writer)llllIlIlIllllIl2).write(lllllI[llllll[21]]);
                    0;
                    if (3 == 3) continue;
                    return;
                }
            }
            catch (Throwable llllIlIlIllllII2) {
                try {
                    ((OutputStreamWriter)llllIlIlIllllIl2).close();
                    0;
                }
                catch (Throwable llllIlIlIlllIll2) {
                    llllIlIlIllllII2.addSuppressed(llllIlIlIlllIll2);
                }
                
                throw llllIlIlIllllII2;
            }
            ((OutputStreamWriter)llllIlIlIllllIl2).close();
            0;
            if (-4 > 0) {
                return;
            }
            0;
        }
        catch (IOException llllIlIlIllllIl2) {
            llllIlIlIllllIl2.printStackTrace();
        }
        if (2 < 0) {
            return;
        }
    }

    public DefaultComboBoxModel<String> Q() {
        return this.accountModel;
    }

    private JLabel a(String string) {
        E e = new E(this, "<html><div style='text-align:center;'>" + string + "</div></html>");
        e.setFont(new Font(m.j().getName(), m.o().getStyle(), llllll[23]));
        e.setForeground(Color.WHITE);
        e.setBorder(new EmptyBorder(llllll[0], llllll[22], llllll[0], llllll[22]));
        return e;
    }

    /*
     * WARNING - void declaration
     */
    private void J() {
        z llllIlIlIllIIll;
        a.a();
        this.accountModel.removeAllElements();
        File file = new File(SQUIRE_DIR, lllllI[llllll[22]]);
        ArrayList<String> llllIlIlIllIIIl = new ArrayList<String>();
        try {
            void llllIlIlIllIIlI;
            Scanner llllIlIlIllIIII = new Scanner((File)llllIlIlIllIIlI);
            try {
                while (z.lIIIIlII(llllIlIlIllIIII.hasNextLine() ? 1 : 0)) {
                    String llllIlIlIlIllll = llllIlIlIllIIII.nextLine();
                    String[] llllIlIlIlIlllI = llllIlIlIlIllll.split(lllllI[llllll[23]]);
                    if (z.lIIIIlIl(llllIlIlIlIlllI.length, llllll[12])) {
                        llllIlIlIllIIIl.add(llllIlIlIlIlllI[llllll[13]]);
                        0;
                    }
                    0;
                    if (1 >= -1) continue;
                    return;
                }
                llllIlIlIllIIII.close();
                0;
            }
            catch (Throwable llllIlIlIlIllll) {
                try {
                    llllIlIlIllIIII.close();
                    0;
                }
                catch (Throwable llllIlIlIlIlllI) {
                    llllIlIlIlIllll.addSuppressed(llllIlIlIlIlllI);
                }
                
                throw llllIlIlIlIllll;
            }
            if (((0x2E ^ 0x7A) & ~(0x55 ^ 1)) > 2) {
                return;
            }
            0;
        }
        catch (FileNotFoundException llllIlIlIllIIII) {
            // empty catch block
        }
        if ((62 & (0x34 ^ 0x7E ^ (0x17 ^ 0x63) ^ -1)) >= 1) {
            return;
        }
        llllIlIlIllIIll.accountModel.addAll(llllIlIlIllIIIl);
        if (z.lIIIIllI(llllIlIlIllIIll.accountModel.getSize())) {
            llllIlIlIllIIll.accountModel.setSelectedItem(llllIlIlIllIIll.accountModel.getElementAt(llllll[0]));
        }
    }

    private static boolean lIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public JLabel N() {
        return this.statusLabel;
    }

    static {
        z.lIIIIIll();
        z.lIIIIIlI();
        MAX_ACCOUNTS = llllll[22];
        SQUIRE_DIR = new File(System.getProperty(lllllI[llllll[7]]) + "/.squire/");
        PANEL_SIZE = new Dimension(L.WINDOW_SIZE.width - q.ao.width, L.WINDOW_SIZE.height);
        PROGRESS_SIZE = new Dimension(z.PANEL_SIZE.width, llllll[27]);
    }

    /*
     * WARNING - void declaration
     */
    private JPanel H() {
        void var1_1;
        void var2_2;
        z llllIlIllIlIIlI;
        block13: {
            GridBagConstraints llllIlIllIlIIIl = new GridBagConstraints();
            llllIlIllIlIIIl.fill = llllll[3];
            llllIlIllIlIIIl.anchor = llllll[4];
            llllIlIllIlIIIl.weightx = 1.0;
            llllIlIllIlIIIl.ipady = llllll[10];
            llllIlIllIlIIIl.gridy = llllll[0];
            llllIlIllIlIIIl.gridx = llllll[1];
            llllIlIllIlIIIl.insets = new Insets(llllll[10], llllll[0], llllll[0], llllll[0]);
            JPanel llllIlIllIlIIII = new JPanel(new GridBagLayout());
            llllIlIllIlIIII.setBorder(new EmptyBorder(llllll[0], llllll[5], llllll[0], llllll[5]));
            llllIlIllIlIIII.setBackground(null);
            JLabel llllIlIllIIllll = new JLabel(lllllI[llllll[13]]);
            llllIlIllIIllll.setForeground(Color.WHITE);
            llllIlIllIlIIII.add((Component)llllIlIllIIllll, llllIlIllIlIIIl);
            llllIlIllIlIIIl.gridy += llllll[1];
            llllIlIllIlIIlI.accountModel = new DefaultComboBoxModel();
            File llllIlIllIIlllI = new File(SQUIRE_DIR, lllllI[llllll[12]]);
            if (!z.lIIIIlII(llllIlIllIIlllI.exists() ? 1 : 0)) break block13;
            ArrayList<String> llllIlIllIIllIl = new ArrayList<String>();
            try {
                Scanner llllIlIllIIllII = new Scanner(llllIlIllIIlllI);
                try {
                    while (z.lIIIIlII(llllIlIllIIllII.hasNextLine() ? 1 : 0)) {
                        String llllIlIllIIlIll = llllIlIllIIllII.nextLine();
                        String[] llllIlIllIIlIlI = llllIlIllIIlIll.split(lllllI[llllll[14]]);
                        if (z.lIIIIlIl(llllIlIllIIlIlI.length, llllll[12])) {
                            llllIlIllIIllIl.add(llllIlIllIIlIlI[llllll[13]]);
                            0;
                        }
                        0;
                        if (1 != ((0xAE ^ 0xB9) & ~(0xA4 ^ 0xB3))) continue;
                        return null;
                    }
                    llllIlIllIIllII.close();
                    0;
                }
                catch (Throwable llllIlIllIIlIll) {
                    try {
                        llllIlIllIIllII.close();
                        0;
                    }
                    catch (Throwable llllIlIllIIlIlI) {
                        llllIlIllIIlIll.addSuppressed(llllIlIllIIlIlI);
                    }
                    if ((0x19 ^ 0x6E ^ (7 ^ 0x74)) <= 1) {
                        return null;
                    }
                    throw llllIlIllIIlIll;
                }
                
                0;
            }
            catch (FileNotFoundException llllIlIllIIllII) {
                throw new RuntimeException(llllIlIllIIllII);
            }
            if (1 >= 3) {
                return null;
            }
            if (z.lIIIIlII(llllIlIllIIllIl.isEmpty() ? 1 : 0)) {
                JOptionPane.showMessageDialog(llllIlIllIlIIlI, lllllI[llllll[15]], lllllI[llllll[16]], llllll[0]);
                llllIlIllIlIIlI.J();
            }
            llllIlIllIlIIlI.accountModel.addAll(llllIlIllIIllIl);
        }
        if (z.lIIIIllI(llllIlIllIlIIlI.accountModel.getSize())) {
            llllIlIllIlIIlI.accountModel.setSelectedItem(llllIlIllIlIIlI.accountModel.getElementAt(llllll[0]));
        }
        JComboBox<String> jComboBox = new JComboBox<String>(this.accountModel);
        jComboBox.setEditor(new g(k.INPUT_BACKGROUND));
        jComboBox.setBackground(k.INPUT_BACKGROUND);
        jComboBox.setForeground(Color.WHITE);
        var2_2.add(jComboBox, var1_1);
        var1_1.gridy += llllll[1];
        JButton jButton = new JButton(lllllI[llllll[17]]);
        jButton.setBackground(k.INPUT_BACKGROUND);
        jButton.setSize(new Dimension(llllll[2], llllll[18]));
        jButton.setForeground(Color.WHITE);
        jButton.setFocusPainted(llllll[0]);
        jButton.setFont(m.j());
        jButton.setBorder(new MatteBorder(llllll[1], llllll[1], llllll[1], llllll[1], Color.BLACK));
        jButton.setOpaque(llllll[1]);
        jButton.addActionListener(arg_0 -> this.a((JPanel)var2_2, jComboBox, arg_0));
        jButton.addMouseListener(new B(this, jButton));
        jButton.setCursor(Cursor.getPredefinedCursor(llllll[19]));
        var2_2.add((Component)jButton, var1_1);
        var1_1.gridy += llllll[1];
        JButton jButton2 = new JButton(lllllI[llllll[10]]);
        jButton2.setBackground(k.INPUT_BACKGROUND);
        jButton2.setSize(new Dimension(llllll[2], llllll[18]));
        jButton2.setForeground(Color.WHITE);
        jButton2.setFocusPainted(llllll[0]);
        jButton2.setFont(m.j());
        jButton2.setBorder(new MatteBorder(llllll[1], llllll[1], llllll[1], llllll[1], Color.BLACK));
        jButton2.setOpaque(llllll[1]);
        jButton2.addActionListener(actionEvent -> this.I());
        jButton2.addMouseListener(new C(this, jButton2));
        jButton2.setCursor(Cursor.getPredefinedCursor(llllll[19]));
        var2_2.add((Component)jButton2, var1_1);
        var1_1.gridy += llllll[1];
        JButton jButton3 = new JButton(lllllI[llllll[4]]);
        jButton3.setBackground(k.INPUT_BACKGROUND);
        jButton3.setSize(new Dimension(llllll[2], llllll[18]));
        jButton3.setForeground(Color.WHITE);
        jButton3.setFocusPainted(llllll[0]);
        jButton3.setFont(m.j());
        jButton3.setBorder(new MatteBorder(llllll[1], llllll[1], llllll[1], llllll[1], Color.BLACK));
        jButton3.setOpaque(llllll[1]);
        jButton3.addActionListener(actionEvent -> this.J());
        jButton3.addMouseListener(new D(this, jButton3));
        jButton3.setCursor(Cursor.getPredefinedCursor(llllll[19]));
        var2_2.add((Component)jButton3, var1_1);
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void a(JPanel jPanel, JComboBox jComboBox, ActionEvent actionEvent) {
        if (!z.lIIIIlII(this.accountModel.getSize()) || z.lIIIIlll(this.accountModel.getSelectedItem())) {
            z llllIlIlIlIIlII;
            void llllIlIlIlIIIll;
            JOptionPane.showMessageDialog((Component)llllIlIlIlIIIll, lllllI[llllll[25]], lllllI[llllll[26]], llllll[0]);
            llllIlIlIlIIlII.J();
            return;
        }
        jPanel.removeAll();
        String string = jComboBox.getSelectedItem().toString();
        JLabel jLabel = new JLabel("Launching into " + string);
        jLabel.setForeground(Color.WHITE);
        jPanel.add(jLabel);
        0;
        Launcher.d(string);
    }
}
