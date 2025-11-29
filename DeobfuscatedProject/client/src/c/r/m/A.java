/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.k;
import c.r.m.z;
import java.awt.Color;
import javax.swing.plaf.basic.BasicProgressBarUI;

class A
extends BasicProgressBarUI {
    final /* synthetic */ z bh;

    A(z z2) {
        this.bh = z2;
    }

    @Override
    protected Color getSelectionForeground() {
        return k.ac;
    }

    @Override
    protected Color getSelectionBackground() {
        return k.ac;
    }
}
