/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.z;
import java.awt.Dimension;
import javax.swing.JLabel;

class E
extends JLabel {
    final /* synthetic */ z bo;
    private static /* synthetic */ int[] lIIIlll;

    private static void lIIIllll() {
        lIIIlll = new int[1];
        E.lIIIlll[0] = 0x8A ^ 0xA8 ^ (2 ^ 0x2F);
    }

    E(z z2, String string) {
        this.bo = z2;
        super(string);
    }

    static {
        E.lIIIllll();
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.width = z.aW.width - lIIIlll[0];
        return dimension;
    }
}
