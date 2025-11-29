/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.h;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.event.EventListenerList;

class g
implements ComboBoxEditor {
    protected /* synthetic */ EventListenerList V;
    private static /* synthetic */ int[] llIIIl;
    private static /* synthetic */ String[] llIIII;
    protected final /* synthetic */ JButton U;

    private static String lIlllll(String llllIllllllIIII, String llllIlllllIllll) {
        llllIllllllIIII = new String(Base64.getDecoder().decode(llllIllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlllllIlllI = new StringBuilder();
        char[] llllIlllllIllIl = llllIlllllIllll.toCharArray();
        int llllIlllllIllII = llIIIl[0];
        char[] llllIlllllIIllI = llllIllllllIIII.toCharArray();
        int llllIlllllIIlIl = llllIlllllIIllI.length;
        int llllIlllllIIlII = llIIIl[0];
        while (g.llIIlIl(llllIlllllIIlII, llllIlllllIIlIl)) {
            char llllIllllllIIIl = llllIlllllIIllI[llllIlllllIIlII];
            llllIlllllIlllI.append((char)(llllIllllllIIIl ^ llllIlllllIllIl[llllIlllllIllII % llllIlllllIllIl.length]));
            "".length();
            ++llllIlllllIllII;
            ++llllIlllllIIlII;
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllIlllllIlllI);
    }

    private static boolean llIIIll(int n) {
        return n >= 0;
    }

    @Override
    public void selectAll() {
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void setItem(Object object) {
        if (g.llIIIlI(object instanceof Color)) {
            Color color = (Color)object;
            this.U.setBackground(color);
            "".length();
            if (((43 + 32 - -38 + 20 ^ 120 + 23 - 108 + 124) & (0x36 ^ 0x3B ^ (0xE ^ 0x19) ^ -" ".length())) == 0) return;
            return;
        }
        try {
            g lllllIIIIIIIlll;
            void lllllIIIIIIIllI;
            Color lllllIIIIIIIlIl = Color.decode(lllllIIIIIIIllI.toString());
            lllllIIIIIIIlll.U.setBackground(lllllIIIIIIIlIl);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        "".length();
        if (-(0x20 ^ 0x25) < 0) return;
        return;
    }

    /*
     * WARNING - void declaration
     */
    protected void a(Color color) {
        Object[] objectArray = this.V.getListenerList();
        int llllIllllllllII = objectArray.length - llIIIl[1];
        while (g.llIIIll(llllIllllllllII)) {
            void llllIllllllllIl;
            if (g.llIIlII(llllIllllllllIl[llllIllllllllII], ActionListener.class)) {
                void llllIlllllllllI;
                g llllIllllllllll;
                ActionEvent llllIlllllllIll = new ActionEvent(llllIllllllllll.U, llIIIl[2], llllIlllllllllI.toString());
                ((ActionListener)llllIllllllllIl[llllIllllllllII + llIIIl[3]]).actionPerformed(llllIlllllllIll);
            }
            llllIllllllllII -= 2;
            "".length();
            if (((0x40 ^ 0x6E) & ~(0x59 ^ 0x77)) == 0) continue;
            return;
        }
    }

    private static void llIIIIl() {
        llIIIl = new int[4];
        g.llIIIl[0] = (0x1C ^ 0x2E) & ~(0x7D ^ 0x4F);
        g.llIIIl[1] = "  ".length();
        g.llIIIl[2] = 0xFFFFEFEB & 0x13FD;
        g.llIIIl[3] = " ".length();
    }

    @Override
    public void addActionListener(ActionListener actionListener) {
        this.V.add(ActionListener.class, actionListener);
    }

    private static boolean llIIlIl(int n, int n2) {
        return n < n2;
    }

    @Override
    public Component getEditorComponent() {
        return this.U;
    }

    @Override
    public void removeActionListener(ActionListener actionListener) {
        this.V.remove(ActionListener.class, actionListener);
    }

    private static boolean llIIIlI(int n) {
        return n != 0;
    }

    static {
        g.llIIIIl();
        g.llIIIII();
    }

    @Override
    public Object getItem() {
        return this.U.getBackground();
    }

    private static void llIIIII() {
        llIIII = new String[llIIIl[3]];
        g.llIIII[g.llIIIl[0]] = g.lIlllll("", "fxNHd");
    }

    private static boolean llIIlII(Object object, Object object2) {
        return object == object2;
    }

    public g(Color color) {
        this.V = new EventListenerList();
        this.U = new JButton(llIIII[llIIIl[0]]);
        this.U.setBackground(color);
        h h2 = new h(this);
        this.U.addActionListener(h2);
    }
}
