/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

class f
implements ListCellRenderer {
    private static /* synthetic */ int[] lIIIIll;
    private static final /* synthetic */ Dimension R;
    protected /* synthetic */ DefaultListCellRenderer Q;

    private static boolean lIIIllIl(int n) {
        return n == 0;
    }

    f() {
        this.Q = new DefaultListCellRenderer();
    }

    private static void lIIIlIll() {
        lIIIIll = new int[2];
        f.lIIIIll[0] = "  ".length() & ~"  ".length();
        f.lIIIIll[1] = 0x40 ^ 0x16 ^ (0x74 ^ 0x36);
    }

    static {
        f.lIIIlIll();
        R = new Dimension(lIIIIll[0], lIIIIll[1]);
    }

    /*
     * WARNING - void declaration
     */
    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        void llllIlIIlIIlllI;
        void llllIlIIlIlIIII;
        void llllIlIIlIIllll;
        JLabel jLabel = (JLabel)this.Q.getListCellRendererComponent((JList<?>)jList, object, n, bl, bl2);
        if (f.lIIIllII(object instanceof Color)) {
            jLabel.setBackground((Color)object);
        }
        if (!f.lIIIllIl((int)llllIlIIlIIllll) || f.lIIIllII((int)llllIlIIlIlIIII)) {
            llllIlIIlIIlllI.setBorder(new LineBorder(Color.DARK_GRAY));
            "".length();
            if ((0x5A ^ 0x5E) > (0xBD ^ 0xB9)) {
                return null;
            }
        } else {
            llllIlIIlIIlllI.setBorder(null);
        }
        jLabel.setPreferredSize(R);
        return jLabel;
    }

    private static boolean lIIIllII(int n) {
        return n != 0;
    }
}
