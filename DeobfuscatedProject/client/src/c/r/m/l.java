/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.k;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class l
extends BasicScrollBarUI {
    private static /* synthetic */ int[] llIlIl;
    private /* synthetic */ Color ah;
    private /* synthetic */ Color ag;

    @Override
    protected JButton createDecreaseButton(int n) {
        return this.h();
    }

    @Override
    protected void paintTrack(Graphics graphics, JComponent jComponent, Rectangle rectangle) {
        graphics.setColor(this.ah);
        graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    private static void llIIlll() {
        llIlIl = new int[3];
        l.llIlIl[0] = (0xFA ^ 0xB7) & ~(0x3F ^ 0x72);
        l.llIlIl[1] = 0xC2 ^ 0xB1 ^ (0xD5 ^ 0xB6);
        l.llIlIl[2] = 0x5D ^ 0x48 ^ (0x38 ^ 0x2A);
    }

    public void b(Color color) {
        this.ag = color;
    }

    public static ComponentUI a(JComponent jComponent) {
        JScrollBar jScrollBar = (JScrollBar)jComponent;
        jScrollBar.setUnitIncrement(llIlIl[1]);
        jScrollBar.setPreferredSize(new Dimension(llIlIl[2], llIlIl[0]));
        return new l();
    }

    public l() {
        this.ag = k.ad;
        this.ah = k.ae;
    }

    @Override
    protected JButton createIncreaseButton(int n) {
        return this.h();
    }

    @Override
    protected void paintThumb(Graphics graphics, JComponent jComponent, Rectangle rectangle) {
        graphics.setColor(this.ag);
        graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public void c(Color color) {
        this.ah = color;
    }

    static {
        l.llIIlll();
    }

    private JButton h() {
        JButton jButton = new JButton();
        Dimension dimension = new Dimension(llIlIl[0], llIlIl[0]);
        jButton.setPreferredSize(dimension);
        jButton.setMinimumSize(dimension);
        jButton.setMaximumSize(dimension);
        return jButton;
    }
}
